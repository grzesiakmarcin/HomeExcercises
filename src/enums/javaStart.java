package enums;

public enum javaStart {
    CZERWONY(true),
    NIEBIESKI(true),
    JOGURTOWY(false),
    ZIELONY(true);

    private boolean czyFacetOgarnie;

    private javaStart(boolean czyFacetOgarnie) {

        this.czyFacetOgarnie = czyFacetOgarnie;
    }

    public boolean czyFacetOgarnie() {
        return czyFacetOgarnie;

    }

}
