/**
 * 11/2/14  12:07 PM
 * Created by JustinZhang.
 */
public class SerialNumberGenerator  {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber(){
        return serialNumber++;
    }
}
