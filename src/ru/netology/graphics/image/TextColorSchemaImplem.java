package ru.netology.graphics.image;

public class TextColorSchemaImplem implements TextColorSchema {

    public TextColorSchemaImplem () {
    }

    @Override
    public char convert(int color) {
        int charColor = color / 32;
        char[] charList = new char[]{'#', '$', '@', '%', '*', '+', '-', '\"'};
        return charList[charColor];
    }
}
