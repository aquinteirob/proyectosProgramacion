package casosAvanazdos;

public class caso28 {

	public static void main(String[] args) {
		prestamo();
	}
	public static void prestamo() {
		double prestado;
		double plazoPago;
		double cuotas;
		String[] meses= {"Enero", "Febrero","Marzo","Abril", "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		prestado=basicos.numericos("Introduzca la cantidad de dinero prestado: ");
		plazoPago=basicos.numericos("Introduzca el plazo de pago ");
		cuotas=prestado/plazoPago;
		for(int i=0; i<=plazoPago ;i++) {
			System.out.println("cuota mes: "+ meses[i]+" "+cuotas);
		}
	}
}
