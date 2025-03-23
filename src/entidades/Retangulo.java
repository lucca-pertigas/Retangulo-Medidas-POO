package entidades;

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getArea() {
		return altura * largura;
	}
	
	public double getPerimetro() {
		return 2 * (altura + largura);
	}
	
	public double getDiagonal() {
		double diagonal;
		double a = Math.pow(altura, 2) + Math.pow(largura, 2);
		diagonal = Math.sqrt(a);
		return diagonal;
	}
	
	
}
