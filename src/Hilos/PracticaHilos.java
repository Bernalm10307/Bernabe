package Hilos;

public class PracticaHilos implements Runnable
{
	private String _strNombreHilo;
	
	public PracticaHilos(String NombreHilo)
	{
		this._strNombreHilo = NombreHilo;
	}

	
	public void run()
	{
		
		for(int i=1;i<=18;i++)
		{
			if(_strNombreHilo.equalsIgnoreCase("Hilo 1"))
			{
				System.out.println(i+"  "+ _strNombreHilo +" SE EJECUTA HILOS 1." );
			}
			else if(_strNombreHilo.equalsIgnoreCase("Hilo 2"))
			{
				System.out.println(i+"  "+ _strNombreHilo +" SE EJECUTA EL HILO 2." );
			}
			
			else
			{
				System.out.println(i+"  "+ _strNombreHilo +" SE EJECUTA EL HILO 3." );
			}
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		
		}
		
	}
}
