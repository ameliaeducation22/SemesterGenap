package UAS_SDL;

public class Status {
    private final String namaStatus;

    public Status(String namaStatus) {
        this.namaStatus = namaStatus;
    }
//    public String getNamaStatus(){
//        return namaStatus;
//    }
    @Override
    public String toString(){
        return namaStatus;
    }
}