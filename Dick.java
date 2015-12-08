import java.util.Scanner;
 public class Dick{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int i = 2;
         System.out.println("Введите текст");
         if(sc.hasNextInt()){
             i = sc.nextInt();
             System.out.println(i*2);
         } else {
             System.out.println("Хорошо");
         }
     }
 }
