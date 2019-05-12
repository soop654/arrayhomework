package test;

public class class1 {
	public static void main(String args[]) {
		int[][] num = new int[10][10];
		int number = 0;
		for(int i=0;i<10;i++) {
			for(int j=(i)*10;j<(i+1)*10;j++) {
				
				num[i][number] =j;
				number++;
				
			}
			number = 0;
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
}
