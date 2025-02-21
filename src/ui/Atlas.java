/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final double CostoUnaNoche = 150000;
    final Double CostoTrayectoBus = 80000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario (completar)
        String nombre;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();

        int edad;
        System.out.println("Bienvenido " + nombre + "!");
        System.out.println("Que edad tienes?");
        edad = escaner.nextInt();
        

        int cedula;
        VerSiEsMenorDeEdad(edad);

        cedula = escaner.nextInt();
        escaner.nextLine();

        String Lugar;
        System.out.println("Desde donde te comunicas con nosotros: ");
        Lugar = escaner.nextLine();

        double cantidadnoches;
        System.out.println("Bienvenido a EVENTOS ATLAS, cuantas noches deseas hospedarte? ");
        cantidadnoches = escaner.nextInt();


        int transporte;
        System.out.println("Que medio de transporte usaras, selecciona 1 para Avion o 2 para Bus. ");
        transporte = escaner.nextInt();






        // ...

        // Declaracion de salidas calculadas (completar)
        double totalTransporte;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(); // aqui podrian faltar parametros
	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    
    



    }
    
    
    public double calcularTotalTransporte() {
        return 0; // Completar operacion
    }
    
    public static void VerSiEsMenorDeEdad(int edad) {
        if (edad < 18) {
            System.out.println("Por favor escribe tu tarjeta de identidad: ");
            if (edad >= 18) {
            System.out.println("Por favor escribe tu cedula de ciudadania: ");
            }
        }
    
    


    public static double costodenoches(int costonoches) {
        double costonoches = CostoUnaNoche * cantidadnoches;
            return costodenoches;
    }

   public int tipotransporte(int transporte) {
        if (transporte == 1) { 

        }


    }
    


    
    
    

            



        }


    
    
    





    

	

	
