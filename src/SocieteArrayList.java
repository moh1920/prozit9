import java.util.*;

public class SocieteArrayList implements IGestion <Employee>{
    List<Employee> employees;
    public SocieteArrayList() {
        employees = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employee employee) {
        employees.add(employee)    ;
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employee E: employees){
            if(E.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee o) {
        return employees.contains(o);
    }
    @Override
    public void supprimerEmploye(Employee o) {
         employees.remove(o);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employees);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employee> employeeComparatorDepartment = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                return o1.getNomDept().compareTo(o2.getNomDept());
            }
        };
        Comparator<Employee> employeeComparatorgrade=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getGrade() -o2.getGrade();
            }
        };
        employees.sort(employeeComparatorDepartment.thenComparing(employeeComparatorgrade));
    }
}
