public class Triangulo {
private double ladoA;
private double ladoB;
private double ladoC;
 
public Triangulo(double a, double b, double c) {
	this.ladoA = a;
	this.ladoB = b;
	this.ladoC = c;
	
}
public double getLadoA() {
	return ladoA;
}
public double getLadoB() {
	return ladoB;
}
public double getLadoC() {
	return ladoC;
}
public void setLadoA(double novoLadoA) {
	this.ladoA = novoLadoA;
}
public void setLadoB(double novoLadoB) {
	this.ladoB = novoLadoB;
}
public void setLadoC(double novoLadoC) {
	this.ladoC = novoLadoC;
}

	
}
