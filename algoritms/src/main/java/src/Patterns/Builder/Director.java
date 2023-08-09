package src.Patterns.Builder;

public class Director {
    WebsiteBuilder websiteBuilder ;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }
    WebSite buildWebsite (){
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCMS();
        websiteBuilder.buildPrise();
        return websiteBuilder.getWebSite();
    }
}
