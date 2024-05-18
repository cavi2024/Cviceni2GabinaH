import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computers02 computer = new Computers02("ZZZ", 1.8,13.6, true, true);
        Computers02 computer2 = new Computers02("ZZZ", 2.1);

        List<Computers02> computers02List = new ArrayList<>();
        computers02List.add(computer);
        computers02List.add(computer2);
    }
}