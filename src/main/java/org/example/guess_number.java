//package org.example;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        //猜数字小游戏
//        int count = 0;  //保底机制
//
//        Random r = new Random();  //生成1-100的随机数
//        int number = r.nextInt(100)+1;
//
//        Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.println("请输入你要猜的数字");
//            count++;
//            int guessNumber = sc.nextInt();
//
//            if(count==3) {
//                System.out.println("猜中了");
//                break;
//            }
//            if (guessNumber > number) {
//                System.out.println("大了");
//            } else if (guessNumber < number) {
//                System.out.println("小了");
//            } else {
//                System.out.println("猜中了");
//                break;
//            }
//        } while (true);
//    }
//}