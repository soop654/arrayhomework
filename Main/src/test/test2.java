package test;

import java.util.Random;
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int TestCase = sc.nextInt();
			int N = sc.nextInt();
			int mapSize = N*N;
			int map[] = new int[mapSize];
			int city[] = new int[TestCase];
			int count = 0;
			Random random = new Random();
			
			while(TestCase > count) {
				count++;
			for(int i =0;i<mapSize;i++) {
				map[i] = random.nextInt(4);
			}
			
			for(int i=0;i<map.length;i++) {
				Boolean water = false;
				Boolean mountain = false;
				Boolean grassland = false;
				if(map[i] == 0) {
					continue;	//불모지면 건너띔
				}
				
				if(i == 0 || i == (N-1) || i == (N * N)-N || i == (N*N)-1 )	//꼭지점은 따로해줘야함
				{
					if(i == 0) {	//맨 왼쪽위 꼭지점
						//주위 불모지 검사
						if(map[i+1] != 0 && map[i+N] != 0 && map[i+N+1] != 0) {
							//불모지가 없다.
							int result[] = new int[4];
							result[0] = map[i+1];
							result[1] = map[i+N];
							result[2] = map[i+N+1];
							result[3] = map[i];
							for(int j=0;j<result.length;j++) {
								if(result[j] ==1) water = true;
								if(result[j] ==2) mountain = true;
								if(result[j] ==3) grassland = true;
							}
							//하나 이상씩 있으면
							if(water == true && mountain == true && grassland == true) {
								city[count-1]++;
								continue;
							}else {
								continue;
							}
						}else {
							continue;
						}
					}else if(i == (N-1)) {	//맨 오른쪽 위 꼭지점
						//주위 불모지 검사
						if(map[i-1] != 0 && map[i+N-1] != 0 && map[i+N] != 0) {
							//불모지가 없다.
							int result[] = new int[4];
							result[0] = map[i-1];
							result[1] = map[i+N-1];
							result[2] = map[i+N];
							result[3] = map[i];
							for(int j=0;j<result.length;j++) {
								if(result[j] ==1) water = true;
								if(result[j] ==2) mountain = true;
								if(result[j] ==3) grassland = true;
							}
							//하나 이상씩 있으면
							if(water == true && mountain == true && grassland == true) {
								city[count-1]++;
								continue;
							}else {
								continue;
							}
						}else {
							continue;
						}
					}else if(i == (N * N)-N) {	// 왼쪽아래 꼭지점
						//주위 불모지 검사
						if(map[i-N] != 0 && map[i-N+1] != 0 && map[i+1] != 0) {
							//불모지가 없다.
							int result[] = new int[4];
							result[0] = map[i-N];
							result[1] = map[i-N+1];
							result[2] = map[i+1];
							result[3] = map[i];
							for(int j=0;j<result.length;j++) {
								if(result[j] ==1) water = true;
								if(result[j] ==2) mountain = true;
								if(result[j] ==3) grassland = true;
							}
							//하나 이상씩 있으면
							if(water == true && mountain == true && grassland == true) {
								city[count-1]++;
								continue;
							}else {
								continue;
							}
						}else {
							continue;
						}
					}else if(i == (N*N)-1) {	//오른쪽아래 꼭지점
						//주위 불모지 검사
						if(map[i-N] != 0 && map[i-N-1] != 0 && map[i-1] != 0) {
							//불모지가 없다.
							int result[] = new int[4];
							result[0] = map[i-N];
							result[1] = map[i-N-1];
							result[2] = map[i-1];
							result[3] = map[i];
							for(int j=0;j<result.length;j++) {
								if(result[j] ==1) water = true;
								if(result[j] ==2) mountain = true;
								if(result[j] ==3) grassland = true;
							}
							//하나 이상씩 있으면
							if(water == true && mountain == true && grassland == true) {
								city[count-1]++;
								continue;
							}else {
								continue;
							}
						}else {
							continue;
						}
					}
				}else {	//꼭지점이 아닐때 벽 조건
				if(i < N) {	//맨 윗줄
					//주위 불모지 검사
					if(map[i-1] != 0 && map[i+1] != 0 && map[i+N-1] != 0 && map[i+N] != 0 && map[i+N+1] != 0) {
						//불모지가 없다.
						int result[] = new int[6];
						result[0] = map[i-1];
						result[1] = map[i+1];
						result[2] = map[i+N-1];
						result[3] = map[i+N];
						result[4] = map[i+N+1];
						result[5] = map[i];
						for(int j=0;j<result.length;j++) {
							if(result[j] ==1) water = true;
							if(result[j] ==2) mountain = true;
							if(result[j] ==3) grassland = true;
						}
						//하나 이상씩 있으면
						if(water == true && mountain == true && grassland == true) {
							city[count-1]++;
							continue;
						}else {
							continue;
						}
					}else {
						continue;
					}
				}else if(i % N == 0){	//왼쪽벽 체크
					//주위 불모지 검사
					if(map[i-N] != 0 && map[i-N+1] != 0 && map[i+1] != 0 && map[i+N+1] != 0 && map[i+N] != 0) {
						//불모지가 없다.
						int result[] = new int[6];
						result[0] = map[i-N];
						result[1] = map[i-N+1];
						result[2] = map[i+1];
						result[3] = map[i+N+1];
						result[4] = map[i+N];
						result[5] = map[i];
						for(int j=0;j<result.length;j++) {
							if(result[j] ==1) water = true;
							if(result[j] ==2) mountain = true;
							if(result[j] ==3) grassland = true;
						}
						//하나 이상씩 있으면
						if(water == true && mountain == true && grassland == true) {
							city[count-1]++;
							continue;
						}else {
							continue;
						}
					}else {
						continue;
					}
				}else if((i+1) % N == 0) {		//오른쪽 벽 체크
					//주위 불모지 검사
					if(map[i-N] != 0 && map[i-N-1] != 0 && map[i-1] != 0 && map[i+N-1] != 0 && map[i+N] != 0) {
						//불모지가 없다.
						int result[] = new int[6];
						result[0] = map[i-N];
						result[1] = map[i-N-1];
						result[2] = map[i-1];
						result[3] = map[i+N-1];
						result[4] = map[i+N];
						result[5] = map[i];
						for(int j=0;j<result.length;j++) {
							if(result[j] ==1) water = true;
							if(result[j] ==2) mountain = true;
							if(result[j] ==3) grassland = true;
						}
						//하나 이상씩 있으면
						if(water == true && mountain == true && grassland == true) {
							city[count-1]++;
							continue;
						}else {
							continue;
						}
					}else {
						continue;
					}
				}else if(i >= (N*N)-N) {	//맨 아랫줄 벽 체크
					//주위 불모지 검사
					if(map[i-N-1] != 0 && map[i-N] != 0 && map[i-N+1] != 0 && map[i+1] != 0 && map[i-1] != 0) {
						//불모지가 없다.
						int result[] = new int[6];
						result[0] = map[i-N-1];
						result[1] = map[i-N];
						result[2] = map[i-N+1];
						result[3] = map[i+1];
						result[4] = map[i-1];
						result[5] = map[i];
						for(int j=0;j<result.length;j++) {
							if(result[j] ==1) water = true;
							if(result[j] ==2) mountain = true;
							if(result[j] ==3) grassland = true;
						}
						//하나 이상씩 있으면
						if(water == true && mountain == true && grassland == true) {
							city[count-1]++;
							continue;
						}else {
							continue;
						}
					}else {
						continue;
					}
				}
			} 
				//꼭지점도 아니고 벽도아닌 일반땅 조사
				//주위 불모지 검사
				if(map[i-N-1] != 0 && map[i-N] != 0 && map[i-N+1] != 0 && map[i+1] != 0 && map[i+N+1] != 0 && map[i+N] != 0 && map[i+N-1] != 0 && map[i-1] != 0) {
					//불모지가 없다.
					int result[] = new int[9];
					result[0] = map[i-N-1];
					result[1] = map[i-N];
					result[2] = map[i-N+1];
					result[3] = map[i+1];
					result[4] = map[i+N+1];
					result[5] = map[i+N];
					result[6] = map[i+N-1];
					result[7] = map[i-1];
					result[8] = map[i];
					for(int j=0;j<result.length;j++) {
						if(result[j] ==1) water = true;
						if(result[j] ==2) mountain = true;
						if(result[j] ==3) grassland = true;
					}
					//하나 이상씩 있으면
					if(water == true && mountain == true && grassland == true) {
						city[count-1]++;
						continue;
					}else {
						continue;
					}
			}else {
				continue;
			}
				
			}	//end 전체 for문
			
			for(int i=0;i<map.length;i++) {
				System.out.print(map[i]);
				if((i+1) % N == 0) {
				System.out.println();
				}
			}
			if(count +1 == TestCase) {
				System.out.println();
				System.out.println(N);
			  }
			}//end while문
			System.out.println();
			for(int i=0;i<city.length;i++) {
				 System.out.println("#"+(i+1) +" " + city[i]);
			}
		}//end main
	
}
