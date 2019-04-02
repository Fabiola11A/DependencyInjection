package servicios;

public class Main {

	public static void main(String[] args) {
		// ServicioImpresion servicioImpresion = new ServicioImpresion();

		// estamos inyectando instancias por constructor.
		//ServicioImpresion servicioImpresion = new ServicioImpresion(
		//		new ServicioEnvio(),  new ServicioPdf());
		
		ServicioImpresion servicioImpresion = new ServicioImpresion(
				new ServicioEnvio(), new ServicioPdfAuxiliar());
		servicioImpresion.imprimir();
		
		System.out.println("********************");
		
	  servicioImpresion = new ServicioImpresion(
				new ServicioEnvio(), new ServicioPdfUNA());
	  servicioImpresion.imprimir();
		
		
	}

}
