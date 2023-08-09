package src.Patterns.Builder;

public class VisitCartWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Visit cart");
    }

    @Override
    void buildCMS() {
        webSite.setCms(CMS.WORDPRESS);
    }

    @Override
    void buildPrise() {
        webSite.setPrice(78);
    }
}
