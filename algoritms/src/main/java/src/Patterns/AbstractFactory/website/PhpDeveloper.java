package src.Patterns.AbstractFactory.website;

import src.Patterns.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
   public void writeCode(){
        System.out.println("PhpDeveloper write code...");
    }
}
