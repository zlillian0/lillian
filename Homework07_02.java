package yyy;

import java.io.*;


public class Homework07_02 {
	public static void main(String args[]) throws IOException {
		int i=250000;
		int[] a=new int[10];
		String qwe = "";
		for(i=0;i<a.length;i++) {
		a[i]=(int)((Math.random()*1000)+1);
		}
			FileOutputStream fos1=new FileOutputStream("C:\\Users\\Java\\Desktop\\java_homework_07\\Data.txt",true);
			PrintStream ps =new PrintStream(fos1);
			
			for(int x:a) {
				ps.println(x);
			}
			
			ps.close();
			fos1.close();
	}
}
