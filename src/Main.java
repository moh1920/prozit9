//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AffectationHashMap depHashset = new AffectationHashMap();
        Department dep1 = new Department(41,"hr",0);
        Department dep2 = new Department(62,"it",0);

        Employee em1 = new Employee(1,7,"ghassen","mohamed","hr");
        Employee em2 = new Employee(2,8,"tbessi","iheb","hr");
        Employee em3 = new Employee(2,9,"maher","kouki","it");
        Employee em4 = new Employee(1,10,"omrani","layemouna","it");

        depHashset.ajouterEmployeDepartement(em1,dep1);
        depHashset.ajouterEmployeDepartement(em1,dep1);
        depHashset.ajouterEmployeDepartement(em2,dep2);
        depHashset.ajouterEmployeDepartement(em3,dep2);
        depHashset.ajouterEmployeDepartement(em4,dep1);
        depHashset.afficherEmployesEtDepartements();
        depHashset.afficherEmployes();
        depHashset.trierMap();

    }
}