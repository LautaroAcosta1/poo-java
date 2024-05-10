package poojava;

public class Punto {
	
	double x;
	double y;

	// constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// metodo de instancia que imprime las coordenadas
	void imprimir() {
		System.out.println("x:"+x + "  " + "y:"+y);
	}
	
	// desoplaza el punto a traves de paramentros recibidos
	void desplazar(double desp_x, double desp_y) {
		 this.x = desp_x;
		 this.y = desp_y;
	}
	
	// devuelve la distancia entre los dos puntos
	static double distancia(Punto p1, Punto p2) {
        double distanciaX = p2.x - p1.x;
        double distanciaY = p2.y - p1.y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
	}
	
	public static void main(String[] args) {
		Punto punto = new Punto(0, 0);
		punto.imprimir();
	}

}
