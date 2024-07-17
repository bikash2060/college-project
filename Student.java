//Creating Superclass/Parentclass:
public class Student{
    //Variable Declaration:
    private int enrollmentID;
    private String dateOfBirth;
    private String courseName;
    private String studentName;
    private String dateOfEnrollment;
    private int courseDuration;
    private int tuitionFee;
    
    //Creating Constructor With Certain Parameters:
    public Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee){
        this.dateOfBirth = dateOfBirth;
        this.studentName = studentName;
        this.courseDuration = courseDuration;
        this.tuitionFee = tuitionFee;
        this.courseName = "";
        this.dateOfEnrollment = "";
        this.enrollmentID = 0;
    }
    
    //Creating Corresponding Accessor/Getter Method To Each Attributes:
    public int getEnrollmentID(){
        return this.enrollmentID;
    }
    
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public String getStudentName(){
        return this.studentName;
    }
    
    public String getDateOfEnrollment(){
        return this.dateOfEnrollment;
    }
    
    public int getCourseDuration(){
        return this.courseDuration;
    }
    
    public int getTuitionFee(){
        return this.tuitionFee;
    }
    
    
    //Creating Mutator/Setter Method To Particular Attributes:
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public void setEnrollmentID(int enrollmentID){
        this.enrollmentID = enrollmentID;
    }
    
    public void setDateOfEnrollment(String dateOfEnrollment){
        this.dateOfEnrollment = dateOfEnrollment;
    }
    
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    
    public void setCourseDuration(int courseDuration){
        this.courseDuration = courseDuration;
    }
    
    public void setTuitionFee(int tuitionFee){
        this.tuitionFee = tuitionFee;
    }    
    
    //Creating Display Method To Display Studentdetails:
    public void display(){
        if(this.enrollmentID == 0 || this.dateOfBirth == "" || this.courseName == "" || this.studentName == "" || this.dateOfEnrollment == "" || this.courseDuration == 0 || this.tuitionFee == 0){
            System.out.println("All the details of student aren't filled.");
        }
        else{
            System.out.println("Enrollment ID: "+this.getEnrollmentID());
            System.out.println("Date Of Birth: "+this.getDateOfBirth());
            System.out.println("Course Name: "+this.getCourseName());
            System.out.println("Student Name: "+this.getStudentName());
            System.out.println("Date Of Enrollment: "+this.getDateOfEnrollment());
            System.out.println("Course Duration: "+this.getCourseDuration());
            System.out.println("Tuition Fee: "+this.getTuitionFee());
        }
    }
}