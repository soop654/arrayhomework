package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int lotte[] = new int[6];	//내 로또번호
		int num[] = new int[6];	//추첨번호0~5
		int result=0;
		boolean fal = false;
		int count = 0;
		
		while(true) {
			count++;
			for(int i=0;i<6;i++) {
				int rand = (int)(Math.random()*10)+1;
				num[i] = rand;
			}
			
			outerLoop :for(int i=0;i<6;i++) {
				for(int j=0;j<6;j++) {
					if(i==j) continue;
					if(num[i] == num[j]) {
						break outerLoop;
					}
				}
				if(i==5)fal = true;
			}
			if(fal == true)break;
			System.out.println("실패" + count);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요6");
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 숫자");
			int r = sc.nextInt();
			lotte[i] = r;
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(i==j)continue;
				if(num[i]>num[j]) {
					continue;
				}
				else {
					int temp;
					temp =num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(num[i]);
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotte[i]==num[j])result++;
			}
		}
		System.out.println(result);
	}
}
