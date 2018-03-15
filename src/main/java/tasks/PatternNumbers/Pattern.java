package tasks.PatternNumbers;

public class Pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            String line = "";

            for (int a = 1; a <= i; a++) {
                line += a;
            }

            for (int z = 1; z <= (7 - i); z++) {
                line += "*";
            }

            System.out.println(line);
        }

    }
}


