package src.Patterns.AbstractFactory.banking;

import src.Patterns.AbstractFactory.Developer;
import src.Patterns.AbstractFactory.Manager;
import src.Patterns.AbstractFactory.ProjectTeamFactory;
import src.Patterns.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getProjectManager() {
        return new BankingProjectManager();
    }
}
