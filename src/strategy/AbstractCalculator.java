package strategy;

/**
 * Created by sanfen on 2016/12/26.
 */
public  abstract class AbstractCalculator {
    public int[] split(String exp, String opt){
        String arr[] = exp.split(opt);
        int arrInt[] = new int[2];
        arrInt[0] = Integer.parseInt(arr[0]);
        arrInt[1] = Integer.parseInt(arr[1]);
        return arrInt;
    }
}
