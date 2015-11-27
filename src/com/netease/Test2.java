package com.netease;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// 接收控制台输入的信息
		int[] a = new int[100];
		int[] b = new int[100];
		for(int i=0;i<100;i++){
		      a[i]=scan.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			int price=1;//初始价格
				int num=1;
				int flag=0;//计数器
				int times=a[i];
				for(int j=1; ;j++){
			    	if(times-flag>0){
			    		num+=j;
			    		times-=flag;
			    		if(times>1){
			    			num--;
			    		}else{
			    			break;
			    		}
			    	}else{
			    		num+=flag-times;
			    		break;
			    	}
			    }
			    System.out.println(num);
		}
	}
	
	

}
