public class Main {
    public static void main(String[] args) {
        int arr[] = {1,12,9,5,6,10};

        HeapSort hs = new HeapSort();
        hs.sort(arr);

        System.out.println("Sorted array is:");
       HeapSort.printArray(arr);
    }
}
