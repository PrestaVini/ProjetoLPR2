


package mavi.usuarios;

public class GerenciarUsuarios {

    Usuarios[] bancoUsuarios = new Usuarios[100];

    public void IniciarBancoUsuarios() {
        // Contas fictícias usadas exclusivamente para demonstração acadêmica.
        int i = 0;
        bancoUsuarios[i] = new Usuarios("vinicius", "heisenberg");
        i++;
        bancoUsuarios[i] = new Usuarios("julia", "gandalf");
        i++;
        bancoUsuarios[i] = new Usuarios("ledel", "artes");
        i++;
        bancoUsuarios[i] = new Usuarios("matheus", "fullbox");
        i++;
        bancoUsuarios[i] = new Usuarios("yasmin", "kpop");
    }

    public Usuarios[] getBancoUsuarios() {
        return bancoUsuarios;
    }

}
