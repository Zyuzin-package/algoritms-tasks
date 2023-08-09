package src.Patterns.AbstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getProjectManager();
}
