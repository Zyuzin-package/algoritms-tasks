package src.Patterns.AbstractFactory.banking;

import src.Patterns.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper write code...");
    }
}
