package com.solid.srp;

import java.util.List;

public class SrpApp {
    public static void main(String[] args) {
        List.of(new Book("The Title", "Mr. Author", 2005),
                new Book("The Next Title", "Mr. Next Author", 2003),
                new Book("The First Title", "Mr. First Author", 1995))
                .forEach(BookPrinter::print);
    }
}
