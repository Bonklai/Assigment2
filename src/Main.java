import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void printData(Iterable<Person> blabla) {
        for (Person pers : blabla) {
            System.out.println(pers + " earns " + pers.getPaymentAmount() + " tenge");
        }
    }
    public static void main(String[] args) {
            List<Person> blabla = new ArrayList<>();
            blabla.add(new Employee("Daulet","Kantai","SoftwareEngineer",10000.0d));
            blabla.add(new Employee("Bakthybek","Begimkulov","Driver",6969.69d));
            blabla.add(new Student("Jake","Jonathan",3.8));
            blabla.add(new Employee("Belka" , "Strelka", "Austronaut", 1000000));
            Collections.sort(blabla);
            printData(blabla);

        }
}