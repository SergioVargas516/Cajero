public class Cajero extends Cliente
{
	private int idCajero;	
	
	public Cajero(String numeroTarjeta, String tipoTarjeta, int idCliente, int contraseña, int idCajero) {
		super(numeroTarjeta, tipoTarjeta, idCliente, contraseña);
		this.idCajero = idCajero;
	}

	public void operarCajero()
    {
		System.out.println("------------------------------");
		System.out.println("Bienvenido al cajero");
		System.out.println("------------------------------");
		System.out.println("Que desea hacer");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Retirar dinero");
		System.out.println("3. Depositar fondos");
		System.out.println("4. Transferir a otra cuenta");
		System.out.println("------------------------------");
    }
	
}