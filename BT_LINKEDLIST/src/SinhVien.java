public class SinhVien {
    private String studentID;
    private String fullName;
    private int age;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String studentID, String fullName, int age, double gpa) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien [studentID=" + studentID + ", fullName=" + fullName + ", age=" + age + ", gpa=" + gpa + "]";
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
