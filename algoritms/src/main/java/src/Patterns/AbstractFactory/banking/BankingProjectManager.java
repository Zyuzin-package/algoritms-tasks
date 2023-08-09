package src.Patterns.AbstractFactory.banking;

import src.Patterns.AbstractFactory.Manager;

public class BankingProjectManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Banking Project Manager manages project..." );
    }
}
