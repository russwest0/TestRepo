package com.netease;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		while(true){
			Scanner scan = new Scanner(System.in);// ���տ���̨�������Ϣ
			int num = scan.nextInt(); // ȡ������̨�������Ϣ
			int initial_ability = scan.nextInt(); // ȡ������̨�������Ϣ 
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
		
	
	
	//�������������Լ��
	public static int maxCommonDivisor2(int m, int n) {

		if (m < n) {// ��֤m>n,��m<n,��������ݽ���
			int temp = m;
			m = n;
			n = temp;
		}
		while (m % n != 0) {// ����������Ϊ0ʱ,����ѭ��
			int temp = m % n;
			m = n;
			n = temp;
		}
		return n;// �������Լ��
	}

}
