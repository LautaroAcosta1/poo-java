package poojava;

public class Fraccion {
	
	int numerador;
	int denominador;
	
	// constructor
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
	
    // metodo de instancia para imprimir
	void imprimir() {
		System.out.println(numerador + "/" + denominador);
	}
	
	// metodo de instancia que invierte el signo
    void invertirSigno() {
        numerador = -numerador;
        denominador = -denominador;
    }
    
    // metodo de instacia que invierte las posicones de los numeros
    void invertir() {
    	int aux = numerador;
    	numerador = denominador;
    	denominador = aux;
    }
	
	public static void main(String[] args) {
		Fraccion fraccion = new Fraccion(2, 5);
		fraccion.imprimir();
		
		fraccion.invertir();
		
		fraccion.imprimir();
	}
}
