import java.util.Scanner;

public class Calculadora 
{
	float resultado,operando1,operando2;
	
	public Calculadora() 
	{
	}
	public void pedirOperandos()
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Por favor introduzca el primer operando");
		operando1=teclado.nextFloat();
		System.out.println("Por favor introduzca el segundo operando");
		operando2=teclado.nextFloat();
		
	}
	
	public float suma()
	{
		resultado = operando1 + operando2;
		return resultado;
	}

	public float resta()
	{
		resultado = operando1 - operando2;
		return resultado;
	}
	
	public float multiplicacion()
	{
		resultado = operando1 * operando2;
		return resultado;
	}
	
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
	
	public float raiz_cuadrada()
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿De qué operando de los 2 desea hacer la raíz cuadrada(1 o 2)?");
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

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		c1.pedirOperandos();
		System.out.println("Método suma: "+c1.suma());
		System.out.println("Método resta: "+c1.resta());
		System.out.println("Método multiplicacion: "+c1.multiplicacion());
		System.out.println("Método division: "+c1.division());
		System.out.println("Método raíz cuadrada: "+c1.raiz_cuadrada());
	}

}

