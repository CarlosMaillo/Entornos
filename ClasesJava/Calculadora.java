import java.util.Scanner;
/**
 * @author Ma�llo
 * @version 1.1
 */
public class Calculadora 
{
	float resultado,operando1,operando2;
	
	public Calculadora() 
	{
	}
	/**
	 * @since disponible desde la versi�n 1.1
	 */
	public void pedirOperandos()
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Por favor introduzca el primer operando");
		operando1=teclado.nextFloat();
		System.out.println("Por favor introduzca el segundo operando");
		operando2=teclado.nextFloat();
		
	}
	/**
	 * @return devuelve un float
	 */
	public float suma()
	{
		resultado = operando1 + operando2;
		return resultado;
	}
	/**
	 * @return devuelve un float
	 */
	public float resta()
	{
		resultado = operando1 - operando2;
		return resultado;
	}
	/**
	 * @return devuelve un float
	 */
	public float multiplicacion()
	{
		resultado = operando1 * operando2;
		return resultado;
	}
	/**
	 * @return devuelve un float
	 */
	public float division()
	{
		if(operando2!=0)
		{
			resultado = operando1 / operando2;
			return resultado;
		}
		else 
		{
			System.out.println("El segundo operando no puede ser 0");
			return -1;
		}
	}
	/**
	 * @return devuelve un float
	 */
	public float raiz_cuadrada()
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("�De qu� operando de los 2 desea hacer la ra�z cuadrada(1 o 2)?");
		if(teclado.nextInt()==1) {
			if(operando1>=1)
			{
				return (float) Math.sqrt(operando1);
			}
			return -1;
		}else{
			if(operando2>=1)
			{
				return (float) Math.sqrt(operando2);
			}
			return -1;
		}
	}
	/**
	 * @anotaci�n Main de la clase calculadora, craci�n del objeto y llamada a los m�todos de la clase
	 */
	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		c1.pedirOperandos();
		System.out.println("M�todo suma: "+c1.suma());
		System.out.println("M�todo resta: "+c1.resta());
		System.out.println("M�todo multiplicacion: "+c1.multiplicacion());
		System.out.println("M�todo division: "+c1.division());
		System.out.println("M�todo ra�z cuadrada: "+c1.raiz_cuadrada());
	}

}

