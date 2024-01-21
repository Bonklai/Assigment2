public class Employee extends  Person{
    private String position;
    private double salary;

    Employee(String name , String surname , String position  , double salary){
        super(name,surname);
        setPosition(position);
        setSalary(salary);
    }
    @Override
    public String toString(){
        return getPosition() + " : " + super.toString();
    }
    @Override
    public double getPaymentAmount(){
        return getSalary();
    }









    public void setPosition(String position){this.position = position;}
    public void setSalary(double salary){this.salary = salary;}
    public String getPosition(){return position;}
    public double getSalary(){return salary;}

}
