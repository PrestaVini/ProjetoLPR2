/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
