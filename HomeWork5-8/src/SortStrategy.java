public interface SortStrategy {

    /**
     * 传入无序数组，返回有序的
     *
     * @param rawArray
     * @return
     */
    public int[] sort(int[] rawArray);
}