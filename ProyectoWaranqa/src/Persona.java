import java.util.Scanner;

///AUTOR : Hector Ramos Chalco
public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	public void ingresarDatos() {
		Scanner entrada= new Scanner(System.in);
		 System.out.println(" \t ииииииииии INGRESE SU NOMBRE POR FAVOR ииииииииии \t ");
		 setNombre(entrada.nextLine());
		
		 System.out.println(" \t ииииииииии INGRESE SU APELLIDO POR FAVOR ииииииииии \t ");
		 setApellido(entrada.nextLine());
		
		 System.out.println(" \t ииииииииии INGRESE SU DNI POR FAVOR ииииииииии \t");
		 setDNI(entrada.nextLine());

	}
	public Persona() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}	
	@Override
	public String toString() {
		return " Nombre : " + nombre + " , Apellido : " + apellido + " ,  Dni : " + dni  ;
	}	
}
