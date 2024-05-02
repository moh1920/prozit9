import java.util.HashSet;
import java.util.TreeSet;

public class DepartmentHashSet implements IDépartement<Department>{

    HashSet<Department> department ;

    public DepartmentHashSet() {
        department = new HashSet<Department>();
    }

    @Override
    public void ajouterDepartement(Department d) {
      department.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Department d : department){
           if(d.getNomDept().equals(nom))
               return true ;
        }

        return false ;
    }

    @Override
    public boolean rechercherDepartement(Department o) {
        return department.contains(o);
    }

    @Override
    public void supprimerDepartement(Department o) {
       department.remove(o);
    }

    @Override
    public void displayDepartement() {
        System.out.println(department);
    }

    @Override
    public TreeSet trierDepartementById() {
        return new  TreeSet<>(department);
    }
}
