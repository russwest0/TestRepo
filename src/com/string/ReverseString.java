package com.string;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������ַ���
 * 
 * @author iver
 * @date 2015��10��13�� ����5:01:56
 */
public class ReverseString {

	public static void main(String[] args) {
		method1();
	}

	/**
	 * ��ʹ��split,indexof,trim�ȷ���ʵ��
	 */
	public static void method1() {
		String string = "ad2 lsdkf, lksdjf. sdkfj dddd";
		char[] b = string.toCharArray();
		int bLength = b.length;
		List list = new ArrayList(); // ��Ż�ȡ�ָ��Ժ���ַ���
		StringBuffer resultString = new StringBuffer();

		for (int i = 0; i < bLength; i++) {
			if (b[i] == ' ')// ����ǿո� ��ӵ� list��
			{
				list.add(resultString);
				resultString = new StringBuffer();
				continue;
			}
			if (i == bLength - 1) // ��������һ�� ��ӵ� list��
			{
				list.add(resultString);
			}
		}
		// ��������������

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
	}
}
