import java.util.Objects;

public class Employee implements Comparable<Employee> {
    int grade ;
    int id ;
    String nom ;
    String prenom ;
    String nomDept ;

    public Employee() {
    }

    public Employee(int grade, int id, String nom, String prenom, String nomDept) {
        this.grade = grade;
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDept = nomDept;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && Objects.equals(getNom(), employee.getNom());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getGrade(), getId(), getNom(), getPrenom(), getNomDept());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "grade=" + grade +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDept='" + nomDept + '\'' +
                '}';
    }
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

}
