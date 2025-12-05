//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Departement d1 = new Departement(1, "RZ-3",22);
        Departement d2 = new Departement(1, "RZ-3",22);

        System.out.println(d1.equals(d2));  // true


    }

}