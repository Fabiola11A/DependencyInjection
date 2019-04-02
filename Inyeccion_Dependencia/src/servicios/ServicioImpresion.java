package servicios;

public class ServicioImpresion {

    private ServicioEnvio servicioEnvio;
    private ServicioPdf servicioPdf;
    
   
    //inyeccion por constructor. Se esta inyectando instancias por constructor.
    public ServicioImpresion(ServicioEnvio servicioEnvio, ServicioPdf servicioPdf) {
      
     //composicion	
     this.servicioEnvio = servicioEnvio;
     this.servicioPdf = servicioPdf;
      //this.servicioPdf = new ServicioPdf();
    }

	public void imprimir() {
		servicioEnvio.enviar();
		servicioPdf.imprimir(1);
	}
}
