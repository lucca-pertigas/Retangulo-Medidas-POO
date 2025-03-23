package aplicacao;

import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		System.out.print("Digite a largura: ");
		double largura = sc.nextDouble();
		Retangulo retan = new Retangulo (largura, altura);
		System.out.println ("Area: " + retan.getArea());
		System.out.println ("Perimetro: " + retan.getPerimetro());
		System.out.println ("Diagonal: " + retan.getDiagonal());

	}

}
