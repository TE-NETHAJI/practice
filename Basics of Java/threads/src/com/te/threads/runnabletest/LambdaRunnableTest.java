package com.te.threads.runnabletest;

public class LambdaRunnableTest {
	public static void main(String[] args) {

		Runnable one1 = () -> {
			System.out.println("-------threadone*started------");
			String[] names = { "a", "b", "c", "d", "e" };
			for (String name : names) {
				System.out.println(name);
			}
			System.out.println("-------threadone*ended------");

		};

		Runnable two2 = () -> {
			System.out.println("------threadtow*starts--------");
			int[] number = { 1, 2, 3, 4, 5, 6 };
			for (int i : number) {
				System.out.println(i);
			}
			System.out.println("------threadtwo*ends--------");

		};
		
		Thread one01 = new Thread(one1);
		Thread two02 = new Thread(two2);
		
		one01.start();
		try {
			one01.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		two02.start();

	}

}
