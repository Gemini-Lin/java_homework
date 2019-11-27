import java.util.Arrays;
public class SortAll {
    public static void main(String[] args) {
        int num = 20000;
        int[] i1 = new int[num];
        //产生随机数组
        for (int m = 0; m < num; m++) {
            final double d = Math.random();
            final int j = (int) (d * 10000000);
            i1[m] = j;
        }
        int[] i2 = new int[num];
        //产生随机数组
        for (int m = 0; m < num; m++) {
            final double d = Math.random();
            final int j = (int) (d * 10000000);
            i2[m] = j;
        }
        int[] i3 = new int[num];
        //产生随机数组
        for (int m = 0; m < num; m++) {
            final double d = Math.random();
            final int j = (int) (d * 10000000);
            i3[m] = j;
        }
        int[] i4 = new int[num];
        //产生随机数组
        for (int m = 0; m < num; m++) {
            final double d = Math.random();
            final int j = (int) (d * 10000000);
            i4[m] = j;
        }
        int[] i5 = new int[num];
        //产生随机数组
        for (int m = 0; m < num; m++) {
            final double d = Math.random();
            final int j = (int) (d * 10000000);
            i5[m] = j;
        }

        System.out.println("----冒泡排序的结果：");
        maoPao(i1);
        System.out.println();
        System.out.println("----选择排序的结果：");
        xuanZe(i2);
        System.out.println();
        System.out.println("----插入排序的结果：");
        chaRu(i3);
        System.out.println();
        System.out.println("----希尔（Shell）排序的结果：");
        shell(i4);
        System.out.println();
        System.out.println("----系统默认排序的结果：");
        Array(i5);
        System.out.println();
    }

    // 冒泡排序
    private static void maoPao(int[] x) {
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        long endTime1 = System.currentTimeMillis();
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println("\n----冒泡排序的时间为：" + (endTime1 - startTime1) + "ms");
    }

    // 选择排序
    private static void xuanZe(int[] x) {
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < x.length; i++) {
            int lowerIndex = i;
            // 找出最小的一个索引
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] < x[lowerIndex]) {
                    lowerIndex = j;
                }
            }
            // 交换
            int temp = x[i];
            x[i] = x[lowerIndex];
            x[lowerIndex] = temp;
        }
        long endTime2 = System.currentTimeMillis();
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println("\n----选择排序的时间为：" + (endTime2 - startTime2) + "ms");
    }

    // 插入排序
    private static void chaRu(int[] x) {
        long startTime3 = System.currentTimeMillis();
        for (int i = 1; i < x.length; i++) {// i从一开始，因为第一个数已经是排好序的啦
            for (int j = i; j > 0; j--) {
                if (x[j] < x[j - 1]) {
                    int temp = x[j];
                    x[j] = x[j - 1];
                    x[j - 1] = temp;
                }
            }
        }
        long endTime3 = System.currentTimeMillis();
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println("\n----插入排序的时间为：" + (endTime3 - startTime3) + "ms");
    }

    // 希尔排序
    private static void shell(int[] x) {
        // 分组
        long startTime4 = System.currentTimeMillis();
        for (int increment = x.length / 2; increment > 0; increment /= 2) {
            // 每个组内排序
            for (int i = increment; i < x.length; i++) {
                int temp = x[i];
                int j = 0;
                for (j = i; j >= increment; j -= increment) {
                    if (temp < x[j - increment]) {
                        x[j] = x[j - increment];
                    } else {
                        break;
                    }
                }
                x[j] = temp;
            }
        }
        long endTime4 = System.currentTimeMillis();
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println("\n----希尔排序的时间为：" + (endTime4 - startTime4) + "ms");
    }

    //系统排序
    private static void Array(int[] x) {
        long startTime = System.currentTimeMillis();
        Arrays.sort(x);
        long endTime = System.currentTimeMillis();
        for (int j = 0; j < x.length; j++) {
            System.out.print(x[j] + " ");
        }
        System.out.println("\n----系统默认排序的时间为：" + (endTime - startTime) + "ms");
    }
}


