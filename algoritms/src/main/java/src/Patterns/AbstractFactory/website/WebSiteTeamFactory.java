package src.Patterns.AbstractFactory.website;

import src.Patterns.AbstractFactory.Developer;
import src.Patterns.AbstractFactory.Manager;
import src.Patterns.AbstractFactory.ProjectTeamFactory;
import src.Patterns.AbstractFactory.Tester;
import src.Patterns.AbstractFactory.banking.QATester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getProjectManager() {
        return new ProjectManager();
    }
}
