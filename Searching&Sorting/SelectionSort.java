
public class SelectionSort {

	public static void selectionSort(int arr[]) {
		int min;
		for(int i=0;i<arr.length-1;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(i!=min) {
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		
	}
	public static void main(String[] args) {
		
		int[] arr = {4,2,3,2,5,1,6};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
