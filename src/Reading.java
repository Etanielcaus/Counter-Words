import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        int emptyLineCount = 0;

        System.out.println("Write the text: ");
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.isEmpty()) {
                emptyLineCount++;
                if (emptyLineCount == 2) {
                    break;
                }
            } else {
                emptyLineCount = 0;
                text.append(line).append("\n");
            }
        }

        String newText = text.toString();
        String[] words = newText.split("\\s+");
        int quantityWords = words.length;
        System.out.println("Quantity of Words is: " + quantityWords);

    }
}
