package src.Patterns.Builder;

public abstract class WebsiteBuilder {
    WebSite webSite;

    void createWebsite() {
        webSite = new WebSite();
    }

    abstract void buildName();

    abstract void buildCMS();

    abstract void buildPrise();

    WebSite getWebSite() {
        return webSite;
    }
}
