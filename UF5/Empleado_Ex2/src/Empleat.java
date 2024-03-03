
public class Empleat {

    private String nom;
    private double salari;
    private String departament;

    private static final double SMI = 1000.0; // Valor SMI per defecte (substituir per valor real)

    public Empleat() {
    }

    public Empleat(String nom, double salari, String departament) throws SalariInvalidException, DepartamentInvalidException {
        if (salari < SMI) {
            throw new SalariInvalidException("El salari no pot ser inferior al SMI (" + SMI + ")");
        }
        if (!departament.equals("Informatica") && !departament.equals("Direccio") && !departament.equals("Comercial")) {
            throw new DepartamentInvalidException("El departament només pot ser 'Informatica', 'Direccio' o 'Comercial'");
        }
        this.nom = nom;
        this.salari = salari;
        this.departament = departament;
    }

    public Empleat(Empleat e) {
        this.nom = e.nom;
        this.salari = e.salari;
        this.departament = e.departament;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) throws SalariInvalidException {
        if (salari < SMI) {
            throw new SalariInvalidException("El salari no pot ser inferior al SMI (" + SMI + ")");
        }
        this.salari = salari;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) throws DepartamentInvalidException {
        if (!departament.equals("Informatica") && !departament.equals("Direccio") && !departament.equals("Comercial")) {
            throw new DepartamentInvalidException("El departament només pot ser 'Informatica', 'Direccio' o 'Comercial'");
        }
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Empleat{" +
                "nom='" + nom + '\'' +
                ", salari=" + salari +
                ", departament='" + departament + '\'' +
                '}';
    }
}