package com.DWS;
//移除元素

//给你一个数组 nums 和一个值 val，你需要在地移除所有数值等于 val 的元素

//举例：

//输入：nums = \[3,2,2,3], val = 3

import java.util.Scanner;

//输出：剩下2个元素, nums = \[2,2]
public class Demo1 {
    public static void main(String[] args) {
        //利用字符串数组按行读取数据
        String str;
        String[] strarr=new String[0];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数组元素，每个元素之间用空格隔开");
        while (sc.hasNextLine())
        {
            str=sc.nextLine();
            if(str.isEmpty())
            {
                break;
            }
            strarr=str.split(" ");

        }
        //将字符串数组转换成int数组
        int[] nums=new int[strarr.length];
        for (int i=0;i<strarr.length;i++)
        {
            nums[i]=Integer.parseInt(strarr[i]);
        }
        System.out.println("请输入要删除的元素");
        int val=sc.nextInt();
        //删除元素
        //双指针
        int slow=0;
        for(int fast=0;fast<nums.length;fast++)
        {
            if(nums[fast]!=val)
            {
                nums[slow]=nums[fast];
                slow++;
            }
        }
        System.out.println("删除后数组长度为："+slow+"个元素");
        System.out.println("删除后的数组为：");
        for(int i=0;i<slow;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
