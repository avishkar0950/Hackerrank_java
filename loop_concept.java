package practice_program;
import java.io.*;
import java.util.*;

public class loop_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner std=new Scanner(System.in);
		n=std.nextInt();
		for(int i=1;i<=10;i++)
		{
			int result=n*i;
			 System.out.println(n + " x " + i + " = " + result);
		}

	}

}
