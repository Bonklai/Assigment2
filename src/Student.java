public class Student extends Person {
    private double gpa;
    public Student(String name , String surname , double gpa){
        super(name,surname);
        setGpa(gpa);
    }
    @Override
    public String toString(){
        return getPosition()+ ": " + super.toString();
    }
    @Override
    public double getPaymentAmount(){
        if(getGpa()>2.67) return 36660.00;
        return 0;
    }



    double getGpa(){return gpa;}
    void setGpa(double gpa){this.gpa = gpa;}
}
