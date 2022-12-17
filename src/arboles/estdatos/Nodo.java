/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles.estdatos;

/**
 *
 * @author Fiuke
 */
public class Nodo {
    
    Nodo raiz;
  

    public Nodo() {
    }
    
    
    public Nodo p; //Padre
    public Nodo der;
    public Nodo izq;
    public int llave;
    public Object nombre;
    
    
    public Nodo(int llave){
         
        p = null;
        der = null;
        izq = null;
        nombre = null;
    
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }
    
    public void insertar(int llave, Object nombre){
        
        Nodo n = new Nodo();
        
        n.llave=llave;
        n.nombre=nombre;
        
        if(raiz == null){
            
            raiz =n;
            
            int temporal = 0;
            
            llave = temporal;
            
        }else{
            Nodo temporal = raiz;
            
            while(temporal != null){
                
                n.p =temporal;
                
                if(n.llave >= temporal.llave){
                    
                    temporal = temporal.der;
                }else{
                    temporal = temporal.izq;
                }
            }
            
            if(n.llave < n.p.llave){
                n.p.izq=n;
            }else{
                n.p.der=n;
            }
        }
    }
    /** 
     public void mostrar(NodoArbolBinario tmp){
        tmp.mostrar();
        if(tmp.hijoIzquierdo!=null)
            mostrar(tmp.hijoIzquierdo);
        if(tmp.hijoDerecho!=null)
            mostrar(tmp.hijoDerecho);
    }
     */
    public void mostrar(Nodo temporal){
        
        if(temporal != null){
            
            System.out.println("Edad: " + temporal.llave + " Nombre: " + temporal.nombre);
            Preorden(temporal.der);
            Preorden(temporal.izq);
        }
        
    }
    
    
    public void Inorden( Nodo temporal){
        
    
        if(temporal != null){
            
            Inorden(temporal.izq);
            System.out.println("Edad: " + temporal.llave + " Nombre: " + temporal.nombre);
            Inorden(temporal.der);
        }
    }
   
    public void Preorden(Nodo temporal){
         
        if(temporal != null){
            
            System.out.println("Edad: " + temporal.llave + " Nombre: " + temporal.nombre);
            Preorden(temporal.izq);
            Preorden(temporal.der);
        }
    }
    
    public void Postorden(Nodo temporal){
   
        if(temporal != null){
            
            Preorden(temporal.izq);
            Preorden(temporal.der);
            System.out.println("Edad: " + temporal.llave + " Nombre: " + temporal.nombre);

        }
    
    
    }
}
