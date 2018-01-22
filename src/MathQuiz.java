import java.util.Scanner;

public class MathQuiz {

    Scanner scanner;

    public MathQuiz(Scanner scanner){
        this.scanner = scanner;
    }

    boolean question1(){
        int answer1;
        System.out.println("Jaki jest wynik mnożenia 3*5?");
        System.out.print("Odpowiedź: ");
        answer1 = scanner.nextInt();
        return answer1 == 15;

    }
    boolean question2(){
        int answer2;
        System.out.println("Jaki jest pole kwadratu o boku 12?");
        System.out.print("Odpowiedź: ");
        answer2 = scanner.nextInt();
        return answer2 == 144;

    }
    boolean question3(){
        int answer3;
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        System.out.print("Odpowiedź: ");
        answer3 = scanner.nextInt();
        return answer3 == 123;

    }

}
