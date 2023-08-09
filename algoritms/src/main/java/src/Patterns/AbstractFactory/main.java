package src.Patterns.AbstractFactory;

import src.Patterns.AbstractFactory.website.ManualTester;
import src.Patterns.AbstractFactory.website.PhpDeveloper;
import src.Patterns.AbstractFactory.website.ProjectManager;

public class main {
    public static void main(String[] args) {
        PhpDeveloper phpDeveloper = new PhpDeveloper();
        ManualTester manualTester = new ManualTester();
        ProjectManager projectManager = new ProjectManager();

        System.out.println("Creating Project");
        phpDeveloper.writeCode();
        manualTester.testCode();
        projectManager.manageProject();

    }
}
