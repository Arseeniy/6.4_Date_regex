package com.arseeniy.dateregex;

import com.arseeniy.dateregex.solution.SolutionClass;

import static com.arseeniy.dateregex.solution.SolutionClass.*;

public class MainClass {

    private static String stringByWords = "Ребе, Ви случайно не знаете, сколько тогда Иуда получил по нынешнему курсу?";

    private static String phoneNumbers = "Для получение военного билета просьба позвонить по телефону: +7 (3412) 517-647. Or by another phone number: 8 (3412) 4997-12 ";


    private static String initialPattern = "Уважаемый, $userName, извещаем вас о том, что на вашем счете $номерСчета скопилась сумма, " +
            "превышающая стоимость $числоМесяцев месяцев пользования нашими услугами. " +
            "Деньги продолжают поступать. " +
            "Вероятно, вы неправильно настроили автоплатеж. С уважением, $пользовательФИО $должностьПользователя";

    private static String templateKey = "userName, номерСчета, числоМесяцев, пользовательФИО, должностьПользователя";

    private static String templateValue = "Ivan123, №12356947, 3, Иванов Д.С., менеджер";

    public static void main(String[] args) {
        System.out.println(getListOfWords(stringByWords));
        System.out.println(convertPhoneNumber(phoneNumbers));
        System.out.println(replaceString(initialPattern, templateKey, templateValue));

    }
}
