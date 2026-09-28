package tostring;

public class SFour {

    String employeeName;
    String uniformColor;
    int employeeCode;
    int departmentId;

    public SFour(String employeeName, String uniformColor, int employeeCode, int departmentId) {
        this.employeeName = employeeName;
        this.uniformColor = uniformColor;
        this.employeeCode = employeeCode;
        this.departmentId = departmentId;
    }

    
    public String toString() {
        return "Employee Name : " + employeeName +
               "\nUniform Color : " + uniformColor +
               "\nEmployee Code : " + employeeCode +
               "\nDepartment ID : " + departmentId;
    }
}
