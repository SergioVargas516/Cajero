import java.util.Scanner;
public class Cliente extends Tarjeta
{
	private int idCliente, contraseña = 0516;
		
	public Cliente(String numeroTarjeta, String tipoTarjeta, int idCliente, int contraseña) 
	{
		super(numeroTarjeta, tipoTarjeta);
		this.idCliente = idCliente;
		this.contraseña = contraseña;
	}
	
	public void ingresarTarjeta()
    {
	
		System.out.println("Por favor ingrese su tarjeta");
		System.out.println(" 'Imaginemos que la ingresa' ");
		try 
		{
            Thread.sleep(10000); 
        } catch (InterruptedException e) {
        	
            e.printStackTrace();
        }
    }
	public void ingresarClave()
    {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la contraseña de la tarjeta");
		int clave= entrada.nextInt();
		
		while(clave != contraseña)
		{
			System.out.println("La contraseña ingresada es incorrecta");
			System.out.println("Espere 10 segundos para volver a intentar");
			try 
			{
	            Thread.sleep(10000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			System.out.println("Ingrese la contraseña de la tarjeta");
			clave= entrada.nextInt(); 
		}
		entrada.close();
    }
	public void seleccionarOperacion()
    {
		System.out.println(" ");
		System.out.print("Ingrese su eleccion: ");
    }
}
