package modelo;




public class Encomiendas {
    private int id;
    private String destinatario;
    private String direccion;
    private String tipoEncomienda;
    private boolean entrega;
    private String tamano;
    private String remitente;

    public Encomiendas() {
    }

    public Encomiendas(int id, String destinatario, String direccion, String tipoEncomienda, boolean entrega, String tamano, String remitente) {
        this.id = id;
        this.destinatario = destinatario;
        this.direccion = direccion;
        this.tipoEncomienda = tipoEncomienda;
        this.entrega = entrega;
        this.tamano = tamano;
        this.remitente = remitente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoEncomienda() {
        return tipoEncomienda;
    }

    public void setTipoEncomienda(String tipoEncomienda) {
        this.tipoEncomienda = tipoEncomienda;
    }

    public boolean getEntrega() {
        return entrega;
    }

    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    @Override
    public String toString() {
        return "Encomiendas{" + "id=" + id + ", destinatario=" + destinatario + ", direccion=" + direccion + ", tipoEncomienda=" + tipoEncomienda + ", entrega=" + entrega + ", tamano=" + tamano + ", remitente=" + remitente + '}';
    }
   
    
}
