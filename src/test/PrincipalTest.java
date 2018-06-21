package test;

import VIEW.TelaLogin;


public class PrincipalTest {
    public static void main(String[] args) {
        TelaLogin login = new TelaLogin();
        //centralizando a janela 
        login.setLocationRelativeTo(null);
        //tornando a janela visivel
        login.setVisible(true);
    }
}
