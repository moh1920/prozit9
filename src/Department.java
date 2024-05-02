import java.util.Objects;

public class Department implements Comparable<Department> {
    int id ;
    String nomDept ;
    int nbEmploye ;

    public Department(int id, String nomDept, int nbEmploye) {
        this.id = id;
        this.nomDept = nomDept;
        this.nbEmploye = nbEmploye;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    public int getNbEmploye() {
        return nbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.nbEmploye = nbEmploye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return getId() == that.getId() && getNbEmploye() == that.getNbEmploye() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNomDept(), getNbEmploye());
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", nomDept='" + nomDept + '\'' +
                ", nbEmploye=" + nbEmploye +
                '}';
    }
    @Override
    public int compareTo(Department o) {
        return this.id-o.id;
    }
}

