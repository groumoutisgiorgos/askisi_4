public class Fridge extends HomeAppliancesStore {
    /**variable statements*/
    private int mhkos;
    private int upsos;
    private int vathos;
    private String onoma_kataskeuasti;
    private String onoma_suskebis;
    private String typos_suskeuhs;
    private int katanalvsh_reumatos;
    private String energeiaki_klasi;
    private String xroma;
    private int xvritikotita_sudirisis;
    private int xvritikotita_katapsiksis;
    private boolean entixismeno;
    /** Getters and Setters*/
    public int getMhkos () {
        return mhkos;
    }

    public void setMhkos (int newmhkos){
        this.mhkos = newmhkos;
    }

    public int getUpsos () {
        return upsos;
    }

    public void setUpsos (int newupsos){
        this.upsos = newupsos;
    }

    public int getVathos () {
        return vathos;
    }

    public void setVathos (int newvathos){
        this.vathos = newvathos;
    }

    public String getOnoma_kataskeuasti () {
        return onoma_kataskeuasti;
    }

    public void setOnoma_kataskeuasti (String newonoma_kataskeuasti){
        this.onoma_kataskeuasti = newonoma_kataskeuasti;
    }

    public String getOnoma_suskebis () {
        return onoma_suskebis;
    }

    public void setOnoma_suskebis (String newonoma_suskebis){
        this.onoma_suskebis = newonoma_suskebis;
    }

    public String getTypos_suskeuhs () {
        return typos_suskeuhs;
    }

    public void setTypos_suskeuhs (String newtypos_suskeuhs){
        this.typos_suskeuhs = typos_suskeuhs;
    }

    public int getKatanalvsh_reumatos () {
        return katanalvsh_reumatos;
    }

    public void setKatanalvsh_reumatos (int newkatanalvsh_reumatos) {
        this.katanalvsh_reumatos = newkatanalvsh_reumatos;
    }
    /**Constructor for initializing the Fridge objects*/
    Fridge(int mhkos, int upsos, int vathos, String onoma_kataskeuasti, String onoma_suskebis,
           String typos_suskeuhs, int katanalvsh_reumatos, String energiaki_klasi, String xroma ,
           int xvritikotita_katapsiksis, boolean entixismeno ,int xvritikotita_sudirisis){
        this.mhkos = mhkos;
        this.upsos = upsos;
        this.vathos = vathos;
        this.onoma_kataskeuasti = onoma_kataskeuasti;
        this.onoma_suskebis = onoma_suskebis;
        this.typos_suskeuhs = typos_suskeuhs;
        this.katanalvsh_reumatos = katanalvsh_reumatos;
        this.xvritikotita_sudirisis=xvritikotita_sudirisis;
        this.xvritikotita_katapsiksis=xvritikotita_katapsiksis;
        this.energeiaki_klasi=energiaki_klasi;
        this.entixismeno=entixismeno;
        this.xroma=xroma;
        ++Counter;
    }
    /**Function for Fridge device to print objects*/
    public void PrintFridge() {
        System.out.println("\ndevice details: ");
        System.out.println("dimensions: "+"\nmhkos:" +mhkos  +"\nupsos:"  +upsos  +"\nvathos:"  +vathos);
        System.out.println("onoma_kataskeasti: " + onoma_kataskeuasti);
        System.out.println("onoma_suskebis: " + onoma_suskebis);
        System.out.println("typos_suskeuhs: " + typos_suskeuhs);
        System.out.println("katanalvsh_reumatos: " + katanalvsh_reumatos);
        System.out.println("xvritikotita_katapsiksis: " + xvritikotita_katapsiksis);
        System.out.println("xvritikotita_sudirisis: " + xvritikotita_sudirisis);
        System.out.println("energeiaki_klasi: " + energeiaki_klasi);
        System.out.println("entixismeno: " + entixismeno);
        System.out.println("xroma: " + xroma);

    }
    /**Counter return to HomeApplianceStore*/
    public int getCounterFridge() {
        return Counter;}
    private void periodicMaintenance(){
    }
}
