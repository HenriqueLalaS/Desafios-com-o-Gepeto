package com.testando_criar_bd;

import com.testando_criar_bd.model.*;
import com.testando_criar_bd.uso_bd.insert.cadastrarUsuario;

public class Main {
    public static void main(String[] args) {
        cadastrarUsuario cadastrarUsuario = new com.testando_criar_bd.uso_bd.insert.cadastrarUsuario();
        Usuario user = new Usuario();
        user.setNome("exemplo1");
        user.setEmail("exemplo@exemplo.com");

        cadastrarUsuario.cadastrarUsuario(user.getNome(), user.getEmail());


        
    }

}