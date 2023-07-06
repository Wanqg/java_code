//package org.example;
//
//import java.util.Random;
//import java.util.Scanner;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        //单行注释：//  多行注释：/* */   文档注释：/** *@啊 *@发 *@阿达 */
//        //不管是单行注释还是多行注释，在书写的时候都不要嵌套
//
////        //键盘录入
////        Scanner sc = new Scanner(System.in);
////        System.out.println("请输入一个三位数");
////        int number = sc.nextInt();
////        int ge = number%10;  //个位
////        int shi = number/10%10;  //十位
////        int bai = number/100%10;  //百位
////
////        //隐式转换(数据类型不一样，先转换成一样的再计算)，byte<short<int<long<float<double
////        //范围小的会先转换成范围大的再运算，byte\short\char 三种类型的数据在运算的时候都会直接先提升为int再运算
////        byte a1 = 10;
////        byte a2 = 20;
////        //result1 = a1+a2; result1 数据类型为int
////
////        int i =10;
////        long n = 100L;
////        double d = 20.2;
////        //result2 = i+n+d; result2 数据类型为int
////
////        //强制转换,取值范围大的赋值给取值范围小的
////        //double a = 12.3;
////        //int b = (int)a;
////
////        byte b1 = 10;
////        byte b2 = 20;
////        byte result3 = (byte)(b1+b2);
////        System.out.println(result3);
////
////        //算术运算符
////        System.out.println(3.7+"abc");//"3.7abc"
////        System.out.println("abc"+true);//"abctrue"
////        System.out.println('中'+"abc"+true);//"中abctrue"
////        int age = 18;
////        System.out.println("我的年龄是："+age+"岁");//我的年龄是：18岁
////        System.out.println("我的年龄是："+"age"+"岁");//我的年龄是age岁
////        //重点
////        System.out.println(1+2+"abc"+2+1);//3abc21
////
////        //当 字符+字符\字符+数字 时，会把字符通过ASCLL码表查询刀对应的数字再进行计算
////        System.out.println(1+'a');//98
////        System.out.println('a'+"abc");//aabc
////
////        //自增自减运算符练习
////        int x = 10;
////        int y = x++;
////        int z = ++x;
////        System.out.println("x:"+x);//x:12
////        System.out.println("y:"+y);//y:10
////        System.out.println("z:"+z);//z:12
////
////        /*判断你的时髦程度是否比你相亲对象高，输出true或false*/
////        System.out.println("请输入自己的时髦程度:");//输入自己的时髦程度
////        int myFashion = sc.nextInt();
////        System.out.println("请相亲对象输入的时髦程度:");//输入相亲对象的时髦程度
////        int girlFashion = sc.nextInt();
////
////        boolean resultfa = myFashion>girlFashion;
////        System.out.println(resultfa);//输出结果
////
////        /*
////        & 逻辑与 并且，两边都为真，结果才是真
////        | 逻辑或 或者，两边都为假，结果才是假
////        ^ 逻辑异或 相同为false，不同为true
////        ！ 逻辑非 取反
////        && 短路与 结果和&相同，但是有短路效果
////        || 短路或 结果和|相同，但是有短路效果
////         */
////
////        /*
////        键盘录入两个整数，如果其中一个是6或者他们的和为6的倍数，则为true;其他情况为false
////         */
////        System.out.println("请分别输入两个数：");
////        int number1 = sc.nextInt();
////        int number2 = sc.nextInt();
////
////        boolean resultb = number1==6 || number2==6 || (number1+number2)%6==0;
////        System.out.println(resultb);
////
////        //三元运算符
////        //格式： 关系表达式？表达式1:表达式2;
////        //实例： 需求：获取两个数的较大值
////        int numb1 = sc.nextInt();
////        int numb2 = sc.nextInt();
////        int maxn = numb1 > numb2 ? numb1 : numb2;
////        System.out.println(maxn);
////
////        //练习1：判断两个数是否相等
////        int numbb1 = sc.nextInt();
////        int numbb2 = sc.nextInt();
////        String res = numbb1==numbb2?"相同":"不同";
////        System.out.println(res);
////
////        //练习2：获取三人中最高的身高，身高分别为：150cm,162cm,156cm
////        int height1 = 150;
////        int height2 = 162;
////        int height3 = 156;
////        int temp = height1>height2?height1:height2;
////        int max = temp>height3?temp:height3;
////        System.out.println(max);
////
////        //运算符优先级.......略
////
////        //原码反码补码
////        //正数：原码、反码、补码都相同
////        /*负数：
////        反码 = 它的原码符号位不变，其它位取反(取反：0换成1，1换成0);
////        补码 = 它的反码+1;
////        */
////        //0的反码补码都是0
////        /*计算机运算时，都是以补码的方式来运算的;  二进制转为十进制，必须使用 二进制的源码进行转换。*/
////
////        //------------------------------------------------------------------------------------------------------
////        //流程控制语句   顺序结构、分支结构、循环结构
////        /* 分支结构  if
////        if(关系表达式){
////            语句体;
////        }
////
////        ps:对布尔类型的变量进行判断，不要用==号
////        */
////        boolean flag = sc.nextBoolean();
////        if(flag){
////            System.out.println("flag的值位true");
////        }
////
////        //练习：自动驾驶
////        boolean isLightGreen = sc.nextBoolean();
////        boolean isLightYellow = sc.nextBoolean();
////        boolean isLightRed = sc.nextBoolean();
////        if(isLightGreen){
////            System.out.println("go go go!");
////        }else if (isLightYellow) {
////            System.out.println("slow!");
////        }else {
////            System.out.println("stop!!!");
////        }
////
////        //分支语句switch
////        /*
////        switch(表达式){
////            case 值1:
////                语句体1;
////                break;
////            case 值2:
////                语句体2;
////                break;
////            ....
////            default:
////                语句体n+1;
////                break;
////        }
////
////        表达式：（将要匹配的值）取值为byte、short、int、char。JDK5以后可以说枚举，JDK7以后可以是String。
////        */
////        String noodle = sc.next();
////        switch(noodle){
////            case "武汉热干面":
////                System.out.println("吃武汉热干面");
////                break;
////            case "北京炸酱面":
////                System.out.println("吃北京炸酱面");
////                break;
////            case "兰州拉面":
////                System.out.println("吃兰州拉面");
////                break;
////            case "陕西油泼面":
////                System.out.println("吃陕西油泼面");
////                break;
////            default:
////                System.out.println("吃方便面");
////                break;
////        }
////        /*switch其他知识点
////            default的位置和省略
////        1.位置：default可以放在任意位置，习惯写在最下面
////        2.省略:default可以省略，但不介意
////
////            case 穿透
////                就是语句体中没写break导致的
////            执行流程：
////                首先还是会拿着小括号中表达式的值跟下面每一个case进行匹配。
////                如果匹配上了，就会执行相应语句体，如果此时发现了break,那么结束整个switch语句
////                否则，程序将会执行下一个case的语句体，一直遇到break或右大括号为止。
////
////            switch新特性：JDK12之后才可以用
////        */
////
////        //switch新特性，例子：需求：1 2 3  分别对应：一 二 三
////        /* 以前这样写
////        int number0 = 2;
////        switch(number0){
////            case 1:
////                System.out.println("一");
////                break;
////            case 2:
////                System.out.println("二");
////                break;
////            case 3:
////                System.out.println("三");
////                break;
////            default:
////                System.out.println("无此选项");
////                break;
////        }
////         */
////
////        /*  新特性方法，如果{中只有一个语句}，可省略{}
////        int number0 = 2;
////        switch (number0){
////            case 1 -> {
////                System.out.println("一");
////            }
////            case 2 -> System.out.println("二");
////            case 3 -> System.out.println("三");
////            default->System.out.println("无此选项");
////        }
////         */
////
////        //循环结构  for循环  while循环  do...while循环
////        /*
////            for循环
////         */
////        for(int ii = 1;ii<=10;ii++){
////            System.out.println("HelloWorld");
////        }
////
////        /*
////             while循环
////        初始化语句;
////        while(条件判断语句){
////            循环体语句;
////            条件控制语句;
////        }
////         */
////
////        /*
////            do...while循环  格式：
////        do{
////            循环语句体;
////            条件控制语句;
////        }while(条件判断语句);
////         */
////
////        /*    无限循环
////        for(;;){
////            System.out.println("学习");
////        }
////
////        while(true){
////            System.out.println("学习");
////        }
////
////        do{
////          System.out.println("学习");
////        }while(true);
////        */
////
////        //跳转控制循环 continue：跳过本次循环，继续执行下一次循环；break：结束整个循环。
////        //实例：逢7、过
////        for(int ij = 1;ij<=100;ij++){
////            if(ij%10==7||ij/10%10==7||ij%7==0){
////                System.out.println("过");
////                continue;
////            }
////            System.out.println(ij);
////        }
////
////        /*
////        猜数字
////         */
////        //先随机获取一个随机数   范围：0~10
////
////        //1.导包  自动生成了，可以不用写
////
////        //2.创建对象
////        /*
////        Random r= new Random();
////        //3.生成随机数
////        for(int ia=0;ia<100;ia++){
////            int numbera = r.nextInt(bound:10);//0~9
////            System.out.println(numbera);
////        }*/
//    }
//}