package src.Patterns.Builder;

public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setWebsiteBuilder(new EnterpriseWebSiteBuilder());
        WebSite webSite = director.buildWebsite();
        System.out.println(webSite);
    }
}
