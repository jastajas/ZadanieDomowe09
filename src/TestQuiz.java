import java.util.Scanner;

public class TestQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MathQuiz mQ = new MathQuiz();

        System.out.println("To jest quiz matematyczny. Proszę odpowiedzieć na trzy pytania.");


        if (mQ.question1(scanner)){
            System.out.println("Odpowiedź jest poprawna. Wynik mnożenia 3*5 to 15.");
        } else {
            System.out.println("Odpowiedż nieprawidłowa. Poprawny wynik to 15.");}

        if (mQ.question2(scanner)){
            System.out.println("Odpowiedź jest poprawna. Wynik pola kwadratu o boku 12 to 144.");
        } else {
            System.out.println("Odpowiedż nieprawidłowa. Poprawny wynik to 144.");}

        if (mQ.question3(scanner)){
            System.out.println("Odpowiedź jest poprawna. Wynik pierwiastka kwadratowego z liczby 15129 to 123");
        }else {
            System.out.println("Odpowiedż nieprawidłowa. Poprawny wynik to 123.");
        }

    }
}
