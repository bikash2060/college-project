/*
Importing built-in class ArrayList from the util package to store the objects of Regular Student and Dropout Student:
Importing built-in different classes such as JFrame, JPanel, JLabel fromt the swing package to create different components like frame, panel, label etc: 
Importing built-in class Font and Color from the awt package to give the font size, font style, color to the label and buttons: 
Importing built-in class from the awt package to make the buttons functionality:
 */
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;

/*
Creating a class to store the different components of Swing and array list of Student class:
 */
public class StudentGUI implements ActionListener
{
    //Creating frame of main, regular student, dropout student, present percentage, grant certificate, pays bills, remove student:
    private JFrame mainFrame, regularFrame, dropoutFrame, presentPercentageFrame, grantCertificateFrame, paysBillsFrame, removeStudentFrame;

    //Creating panel of main, regular student, dropout student, present percentage, grant certificate, pays bills, remove student:
    private JPanel mainPanel, regularPanel, dropoutPanel, presentPercentagePanel, grantCertificatePanel, paysBillsPanel, removeStudentPanel;   

    //Creating buttons for main frame:
    private JButton regularBtn, dropoutBtn, exitBtn;

    //Creating labels for regular student's frame:
    private JLabel title1, title2, studentName_label, enrollmentID_label, courseName_label, courseDuration_label, tuitionFee_label, numberOfModules_label,
    numberOfDaysPresent_label, dob_label, dateOfEnrollment_label, numberOfCreditHours_label;

    //Creating textfields for regular student's frame:
    private JTextField studentName_field, enrollmentID_field, courseName_field, courseDuration_field, tuitionFee_field, numberOfModules_field, 
    numberOfCreditHours_field, numberOfDaysPresent_field;

    //Creating combo box for regular student's frame:
    private JComboBox <String> dob_day, dob_month, dob_year, dateOfEnrollment_day, dateOfEnrollment_month, dateOfEnrollment_year;

    //Creating buttons for regular student's frame:
    private JButton presentPercentageBtn, grantCertificateBtn, clearBtn1, displayBtn1, addBtn1, backBtn1;

    //Creating labels for dropout student's frame:
    private JLabel title3, title4, studentName1_label, enrollmentID1_label, courseName1_label, courseDuration1_label, dob1_label, dateOfEnrollment1_label,
    tuitionFee1_label, numberOfRemainingModules_label, numberOfMonthsAttended_label, dateOfDropout_label, remainingAmount_label;

    //Creating textfields for dropout student's frame:
    private JTextField studentName1_field, enrollmentID1_field, courseName1_field, courseDuration1_field, tuitionFee1_field,remainingAmount_field,
    numberOfRemainingModules_field, numberOfMonthsAttended_field;

    //Creating combo box for dropout student's frame:
    private JComboBox <String> dob1_day, dob1_month, dob1_year, dateOfEnrollment1_day, dateOfEnrollment1_month, dateOfEnrollment1_year, dateOfDropout_day,
    dateOfDropout_month, dateOfDropout_year;

    //Creating buttons for dropout student's frame:
    private JButton paysBillBtn, removeBtn, clearBtn2, displayBtn2, addBtn2, backBtn2;

    //Creating labels for present percentage's frame:
    private JLabel enrollment_label, daysPresent_label;

    //Creating textfields for present percentage's frame:
    private JTextField enrollment_field, daysPresent_field;

    //Creating button for present percentage's frame:
    private JButton calculate1;

    //Creating labels for grant certificate's frame:
    private JLabel enrollment1_label, course_label, doe_label;

    //Creating textfields for grant certificate's frame:
    private JTextField enrollment1_field, course_field;

    //Creating combo box for grant certificate's frame:
    private JComboBox <String> dateOfEnrollment_cb1, dateOfEnrollment_cb2, dateOfEnrollment_cb3;

    //Creating button for grant certificate's frame:
    private JButton calculate2;

    //Creating label for pays bill's frame:
    private JLabel enID_label;

    //Creating text field for pays bill's frame:
    private JTextField txt_field;

    //Creating button for pays bill's frame:
    private JButton pay;   

    //Creating label for remove student's frame:
    private JLabel enID1_label;

    //Creating textfield for remove student's frame:
    private JTextField txt1_field;

    //Creating button for remove student's frame:
    private JButton remove; 

    //Creating fonts for buttons and labels of respective frames:   
    private Font font1, font2;

    //Creating array list of Student class to store the objects of regular student and dropout student:
    private ArrayList<Student> students = new ArrayList<Student>();

    //Creating constructor to create object of the different swing components and registering action listener to buttons:
    public StudentGUI()
    {
        //Creating main frame to hold buttons to redirect regular student frame and dropout frame:
        mainFrame = new JFrame("Student");

        //Creating main panel and adding it to main frame:
        mainPanel = new JPanel();

        //Setting background color to the main frame:
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainFrame.getContentPane().add(mainPanel);

        //Creating object of Font adding to the label:
        font1 = new Font("Ubuntus",Font.BOLD,20);
        font2 = new Font("Ubuntus",Font.BOLD,18);

        //Creating regular student, dropout student and exit buttons and adding them to the main panel:
        regularBtn = new JButton("Regular Student");
        dropoutBtn = new JButton("Dropout Student");
        exitBtn = new JButton("Exit");

        regularBtn.setBounds(150,80,200,50);
        dropoutBtn.setBounds(150,180,200,50);
        exitBtn.setBounds(250,270,100,40);

        regularBtn.setBackground(Color.decode("#E6E6FA"));
        dropoutBtn.setBackground(Color.decode("#DAA520"));
        exitBtn.setBackground(Color.RED);
        exitBtn.setForeground(Color.WHITE);

        regularBtn.setFont(font1);
        dropoutBtn.setFont(font1);
        exitBtn.setFont(font1);

        mainPanel.add(regularBtn);
        mainPanel.add(dropoutBtn);
        mainPanel.add(exitBtn);

        //Creating regular student frame to hold different swing components:
        regularFrame = new JFrame("Regular Student");
        regularFrame.setSize(1100,590);
        regularFrame.setLayout(null);
        regularFrame.setLocationRelativeTo(null);
        regularFrame.setResizable(false);
        regularFrame.setVisible(false);

        //Creating panel of regular student frame's:
        regularPanel = new JPanel();
        regularPanel.setSize(1100,590);
        regularPanel.setLayout(null);
        regularFrame.add(regularPanel);

        //Setting background color to the regular student frame:
        regularPanel.setBackground(Color.decode("#87CEEB"));
        regularFrame.getContentPane().add(regularPanel);

        //Creating dropout student frame to hold different swing components: 
        dropoutFrame = new JFrame("Dropout Student");
        dropoutFrame.setSize(1200,650);
        dropoutFrame.setLayout(null);
        dropoutFrame.setLocationRelativeTo(null);
        dropoutFrame.setResizable(false);
        dropoutFrame.setVisible(false);

        //Creating panel of dropout student frame's:
        dropoutPanel = new JPanel();
        dropoutPanel.setSize(1200,650);
        dropoutPanel.setLayout(null);
        dropoutFrame.add(dropoutPanel);

        //Setting background color to the dropout student frame:
        dropoutPanel.setBackground(Color.decode("#87CEEB"));
        dropoutFrame.getContentPane().add(dropoutPanel);

        //Creating different components and adding them in the panel of regular student's frame:
        title1 = new JLabel("Regular Student");
        title1.setBounds(480,10,200,40);
        title1.setFont(font1);
        regularPanel.add(title1);

        studentName_label = new JLabel("Student Name                    :");
        studentName_label.setBounds(40,60,250,40);
        studentName_label.setFont(font2);
        regularPanel.add(studentName_label);

        studentName_field = new JTextField();
        studentName_field.setBounds(280,65,220,30);
        studentName_field.setFont(font2);
        regularPanel.add(studentName_field);

        enrollmentID_label = new JLabel("Enrollment ID                     :");
        enrollmentID_label.setBounds(40,120,250,40);
        enrollmentID_label.setFont(font2);
        regularPanel.add(enrollmentID_label);

        enrollmentID_field = new JTextField();
        enrollmentID_field.setBounds(280,125,220,30);
        enrollmentID_field.setFont(font2);
        regularPanel.add(enrollmentID_field);

        courseName_label = new JLabel("Course Name                     :");
        courseName_label.setBounds(40,180,250,40);
        courseName_label.setFont(font2);
        regularPanel.add(courseName_label);

        courseName_field = new JTextField();
        courseName_field.setBounds(280,185,220,30);
        courseName_field.setFont(font2);
        regularPanel.add(courseName_field);

        dateOfEnrollment_label = new JLabel("Date of Enrollment :");
        dateOfEnrollment_label.setBounds(520,60,200,40);
        dateOfEnrollment_label.setFont(font2);
        regularPanel.add(dateOfEnrollment_label);

        String[] doe_day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        dateOfEnrollment_day = new JComboBox<String>(doe_day);
        dateOfEnrollment_day.setBounds(704,65,60,30);
        dateOfEnrollment_day.setFont(font2);
        regularPanel.add(dateOfEnrollment_day);

        String[] doe_month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        dateOfEnrollment_month = new JComboBox<String>(doe_month);
        dateOfEnrollment_month.setBounds(784,65,130,30);
        dateOfEnrollment_month.setFont(font2);
        regularPanel.add(dateOfEnrollment_month);

        String[] doe_year = {"2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        dateOfEnrollment_year = new JComboBox<String>(doe_year);
        dateOfEnrollment_year.setBounds(934,65,100,30);
        dateOfEnrollment_year.setFont(font2);
        regularPanel.add(dateOfEnrollment_year);

        dob_label = new JLabel("Date of Birth            :");
        dob_label.setBounds(520,120,200,40);
        dob_label.setFont(font2);
        regularPanel.add(dob_label);

        String[] dobday = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        dob_day = new JComboBox<String>(dobday);
        dob_day.setBounds(704,125,60,30);
        dob_day.setFont(font2);
        regularPanel.add(dob_day);

        String[] dobmonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        dob_month = new JComboBox<String>(dobmonth);
        dob_month.setBounds(784,125,130,30);
        dob_month.setFont(font2);
        regularPanel.add(dob_month);

        String[] dobyear = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
        dob_year = new JComboBox<String>(dobyear);
        dob_year.setBounds(934,125,100,30);
        dob_year.setFont(font2);
        regularPanel.add(dob_year);

        numberOfModules_label = new JLabel("Number of Modules          :");
        numberOfModules_label.setBounds(40,240,250,40);
        numberOfModules_label.setFont(font2);
        regularPanel.add(numberOfModules_label);

        numberOfModules_field = new JTextField();
        numberOfModules_field.setBounds(280,245,220,30);
        numberOfModules_field.setFont(font2);
        regularPanel.add(numberOfModules_field);

        numberOfCreditHours_label = new JLabel("Number of Credit Hours  :");
        numberOfCreditHours_label.setBounds(40,300,250,40);
        numberOfCreditHours_label.setFont(font2);
        regularPanel.add(numberOfCreditHours_label);

        numberOfCreditHours_field = new JTextField();
        numberOfCreditHours_field.setBounds(280,305,220,30);
        numberOfCreditHours_field.setFont(font2);
        regularPanel.add(numberOfCreditHours_field);

        courseDuration_label = new JLabel("Course Duration    :");
        courseDuration_label.setBounds(520,180,200,40);
        courseDuration_label.setFont(font2);
        regularPanel.add(courseDuration_label);

        courseDuration_field = new JTextField();
        courseDuration_field.setBounds(704,185,220,30);
        courseDuration_field.setFont(font2);
        regularPanel.add(courseDuration_field);

        tuitionFee_label = new JLabel("Tuition Fee             :");
        tuitionFee_label.setBounds(520,240,200,40);
        tuitionFee_label.setFont(font2);
        regularPanel.add(tuitionFee_label);

        tuitionFee_field = new JTextField();
        tuitionFee_field.setBounds(704,245,220,30);
        tuitionFee_field.setFont(font2);
        regularPanel.add(tuitionFee_field);

        numberOfDaysPresent_label = new JLabel("Days Present          :");
        numberOfDaysPresent_label.setBounds(520,300,200,40);
        numberOfDaysPresent_label.setFont(font2);
        regularPanel.add(numberOfDaysPresent_label);

        numberOfDaysPresent_field = new JTextField();
        numberOfDaysPresent_field.setBounds(704,305,220,30);
        numberOfDaysPresent_field.setFont(font2);
        regularPanel.add(numberOfDaysPresent_field);

        //Creating present percentage, grant certificate , add, clear and display buttons of regular student's frame:
        title3 = new JLabel("Calculate:");
        title3.setBounds(40,380,200,40);
        title3.setFont(font1);
        regularPanel.add(title3);

        presentPercentageBtn = new JButton("Present Percentage");
        presentPercentageBtn.setBounds(40,420,220,40);
        presentPercentageBtn.setFont(font2);
        presentPercentageBtn.setBackground(Color.decode("#E6E6FA"));
        presentPercentageBtn.setForeground(Color.BLACK);
        regularPanel.add(presentPercentageBtn);

        grantCertificateBtn = new JButton("Grant Certificate");
        grantCertificateBtn.setBounds(40,470,220,40);
        grantCertificateBtn.setFont(font2);
        grantCertificateBtn.setBackground(Color.decode("#E6E6FA"));
        grantCertificateBtn.setForeground(Color.BLACK);
        regularPanel.add(grantCertificateBtn);

        backBtn1 = new JButton("Back");
        backBtn1.setBounds(670,470,100,40);
        backBtn1.setFont(font2);
        backBtn1.setBackground(Color.BLACK);
        backBtn1.setForeground(Color.WHITE);
        regularPanel.add(backBtn1);

        clearBtn1 = new JButton("Clear");
        clearBtn1.setBounds(800,470,100,40);
        clearBtn1.setFont(font2);
        clearBtn1.setBackground(Color.RED);
        clearBtn1.setForeground(Color.WHITE);
        regularPanel.add(clearBtn1);

        addBtn1 = new JButton("Add");
        addBtn1.setBounds(930,420,100,40);
        addBtn1.setFont(font2);
        addBtn1.setBackground(Color.WHITE);
        addBtn1.setForeground(Color.BLACK);
        regularPanel.add(addBtn1);

        displayBtn1 = new JButton("Display");
        displayBtn1.setBounds(930,470,100,40);
        displayBtn1.setFont(font2);
        displayBtn1.setBackground(Color.WHITE);
        displayBtn1.setForeground(Color.BLACK);
        regularPanel.add(displayBtn1);

        //Creating different components and adding them in the panel of dropout student's frame:
        title2 = new JLabel("Dropout Student");
        title2.setBounds(480,10,200,40);
        title2.setFont(font1);
        dropoutPanel.add(title2);

        studentName1_label = new JLabel("Student Name                    :");
        studentName1_label.setBounds(40,60,250,40);
        studentName1_label.setFont(font2);
        dropoutPanel.add(studentName1_label);

        studentName1_field = new JTextField();
        studentName1_field.setBounds(280,65,220,30);
        studentName1_field.setFont(font2);
        dropoutPanel.add(studentName1_field);

        enrollmentID1_label = new JLabel("Enrollment ID                     :");
        enrollmentID1_label.setBounds(40,120,250,40);
        enrollmentID1_label.setFont(font2);
        dropoutPanel.add(enrollmentID1_label);

        enrollmentID1_field = new JTextField();
        enrollmentID1_field.setBounds(280,125,220,30);
        enrollmentID1_field.setFont(font2);
        dropoutPanel.add(enrollmentID1_field);

        courseName1_label = new JLabel("Course Name                     :");
        courseName1_label.setBounds(40,180,250,40);
        courseName1_label.setFont(font2);
        dropoutPanel.add(courseName1_label);

        courseName1_field = new JTextField();
        courseName1_field.setBounds(280,185,220,30);
        courseName1_field.setFont(font2);
        dropoutPanel.add(courseName1_field);

        courseDuration1_label = new JLabel("Course Duration               :");
        courseDuration1_label.setBounds(40,240,250,40);
        courseDuration1_label.setFont(font2);
        dropoutPanel.add(courseDuration1_label);

        courseDuration1_field = new JTextField();
        courseDuration1_field.setBounds(280,245,220,30);
        courseDuration1_field.setFont(font2);
        dropoutPanel.add(courseDuration1_field);

        tuitionFee1_label = new JLabel("Tuition Fee                        :");
        tuitionFee1_label.setBounds(40,300,250,40);
        tuitionFee1_label.setFont(font2);
        dropoutPanel.add(tuitionFee1_label);

        tuitionFee1_field = new JTextField();
        tuitionFee1_field.setBounds(280,305,220,30);
        tuitionFee1_field.setFont(font2);
        dropoutPanel.add(tuitionFee1_field);

        numberOfRemainingModules_label = new JLabel("Number of Remaining Modules  :");
        numberOfRemainingModules_label.setBounds(520,60,300,40);
        numberOfRemainingModules_label.setFont(font2);
        dropoutPanel.add(numberOfRemainingModules_label);

        numberOfRemainingModules_field = new JTextField();
        numberOfRemainingModules_field.setBounds(825,65,220,30);
        numberOfRemainingModules_field.setFont(font2);
        dropoutPanel.add(numberOfRemainingModules_field);

        numberOfMonthsAttended_label = new JLabel("Number of Months Attended       :");
        numberOfMonthsAttended_label.setBounds(520,120,300,40);
        numberOfMonthsAttended_label.setFont(font2);
        dropoutPanel.add(numberOfMonthsAttended_label);

        numberOfMonthsAttended_field = new JTextField();
        numberOfMonthsAttended_field.setBounds(825,125,220,30);
        numberOfMonthsAttended_field.setFont(font2);
        dropoutPanel.add(numberOfMonthsAttended_field);

        remainingAmount_label = new JLabel("Remaining Amount         :");
        remainingAmount_label.setBounds(40,360,250,40);
        remainingAmount_label.setFont(font2);
        dropoutPanel.add(remainingAmount_label);

        remainingAmount_field = new JTextField();
        remainingAmount_field.setBounds(280,365,220,30);
        remainingAmount_field.setFont(font2);
        dropoutPanel.add(remainingAmount_field);

        dateOfEnrollment1_label = new JLabel("Date of Enrollment                         :");
        dateOfEnrollment1_label.setBounds(520,180,300,40);
        dateOfEnrollment1_label.setFont(font2);
        dropoutPanel.add(dateOfEnrollment1_label);

        String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        dateOfEnrollment1_day = new JComboBox<String>(day);
        dateOfEnrollment1_day.setBounds(825,185,60,30);
        dateOfEnrollment1_day.setFont(font2);
        dropoutPanel.add(dateOfEnrollment1_day);

        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        dateOfEnrollment1_month = new JComboBox<String>(month);
        dateOfEnrollment1_month.setBounds(905,185,130,30);
        dateOfEnrollment1_month.setFont(font2);
        dropoutPanel.add(dateOfEnrollment1_month);

        String[] year = {"2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        dateOfEnrollment1_year = new JComboBox<String>(year);
        dateOfEnrollment1_year.setBounds(1055,185,100,30);
        dateOfEnrollment1_year.setFont(font2);
        dropoutPanel.add(dateOfEnrollment1_year);

        dateOfDropout_label = new JLabel("Date of Dropout                              :");
        dateOfDropout_label.setBounds(520,240,300,40);
        dateOfDropout_label.setFont(font2);
        dropoutPanel.add(dateOfDropout_label);

        String[] day1 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        dateOfDropout_day = new JComboBox<String>(day1);
        dateOfDropout_day.setBounds(825,245,60,30);
        dateOfDropout_day.setFont(font2);
        dropoutPanel.add(dateOfDropout_day);

        String[] month1 = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        dateOfDropout_month = new JComboBox<String>(month);
        dateOfDropout_month.setBounds(905,245,130,30);
        dateOfDropout_month.setFont(font2);
        dropoutPanel.add(dateOfDropout_month);

        String[] year1 = {"2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        dateOfDropout_year = new JComboBox<String>(year);
        dateOfDropout_year.setBounds(1055,245,100,30);
        dateOfDropout_year.setFont(font2);
        dropoutPanel.add(dateOfDropout_year);

        dob1_label = new JLabel("Date of Birth                                    :");
        dob1_label.setBounds(520,300,300,40);
        dob1_label.setFont(font2);
        dropoutPanel.add(dob1_label);

        String[] day2 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        dob1_day = new JComboBox<String>(day2);
        dob1_day.setBounds(825,305,60,30);
        dob1_day.setFont(font2);
        dropoutPanel.add(dob1_day);

        String[] month2 = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        dob1_month = new JComboBox<String>(month2);
        dob1_month.setBounds(905,305,130,30);
        dob1_month.setFont(font2);
        dropoutPanel.add(dob1_month);

        String[] year2 = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
        dob1_year = new JComboBox<String>(dobyear);
        dob1_year.setBounds(1055,305,100,30);
        dob1_year.setFont(font2);
        dropoutPanel.add(dob1_year);

        //Creating pay the bills, remove student , add, clear and display buttons of dropout student's frame:
        title4 = new JLabel("Calculate:");
        title4.setBounds(40,440,200,40);
        title4.setFont(font1);
        dropoutPanel.add(title4);

        paysBillBtn = new JButton("Pay Bills");
        paysBillBtn.setBounds(40,480,190,40);
        paysBillBtn.setFont(font2);
        paysBillBtn.setBackground(Color.decode("#E6E6FA"));
        paysBillBtn.setForeground(Color.BLACK);
        dropoutPanel.add(paysBillBtn);

        removeBtn = new JButton("Remove Student");
        removeBtn.setBounds(40,530,190,40);
        removeBtn.setFont(font2);
        removeBtn.setBackground(Color.decode("#E6E6FA"));
        removeBtn.setForeground(Color.BLACK);
        dropoutPanel.add(removeBtn);

        backBtn2 = new JButton("Back");
        backBtn2.setBounds(790,530,100,40);
        backBtn2.setFont(font2);
        backBtn2.setBackground(Color.BLACK);
        backBtn2.setForeground(Color.WHITE);
        dropoutPanel.add(backBtn2);

        clearBtn2 = new JButton("Clear");
        clearBtn2.setBounds(925,530,100,40);
        clearBtn2.setFont(font2);
        clearBtn2.setBackground(Color.RED);
        clearBtn2.setForeground(Color.WHITE);
        dropoutPanel.add(clearBtn2);

        addBtn2 = new JButton("Add");
        addBtn2.setBounds(1055,480,100,40);
        addBtn2.setFont(font2);
        addBtn2.setBackground(Color.WHITE);
        addBtn2.setForeground(Color.BLACK);
        dropoutPanel.add(addBtn2);

        displayBtn2= new JButton("Display");
        displayBtn2.setBounds(1055,530,100,40);
        displayBtn2.setFont(font2);
        addBtn2.setBackground(Color.WHITE);
        addBtn2.setForeground(Color.BLACK);
        dropoutPanel.add(displayBtn2);

        //Creating present percentage frame of regular student:
        presentPercentageFrame = new JFrame("Calculate Present Percentage");
        presentPercentageFrame.setSize(490,300);
        presentPercentageFrame.setLayout(null);
        presentPercentageFrame.setLocationRelativeTo(null);
        presentPercentageFrame.setResizable(false);
        presentPercentageFrame.setVisible(false);

        //Creating present percentage panel and adding it on the frame:
        presentPercentagePanel = new JPanel();
        presentPercentagePanel.setSize(490,300);
        presentPercentagePanel.setLayout(null);
        presentPercentageFrame.add(presentPercentagePanel);

        //Setting background color for present percentage's frame:
        presentPercentagePanel.setBackground(Color.LIGHT_GRAY);
        presentPercentageFrame.getContentPane().add(presentPercentagePanel);

        //Storing labels in the frame of present percentage:
        enrollment_label = new JLabel("Enrollment ID  :");
        daysPresent_label = new JLabel("Days Present   :");
        enrollment_label.setBounds(50,30,150,50);
        daysPresent_label.setBounds(50,100,150,50);
        enrollment_label.setFont(font2);
        daysPresent_label.setFont(font2);
        presentPercentagePanel.add(enrollment_label);
        presentPercentagePanel.add(daysPresent_label);

        //Storing text fields in the frame of present percentage:
        enrollment_field = new JTextField();
        daysPresent_field = new JTextField();
        enrollment_field.setBounds(200,39,220,30);
        daysPresent_field.setBounds(200,109,220,30);
        enrollment_field.setFont(font2);
        daysPresent_field.setFont(font2);
        presentPercentagePanel.add(daysPresent_field);
        presentPercentagePanel.add(enrollment_field);

        //Storing button in the frame of present percentage:
        calculate1 = new JButton("Calculate");
        calculate1.setBounds(50,190,150,40);
        calculate1.setFont(font2);
        calculate1.setBackground(Color.ORANGE);
        calculate1.setForeground(Color.BLACK);
        presentPercentagePanel.add(calculate1);     

        //Creating grant certificate frame of regular student:
        grantCertificateFrame = new JFrame("Calculate Grant Certificate");
        grantCertificateFrame.setSize(630,350);
        grantCertificateFrame.setLayout(null);
        grantCertificateFrame.setLocationRelativeTo(null);
        grantCertificateFrame.setResizable(false);
        grantCertificateFrame.setVisible(false);

        //Creating present percentage panel and adding it on the frame:
        grantCertificatePanel = new JPanel();
        grantCertificatePanel.setSize(630,350);
        grantCertificatePanel.setLayout(null);
        grantCertificateFrame.add(grantCertificatePanel);

        //Setting background color for grant certificate's frame:
        grantCertificatePanel.setBackground(Color.LIGHT_GRAY);
        grantCertificateFrame.getContentPane().add(grantCertificatePanel);

        //Storing labels in the frame of grant certificate:
        enrollment1_label = new JLabel("Enrollment ID             :");
        course_label = new JLabel("Course Name             :");
        doe_label = new JLabel("Date of Enrollment   :");
        enrollment1_label.setBounds(50,30,200,50);
        course_label.setBounds(50,100,200,50);
        doe_label.setBounds(50,170,200,50);
        enrollment1_label.setFont(font2);
        course_label.setFont(font2);
        doe_label.setFont(font2);
        grantCertificatePanel.add(enrollment1_label);
        grantCertificatePanel.add(course_label);
        grantCertificatePanel.add(doe_label);

        //Storing text fields in the frame of grant certificate:
        enrollment1_field = new JTextField();
        course_field = new JTextField();
        enrollment1_field.setBounds(250,39,220,30);
        course_field.setBounds(250, 109,220,30);
        enrollment1_field.setFont(font2);
        course_field.setFont(font2);
        grantCertificatePanel.add(enrollment1_field);
        grantCertificatePanel.add(course_field);

        //Storing combo box in the frame of grant certificate:
        String[] d = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        String[] m = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] y = {"2015","2016","2017","2018","2019","2020","2021","2022","2023"};
        dateOfEnrollment_cb1 = new JComboBox<String>(d);
        dateOfEnrollment_cb2 = new JComboBox<String>(m);
        dateOfEnrollment_cb3 = new JComboBox<String>(y);
        dateOfEnrollment_cb1.setBounds(250,179,50,30);
        dateOfEnrollment_cb2.setBounds(320,179,140,30);
        dateOfEnrollment_cb3.setBounds(480,179,80,30);
        dateOfEnrollment_cb1.setFont(font2);
        dateOfEnrollment_cb2.setFont(font2);
        dateOfEnrollment_cb3.setFont(font2);
        grantCertificatePanel.add(dateOfEnrollment_cb1);
        grantCertificatePanel.add(dateOfEnrollment_cb2);
        grantCertificatePanel.add(dateOfEnrollment_cb3);

        //Storing button in the frame of grant certificate:
        calculate2 = new JButton("Calculate");
        calculate2.setBounds(50,240,150,40);
        calculate2.setFont(font2);
        calculate2.setBackground(Color.ORANGE);
        calculate2.setForeground(Color.BLACK);
        grantCertificatePanel.add(calculate2); 

        //Creating pay bills frame of dropout student:
        paysBillsFrame = new JFrame("Pay Bills");
        paysBillsFrame.setSize(480,200);
        paysBillsFrame.setLayout(null);
        paysBillsFrame.setLocationRelativeTo(null);
        paysBillsFrame.setResizable(false);
        paysBillsFrame.setVisible(false);

        //Creating pay bills panel and adding it on the frame:
        paysBillsPanel = new JPanel();
        paysBillsPanel.setSize(480,200);
        paysBillsPanel.setLayout(null);
        paysBillsFrame.add(paysBillsPanel);

        //Setting background color for pays bill's frame:
        paysBillsPanel.setBackground(Color.LIGHT_GRAY);
        paysBillsFrame.getContentPane().add(paysBillsPanel);

        //Storing lable in the frame of pays bills:
        enID_label = new JLabel("Enrollment ID  :");
        enID_label.setBounds(50,30,150,40);
        enID_label.setFont(font2);
        paysBillsPanel.add(enID_label);

        //Storing text field in the frame of pays bills:
        txt_field = new JTextField();
        txt_field.setBounds(200,35,220,30);
        txt_field.setFont(font2);
        paysBillsPanel.add(txt_field);

        //Storing button in the frame of pays bills:
        pay = new JButton("Pay");
        pay.setBounds(50,100,80,40);
        pay.setFont(font2);
        pay.setBackground(Color.ORANGE);
        pay.setForeground(Color.BLACK);
        paysBillsPanel.add(pay);

        //Creating remove student frame of dropout student:
        removeStudentFrame = new JFrame("Remove Student");
        removeStudentFrame.setSize(480,200);
        removeStudentFrame.setLayout(null);
        removeStudentFrame.setLocationRelativeTo(null);
        removeStudentFrame.setResizable(false);
        removeStudentFrame.setVisible(false);

        //Creating remove student panel and adding it on the frame:
        removeStudentPanel = new JPanel();
        removeStudentPanel.setSize(480,200);
        removeStudentPanel.setLayout(null);
        removeStudentFrame.add(removeStudentPanel);

        //Setting background color for remove student's frame:
        removeStudentPanel.setBackground(Color.LIGHT_GRAY);
        removeStudentFrame.getContentPane().add(removeStudentPanel);

        //Storing lable in the frame of remove student:
        enID1_label = new JLabel("Enrollment ID  :");
        enID1_label.setBounds(50,30,150,40);
        enID1_label.setFont(font2);
        removeStudentPanel.add(enID1_label);

        //Storing text field in the frame of remove student:
        txt1_field = new JTextField();
        txt1_field.setBounds(200,35,220,30);
        txt1_field.setFont(font2);
        removeStudentPanel.add(txt1_field);

        //Storing button in the frame of pays bills:
        remove = new JButton("Remove");
        remove.setBounds(50,100,130,40);
        remove.setFont(font2);
        remove.setBackground(Color.ORANGE);
        remove.setForeground(Color.BLACK);
        removeStudentPanel.add(remove);

        mainPanel.setSize(500,400);
        mainPanel.setLayout(null);
        mainFrame.add(mainPanel);
        mainFrame.setSize(500,400);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);    
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Registering action listener to the buttons of the main frame:
        regularBtn.addActionListener(this);
        dropoutBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        //Registerin action listener to the buttons of the regular frame:
        presentPercentageBtn.addActionListener(this);
        grantCertificateBtn.addActionListener(this);
        backBtn1.addActionListener(this);
        addBtn1.addActionListener(this);
        clearBtn1.addActionListener(this);
        displayBtn1.addActionListener(this);
        calculate1.addActionListener(this);
        calculate2.addActionListener(this);

        //Registerin action listener to the buttons of the dropout frame:
        paysBillBtn.addActionListener(this);
        removeBtn.addActionListener(this);
        backBtn2.addActionListener(this);
        clearBtn2.addActionListener(this);
        addBtn2.addActionListener(this);
        displayBtn2.addActionListener(this);
        pay.addActionListener(this);
        remove.addActionListener(this);
    }

    //Overriding listener interface method for buttons to performed certain action when clicked:
    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == regularBtn)
        {
            regularFrame.setVisible(true);
        }
        else if(event.getSource() == dropoutBtn)
        {
            dropoutFrame.setVisible(true);
        }
        else if(event.getSource() == exitBtn)
        {
            mainFrame.dispose();
            regularFrame.dispose();
            dropoutFrame.dispose();
            presentPercentageFrame.dispose();
            grantCertificateFrame.dispose();
            paysBillsFrame.dispose();
            removeStudentFrame.dispose();
        }
        else if(event.getSource() == backBtn1)
        {
            regularFrame.dispose();
            presentPercentageFrame.dispose();
            grantCertificateFrame.dispose();
        }
        else if(event.getSource() == backBtn2)
        {
            dropoutFrame.dispose();
            paysBillsFrame.dispose();
            removeStudentFrame.dispose();
        }
        else if(event.getSource() == clearBtn1)
        {
            studentName_field.setText("");
            enrollmentID_field.setText("");
            courseName_field.setText("");
            courseDuration_field.setText("");
            tuitionFee_field.setText("");
            numberOfModules_field.setText("");
            numberOfCreditHours_field.setText("");
            numberOfDaysPresent_field.setText("");
        }        
        else if(event.getSource() == clearBtn2)
        {
            studentName1_field.setText("");
            enrollmentID1_field.setText("");
            courseName1_field.setText("");
            courseDuration1_field.setText("");
            tuitionFee1_field.setText("");
            remainingAmount_field.setText("");
            numberOfRemainingModules_field.setText("");
            numberOfMonthsAttended_field.setText("");
        } 
        else if(event.getSource() == presentPercentageBtn)
        {
            presentPercentageFrame.setVisible(true);
        }
        else if(event.getSource() == grantCertificateBtn)
        {
            grantCertificateFrame.setVisible(true);
        }
        else if(event.getSource() == paysBillBtn)
        {
            paysBillsFrame.setVisible(true);
        }
        else if(event.getSource() == removeBtn)
        {
            removeStudentFrame.setVisible(true);
        }

        //Applying condition when add button of regular student's frame is clicked:
        else if(event.getSource() == addBtn1)
        {
            //Applying condition when any of the fields are empty:
            if(studentName_field.getText().isEmpty() || enrollmentID_field.getText().isEmpty() || courseName_field.getText().isEmpty() || 
            courseDuration_field.getText().isEmpty() || tuitionFee_field.getText().isEmpty() || numberOfModules_field.getText().isEmpty() ||
            numberOfCreditHours_field.getText().isEmpty() || numberOfDaysPresent_field.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(regularFrame,"Please fill all the fields","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                try
                {
                    //Converting string text into integer using parseInt() method:
                    int enrollment_ID = Integer.parseInt(enrollmentID_field.getText());

                    if(enrollment_ID <= 0)
                    {
                        JOptionPane.showMessageDialog(regularFrame,"Enrollment ID must be greater than zero","Alert",JOptionPane.WARNING_MESSAGE);
                        enrollmentID_field.setText("");
                    }
                    else
                    {
                        try
                        {
                            String studentName = studentName_field.getText();
                            String courseName = courseName_field.getText();
                            String dateOfBirth = (String)dob_day.getSelectedItem()+" "+(String)dob_month.getSelectedItem()+" "+(String)dob_year.getSelectedItem();
                            String dateOfEnrollment = (String)dateOfEnrollment_day.getSelectedItem()+" "+(String)dateOfEnrollment_month.getSelectedItem()+" "+
                                dateOfEnrollment_year.getSelectedItem();

                            int tuitionFee = Integer.parseInt(tuitionFee_field.getText());
                            int enrollmentID = Integer.parseInt(enrollmentID_field.getText());
                            int numOfModules = Integer.parseInt(numberOfModules_field.getText());
                            int courseDuration = Integer.parseInt(courseDuration_field.getText());
                            int numberOfCreditHours = Integer.parseInt(numberOfCreditHours_field.getText());
                            int numberOfDaysPresent = Integer.parseInt(numberOfDaysPresent_field.getText());

                            String message = "Student Name: "+studentName+"\n"+"Enrollment ID: "+enrollmentID+"\n"+"Course Name: "+courseName+"\n"
                                +"Date of Birth: "+dateOfBirth+"\n"+"Date of Enrollment: "+dateOfEnrollment+"\n"+"Tuition Fee: "+tuitionFee+"\n"
                                +"Number of Modules: "+numOfModules+"\n"+"Course Duration: "+courseDuration+" months"+"\n"
                                +"Number of Credit Hours: "+numberOfCreditHours+"\n"+"Number of days Present: "+numberOfDaysPresent;

                            //Checking whether days present is more than course duration or not:
                            if(numberOfDaysPresent > courseDuration*30)
                            {
                                JOptionPane.showMessageDialog(regularFrame,"Number of days present is more than \ncourse duration(converted into days)","Alert",JOptionPane.WARNING_MESSAGE);
                                numberOfDaysPresent_field.setText("");
                            }
                            else
                            {
                                //Checking if an arrayList is empty or not:
                                if(students.isEmpty())
                                {   
                                    Regular student1 = new Regular(enrollmentID, dateOfBirth, courseName, studentName, dateOfEnrollment, courseDuration, tuitionFee,
                                            numOfModules, numberOfCreditHours, numberOfDaysPresent);
                                    students.add(student1);
                                    JOptionPane.showMessageDialog(regularFrame,"Successfully added a Regular Student!!\n"+message,"Regular Student",JOptionPane.INFORMATION_MESSAGE);
                                    studentName_field.setText("");
                                    enrollmentID_field.setText("");
                                    courseName_field.setText("");
                                    courseDuration_field.setText("");
                                    tuitionFee_field.setText("");
                                    numberOfModules_field.setText("");
                                    numberOfCreditHours_field.setText("");
                                    numberOfDaysPresent_field.setText("");
                                }
                                else
                                {
                                    //Checking all the objects of array list:                        
                                    //Comparing existing enrollmentID with the new enrollmentID:
                                    boolean oldStudent = false;
                                    for(Student obj: students)
                                    {
                                        //Checking that object is instance of Regular class or not: 
                                        if (obj instanceof Regular && enrollmentID == obj.getEnrollmentID())
                                        {
                                            oldStudent = true;
                                            break;
                                        }
                                    }

                                    //Creating object of regular student if enrollmentID doesn't match:
                                    if(oldStudent)
                                    {
                                        JOptionPane.showMessageDialog(regularFrame, "Student already exist!! Please enter a new enrollment ID", "Alert", JOptionPane.WARNING_MESSAGE);
                                        enrollmentID_field.setText("");
                                    }
                                    else
                                    {
                                        Regular student1 = new Regular(enrollmentID, dateOfBirth, courseName, studentName, dateOfEnrollment, courseDuration, tuitionFee,
                                        numOfModules, numberOfCreditHours, numberOfDaysPresent);
                                        students.add(student1);
                                        JOptionPane.showMessageDialog(regularFrame,"Successfully added a Regular Student!!\n"+message,"Regular Student",JOptionPane.INFORMATION_MESSAGE);
                                        studentName_field.setText("");
                                        enrollmentID_field.setText("");
                                        courseName_field.setText("");
                                        courseDuration_field.setText("");
                                        tuitionFee_field.setText("");
                                        numberOfModules_field.setText("");
                                        numberOfCreditHours_field.setText("");
                                        numberOfDaysPresent_field.setText("");
                                    }
                                }
                            }
                        }                         
                        catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(regularFrame,"Please fill valid input only","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                catch (NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(regularFrame,"Enrollment ID should be a valid number","Alert",JOptionPane.WARNING_MESSAGE);
                    enrollmentID_field.setText("");
                }
            }
        }
        
        //Condition for calculating present percentage:
        else if(event.getSource() == calculate1)
        {
            //Checking if any of the fields are empty or not:
            if(enrollment_field.getText().isEmpty() || daysPresent_field.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(presentPercentageFrame,"Please fill all the required fields","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {                
                //Checking the appropriate input for respective fields:
                try
                {
                    int enrollmentId = Integer.parseInt(enrollment_field.getText());
                    int daysPresent = Integer.parseInt(daysPresent_field.getText());

                    //Checking whether an array list is empty or not:
                    if(students.isEmpty())
                    {
                        JOptionPane.showMessageDialog(presentPercentageFrame,"Please add regular student first","Alert",JOptionPane.WARNING_MESSAGE);
                        presentPercentageFrame.dispose();
                    }
                    else
                    {
                        //Comparing the entered enrollmentID with existing value:
                        boolean enrollmentIdMatched = false;
                        for(Student obj: students)
                        {
                            if(obj instanceof Regular && enrollmentId == obj.getEnrollmentID())
                            {
                                //Applying condition if the given days present is more than the course duration of that objects:
                                if(daysPresent > obj.getCourseDuration()*30)
                                {
                                    JOptionPane.showMessageDialog(presentPercentageFrame,"Number of days present is more than \ncourse duration(converted into days)","Alert",JOptionPane.WARNING_MESSAGE);
                                    daysPresent_field.setText("");
                                    enrollmentIdMatched = true;
                                    break;
                                }
                                else
                                {
                                    Regular regularStudent = (Regular) obj;
                                    char attendanceGrade = regularStudent.presentPercentage(daysPresent);
                                    String message = "The attendance grade for enrollment ID "+enrollmentId+" is\n"+attendanceGrade;
                                    JOptionPane.showMessageDialog(presentPercentageFrame,message,"Attendance Grade",JOptionPane.INFORMATION_MESSAGE);
                                    enrollmentIdMatched = true;
                                    enrollment_field.setText("");
                                    daysPresent_field.setText("");
                                    presentPercentageFrame.dispose();
                                    break;
                                }                                
                            }                           
                        }   

                        //Creating a dialog box if an entered enrollment ID doesnot match:
                        if (!enrollmentIdMatched) 
                        {
                            JOptionPane.showMessageDialog(presentPercentageFrame,"Please enter a valid enrollment ID","Alert",JOptionPane.WARNING_MESSAGE);
                            enrollment_field.setText("");
                        }
                    }                  
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(presentPercentageFrame,"Please fill valid input only","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        //Conidition for grant certificate:
        else if(event.getSource() == calculate2)
        {
            //Checking if any of the fields are empty or not::
            if(enrollment1_field.getText().isEmpty() || course_field.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(grantCertificateFrame,"Please fill all the required fields","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                try
                {
                    int enrollmentID = Integer.parseInt(enrollment1_field.getText());
                    String courseName = course_field.getText();
                    String dateOfEnrollment = (String)dateOfEnrollment_cb1.getSelectedItem()+" "+(String)dateOfEnrollment_cb2.getSelectedItem()+" "+
                        dateOfEnrollment_cb3.getSelectedItem();

                    //Checking whether an array list is empty or not:
                    if(students.isEmpty())
                    {
                        JOptionPane.showMessageDialog(grantCertificateFrame,"Please add regular student first","Alert",JOptionPane.WARNING_MESSAGE);
                        grantCertificateFrame.dispose();
                    }
                    else
                    {
                        //Comparing the entered enrollmentID with existing value:        
                        boolean enrollmentIdMatched = false;
                        for(Student obj: students)
                        {
                            if(obj instanceof Regular && enrollmentID == obj.getEnrollmentID())
                            {
                                Regular regularStudent = (Regular) obj;
                                regularStudent.grantCertificate(courseName, enrollmentID, dateOfEnrollment);
                                if(regularStudent.getIsGrantedScholarship())
                                {
                                    String message = "The student has graduated successfully.\n"+"Course Name: "+courseName+"\n"+"Enrollment ID: "+enrollmentID+"\n"+"Date of Enrollment: "+dateOfEnrollment+"\n"+"The student has been granted.";
                                    JOptionPane.showMessageDialog(grantCertificateFrame,message,"Certificate",JOptionPane.INFORMATION_MESSAGE);
                                    enrollmentIdMatched = true;
                                    enrollment1_field.setText("");
                                    course_field.setText("");
                                    grantCertificateFrame.dispose();
                                    break;
                                }
                                else
                                {
                                    String message = "The student has graduated successfully.\n"+"Course Name: "+courseName+"\n"+"Enrollment ID: "+enrollmentID+"\n"+"Date of Enrollment: "+dateOfEnrollment;
                                    JOptionPane.showMessageDialog(grantCertificateFrame,message,"Certificate",JOptionPane.INFORMATION_MESSAGE);
                                    enrollmentIdMatched = true;
                                    enrollment1_field.setText("");
                                    course_field.setText("");
                                    grantCertificateFrame.dispose();
                                    break;
                                }
                            }
                        }

                        //Creating a dialog box if an entered enrollment ID doesnot match:
                        if (!enrollmentIdMatched) 
                        {
                            JOptionPane.showMessageDialog(grantCertificateFrame,"Please enter valid enrollment ID","Alert",JOptionPane.WARNING_MESSAGE);
                            enrollment1_field.setText("");
                        }
                    }
                }
                catch (NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(grantCertificateFrame,"Please fill valid input only","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        //Condition for display method of regular student:
        else if(event.getSource() == displayBtn1)
        {
            //Checking whether an arraylist is empty or not"
            if(students.isEmpty())
            {
                JOptionPane.showMessageDialog(regularFrame,"The object has not been created","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                for(Student obj: students)
                { 
                    //Applying condition for an object where it is instance of Regular class or not:
                    if(obj instanceof Regular)
                    {
                        Regular regularStudent = (Regular) obj;
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("The details of enrollment ID "+regularStudent.getEnrollmentID()+" are given below:");
                        System.out.println();
                        regularStudent.display();
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println();
                    }
                }
            }
        }

        //Condition for adding dropout student:
        else if(event.getSource() == addBtn2)
        {
            //Checking if any of the fields are empty or not:
            if(studentName1_field.getText().isEmpty() || enrollmentID1_field.getText().isEmpty() || courseName1_field.getText().isEmpty() || 
            courseDuration1_field.getText().isEmpty() || tuitionFee1_field.getText().isEmpty() || numberOfRemainingModules_field.getText().isEmpty() || 
            numberOfMonthsAttended_field.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(dropoutFrame,"Please fill all the required fields","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                try{
                    int enrollment_Id = Integer.parseInt(enrollmentID1_field.getText());
                    
                    if(enrollment_Id <=0)
                    {
                        JOptionPane.showMessageDialog(regularFrame,"Enrollment ID must be greater than zero","Alert",JOptionPane.WARNING_MESSAGE);
                        enrollmentID1_field.setText("");
                    }
                    else
                    {
                        //Checking the appropriate input for respective fields:
                        try
                        {
                            String studentName = studentName1_field.getText();
                            String courseName = courseName1_field.getText();
                            String dateOfBirth = (String)dob_day.getSelectedItem()+" "+(String)dob_month.getSelectedItem()+" "+(String)dob_year.getSelectedItem();
                            String dateOfEnrollment = (String)dateOfEnrollment_day.getSelectedItem()+" "+(String)dateOfEnrollment_month.getSelectedItem()+" "+
                                dateOfEnrollment_day.getSelectedItem();
                            String dateOfDropout = (String)dateOfDropout_day.getSelectedItem()+" "+(String)dateOfDropout_month.getSelectedItem()+" "+
                                dateOfDropout_year.getSelectedItem();
        
                            int numOfRemainingModules = Integer.parseInt(numberOfRemainingModules_field.getText());
                            int enrollmentId = Integer.parseInt(enrollmentID1_field.getText());
                            int courseDuration = Integer.parseInt(courseDuration1_field.getText());
                            int tuitionFee = Integer.parseInt(tuitionFee1_field.getText());
                            int numOfMonthsAttended = Integer.parseInt(numberOfMonthsAttended_field.getText());
        
                            String message = "Student Name: "+studentName+"\n"+"Enrollment ID: "+enrollmentId+"\n"+"Course Name: "+courseName+"\n"
                                +"Date of Birth: "+dateOfBirth+"\n"+"Date of Enrollment: "+dateOfEnrollment+"\n"+"Date of Dropout: "+dateOfDropout+"\n"+
                                "Tuition Fee: "+tuitionFee+"\n" +"Number of Remaining Modules: "+numOfRemainingModules+"\n"+"Course Duration: "+courseDuration+" months"+"\n"
                                +"Number of Months Attended: "+numOfMonthsAttended+" month";
        
                            //Checking if months attended is more than course duration or not:
                            if(numOfMonthsAttended > courseDuration)
                            {
                                JOptionPane.showMessageDialog(regularFrame,"Number of months attended is more than course duration","Alert",JOptionPane.WARNING_MESSAGE);
                                numberOfMonthsAttended_field.setText("");
                            }
                            else
                            {
                                //Checking if an arrayList is empty or not:
                                if(students.isEmpty())
                                {
                                    Dropout student1 = new Dropout(dateOfBirth, studentName, courseDuration, tuitionFee, numOfRemainingModules, numOfMonthsAttended,
                                            dateOfDropout);
                                    student1.setEnrollmentID(enrollmentId);
                                    student1.setCourseName(courseName);
                                    student1.setDateOfEnrollment(dateOfEnrollment);
                                    students.add(student1);
                                    JOptionPane.showMessageDialog(dropoutFrame,"Successfully added a Dropout Student!!\n"+message,"Dropout Student",JOptionPane.INFORMATION_MESSAGE);
                                    studentName1_field.setText("");
                                    enrollmentID1_field.setText("");
                                    courseName1_field.setText("");
                                    courseDuration1_field.setText("");
                                    tuitionFee1_field.setText("");
                                    remainingAmount_field.setText("");
                                    numberOfRemainingModules_field.setText("");
                                    numberOfMonthsAttended_field.setText("");
                                }
                                else
                                {
                                    //Checking all the objects of array list:                        
                                    //Comparing existing enrollmentID with the new enrollmentID:
                                    boolean oldStudent = false;
                                    for(Student objs: students)
                                    {
                                        //Checking that object is instance of Dropout class or not: 
                                        if(objs instanceof Dropout && enrollmentId == objs.getEnrollmentID())
                                        {
                                            oldStudent = true;
                                            break;
                                        }
                                    }
        
                                    //Creating object of regular student if enrollmentID doesn't match:
                                    if(oldStudent)
                                    {
                                        JOptionPane.showMessageDialog(dropoutFrame, "Student already exist!! Please enter a new enrollment ID", "Alert", JOptionPane.WARNING_MESSAGE);
                                        enrollmentID1_field.setText("");
                                    }
                                    else
                                    {
                                        Dropout student1 = new Dropout(dateOfBirth, studentName, courseDuration, tuitionFee, numOfRemainingModules, numOfMonthsAttended,
                                                dateOfDropout);
                                        student1.setEnrollmentID(enrollmentId);
                                        student1.setCourseName(courseName);
                                        student1.setDateOfEnrollment(dateOfEnrollment);
                                        students.add(student1);
                                        JOptionPane.showMessageDialog(dropoutFrame,"Successfully added a Dropout Student!!\n"+message,"Dropout Student",JOptionPane.INFORMATION_MESSAGE);
                                        studentName1_field.setText("");
                                        enrollmentID1_field.setText("");
                                        courseName1_field.setText("");
                                        courseDuration1_field.setText("");
                                        tuitionFee1_field.setText("");
                                        remainingAmount_field.setText("");
                                        numberOfRemainingModules_field.setText("");
                                        numberOfMonthsAttended_field.setText("");
                                    }
                                }
                            }
                        }
                        catch (NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(dropoutFrame,"Please fill valid input only","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(dropoutFrame,"Enrollment ID should be a valid number","Alert",JOptionPane.WARNING_MESSAGE);
                    enrollmentID1_field.setText("");
                }
            }
        }

        //Applying condition when pay button of dropout class's frame is clicked:
        else if (event.getSource() == pay)
        {
            //Checking whether any of the fields is empty or not:
            if (txt_field.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(paysBillsFrame,"Please fill the required field","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                //Handling expected exception without crashing program:
                try
                {
                    int enrollmentID = Integer.parseInt(txt_field.getText());     

                    //Checking whether array list is empty or not:
                    if(students.isEmpty())
                    {
                        JOptionPane.showMessageDialog(paysBillsFrame,"Please add dropout student first","Alert",JOptionPane.WARNING_MESSAGE);
                        paysBillsFrame.dispose();
                    }
                    else
                    {
                        boolean enrollmentIdMatched = false;
                        for(Student obj: students)
                        {
                            //Applying condition whether object is instance of dropout or not:
                            if(obj instanceof Dropout && enrollmentID == obj.getEnrollmentID())
                            {
                                Dropout dropoutStudent = (Dropout) obj;
                                dropoutStudent.billsPayable();
                                JOptionPane.showMessageDialog(paysBillsFrame,"The remaining amount of enrollment ID "+enrollmentID+" is "+dropoutStudent.getRemainingAmount(),"Remaining Amount",JOptionPane.INFORMATION_MESSAGE);
                                enrollmentIdMatched = true;
                                txt_field.setText("");
                                paysBillsFrame.dispose();
                                break;
                            }
                        }

                        //Creating a dialog box if an entered enrollment ID doesnot match:
                        if (!enrollmentIdMatched) 
                        {
                            JOptionPane.showMessageDialog(presentPercentageFrame,"Please enter valid enrollment ID","Alert",JOptionPane.WARNING_MESSAGE);
                            txt_field.setText("");
                        }
                    }
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(paysBillsFrame,"Please fill valid input only","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        //Condition for remove student:
        else if(event.getSource() == remove)
        {
            //Checking whether any of the fields is empty or not:
            if(txt1_field.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(removeStudentFrame,"Please fill the required field","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                //Handling expected exception without crashing program:
                try
                {
                    int enrollmentID = Integer.parseInt(txt1_field.getText());  

                    //Checking whether array list is empty or not:
                    if(students.isEmpty())
                    {
                        JOptionPane.showMessageDialog(removeStudentFrame,"Please add dropout student first","Alert",JOptionPane.WARNING_MESSAGE);
                        removeStudentFrame.dispose();
                    }
                    else
                    {
                        boolean enrollmentIdMatched = false;
                        for(Student obj: students)
                        {
                            //Applying condition whether object is instance of dropout or not:
                            if(obj instanceof Dropout && enrollmentID == obj.getEnrollmentID())
                            {
                                Dropout dropoutStudent = (Dropout) obj;
                                if(dropoutStudent.getHasPaid())
                                {
                                    dropoutStudent.removeStudent();
                                    JOptionPane.showMessageDialog(removeStudentFrame,"The student of enrollment ID "+enrollmentID+"is removed successfully.","Remove",JOptionPane.INFORMATION_MESSAGE);
                                    enrollmentIdMatched = true;
                                    txt1_field.setText("");
                                    removeStudentFrame.dispose();
                                    break;
                                }
                                else
                                {
                                    dropoutStudent.removeStudent();
                                    JOptionPane.showMessageDialog(removeStudentFrame,"Please cleared all the remanining amount","Remove",JOptionPane.INFORMATION_MESSAGE);
                                    enrollmentIdMatched = true;
                                    txt1_field.setText("");
                                    removeStudentFrame.dispose();
                                    break; 
                                }                                
                            }
                        }

                        //Creating a dialog box if an entered enrollment ID doesnot match:
                        if (!enrollmentIdMatched) 
                        {
                            JOptionPane.showMessageDialog(removeStudentFrame,"Please enter valid enrollment ID","Alert",JOptionPane.WARNING_MESSAGE);
                            txt1_field.setText("");
                        }
                    }
                }
                catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(removeStudentFrame,"Please fill valid input only","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        //Condition for display button of dropout student:
        else 
        {
            //Checking whether an arraylist is empty or not"
            if(students.isEmpty())
            {
                JOptionPane.showMessageDialog(dropoutFrame,"The object has not been created!!","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                for(Student obj: students)
                {
                    //Applying condition whether object is instance of dropout or not:
                    if(obj instanceof Dropout)
                    {
                        Dropout dropoutStudent = (Dropout) obj;
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println("The details of enrollment ID "+dropoutStudent.getEnrollmentID()+" are given below:");
                        System.out.println();
                        dropoutStudent.display();
                        System.out.println("-----------------------------------------------------------------------");
                        System.out.println();
                    }
                }
            }
        }
    }

    //Creating main method to call constructor:
    public static void main(String[] args)
    {
        new StudentGUI();
    }
} 