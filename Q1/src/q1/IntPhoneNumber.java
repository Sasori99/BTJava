package q1;

public class IntPhoneNumber extends PhoneNumber{
    private int maQG;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(int maQG, int maVung, String sdt) {
        super(maVung, sdt);
        this.maQG = maQG;
    }

    public int getMaQG() {
        return maQG;
    }

    public void setMaQG(int maQG) {
        this.maQG = maQG;
    }

    @Override
    public String toString() {
        return maQG + "-" + super.getMaVung() + "-" + super.getSdt();
    }
    
    
    
}
