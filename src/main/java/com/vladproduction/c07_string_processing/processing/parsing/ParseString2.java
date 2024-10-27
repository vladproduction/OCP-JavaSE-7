package com.vladproduction.c07_string_processing.processing.parsing;

/**
 * string containing the path of a folder, and you want to parse this string and
 * print individual folder names
 * */
public class ParseString2 {
    public static void main(String[] args) {
        String str = "c:\\work\\programs\\parser";
        String [] dirList = str.split("\\\\");
        for (int i=0; i<dirList.length; i++) {
            System.out.println(dirList[i]);
        }
    }
}
