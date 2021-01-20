public class Oven extends HomeAppliancesStore {
    /**variable statements*/
    private int mhkos;
    private int upsos;
    private int vathos;
    private String onoma_kataskeuasti;
    private String onoma_suskebis;
    private String typos_suskeuhs;
    private int katanalvsh_reumatos;
    private String energeiakh_klasi;
    private String xroma;
    private boolean psifiaki_othoni;
    private int xvritikotita_fournou;
    private String typos_estion;
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

    public static void Object_Size() {

    }
    /**Constructor for initializing the Oven objects*/
    Oven(int mhkos, int upsos, int vathos, String onoma_kataskeuasti, String onoma_suskebis,
         String typos_suskeuhs, int katanalvsh_reumatos, String energeiaki_klasi, String xroma,
         boolean psifiaki_othoni, int xvritikotita_fournou, String typos_estion) {
        this.mhkos = mhkos;
        this.upsos = upsos;
        this.vathos = vathos;
        this.onoma_kataskeuasti = onoma_kataskeuasti;
        this.onoma_suskebis = onoma_suskebis;
        this.typos_suskeuhs = typos_suskeuhs;
        this.katanalvsh_reumatos = katanalvsh_reumatos;
        this.energeiakh_klasi = energeiaki_klasi;
        this.xroma = xroma;
        this.psifiaki_othoni = psifiaki_othoni;
        this.xvritikotita_fournou = xvritikotita_fournou;
        this.typos_estion = typos_estion;
    }
    /**Function for Oven device to print objects*/
    public void PrintOven() {
        System.out.println("\ndevice details: ");
        System.out.println("dimensions: "+"\nmhkos:" +mhkos  +"\nupsos:"  +upsos  +"\nvathos:"  +vathos);
        System.out.println("onoma_kataskeasti: " + onoma_kataskeuasti);
        System.out.println("onoma_suskebis: " + onoma_suskebis);
        System.out.println("typos_suskeuhs: " + typos_suskeuhs);
        System.out.println("katanalvsh_reumatos: " + katanalvsh_reumatos);
        System.out.println("energeiaki_klasi: " + energeiakh_klasi);
        System.out.println("xroma: " + xroma);
        System.out.println("psifiaki_othoni: " + psifiaki_othoni);
        System.out.println("xvritikotita_fournou: " + xvritikotita_fournou);
        System.out.println("typos_estion: " + typos_estion);
    }
    /**Counter return to HomeApplianceStore*/
    public int getCounterOven() {
        return Counter;}

    private void periodicMaintenance() {
    }
}

