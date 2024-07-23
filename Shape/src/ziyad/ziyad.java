package ziyad;

import java.util.Scanner;
import java.lang.Math.*;
public class ziyad {
	
                           /*welcome list*/	
	static int choice;	
	static	Scanner sc=new Scanner(System.in);
	public static  void welcome() {
		System.out.println("For Circle Area    press: 1");
		System.out.println("For Square Area    press: 2");
		System.out.println("For Rectangle Area press: 3");
		System.out.println("To exit press: 0");
		System.out.println("Enter your choice please ");
		choice=sc.nextInt();
		choice(choice);
	}
	
	                      /*choices list*/
	public static  int choice(int choice) {
         if(choice==1) {
        	 Circle ();
         }
         if(choice==2) {
        	 Square ();
         }
         if(choice==3) {
        	 Rectangle ();
         }
		if(choice==0) {
			Exit();
		}
		return choice;
	}
	
	public static  void Circle() {
		System.out.println("Enter The Circle Raduis :");
		int raduis=sc.nextInt();
		double area=0;
		area=Math.PI * raduis*raduis;
		System.out.println("The Cirle Area = "+area);
		System.out.println();
		welcome();
		}
	
	public static void Square() {
		System.out.println("Enter The Side Length of The Square :");
		int Side=sc.nextInt();
		int area ;
		area=Side*Side;
		System.out.println("The Square Area ="+area);
		System.out.println();
		welcome();
		}
	
	public static  void Rectangle() {
		System.out.println("Enter The Length Of The Rectangle :");
		int length=sc.nextInt();
		System.out.println("Enter The Width Of the Rectangle :");
		int width=sc.nextInt();
		int area=0;
		area=length*width;
		System.out.println("The Rectangle Area ="+area);
		System.out.println();

		welcome();
	}
	
	public static void Exit() {
		switch(choice) {
		case 0:
		System.out.println("Thanks");
		break;
		}	
	}
	
	public static void main(String [] args) {
		
		System.out.println("Welcome ");
		
		int choice = 0;
		welcome();
		choice(choice);
	}	
	}

/*ZIYAD SAIED */
		