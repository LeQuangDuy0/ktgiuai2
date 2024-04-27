package Duy.dev;

import java.util.Arrays;

public class bai2 {
	// a.
	public static int demsl(int[] arr) {
		int n = 0;
		for (int num : arr) {
			if (num % 2 == 0) {
				n++;
			}
		}
		return n;
	}

	// b
	public static boolean kiemtramang(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// c
	public static int demslpt(int[] arr, int be, int lon) {
		int n = 0;
		for (int num : arr) {
			if (num >= be && num <= lon) {
				n++;
			}
		}
		return n;
	}

	// d
	public static int tong(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}

	//e 
	public static int tongcacgtmang(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			if (num % 2 != 0) {
				sum += num;
			}
		}
		return sum;
	}

	// f

	public static void mangtangdan(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// g
	public static int gtln(int[] arr) {
		int lon = arr[0];
		for (int num : arr) {
			if (num > lon) {
				lon = num;
			}
		}
		return lon;
	}

	public static void main(String[] args) {
		int[] array = { 3, 7, 2, 8, 6, 4, 12, 9, 5 };

		System.out.println("Số lượng phần tử chẵn trong mảng: " + demsl(array));

		System.out.println("Mảng có được sắp xếp tăng dần không: " + kiemtramang(array));

		System.out.println("Số lượng phần tử có giá trị từ 4 đến 12 trong mảng: " + demslpt(array, 4, 12));

		System.out.println("Tổng các phần tử của mảng: " + tong(array));

		System.out.println("Tổng các phần tử có giá trị lẻ trong mảng: " + tongcacgtmang(array));

		mangtangdan(array);
		System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(array));

		System.out.println("Giá trị lớn nhất của mảng: " + gtln(array));
	}
}
