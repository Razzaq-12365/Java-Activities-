package com.Activity8;
	class ThreadEven extends Thread{
		public void run()
		{
			for(int i=1; i<=10; i++)
			{
				if(i%2==0)
				{
					System.out.println("Even Numbers Are: " + i);
				}
			}
		}
	}
	class OddThread extends Thread
	{
		public void run()
		{
			for(int i=1; i<=10; i++)
			{
				if(i%2!=0)
				{
					System.out.println("Odd Numbers Are: " + i);
				}
			}
		}
	}

	public class EvenOddThread {

		public static void main(String[] args) {
			ThreadEven teve = new ThreadEven();
			OddThread oth = new OddThread();
			teve.start();
			oth.start();

		}

	}
