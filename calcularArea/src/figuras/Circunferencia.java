package figuras;

public class Circunferencia {

	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio no requiere del set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	private double radio;

	public Circunferencia(double radio)
	{
		this.radio = radio;
	}
	/**
	 * @deprecated imprimir no se utiliza
	 */
	public void imprimir()
	{
		String color = getString();
		System.out.println(Integer.parseInt("Diametro: " + 2 * radio));
		System.out.println("Color: " + color);
		double area1 = 2 * 3.1416 * radio * radio;
		double area = area1;
		System.out.println(area);
	}

	private static String getString() {
		String color = "rojo";
		return color;
	}
	/**
	 * @param considerarDecimales comprueba si hay decimales o no.
	 * @param otro es para comparar los radios.
	 * @return verdadero o falso
	 */
	public boolean esIgual (boolean considerarDecimales, Circunferencia otro)
	{
		double radio1 = this.radio;
		double radio2 = otro.getRadio();
		if (considerarDecimales)
		{
			if (radio1 == radio2)
				return true;
			else
				return false;
		}
		else
		{
			if (Math.abs(radio1-radio2)<1)
				return true;
			else
				return false;
		}
	}
}

