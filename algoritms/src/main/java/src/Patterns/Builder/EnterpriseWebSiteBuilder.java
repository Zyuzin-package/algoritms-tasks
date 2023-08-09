package src.Patterns.Builder;

public class EnterpriseWebSiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Enterprise cart");
    }

    @Override
    void buildCMS() {
        webSite.setCms(CMS.ALFRESCO);
    }

    @Override
    void buildPrise() {
        webSite.setPrice(56);
    }

}
