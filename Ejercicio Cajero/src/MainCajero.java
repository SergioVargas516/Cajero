import java.util.Scanner;

public class MainCajero {
	
	private static int contraseña = 0516;
	
	public static void main(String[] args)
    {
		Cajero cajero1 = new Cajero(null, null, contraseña, contraseña, contraseña);
		Transaccion transaccion = new Transaccion(contraseña, contraseña);
		
		Scanner entrada = new Scanner(System.in);
		int llave=0;
		do{
			
			cajero1.ingresarTarjeta();
			cajero1.validarTarjeta();
			cajero1.ingresarClave();
			contraseña = entrada.nextInt();
			cajero1.operarCajero();				
			cajero1.seleccionarOperacion();	
			
			llave = entrada.nextInt(); 
			
			switch(llave)
			{
			case 1:	cajero1.consultarSaldo();
			case 2: cajero1.retirar();
			case 3: cajero1.depositar();
			case 4: transaccion.ejecutarTransaccion();
			case 5: break;
			default:
			}
			entrada.close();
		}while(llave != 1);
    }

}
