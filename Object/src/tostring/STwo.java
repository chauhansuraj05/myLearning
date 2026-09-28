package tostring;

public class STwo {

    String owner;
    String shade;
    int serialNo;
    int recordId;

    public STwo(String owner, String shade, int serialNo, int recordId) {
        this.owner = owner;
        this.shade = shade;
        this.serialNo = serialNo;
        this.recordId = recordId;
    }

    
    public String toString() {
        return "Owner Name : " + owner +
               "\nShade : " + shade +
               "\nSerial No : " + serialNo +
               "\nRecord ID : " + recordId;
    }
}
