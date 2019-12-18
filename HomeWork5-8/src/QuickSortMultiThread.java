import java.util.Arrays;

public class QuickSortMultiThread {
    static int[] array ;
    public static void main(String[] args) {
        int num = 20000;
        array = new int[num];
        /* 产生随机数组 */
        for (int m = 0; m < num; m++) {
            final double d = Math.random();
            final int j = (int) (d * 10000000);
            array[m] = j;
        }
        long startTime = System.currentTimeMillis();
        Thread runnable = new SortRunnable(0, array.length - 1);
        runnable.start();
        try {
            runnable.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("----多线程排序的时间为 : " + String.valueOf(System.currentTimeMillis() - startTime)+"ms");
    }


    static class SortRunnable extends Thread {
        int l, h;

        public SortRunnable(int l, int h) {
            this.l = l;
            this.h = h;
        }

        @Override
        public void run() {
            if (l < h) {
                int position = getPosition(l, h);
                Thread thread1 = new SortRunnable(l, position - 1);
                Thread thread2 = new SortRunnable(position + 1, h);
                thread1.start();
                thread2.start();
                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static int getPosition(int l, int h) {
        int temp = array[l];
        while (h > l) {
            while (array[h] >= temp && h > l) {
                h--;
            }
            array[l] = array[h];
            while (array[l] <= temp && h > l) {
                l++;
            }
            array[h] = array[l];
        }
        array[l] = temp;
        return l;
    }
}
