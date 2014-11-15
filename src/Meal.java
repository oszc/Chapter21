/**
 * 11/9/14  8:57 PM
 * Created by JustinZhang.
 */
public class Meal {
    private final int orderNum;

    public Meal(int orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "Meal "+ orderNum;
    }
}
