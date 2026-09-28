package tostring;

public class SThree {

    String studentName;
    String deviceColor;
    int rollNumber;
    int admissionId;

    public SThree(String studentName, String deviceColor, int rollNumber, int admissionId) {
        this.studentName = studentName;
        this.deviceColor = deviceColor;
        this.rollNumber = rollNumber;
        this.admissionId = admissionId;
    }

    
    public String toString() {
        return "Student Name : " + studentName +
               "\nDevice Color : " + deviceColor +
               "\nRoll Number : " + rollNumber +
               "\nAdmission ID : " + admissionId;
    }
}
