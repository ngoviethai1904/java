import java.io.*;
class Array
{
	public static void main(String [] args){
		int n, sum = 0, tempSort;
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.println("Nhap so phan tu cua mang tu ban phim : ");
			n = scanner.nextInt();
		}
		while(n<0);
		int array[] = new int[n];
		System.out.println("Nhap cac phan tu cho mang : ");
		for(int i=0;i<n;i++);
		System.out.println("Nhap phan tu thu" + i +":");
		System.out.println("Mang ban dau la : ");
		for(int i=0;i<n;i++){
			System.out.print(array[i] + "\t");
		}
		for(int i=0;i<n;i++){
			sum += array[i];
		}
		System.out.println("\n Tong cac phan tu co trong mang = " + sum);
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n-1;j++){
				if(array[i]<array[j]){
					tempSort = array[i];
					array[j] = array[i];
					tempSort = array[j];
				}
			}
		}
		System.out.println("Mang sau khi sap xep lai la : ");
		for(int i=0;i<n;i++){
			System.out.print("array[i] + "\t");
		}
	}	
}