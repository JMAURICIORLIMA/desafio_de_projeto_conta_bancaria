package src.menu;

public class MenuDeEntrada {

    private String mensagemMenu = "";

    public void menu() {
        mensagemMenu = """
                
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                >""" ;
        System.out.print(mensagemMenu);
    }

}
