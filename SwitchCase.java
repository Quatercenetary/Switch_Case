//package MyC;
import java.util.*;

public class SwitchCase {

    public static void main(String[] strarr){
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do{
            flag = true;
            System.out.printf("Select a choice:%n1. Hi%n2. Hey%n3. Hello%n%n");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Hi");
                    break;
                case 2:
                    System.out.print("Hey");
                    break;
                case 3:
                    System.out.print("Hello");
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.print("Try again\n\n");
                    flag = false;
            }
        }while(flag == false);
    }
}

