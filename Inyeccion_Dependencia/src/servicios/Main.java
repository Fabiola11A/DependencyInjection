package servicios;

public class Main {

	public static void main(String[] args) {
		// ServicioImpresion servicioImpresion = new ServicioImpresion();

		// estamos inyectando instancias por constructor.
		ServicioImpresion servicioImpresion = new ServicioImpresion(new ServicioEnvio(), new ServicioPdf());
		servicioImpresion.imprimir();
	}

}
