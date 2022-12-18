import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    private static int[] copyArray(int[] arr, int size) {
        int[] newarr = new int[size];
        for (int i=0; i<arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("-------");
		printArray(arr);
		System.out.println("-------");
		System.out.print("How much size array you want : ");
		int size = sc.nextInt();
		arr = copyArray(arr, size);
		System.out.println("-------");
		printArray(arr);
	}
}
