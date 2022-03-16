package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Modela un alumno, con la edad y su nombre
 * <p>
 * Esta clase parte de los requisitos del profesor de clase para explicarnos como funciona la documentacion
 * 
 * @author Iker Vicente Rico Triguero
 *
 */
public class Estudiante implements IComparable{
	
	private static final int EDAD_MINIMA = 18;
	int edad;
	String nombre;
	
	
	public Estudiante(int e, String n) {
		this.edad = e;
		this.nombre = n;
	}
	

	@Override
	public int comparaTe(Estudiante e) {
		
		if (this.edad == e.edad){
			return 0;
		} else if (this.edad > e.edad) {
			return 1;
		} else {
			return -1;
		}
	}

	public static boolean esMayorEdad(int edad)
	{
		return edad >= EDAD_MINIMA;
	}
	
}
