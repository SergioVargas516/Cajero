import java.util.Scanner;
public class CuentaBancaria 
{
	private String numeroCuenta;
	private double saldo;
	
	
	public void consultarSaldo()
    {
		System.out.println("Su saldo disponible es de: "+ saldo +"$");
    }
	
	public void retirar()
    {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la cantidad que desea retirar");
		double retiro= entrada.nextDouble();
		System.out.println("Transaccion Exitosa");
		System.out.println("Desea ver un resumen de la transferencia");
		System.out.println("    1. Si //  2. No");
		int llave=entrada.nextInt();
		
		if (llave == 1) 
		{
			System.out.println("Saldo anterior: "+saldo+"$");
			System.out.println("Monto a retirar: " +retiro+ "$");
			System.out.println("Saldo actual: "+(saldo-retiro)+"$");
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
		else
		{
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
		entrada.close();
    }
	
	public void depositar()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la cantidad que desea depositar");
		double deposito= entrada.nextDouble();
		System.out.println("Transaccion Exitosa");
		System.out.println("Desea ver un resumen de la transferencia");
		System.out.println("    1. Si //  2. No");
		int llave=entrada.nextInt();
		
		if (llave == 1) 
		{
			System.out.println("Saldo anterior: "+saldo+"$");
			System.out.println("Monto a depositar: " +deposito+ "$");
			System.out.println("Saldo actual: "+(saldo+deposito)+"$");
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
		else
		{
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
		entrada.close();
    }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
		
	
}
