public class Main {
    public static void main(String[] args) throws SalariInvalidException, DepartamentInvalidException {
        Empleat emp1 = new Empleat("Joan", 1500.0, "Informatica");
        System.out.println(emp1.toString());
        try {
            emp1.setSalari(800.0);
        } catch (SalariInvalidException e) {
            System.err.println(e.getMessage());
        }
        try {
            emp1.setDepartament("Vendes");
        } catch (DepartamentInvalidException e) {
            System.err.println(e.getMessage());
        }
    }
}
