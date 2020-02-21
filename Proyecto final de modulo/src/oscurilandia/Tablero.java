package oscurilandia;
/**
 * @author Carlos Acosta 
 * @see 
 * @version 20 / 02 / 2020
 *
 */

import java.util.Scanner; 

public class Tablero{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		/**
		 * En esta Clase instanciamos los metodos de la clase ESpacio, ademas de inicializar un nuevo espacio
		 * Luego creamos un menu con las distintas opciones. 
		 */
		Espacio esp1 = new Espacio();
		esp1.llenarTablero();
		int op = 0 ; 
		Scanner sc = new Scanner ( System.in); 
		System.out.println(" Iniciando Juego ");
		do {
			System.out.println("-----------------------------");
			System.out.println(" Menu ");
			System.out.println("------------------------------");
			System.out.println("1.- Crear Carros ");
			System.out.println("2.- Lanzar Huevo");
			System.out.println("3.- Mostrar Tablero");
			System.out.println("4.- Salir del programa");
			System.out.println("------------------------------");
			System.out.print("Ingrese una opcion: ");

			op = sc.nextInt();
			
			switch(op){
			
				case 1:
					esp1.crearCarro();
					break;
				case 2:
					esp1.lanzarHuevo();
					break;
				case 3:
					esp1.mostrarTablero();
					break;
				case 4: 
					System.out.println("Adios!!!");
					break;
				default:
					System.out.println("Ingrese una opcion valida");
					break;
			}
			
		}while (op != 4);

		sc.close();

	}

}
// Fin espacio 1 

