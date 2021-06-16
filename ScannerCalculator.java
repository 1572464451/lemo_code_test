package com.Day.Day04.Work04;

import java.util.Scanner;
//Scanner所实例化的对象读取用户在命令行输入的各种数据类型　　
//next.Byte(),
// nextDouble(),
// nextFloat,nextInt(),
// nextLine(),
// nextLong(),
// nextShot()
/**
 * @Project: JAVA29_BASE
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2020 版权所有 湖南省零檬信息技术有限公司
 * @Author: v_zhlv
 * @Create: 2021-05-08 16:52
 * @Desc：
 **/

public class ScannerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator CL =new Calculator();
        System.out.println("请输入运算符");
        String sign =input.nextLine();
        System.out.println("请输入第一个数字");
        CL.a =input.nextInt();

        System.out.println("请输入第二个数字");
         CL.b =input.nextInt();
        if (sign.equals("+")){
            CL.add();

        }
        else if (sign.equals("-")){
            CL.subtraction();
        }
        else if (sign.equals("*")){
            CL.multiplication();
        }
        else if (sign.equals("/")){
            CL.division();
        }
        else {
            System.out.println("输入有误");
        }
    }
}
