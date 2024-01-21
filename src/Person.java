public class Person implements Comparable<Person> , Payable {
    private final int id ;
    private static int gen_id = 1;
    private String name;
    private String surname;

    public String getPosition(){
        return "Student";
    }
        

    public Person(String name , String surname){
        id = gen_id++;
        setName(name);
        setSurname(surname);
    }
    @Override
    public String toString(){
        return  id+ ". " + getName() + ' ' + getSurname();
    }


    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }


    public void setName(String name){this.name = name;}
    public void setSurname(String surname){this.surname = surname;}
    public String getName(){return name;}
    public String getSurname(){return surname;}
}
