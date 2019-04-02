package servicios;

public class ServicioPdfAuxiliar extends ServicioPdf  {

   public void imprimir(int i) {
	   System.out.println("Soy el primer hijo de Servicio Pdf");
   }
	
	public void imprimir(int i, int i2) {
		System.out.println("YO SOY IMPRIMIR SERVICIO PDF AUXILIAR");
	}
	
	public void imprimir( ) {
		System.out.println("estoy sobreescribiendo a mi tata");
	}
	
}

