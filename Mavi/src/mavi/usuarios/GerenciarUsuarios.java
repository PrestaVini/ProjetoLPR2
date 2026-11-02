/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavi.usuarios;

public class GerenciarUsuarios {
    
    Usuarios[] bancoUsuarios = new Usuarios[100];
    
    public void IniciarBancoUsuarios() {
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
