import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        FizzBuzz
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Number: ");
//        int num = scanner.nextInt();
//
//
//        if(num % 5 == 0 && num % 3 == 0) System.out.println("FizzBuzz");
//        else if(num % 5 == 0) System.out.println("Fizz");
//        else if (num % 3 == 0) System.out.println("Buzz");
//        else System.out.println(num);

//        for && while loops
//        for(int i = 0; i < 5; i++){
//            System.out.println("Hello World");
//        }
//
//        int i = 0;
//        while(i < 5){
//            System.out.println("Hello World");
//            i++;
//        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}