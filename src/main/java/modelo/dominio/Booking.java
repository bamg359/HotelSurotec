package modelo.dominio;

public class Booking {

    private int idBooking;
    private String fechaEntrada;
    private String fechaSalida;
    private Huesped huesped;
    private Habitacion habitacion;
    private double total;
    private String formaPago;
    private String estado;


    public Booking() {
    }


    public Booking(int idBooking, String fechaEntrada, String fechaSalida, Huesped huesped, Habitacion habitacion, double total, String formaPago, String estado) {
        this.idBooking = idBooking;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.total = total;
        this.formaPago = formaPago;
        this.estado = estado;

    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", huesped=" + huesped +
                ", habitacion=" + habitacion +
                ", total=" + total +
                ", formaPago='" + formaPago + '\'' +
                '}';
    }
}
