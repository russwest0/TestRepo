package com.string;

import java.util.Scanner;

public class Test {

	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		int col=0,row=0;
		//int pis_col=0,pis_row=0;
		col=reader.nextInt();
		row=reader.nextInt();
		int [][] a=new int[col][row]; 
		//初始化二维数组矩阵
		for(int i=0;i<col;i++){
			for(int j=0;j<row;j++){
				a[i][j]=reader.nextInt();
			}
		}
		int result=0;
		int tmp=0;
		int[] mutiply_col=new int[col];
		int[] mutiply_row=new int[row];
		for(int i=0;i<col;i++){
			int mult=1;
			for(int j=0;j<row;j++){
				mult*=a[i][j];
			}
			mutiply_col[i]=mult;
		}
		
		for(int i=0;i<row;i++){
			int mult=1;
			for(int j=0;j<col;j++){
				mult*=a[j][i];
			}
			mutiply_row[i]=mult;
		}
		
		for(int i=0;i<col;i++){
			for(int j=0;j<row;j++){
				tmp=mutiply_col[i]*mutiply_row[j]/(a[i][j]*a[i][j]);
				if(tmp>result){
					result=tmp;
					//pis_col=i;
					//pis_row=j;
				}
					
			}
		}
		
		System.out.println(tmp);
	}
}
