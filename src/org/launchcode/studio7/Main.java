package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        BaseDisc wordDiscOne = new DVD("Work Disc One", 400.0, "work", "DVD", true, 500.0, true);

        System.out.println(wordDiscOne.eject().toString());
        System.out.println(wordDiscOne.spinDisc());
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
