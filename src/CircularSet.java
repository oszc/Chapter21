/**
 * 11/2/14  10:49 AM
 * Created by JustinZhang.
 */
public class CircularSet {

    private int[] array;
    private int len;
    private int index;

    public CircularSet(int size) {
        this.len = size;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = -1;
        }
    }

    public synchronized void add(int i ){

        array[index] = i;
        index = ++index % len;

    }

    public synchronized boolean contains(int val){

        for (int i = 0; i < len; i++) {

            if(array[i] == val){
                return true;
            }
        }
        return false;
    }

}
