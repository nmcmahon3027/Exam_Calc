package helloPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int p1, p2, p3, p4;

        System.out.println("Enter first mark: ");
        p1= new Scanner(System.in).nextInt();
        System.out.println("Enter 2nd: ");
        p2 = new Scanner(System.in).nextInt();
        System.out.println("3rd: ");
        p3 = new Scanner(System.in).nextInt();
        System.out.println("4th: ");
        p4 = new Scanner(System.in).nextInt();
        System.out.println("Average: " + (p1+p2+p3+p4)/4);
        LargeSum();



    }
    public static void LargeSum(){
        int sum = 0;
        for(int count=1; count<=100; count++){
            System.out.println("Enter exam score: "+ count + ": ");
            sum = sum + new Scanner(System.in).nextInt();
        }
        System.out.println("Average: " + (sum/100));
    }
}
