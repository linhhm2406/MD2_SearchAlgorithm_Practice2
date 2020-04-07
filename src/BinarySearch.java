public class BinarySearch {
    public static void main(String[] args) {
        int[] intArr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

            System.out.println(binarySearch(intArr, 2));  /* 0 */
            System.out.println(binarySearch(intArr, 11)); /* 4 */
            System.out.println(binarySearch(intArr, 79)); /*12 */
            System.out.println(binarySearch(intArr, 1));  /*-1 */
            System.out.println(binarySearch(intArr, 5));  /*-1 */
            System.out.println(binarySearch(intArr, 80)); /*-1 */
        }

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key == list[mid]) {
                return mid;
            } else if (key < list[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
