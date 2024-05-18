import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    LocalDate birthdate;
    List<Computers02> computers02s= new ArrayList<>();

    public Employee(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public void addComputers02(Computers02 computers02) {
        computers02s.add(computers02);
        // přidáme počítače
    }

    public void removeComputers02(Computers02 computers02) {
        computers02s.remove(computers02); // odebereme počítače
    }

    public List<Computers02> getComputers02s () {
        return new ArrayList<>(computers02s);
        // vrátíme kopii seznamu, pokud někdo provede změny, neovlivní to náš seznam
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}




