//Creating Subclass/Childclass:
public class Regular extends Student{
    //Variable Declaration:
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;    
    
    //Creating Constructor With Certain Parameters And Calling Constructor And Mutator Method of Parentclass:
    public Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment, int courseDuration, int tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent){
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setCourseName(courseName);
        super.setEnrollmentID(enrollmentID);
        super.setDateOfEnrollment(dateOfEnrollment);
        this.numOfModules = numOfModules;
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
    }
    
    //Creating Corresponding Accessor/Getter Method Of Each Attribut:
    public int getNumOfModules(){
        return this.numOfModules;
    }
    
    public int getNumOfCreditHours(){
        return this.numOfCreditHours;
    }
    
    public double getDaysPresent(){
        return this.daysPresent;
    }
    
    public boolean getIsGrantedScholarship(){
        return this.isGrantedScholarship;
    }
    
    //Creating presentPercentage Method To Calculate Percentage Of Present:
    public char presentPercentage(double daysPresent){ 
        this.daysPresent = daysPresent;
        double presentPercentage;
        char attendanceGrade;
        presentPercentage = (this.daysPresent/(super.getCourseDuration()*30))*100;
        
        //Checking Whether Days Present Is less Or More Than Course Duration And Return An Empty Character When Condition Is True:
        if(this.daysPresent > (super.getCourseDuration()*30)){
            System.out.println("Course duration cannot be less than number of days present.");
            return ' ';
        }
         
        //Providing Attendance Grade According To Percentage:
        if(presentPercentage>=80){
             attendanceGrade = 'A';
        }
        else if(presentPercentage>=60){
             attendanceGrade = 'B';
        }
        else if(presentPercentage>=40){
             attendanceGrade = 'C';
        }
        else if(presentPercentage>=20){
             attendanceGrade = 'D';
        }
        else{
            attendanceGrade = 'E';
        }
        
        this.isGrantedScholarship = (attendanceGrade == 'A');
        return attendanceGrade;
    }
    
    //Creating grantCertificate Method To Display That Student Is Gratuated: 
    public void grantCertificate(String courseName, int enrollmentID, String dateOfEnrollment){
        super.setCourseName(courseName);
        super.setEnrollmentID(enrollmentID);
        super.setDateOfEnrollment(dateOfEnrollment);
        System.out.println("The Student has gratuated successfully");
        System.out.println("Course Name: "+super.getCourseName());
        System.out.println("Enrollment ID: "+super.getEnrollmentID());
        System.out.println("Date Of Enrollment: "+super.getDateOfEnrollment());
        if(this.isGrantedScholarship){
            System.out.println("The scholarship has been granted.");
        }
    }
    
    //Creating display Method To Display The Details Of Regular Class Along With Student Class Method:
    @Override
    public void display(){
        super.display();
        System.out.println("Number Of Modules: "+this.getNumOfModules());
        System.out.println("Number Of CreditHours: "+this.getNumOfCreditHours());
        System.out.println("Number Of Days Present: "+this.getDaysPresent());
    }
}   