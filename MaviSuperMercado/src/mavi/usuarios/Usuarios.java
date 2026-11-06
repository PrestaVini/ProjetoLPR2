


package mavi.usuarios;

public class Usuarios {

    private String nomeUsuario;
    private String senhaUsuario;

    Usuarios(String nomeUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }
}
