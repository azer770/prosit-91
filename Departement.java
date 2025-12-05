public class Departement {
    int id;
    String nomDepartement;
    int nombreEmployes;

    public Departement(){

    }

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;

    }
    public int getId() {
        return id;


    }
    public void setId(int id) {
        this.id = id;

    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;

    }
    public int getNombreEmployes() {
        return nombreEmployes;
    }
    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;

    }
    @Override
    public String toString() {
        return "id=" + id + ", nomDepartement=" + nomDepartement +"nombres de employes" + nombreEmployes;

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement other = (Departement) obj;
        return this.id == other.id &&
                (this.nomDepartement != null ? this.nomDepartement.equals(other.nomDepartement) : other.nomDepartement == null);
    }
    @Override
    public int hashCode() {
        return id + nomDepartement.toLowerCase().hashCode();
    }

    // toString()
    @Override
    public String toString() {
        return "Departement { " +
                "id=" + id +
                ", nom='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                " }";
    }
}

}


