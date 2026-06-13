package UAS_SDL;

public class Ticket {
    private String tiketID;
    private String nama;
    private String isiKomplain;
    private String Status;
    private int SLATime;


    public Ticket(String tiketID, String nama, String isiKomplain, String Status, int SLATime){
        this.tiketID = tiketID;
        this.nama = nama;
        this.isiKomplain = isiKomplain;
        this.Status = Status;
        this.SLATime = SLATime;
    }

    // INI KUTAMBAH BUAT ROLLBACK STATUS=========================================================================
    public void setStatus(String status){
        this.Status = status;
    }

    public void UpdateStatus(String newStatus) {
        this.Status = newStatus;
        System.out.println("Status tiket [" + tiketID + "] diperbarui menjadi: " + newStatus);
    }
    //=================================================================================================

    public void tampilTiket() {
        System.out.println("==============================");
        System.out.println("ID Tiket    : " + tiketID);
        System.out.println("Nama        : " + nama);
        System.out.println("Komplain    : " + isiKomplain);
        System.out.println("Status      : " + Status);
        System.out.println("SLA Time    : " + SLATime + " jam");
        System.out.println("==============================");
    }
    public void tampilStatus(){
        System.out.println(tiketID + " : " + Status);
    }
    public String getTiketID() {
        return tiketID;
    }
    public String getStatus() {
        return Status;
    }
    public int getSLATime() {
        return SLATime;
    }
}