package com.testando_criar_bd;

/*import com.testando_criar_bd.model.*;
import com.testando_criar_bd.uso_bd.insert.cadastrarUsuario;*/
import com.testando_criar_bd.uso_bd.consultas.consultas;

public class Main {
    public static void main(String[] args) {
        consultas consulta = new consultas();
        /*cadastrarUsuario cadastrarUsuario = new cadastrarUsuario();
        Usuario user = new Usuario();*/

        consulta.consultaGenerica("usuarios", "nome", null);;

        /*user.setNome("exemplo1");
        user.setEmail("exemplo@exemplo.com");

        cadastrarUsuario.cadastrarUsuario(user.getNome(), user.getEmail());*/
    }

}