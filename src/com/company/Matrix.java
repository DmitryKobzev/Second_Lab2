package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    int [][]arr;
    int n;
    int []sum;

    public Matrix(int n)throws Exception{
        if(n<0){
            throw new Exception("Error!!!n-натуральное число");
        }
        arr=new int[n][n];
        sum=new int [(n-1)*2];
    }
    public void GetMatrix(){
        Random rand=new Random();
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(20);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public void Task()throws Exception{
            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length-i; j++) {
                        sum[i-1] += Math.abs(arr[i+j][j]);
                        sum[sum.length-i]+=Math.abs(arr[j][i+j]);
                }
            }
            for(int i=0;i<sum.length;i++){
                System.out.println(sum[i]);
            }
            Arrays.sort(sum);
        System.out.println("Максимальная сумма="+sum[sum.length-1]);
    }
}
