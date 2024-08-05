package com.basava.structural.flyweight_pattern;

public class DocumentCharacter implements ILetter{

    private final char character;
    private final String fontType;
    private final int size;

    DocumentCharacter(char character, String fontType, int size){
        this.character = character;
        this.fontType = fontType;
        this.size = size;

    }

    public char getCharacter() {
        return character;
    }

    public String getFontType() {
        return fontType;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void display(int row, int column) {
        //display the character of particular font and size
        //at given location
        System.out.println(
                this.getCharacter() + " has font type of " + this.getFontType() + " and size: " + this.getSize() +
                        " located at (X, Y): " + "(" + row + ", " + column + ")"
        );
    }
}

