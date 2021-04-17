
public class InsertionSort {

//	public static void insertionSort(int[] arr) {
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j>0;j--) {
//				if(arr[j]<arr[j-1]) {
//					int temp=arr[j];
//					arr[j]=arr[j-1];
//					arr[j-1]=temp;
//				}
//			}
//		}
//	}
	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp; 
		}
	}
	public static void main(String[] args) {
		int[] arr = {4 ,3 ,2 ,1};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
