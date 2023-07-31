import java.util.Scanner;

public class Iqbal_Hilmi_Wibowo {
    public static void main(String[] args) {
        String[] questions = {
            "1. Hewan Terbesar di Dunia\n(a) Paus Biru\n(b) Gajah\n(c) Sperm Whale",
            "2. Siapakah Orang Pertama Yang Mendarat di Bulan\n(a) Donald Trump\n(b) Neil Armstrong\n(c) Joe Biden",
            "3. Siapakah penemu gravitasi?\n(a) Galileo Galilei\n(b) Isaac Newton\n(c) Albert Einstein"
        };

        char[] answers = {'a', 'b', 'b'};
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            char userAnswer = Character.toLowerCase(scanner.nextLine().charAt(0));
            if (userAnswer == answers[i]) {
                System.out.println("Jawaban Anda benar!");
                score++;
            } else {
                System.out.println("Jawaban Anda salah!");
            }
            System.out.println();
        }

        System.out.println("Skor akhir Anda: " + score + " dari " + questions.length);
    }
}
