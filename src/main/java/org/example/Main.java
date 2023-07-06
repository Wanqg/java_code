package org.example;


public class Main {
    public static void main(String[] args) {
        //方法（method）是程序中最小的执行单元  跟c++函数差不多
        /*
        格式：
        public static void方法名(){
            方法体
        }
         */
        play();

        //带参数的方法
        get_sum(5,10);

        //带有返回值的方法   直接调用 赋值调用
        //直接调用
        get_zj(10,20,30);

        //赋值调用
        int fz = get_zj(10,20,30);
        System.out.println(fz);

        //输出调用
        System.out.println(get_zj(10,20,30));
    }

    public static void play(){
        System.out.println("da");
    }

    //带参数的方法
    public static void get_sum(int num1, int num2){
        int result = num1+num2;
        System.out.println(result);
    }

    public static int get_zj(int n1,int n2,int n3){
        int result1 = n1+n2+n3;
        return result1;
    }

    //方法重载

    
}