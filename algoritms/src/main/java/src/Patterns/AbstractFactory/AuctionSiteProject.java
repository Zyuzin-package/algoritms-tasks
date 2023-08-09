package src.Patterns.AbstractFactory;

import src.Patterns.AbstractFactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Website system");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
