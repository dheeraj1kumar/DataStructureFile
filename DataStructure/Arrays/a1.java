//package DataStructure.Arrays;

import java.util.Scanner;

public class a1 {


    static void reverseArray(int a[],int start,int end)
    {
        int temp;
        while(start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
  public  static void printl(int a[],int n){
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    
    System.out.println();}
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();}
        reverseArray(a, 0, 5);
        printl(a, n);

    }
    
}
