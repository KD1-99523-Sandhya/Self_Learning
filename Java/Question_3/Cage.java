package Question_3;

public class Cage {
    private int cageNo;
    private String location;

    public Cage() {
        this.cageNo = 0;
        this.location = "";
    }

    public Cage(int cageNo, String location) {
        this.cageNo = cageNo;
        this.location = location;
    }

    public int getCageNo() {
        return cageNo;
    }

    public void setCageNo(int cageNo) {
        this.cageNo = cageNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Cage [No=" + cageNo + ", Location=" + location + "]";
    }
}
