/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles.estdatos;

import java.util.Scanner;

/**
 *
 * @author Fiuke
 */
public class ArbolesEstDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        menu();
    }
    
    public static void menu(){
        
        
        Scanner entrada= new Scanner(System.in);
        int e=-1;
        

        while(e!=0){
            
            System.out.println("------------------------------------------------");
            System.out.println("MENU");
            System.out.println("Digite la opcion que desea seleccionar");
            System.out.println("1- Mostrar Arbol");
            System.out.println("2- Mostrar Recorridos Inorden, Preorden y Psotorden");
            System.out.println("3- Insertar Nodo");
            System.out.println("0- Salir");
            System.out.println("------------------------------------------------");
            e=entrada.nextInt();
            
            switch(e){
                
                case 1: 
                   verArbol();
                break;
                
                case 2: 
                    recorridos();
                break;
                
                case 3:
                    insertatNodo();
                break;
            
            }
        }
    }
    
    public static void verArbol(){
        
        Nodo arbol= new Nodo();
        
        arbol.insertar(25, "Carlos");
        arbol.insertar(20, "Maria");
        arbol.insertar(30, "Luis");  
        arbol.insertar(18, "Ana");
        arbol.insertar(21, "Jorge");
        arbol.insertar(26, "Alicia");
        arbol.insertar(35, "Andres");
        arbol.mostrar(arbol.raiz);
    
    }
    
    public static void recorridos(){
        
         Nodo arbol = new Nodo();
        
        arbol.insertar(25, "Carlos");
        arbol.insertar(20, "Maria");
        arbol.insertar(30, "Luis");  
        arbol.insertar(18, "Ana");
        arbol.insertar(21, "Jorge");
        arbol.insertar(26, "Alicia");
        arbol.insertar(35, "Andres");
       
        
        System.out.println("Recorrido Inorden");
        arbol.Inorden(arbol.raiz);
        System.out.println(" ");
        
        System.out.println("Recorrido Preorden");
        arbol.Preorden(arbol.raiz);
        System.out.println(" ");
        
        System.out.println("Recorrido Postorden");
        arbol.Postorden(arbol.raiz);
    }
    
    public static void insertatNodo(){
        
        Nodo arbol = new Nodo();
        Scanner e = new Scanner(System.in);
        
        arbol.insertar(25, "Carlos");
        arbol.insertar(20, "Maria");
        arbol.insertar(30, "Luis");  
        arbol.insertar(18, "Ana");
        arbol.insertar(21, "Jorge");
        arbol.insertar(26, "Alicia");
        arbol.insertar(35, "Andres");
        
        System.out.println("Digite LA EDAD y el NOMBRE de la persona que desea inseertar al arbol");
        arbol.insertar(e.nextInt(), e.next());
        
        System.out.println("Nuevo arbol_______________________");
        arbol.mostrar(arbol.raiz);
        System.out.println(" ");
        
        System.out.println("Nuevo recorrido Inorden_____________________");
        arbol.Inorden(arbol.raiz);
        System.out.println(" ");
        
        System.out.println("Nuevo Recorrido Preorden____________________");
        arbol.Preorden(arbol.raiz);
        System.out.println(" ");
        
        System.out.println("Nuevo recorrido Postorden____________________");
        arbol.Postorden(arbol.raiz);
    }
    
    
}
