import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Iniciando o desafio");

        var saldo = Math.random() * 2000;

        saldo = Math.round(saldo * 100.0)/100.0;

        System.out.println("O seu saldo atual e de R$ " + saldo + " reais");

        System.out.println("Qual o valor para saque?");
        var leitor = new Scanner(System.in);

        var saque = leitor.nextDouble();

        var motivo = " saldo insuficiente";

        if (saque <= saldo && saque <= 1000.00 && saque >= 10.00 && (saque%10) == 0) {
            System.out.println("Trasacao aprovada, voce pode sacar");
        } else
            {if (saque >= 1000.00 || saque <= 10.00) {
                motivo = "Esta fora do limite maximo de R$ 1000,00 e minimo de R$ 10,00 reais";
            } else if ((saque%10) != 0) {
                motivo = "Temos apenas cedulas de R$ 10, R$ 20, R$ 50 e R$ 100 reais";
            }
            System.out.println("Saque nao autorizado." + motivo);
        }
    }
}
