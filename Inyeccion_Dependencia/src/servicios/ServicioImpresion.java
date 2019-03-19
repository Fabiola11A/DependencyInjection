package servicios;

public class ServicioImpresion {

    private ServicioEnvio servicioEnvio;
    private ServicioPdf servicioPdf;
    
    public ServicioImpresion() {};
	
    //inyeccion por constructor. Se esta inyectando instancias por constructor.
    public ServicioImpresion(ServicioEnvio servicioEnvio, ServicioPdf servicioPdf) {
      this.servicioEnvio = servicioEnvio;
      this.servicioPdf = servicioPdf;
	}

	public void imprimir() {
		//System.out.println("enviar el documento a imprimir");
		//System.out.println("imprimiendo el documento en pdf");
		servicioEnvio.enviar();
		servicioPdf.imprimirPdf();
	}
}
