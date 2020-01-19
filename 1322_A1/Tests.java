import java.text.DecimalFormat;

public class Tests {

    //Variables
    private String firstName,lastName;
    private float[] grades = new float[5];
    private float average;
    private char letterGrade;

    //Constructors
    public Tests(){
        firstName = "No";
        lastName = "Name";
    }


    public Tests(String firstName, String lastName,float grade1,float grade2,float grade3,float grade4,float grade5) {
        this.firstName = firstName;
        this.lastName = lastName;
        grades[0] = grade1;
        grades[1] = grade2;
        grades[2] = grade3;
        grades[3] = grade4;
        grades[4] = grade5;
    }

    //Methods
    @Override
    public String toString() {
        DecimalFormat dec = new DecimalFormat("0.00");
        return firstName + "           "+lastName +"          "+ dec.format(grades[0])+"      "+dec.format(grades[1])+"     "+dec.format(grades[2])+
                "     "+dec.format(grades[3])+
                "      "+dec.format(grades[4]) +"     "+ dec.format(average) +"      "+ letterGrade;
    }

    public void setLetterGrade(){
        if(average >= 90){
            letterGrade = 'A';
        }
        else if(average >= 80 && average < 90){
            letterGrade = 'B';
        }
        else if(average >= 70 && average < 80) {
            letterGrade = 'C';
        }
        else if(average >= 60 && average < 70){
            letterGrade = 'D';
        }
        else if(average < 60){
            letterGrade = 'F';
        }

    }

    public void setAverage(){
        average = (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
    }

    //Accessors
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getGrades(int gradeNumber) {
        return grades[gradeNumber];
    }

    public void setGrades(float grades,int gradeNumber) {
        this.grades[gradeNumber] = grades;
    }

    public float getAverage() {
        return average;
    }

    public char getLetterGrade() {
        return letterGrade;
    }
}
