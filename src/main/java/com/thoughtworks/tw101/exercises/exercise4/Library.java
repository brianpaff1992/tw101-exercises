package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public String printBooksContaining(String partialBookTitle) {

        printStream.println(partialBookTitle + " - ");

        for(String title: books)
        {
            if(title.contains(partialBookTitle))
            {
                printStream.println(title);
            }
        }

        //Create an extra blank line at the end for readability.
        printBlankLine();

        //I'm not sure what string was intended to be returned, it does not say in the prompt
        return partialBookTitle;
    }

    private void printBlankLine() {
        printStream.println("");
    }
}
