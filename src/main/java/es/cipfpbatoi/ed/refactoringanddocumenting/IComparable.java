package es.cipfpbatoi.ed.refactoringanddocumenting;
/**
 * Interfaz para comparar estudiantes
 * @author iker
 *
 */
public interface IComparable {
/**
 * Metode para comparar con un estudiante
 * 
 * @param e Estudiante a comparar
 * @return 0 si son iguales,1 si el actual es mayor y 
 * -1 si el actual es menor
 */
	int comparaTe(Estudiante e);

}