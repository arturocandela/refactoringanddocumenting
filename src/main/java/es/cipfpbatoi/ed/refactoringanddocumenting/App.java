package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante pepe = new Estudiante(10,"pepe");
        
        String textoEstudiante = "El estudiante ";
        
		imprimirInformacio(pepe, textoEstudiante);
        
    }

	private static void imprimirInformacio(Estudiante estudiant, String textoEstudiante) {
		if (Estudiante.esMayorEdad(estudiant.edad)) {
        	System.out.println(textoEstudiante + estudiant.nombre + " es mayor de edad");
        } else {
        	System.out.println(textoEstudiante + estudiant.nombre + " es menor de edad");
        }
	}
}
