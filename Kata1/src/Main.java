/*
Proyecto de kata 1 realizado por Diego Cedres Espinosa
 */

package kata1;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1949, 9, 24);

        kata1.Person person = new kata1.Person("Blas", "Cabrera", date);
        System.out.println(person.getName() + " " + person.getSurname() + " tiene " + person.getAge() + " años");
    }

}