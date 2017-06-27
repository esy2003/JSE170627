package com.hanbit.algorithm.sequence;
import java.util.Scanner;
public class TopLanking{
   public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      int[] arr = {0,0,0,0,100};    //학생수, 합계, 평균, 최대, 최소
      System.out.print("1반의 총 학생 수는 몇 명?");
      arr[0]=scan.nextInt();
      int[] avgs = new int[arr[0]];
      for(int i=0;i<avgs.length;i++){
         System.out.print("학생의 평균 점수 입력하세요(100점 만점))");
         avgs[i]=scan.nextInt();
      }
      
      for(int i=0;i<avgs.length;i++){
         arr[1] += avgs[i];
      }
      
      arr[2]=arr[1]/arr[0];
      
      for(int i=0;i<avgs.length;i++){
         if(avgs[i]>arr[3]){
            arr[3]=avgs[i];
         }
         
         if(avgs[i]<arr[4]){
            arr[4]=avgs[i];
         }         
      }

   
   
      System.out.print("1반의 평균점수는 " + arr[2]);
      System.out.print("최대 점수는 " + arr[3]);
      System.out.print("최소 점수는 " + arr[4]);
      
   }
}
/*
import java.util.Scanner;
public class TopRanking{
   public static void main (String[] args){
      Scanner scan=new Scanner(System.in);
      
      System.out.print("1반의 총 학생수는 몇명?");
      int num=scan.nextInt();
      int[] scores = new int[num];
      for(int i=0;i<num;i++){
         System.out.print("학생의 점수를 입력하세요(100점 만점)?");
         scores[i]=scan.nextInt();
      }
      
      int sum=0;
      for(int i=0; i<scores.length;i++){
         sum+=scores[i];
      }
      int avg=sum/num;
      System.out.println("1반의 평균점수는?\n"+avg);
      
      
      int max=scores[0];
      for(int i=0; i<num; i++){
         if(scores[i]>max){
            max=scores[i];
         }
      }
      System.out.println("최대 점수는 \n"+max);
      
      int min=scores[0];
      for(int i=0; i<num; i++){
         if(scores[i]<min){
            min=scores[i];
         }
      }
      System.out.println("최소 점수는 \n"+min);
   }
}
*/