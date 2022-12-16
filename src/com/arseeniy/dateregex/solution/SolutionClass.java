package com.arseeniy.dateregex.solution;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionClass {

    public static String getListOfWords(String input) {

        Pattern pattern = Pattern.compile("\\p{L}+");
        Matcher matcher = pattern.matcher(input);
        String result = "";
        String tempered = "";
        String max = "";
        matcher.find();
        String min = input.substring(matcher.start(), matcher.end());

        matcher.reset();
        while (matcher.find()) {
            tempered = input.substring(matcher.start(), matcher.end());
            result = result + tempered + "\n";
            if (tempered.length() > max.length()) {
                max = tempered;
            }
            if (tempered.length() < min.length()) {
                min = tempered;
            }
        }
        System.out.println("Самое короткое слово: " + min + "\n"
                + "Самое длинное слово: " + max);
        return result;
    }

    public static String convertPhoneNumber(String input) {
        String temperedNumber;
        Pattern pattern = Pattern.compile("((\\+)?(\\d))[ ]((\\()?(\\d{4})(\\))?)[ ](\\d{2,4})[-](\\d{2,3})([-]\\d{2})?");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            temperedNumber = matcher.group(0);
            input = input.replace(temperedNumber, temperedNumber
                    .replaceAll("((\\+)?(\\d{1}))[ ]((\\()?(\\d{4})(\\))?)[ ]", ""));
        }
        return input;
    }

    public static String replaceString(String pattern, String templateKey, String templateValue) {
        List<String> templateKeyList = Arrays.asList(templateKey.split(", "));
        List<String> templateValueList = Arrays.asList(templateValue.split(", "));
        for (int i = 0; i < templateKeyList.size(); i++) {
            pattern = pattern.replace("$" + templateKeyList.get(i), templateValueList.get(i));
        }
        return pattern;
    }
}
