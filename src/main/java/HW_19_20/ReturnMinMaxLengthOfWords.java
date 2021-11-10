package HW_19_20;

import java.util.*;

public class ReturnMinMaxLengthOfWords {

    // Напишите метод, который в строке находит слова
    // минимальной и максимальной длины, и количество
    // слов одинаковой длины (максимально одинаковой).

    public static String[] returnMinMaxLengthOfWords(String str) {

        String strOnlyLetters = str.replaceAll("[^a-zA-Z ]", "");

        List<String> arrayList = Arrays.asList(strOnlyLetters.split(" "));
        List<Integer> wordsLength = new ArrayList<>();

        for (String item : arrayList) {
            wordsLength.add(item.length());
        }

        int countOfWordsWithSimilarLength = 0;

        for (int i = 1; i < wordsLength.size(); i++) {
            if (countOfWordsWithSimilarLength + 1 < Collections.frequency(wordsLength, wordsLength.get(i))) {
                countOfWordsWithSimilarLength = Collections.frequency(wordsLength, wordsLength.get(i));
            }
        }

        String maxLongWord = arrayList.stream().max((str1, str2) -> str1.length() > str2.length() ? 1: -1).get();
        String minLongWord = arrayList.stream().min((str1, str2) -> str1.length() > str2.length() ? 1: -1).get();

        return new String[]{minLongWord, maxLongWord, Integer.toString(countOfWordsWithSimilarLength)};
    }
}
