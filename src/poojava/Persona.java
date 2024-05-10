package poojava;

public class Persona {
    String nombre;
    int edad;
    int DNI;
    
    // constructor
    public Persona(String nombre, int edad) {
    	this.nombre = nombre;
    	this.edad = edad;
    }
    
    // verifica si la perosona de instancia es mas joven que otro
    boolean masJovenQue(Persona otro) {
    	if (this.edad < otro.edad) {
    		return true;
    	}
    	return false;
    }
    
    // verifica si la persona de instancia tiene el mismo nombre que otro
    boolean tocayo(Persona otro) {
    	if (this.nombre == otro.nombre) {
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    	Persona persona = new Persona("Lautaro", 22);
    	Persona persona2 = new Persona("pepe", 43);
    	persona.masJovenQue(persona2);
    }
    
}
