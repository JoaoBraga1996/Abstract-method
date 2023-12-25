package entities;

import entities.enums.Color;

/*Se uma classe possuir pelo menos um método
abstrato, então esta classe também é abstrata.*/
public abstract class Shape {

	Color color;

	public Shape() {

	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// São métodos que não possuem implementação.
	public abstract double area();

}
