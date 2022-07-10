package src;
public class mainP {
    public static void main(String [] args) {

        Persona per = new Persona();
        
        per.setNombre("Eduardo");
        per.setEdad(23);
        per.setTelefono(556897410);

        System.out.println("Nombre: " + per.getNombre());
        System.out.println("Edad: " + per.getEdad());
        System.out.println("Telefono: " + per.getTelefono());

    }
}
