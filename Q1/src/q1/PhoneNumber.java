package q1;
public class PhoneNumber {
    private int maVung;
    private String sdt;

    public PhoneNumber() {
    }

    public PhoneNumber(int maVung, String sdt) {
        this.maVung = maVung;
        this.sdt = sdt;
    }

    public int getMaVung() {
        return maVung;
    }

    public void setMaVung(int maVung) {
        this.maVung = maVung;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    @Override
    public String toString(){
        return "0"+maVung+"-"+sdt;
    }
    
}
