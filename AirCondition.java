public class AirCondition extends HomeAppliancesStore {
    /**variable statements*/
    private int mhkos;
    private int upsos;
    private int vathos;
    private String onoma_kataskeuasti;
    private String onoma_suskebis;
    private String typos_suskeuhs;
    private int katanalvsh_reumatos;
    private boolean filtro_aeros;
    private int isxis_psixis;
    private int isxis_thermansis;
    private boolean Wifi;
    private String energeiaki_klasi_psixis;
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
    /**Constructor for initializing the Air Condition objects*/
    AirCondition(int mhkos, int upsos, int vathos, String onoma_kataskeuasti, String onoma_suskebis,
                 String typos_suskeuhs, int katanalvsh_reumatos, int isxis_psixis, int isxis_thermansis ,
                 String energeiaki_klasi_psixis, boolean filtro_aeros ,boolean Wifi){
        this.mhkos = mhkos;
        this.upsos = upsos;
        this.vathos = vathos;
        this.onoma_kataskeuasti = onoma_kataskeuasti;
        this.onoma_suskebis = onoma_suskebis;
        this.typos_suskeuhs = typos_suskeuhs;
        this.katanalvsh_reumatos = katanalvsh_reumatos;
        this.isxis_psixis=isxis_psixis;
        this.isxis_thermansis=isxis_thermansis;
        this.energeiaki_klasi_psixis=energeiaki_klasi_psixis;
        this.filtro_aeros=filtro_aeros;
        this.Wifi=Wifi;
    }
    /**Function for Air Condition device to print objects*/
    public void PrintAirCondition() {
        System.out.println("\ndevice details: ");
        System.out.println("dimensions: "+"\nmhkos:" +mhkos  +"\nupsos:"  +upsos  +"\nvathos:"  +vathos);
        System.out.println("onoma_kataskeasti: " + onoma_kataskeuasti);
        System.out.println("onoma_suskebis: " + onoma_suskebis);
        System.out.println("typos_suskeuhs: " + typos_suskeuhs);
        System.out.println("katanalvsh_reumatos: " + katanalvsh_reumatos);
        System.out.println("isxis_psixis: " + isxis_psixis);
        System.out.println("isxis_thermansis: " + isxis_thermansis);
        System.out.println("energeiaki_klasi_psixis: " + energeiaki_klasi_psixis);
        System.out.println("filtro_aeros: " + filtro_aeros);
        System.out.println("Wifi: " + Wifi);
    }
    /**Counter return to HomeApplianceStore*/
    public int getCounterAirCondition() {
        return Counter;}
    private void periodicMaintenance(){
    }
}
