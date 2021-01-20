public class Washing_Machine extends HomeAppliancesStore{
    /**variable statements*/
    private int mhkos;
    private int upsos;
    private int vathos;
    private String onoma_kataskeuasti;
    private String onoma_suskebis;
    private String typos_suskeuhs;
    private int katanalvsh_reumatos;
    private int RPM;
    private int ogos_plhdiriou;
    private int arithmos_programmatvn;
    private boolean eksipnes_leitourgeies;
    private int Washing_Noise_Level;
    /** Getters and Setters*/
    public int getMhkos() {
        return mhkos;
    }

    public void setMhkos(int newmhkos) {
        this.mhkos = newmhkos;
    }

    public int getUpsos() {
        return upsos;
    }

    public void setUpsos(int newupsos) {
        this.upsos = newupsos;
    }

    public int getVathos() {
        return vathos;
    }

    public void setVathos(int newvathos) {
        this.vathos = newvathos;
    }

    public String getOnoma_kataskeuasti() {
        return onoma_kataskeuasti;
    }

    public void setOnoma_kataskeuasti(String newonoma_kataskeuasti) {
        this.onoma_kataskeuasti = newonoma_kataskeuasti;
    }

    public String getOnoma_suskebis() {
        return onoma_suskebis;
    }

    public void setOnoma_suskebis(String newonoma_suskebis) {
        this.onoma_suskebis = newonoma_suskebis;
    }

    public String getTypos_suskeuhs() {
        return typos_suskeuhs;
    }

    public void setTypos_suskeuhs(String newtypos_suskeuhs) {
        this.typos_suskeuhs = newtypos_suskeuhs;
    }

    public int getKatanalvsh_reumatos() {
        return katanalvsh_reumatos;
    }

    public void setKatanalvsh_reumatos(int newkatanalvsh_reumatos) {
        this.katanalvsh_reumatos = katanalvsh_reumatos;
    }
    /**Constructor for initializing the WashineMachine objects*/
    Washing_Machine(int mhkos, int upsos, int vathos, String onoma_kataskeuasti, String onoma_suskebis,
                   String typos_suskeuhs, int katanalvsh_reumatos, int ogos_plhdiriou , int Washing_Noise_Level ,
                   boolean eksipnes_leitourgeies , int arithmos_programmatvn , int RPM ) {
        this.mhkos = mhkos;
        this.upsos = upsos;
        this.vathos = vathos;
        this.onoma_kataskeuasti = onoma_kataskeuasti;
        this.onoma_suskebis = onoma_suskebis;
        this.typos_suskeuhs = typos_suskeuhs;
        this.katanalvsh_reumatos = katanalvsh_reumatos;
        this.arithmos_programmatvn=arithmos_programmatvn;
        this.eksipnes_leitourgeies=eksipnes_leitourgeies;
        this.RPM=RPM;
        this.ogos_plhdiriou=ogos_plhdiriou;
        this.Washing_Noise_Level=Washing_Noise_Level;
    }
    /**Function for Washine Machine device to print objects*/
    public void PrintWashing_Machine() {
        System.out.println("\ndevice details: ");
        System.out.println("dimensions: "+"\nmhkos:" +mhkos  +"\nupsos:"  +upsos  +"\nvathos:"  +vathos);
        System.out.println("onoma_kataskeasti: " + onoma_kataskeuasti);
        System.out.println("onoma_suskebis: " + onoma_suskebis);
        System.out.println("typos_suskeuhs: " + typos_suskeuhs);
        System.out.println("katanalvsh_reumatos: " + katanalvsh_reumatos);
        System.out.println("Washine noise level: " +Washing_Noise_Level);
        System.out.println("ogos_plhntigiou: " +ogos_plhdiriou);
        System.out.println("eksipnes_leitourgeies: " +eksipnes_leitourgeies);
        System.out.println("arithmos_programmatvn: " +arithmos_programmatvn);
        System.out.println("Number of RPM's: " +RPM);
    }
    /**Counter return to HomeApplianceStore*/
    public int getCounterWashing_Machine() {
        return Counter;}

    private void periodicMaintenance() {
    }
}
