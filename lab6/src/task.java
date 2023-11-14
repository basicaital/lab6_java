import java.io.*;

public class task {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aytal\\Desktop\\контрольная аип\\АиП\\Алгоритмизация 6 лаба\\BufferedReader.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\aytal\\Desktop\\контрольная аип\\АиП\\Алгоритмизация 6 лаба\\BufferedWrite.txt"))) {

            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+"); // Разделение строки на слова

                for (String word : words) {
                    if (startsWithConsonant(word)) {
                        bw.write("Line " + lineNumber + ": " + word);
                        bw.newLine();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!");;
        }
    }

    // Метод для определения, начинается ли слово с согласной буквы
    private static boolean startsWithConsonant(String word) {
        if (word.length() > 0) {
            char firstLetter = Character.toLowerCase(word.charAt(0));
            return !(firstLetter == 'а' || firstLetter == 'е' || firstLetter == 'ё' ||
                    firstLetter == 'и' || firstLetter == 'о' || firstLetter == 'у' ||
                    firstLetter == 'ы' || firstLetter == 'э' || firstLetter == 'ю' ||
                    firstLetter == 'я');
        }
        return false;
    }
}
