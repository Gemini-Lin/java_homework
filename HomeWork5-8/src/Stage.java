import java.util.Arrays;
import java.util.Date;

public class Stage {

    public static void main(String[] args) {

        // 变量定义
        long begintime = 0;
        long endtime = 0;

        // 生成排序数据
        int[] rawArr = generateIntArray(10000000);
        int[] rawArr2 = Arrays.copyOf(rawArr, rawArr.length);

        begintime = new Date().getTime();
        new SingleThreadMergeSort().sort(rawArr);

        endtime = new Date().getTime();
        System.out.println("单线程归并排序花费时间：" + (endtime - begintime)+"ms");


        begintime = new Date().getTime();
        new ForkJoinMergeSort().sort(rawArr2);

        endtime = new Date().getTime();
        System.out.println("多线程Fork/Join归并排序花费时间：" + (endtime - begintime)+"ms");

    }

    private static int[] generateIntArray(int length) {
        int[] intArr = new int[length];
        for (int i = 0; i < length; i++) {
            intArr[i] = new Double(Math.random() * length).intValue();
        }
        return intArr;
    }
}