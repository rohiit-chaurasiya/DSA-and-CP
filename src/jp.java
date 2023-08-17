//import java.util.Scanner;
//public class jp {
//    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//
//        int input1 = scanner.nextInt();
//        int input3 = scanner.nextInt();
//
//        int input2[][] = new int[input1][input3];
//
//        for (int row = 0; row < input1; row++) {
//            for (int col = 0; col < input3; col++) {
//                input2[row][col] = scanner.nextInt();
//            }
//        }
//        scanner.close();
//        int avg[] = new int[input3];
//        int min = -1;
//        int skipIndex = -1;
//
//        for (int sub = 0; sub < input3; sub++) {
//            for (int stu = 0; stu < input1; stu++) {
//                avg[sub] += input2[stu][sub];
//            }
//            avg[sub] /= input1;
//
//            if (sub == 0) {
//                min = avg[0];
//                skipIndex = 0;
//            } else if (avg[sub] < min) {
//                min = avg[sub];
//                skipIndex = sub;
//            }
//        }
//        int result[] = new int[input1];
//        for (int row = 0; row < input1; row++) {
//            for (int col = 0; col < input3; col++) {
//                if (skipIndex != col)
//                    result[row] += input2[row][col];
//            }
//        }
//        return result;
//    }
//}

import java.util.*;

import java.lang.*;

import java.io.*;

class jp

{

    public static void main (String[] args) throws Exception

    {



        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++)

            a[i] = sc.nextInt();

        int max=a[0], min=a[0];

        for(int i=1;i<n;i++) {

            if(a[i] > max)

                max = a[i];

            if(a[i] < min)

                min = a[i];

        }

        int sum = max+min;

        System.out.println(sum);

    }

}