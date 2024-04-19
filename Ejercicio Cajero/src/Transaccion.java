import java.util.Scanner;
public class Transaccion extends CuentaBancaria
{
	private  int idTransaccion;
	private double monto;
	
	public Transaccion(int idTransaccion, double monto) {
		super();
		this.idTransaccion = idTransaccion;
		this.monto = monto;
	}

	public void ejecutarTransaccion()
    {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la cantidad que desea conosignar");
		double consignacion= entrada.nextDouble();
		System.out.println("Transaccion Exitosa");
		System.out.println("Desea ver un resumen de la transferencia");
		System.out.println("    1. Si //  2. No");
		int llave=entrada.nextInt();
		
		if (llave == 1) 
		{
			System.out.println("Saldo anterior: "+saldo+"$");
			System.out.println("Monto a retirar: " +consignacion+ "$");
			System.out.println("Saldo actual: "+(saldo-consignacion)+"$");
			try 
			{
	            Thread.sleep(15000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			System.out.println("Gracias por preferirnos");
			System.out.print("\033[H\033[2J");
	        System.out.flush();
		}
    }
}
