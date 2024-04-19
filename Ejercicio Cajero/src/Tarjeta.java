import java.util.Scanner;
public class Tarjeta extends CuentaBancaria
{
	private String numeroTarjeta,tipoTarjeta;
	
	
	public Tarjeta(String numeroTarjeta, String tipoTarjeta) 
	{
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.tipoTarjeta = tipoTarjeta;
	}

	

	public void validarTarjeta()
    {
		Scanner entrada = new Scanner(System.in);
		int llave = 0;
				
		System.out.println("1. Debito");
		System.out.println("2. Credio");
		System.out.print("Cual es su tipo de tarjeta: ");
			
		switch(llave=entrada.nextInt())
		{
		case 1: tipoTarjeta ="Credito"; break;
		case 2: tipoTarjeta ="Credito"; break;
		default: System.exit(0);
		
		}
		System.out.println(" ");
		System.out.print("Ingrese el numero de su tarjeta");
		numeroTarjeta=entrada.nextLine();
		
		entrada.close();
    }
	
	
}
