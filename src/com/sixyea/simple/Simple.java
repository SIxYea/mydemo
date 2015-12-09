package com.sixyea.simple;

public class Simple {
	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		int c = 1000;
		Integer A = 100;
		Integer B = 100;
		Integer C = new Integer(100);
		Integer D = new Integer(100);
		Integer E = 1000;
		Integer F = 1000;
		System.out.println("a == b——>"+(a == b));
		System.out.println("A == B——>"+(A == B));
		/*自动拆箱：故名思议就是将对象重新转化为基本数据类型*/
		System.out.println("A == a——>"+(A == a));
		System.out.println("C == D——>"+(C == D));
		System.out.println("a == C——>"+(a == C));
		System.out.println("A == C——>"+(A == C));
		System.out.println("c == E——>"+(c == E));
		/*java定义：在自动装箱时对于值从–128到127之间的值，它们被装箱为Integer对象后，会存在内存中被重用，始终只存在一个对象
		而如果超过了从–128到127之间的值，被装箱后的Integer对象并不会被重用，即相当于每次装箱时都新建一个 Integer对象；*/
		System.out.println("E == F——>"+(E == F));
	}
}
