package com.netease;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		while(true){
			Scanner scan = new Scanner(System.in);// 接收控制台输入的信息
			int num = scan.nextInt(); // 取出控制台输入的信息
			int initial_ability = scan.nextInt(); // 取出控制台输入的信息 
			int[] a = new int[num];
			for(int i=0;i<num;i++){
			      a[i]=scan.nextInt();
			}
			for(int i =0;i<num;i++){
				if(a[i]<=initial_ability){
					initial_ability+=a[i];
				}else{
					int maxCommonnDivisor=maxCommonDivisor2(a[i], initial_ability);
					initial_ability+=maxCommonnDivisor;
				}
			}
			System.out.println(initial_ability);
		}
		}
		
	
	
	//求两个数的最大公约数
	public static int maxCommonDivisor2(int m, int n) {

		if (m < n) {// 保证m>n,若m<n,则进行数据交换
			int temp = m;
			m = n;
			n = temp;
		}
		while (m % n != 0) {// 在余数不能为0时,进行循环
			int temp = m % n;
			m = n;
			n = temp;
		}
		return n;// 返回最大公约数
	}

}
