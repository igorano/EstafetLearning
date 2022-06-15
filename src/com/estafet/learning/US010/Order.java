package com.estafet.learning.US010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Order {
    public static boolean containsAlphabet(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!(ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }
    public void CustomCheckedException(String name, int age) throws CustomException {
        if(!containsAlphabet(name)) {
            String msg = "Improper name (Should contain only characters between a to z (all small))";
            throw new CustomException(msg);
        }
    }


    public static void main(String args[]) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        System.out.println("ArrayList : " + list.toString());

        HashMap<String, String> countryPhonePrefixes = new HashMap<String, String>();
        countryPhonePrefixes.put("BG", "+359");
        countryPhonePrefixes.put("DE", "+49");
        countryPhonePrefixes.put("UK", "+44");
        countryPhonePrefixes.put("US", "+1");
        System.out.println(countryPhonePrefixes);

        HashMap<String, Integer> citiesZipCodes = new HashMap<String, Integer>();
        citiesZipCodes.put("Sofia", 1000);
        citiesZipCodes.put("Vratsa", 3000);
        citiesZipCodes.put("Montana", 3400);
        citiesZipCodes.put("Pleven", 5800);
        System.out.println(citiesZipCodes);

    }
}
