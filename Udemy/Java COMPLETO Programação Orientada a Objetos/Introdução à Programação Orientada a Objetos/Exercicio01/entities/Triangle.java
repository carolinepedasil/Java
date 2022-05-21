package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	/*
	 	public = indica que essa função poderá ser utilizada em outro arquivo
	 	double = a função vai retornar um valor tipo double
	 	depois digitar o nome da operação 
	 	dentro do () vai vir os parametros que essa função recebe para fazer o que ela tem que fazer
	*/
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		/*
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
		*/
	}

}
