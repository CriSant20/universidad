
package categoria;

public class Premium {
    String nombreActriz;
    String apellidoActriz;

    public Premium(String nombreActriz, String apellidoActriz) {
        this.nombreActriz = nombreActriz;
        this.apellidoActriz = apellidoActriz;
    }

    public String getNombreActriz() {
        return nombreActriz;
    }

    public void setNombreActriz(String nombreActriz) {
        this.nombreActriz = nombreActriz;
    }

    public String getApellidoActriz() {
        return apellidoActriz;
    }

    public void setApellidoActriz(String apellidoActriz) {
        this.apellidoActriz = apellidoActriz;
    }
    
    
}
