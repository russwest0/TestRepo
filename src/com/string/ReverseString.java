package com.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 逆序输出字符串
 * 
 * @author iver
 * @date 2015年10月13日 下午5:01:56
 */
public class ReverseString {

	public static void main(String[] args) {
		method1();
	}

	/**
	 * 不使用split,indexof,trim等方法实现
	 */
	public static void method1() {
		String string = "ad2 lsdkf, lksdjf. sdkfj dddd";
		char[] b = string.toCharArray();
		int bLength = b.length;
		List list = new ArrayList(); // 存放获取分隔以后的字符串
		StringBuffer resultString = new StringBuffer();

		for (int i = 0; i < bLength; i++) {
			if (b[i] == ' ')// 如果是空格 添加到 list中
			{
				list.add(resultString);
				resultString = new StringBuffer();
				continue;
			}
			if (i == bLength - 1) // 如果是最后一个 添加到 list中
			{
				list.add(resultString);
			}
		}
		// 将结果集反序输出

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
	}
}
