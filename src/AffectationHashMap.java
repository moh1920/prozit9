import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AffectationHashMap {
        Map<Employee,Department>  employeeDepartmentMap=new HashMap<>();
        public void  ajouterEmployeDepartement(Employee e, Department d){
                employeeDepartmentMap.put(e,d);
        }
        public  void afficherEmployesEtDepartements(){
                for(Map.Entry<Employee,Department> e : employeeDepartmentMap.entrySet()){
                        System.out.println(e.toString());
                }
        }
        public void supprimerEmploye (Employee e){
                employeeDepartmentMap.remove(e);
        }
        public void supprimerEmployeEtDepartement (Employee e,Department d){
                employeeDepartmentMap.remove(e,d);
        }
        public void afficherEmployes(){
                Stream<Map.Entry<Employee, Department>> mapStream = employeeDepartmentMap.entrySet().stream();
                List<Employee> employees = mapStream.map(Map.Entry::getKey).collect(Collectors.toList());
                employees.forEach(System.out::println);
        }
        public void afficherDepartements(){
                Stream<Map.Entry<Employee, Department>> mapStream = employeeDepartmentMap.entrySet().stream();
                List<Department> department = mapStream.map(Map.Entry::getValue).collect(Collectors.toList());
                department.forEach(System.out::println);
        }
        public boolean rechercherEmploye (Employee e){
                for(Map.Entry<Employee,Department> employeeDepartmentEntry : employeeDepartmentMap.entrySet()){
                        if (employeeDepartmentEntry.getKey().equals(e))
                                return true ;
                }
                return false ;
        }
        public  boolean rechercherDepartement (Department d){
                for (Map.Entry<Employee,Department> departmentEntry : employeeDepartmentMap.entrySet()){
                        if (departmentEntry.getValue().equals(d))
                                return true;
                }
                return false ;
        }


        public  TreeMap<Employee,Department> trierMap(){
                return new TreeMap<>(employeeDepartmentMap);
        }
}
