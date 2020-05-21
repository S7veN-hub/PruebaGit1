package figuras;

public class Rectangulo {
	
	int ancho;
	int alto;
	String nombre;
	
	public Rectangulo(int ancho, int alto, String nombre) {
		
		this.ancho = ancho;
		this.alto = alto;
		this.nombre = nombre;
	}
	
	public Rectangulo() {
		
		this.ancho = 5;
		this.alto = 7;
		this.nombre = "RECTANGULO";
	}
	
	public int getAncho() {
		
		return this.ancho;
	}
	
	public int getAlto() {
		
		return this.alto;
	}
	
	public int perimetro() {
		
		int perimetro = this.ancho * 2 + this.alto * 2;
		return perimetro;
	}
	
	public int area() {
		
		int area = this.ancho * this.alto;
		return area;
	}
	
	public int incrementaAncho() {
		
		this.ancho ++;
		return this.ancho;
	}
	
	public int incrementaAlto() {
		
		this.alto ++;
		return this.alto;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public boolean esCuadrado() {
		
		boolean flag = true;
		
		if (this.ancho == this.alto) {
			
			flag = true;
		} 
		else {
			
			flag = false;
		}
		return flag;
	}
	
	public void pintaRelleno(char caracter) {
		
		int i, j;
		
		for (i = 1; i <= this.alto; i++) {
			
			for (j = 1; j <= this.ancho; j++) {
				
				System.out.print(caracter + " ");
			}
			System.out.println("");
		}
	}
	
	public void pintaPerimetro(char caracter) {
			
		int i, j;
			
		for (i = 1; i <= this.alto; i++) {
				
			for (j = 1; j <= this.ancho; j++) {
				
				if ((i == this.alto - (this.alto - 1) || i == this.alto)) {
					
					for (j = 1; j <= this.ancho; j++) {
						
						System.out.print(caracter + " ");
					}
				}
					
				if ((j == this.ancho - (this.ancho - 1) || j == this.ancho) && (i != this.alto - (this.alto - 1) || i != this.alto)) {
						
					System.out.print(caracter + " ");
				}
				else {
						
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}













