package Lesson3;

public class Number3_1 {

     public static void main(String[] args) {
          int[][]name=new int[8][8];
         for (int i = 0; i < name.length; i++) {
           for (int j = 0; j < name.length; j++) {
             if((i+j)%2==0){
           System.out.print(" "+ "W");}
             else if ((i+j)%2==1){
                   System.out.print(" " + "B");
               }
                  }
                System.out.println();
          }
         }
         }



