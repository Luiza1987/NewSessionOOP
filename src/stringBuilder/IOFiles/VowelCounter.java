package stringBuilder.IOFiles;

public class VowelCounter {
    public static int countVowels(String text) {
        String vowels = "аеёиоуэюя";
        int count = 0;

        for (char ch : text.toLowerCase().toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
