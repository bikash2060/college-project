//Creating Another Subclass/Childclass:
public class Dropout extends Student{
    //Variable Declaration:
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    
    //Creating Constructor With Certain Parameters And Calling Constructor And Setter Method Of Super Class:
    public Dropout(String dateOfBirth, String studentName, int courseDuration, int tuitionFee, int numOfRemainingModules, int numOfMonthsAttended, String dateOfDropout){
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setEnrollmentID(getEnrollmentID());
        super.setCourseName(getCourseName());
        super.setDateOfEnrollment(getDateOfEnrollment());
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;
    }
    
    //Creating Accessor/Getter Method Of Each Attributes:
    public int getNumOfRemainingModules(){
        return this.numOfRemainingModules;
    }
    
    public int getNumOfMonthsAttended(){
        return this.numOfMonthsAttended;
    }
    
    public String getDateOfDropout(){
        return this.dateOfDropout;
    }
    
    public int getRemainingAmount(){
        return this.remainingAmount;
    }
    
    public boolean getHasPaid(){
        return this.hasPaid;
    }
    
    //Creating billsPayable Method To Calculate Pending Tuition Fee:
    public void billsPayable(){
        int pendingTuitionFee;
        pendingTuitionFee = (super.getCourseDuration() - numOfMonthsAttended)*super.getTuitionFee();
        this.remainingAmount = pendingTuitionFee;
        if(remainingAmount == 0){
            this.hasPaid = true;
        }
        else{
            this.hasPaid = false;
        }
    }
    
    //Creating removeStudent Method To Check Whether The Student HasPaid Or Not:
    public void removeStudent(){
        if(hasPaid){
            super.setDateOfBirth("");
            super.setCourseName("");
            super.setStudentName("");
            super.setDateOfEnrollment("");
            super.setCourseDuration(0);
            super.setTuitionFee(0);
            this.dateOfDropout = "";
            super.setEnrollmentID(0);
            this.numOfRemainingModules = 0;
            this.numOfMonthsAttended = 0;
            this.remainingAmount = 0;
        }
        else{
            System.out.println("All bills are not cleared.");
        }
    }
    
    //Creating Display Method To Display Details Of Dropout Class Along With Parent Class Display Method:
    @Override
    public void display(){
        super.display();
        System.out.println("Number Of Remaining Modules: "+this.getNumOfRemainingModules());
        System.out.println("Number Of Months Attended: "+this.getNumOfMonthsAttended());
        System.out.println("Date Of Drop Out: "+this.getDateOfDropout());
        System.out.println("Remaining Amount: "+this.getRemainingAmount());
    }
}