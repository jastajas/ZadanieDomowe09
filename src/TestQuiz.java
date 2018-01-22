import java.util.Scanner;

public class TestQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MathQuiz mQ = new MathQuiz(new Scanner(System.in));
        int noCorrect = 0;

        System.out.println("To jest quiz matematyczny. Proszę odpowiedzieć na trzy pytania.");


        if (mQ.question1()){
            System.out.println("Odpowiedź jest poprawna. Wynik mnożenia 3*5 to 15.");
            noCorrect++;
        } else {
            System.out.println("Odpowiedż nieprawidłowa. Poprawny wynik to 15.");}

        if (mQ.question2()){
            System.out.println("Odpowiedź jest poprawna. Wynik pola kwadratu o boku 12 to 144.");
            noCorrect++;
        } else {
            System.out.println("Odpowiedż nieprawidłowa. Poprawny wynik to 144.");}

        if (mQ.question3()){
            System.out.println("Odpowiedź jest poprawna. Wynik pierwiastka kwadratowego z liczby 15129 to 123");
            noCorrect++;
        }else {
            System.out.println("Odpowiedż nieprawidłowa. Poprawny wynik to 123.");
        }

        System.out.println("Wynik testu to: " + noCorrect + "/3");



    }
}
