import java.util.Scanner;

public class TestQuiz {
    public static void main(String[] args) {
        boolean answer1;
        boolean answer2;
        boolean answer3;


        Scanner scanner = new Scanner(System.in);
        MathQuiz mQ = new MathQuiz();

        System.out.println("To jest quiz matematyczny. Proszę odpowiedzieć na trzy pytania.");

        answer1 = mQ.question1(scanner);
        if (answer1 == true){
            System.out.println("Odpowiedź jest poprawna. Wynik mnożenia 3*5 to 15.");
        } else {
            System.out.println("Odpowiedż nieprawidłowa. Poprawny wynik to 15.");}

        answer2 = mQ.question2(scanner);
        if (answer2 == true){
            System.out.println("Odpowiedź jest poprawna. Wynik pola kwadratu o boku 12 to 144.");
        } else {
            System.out.println("Odpowiedż nieprawidłowa. Poprawny wynik to 144.");}

        answer3 = mQ.question3(scanner);
        if (answer3 == true){
            System.out.println("Odpowiedź jest poprawna. Wynik pierwiastka kwadratowego z liczby 15129 to 123");
        }else {
            System.out.println("Odpowiedż nieprawidłowa. Poprawny wynik to 123.");
        }

    }
}
