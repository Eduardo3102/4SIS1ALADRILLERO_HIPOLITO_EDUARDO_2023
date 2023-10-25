public class Datos extends Principal{
    private String codigo;
	private String fecha;
	private String idPaciente;
	private String Receta;
	private String observaciones;
	
	public void HistorialClinico(String codigo, String fecha, String idPaciente, String Receta, String observaciones) {
		this.codigo = codigo;
		this.fecha = fecha;
		this.idPaciente = idPaciente;
		this.Receta = Receta;
		this.observaciones = observaciones;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getReceta() {
		return Receta;
	}

	public void setReceta(String Receta) {
		this.Receta = Receta;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	public void mostrar() {
		System.out.println("Codigo Historial: " + codigo);
		System.out.println("Fecha: " + fecha);
		System.out.println("ID Pacielnte: " + idPaciente);
		System.out.println("Receta: " + Receta);
		System.out.println("Observaciones:\n" + observaciones);
	}
}