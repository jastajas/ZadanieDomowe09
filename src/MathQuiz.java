import java.util.Scanner;

public class MathQuiz {

    boolean question1(Scanner scanner){
        int answer1;
        System.out.println("Jaki jest wynik mnożenia 3*5?");
        System.out.print("Odpowiedź: ");
        answer1 = scanner.nextInt();
        if(answer1 == 15){
            return true;
        } else {
            return false;
        }
    }
    boolean question2(Scanner scanner){
        int answer2;
        System.out.println("Jaki jest pole kwadratu o boku 12?");
        System.out.print("Odpowiedź: ");
        answer2 = scanner.nextInt();
        if(answer2 == 144){
            return true;
        } else {
            return false;
        }
    }
    boolean question3(Scanner scanner){
        int answer3;
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        System.out.print("Odpowiedź: ");
        answer3 = scanner.nextInt();
        if(answer3 == 123){
            return true;
        } else {
            return false;
        }
    }

}
