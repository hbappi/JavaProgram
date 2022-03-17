public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 42, 6, 6, 78, 32, 4, 3, 65, 5, -5, -64, -1, 0 };
        for (int i : array) {
            print(i);
        }
        print("\n\n\nSorting data now");
        int[] sortedArray = array;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int a = array[i];
                int b = array[j];
                if (a > b) {
                    sortedArray[i] = b;
                    sortedArray[j] = a;
                }
            }
        }
        print("\n\n\nSorted Max to min output is:");
        for (int i : sortedArray) {
            print(i);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int a = array[i];
                int b = array[j];
                if (a < b) {
                    sortedArray[i] = b;
                    sortedArray[j] = a;
                }
            }
        }
        print("\n\n\nSorted Min to Max output is:");
        for (int i : sortedArray) {
            print(i);
        }
    }
    public static void print(Object o) {
        System.out.println(o);
    }
}