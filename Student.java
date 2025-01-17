/**
 * This is a demo class to show how it works with if...else
 */
public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;
        if((average > 0) & (average <= 100)){
            this.average = average;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAverage(double average){
        if((average > 0) & (average <= 100)){
            this.average = average;
        }
    }

    public double getAverage(){
        return average;
    }

    public char getLetterGrade(){
        char letterGrade;

        if(average >= 90){
            letterGrade = 'A';
        }else if(average >= 80){
            letterGrade = 'B';
        }else if(average >= 70){
            letterGrade = 'C';
        }else if(average >= 60){
            letterGrade = 'D';
        }else{
            letterGrade = 'F';
        }

        return letterGrade;
    }




}


