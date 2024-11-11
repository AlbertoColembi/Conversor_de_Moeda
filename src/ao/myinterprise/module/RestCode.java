package ao.myinterprise.module;

import java.io.IOException;
import java.util.Scanner;

public class RestCode {
    public void execut() throws IOException, InterruptedException {
        Conversor convert = new Conversor();
        Scanner scanner = new Scanner(System.in);
        int valor = 0;
        System.out.println("========================================================================");
        System.out.println("  Bem-vindo ao App que te ajuda saber como está o cámbio do dia :) ");
        System.out.println("                                Menu                                     ");
        System.out.println("  ");
        System.out.println("[1] Converter de Dollar para Kwanza");
        System.out.println("[2] Converter de Kwanza para Dollar ");
        System.out.println("[3] Converter de Euro para Won");
        System.out.println("[4] Converter de Won para Euro");
        System.out.println("[5] Converter de Real para Peso");
        System.out.println("[6] Converter de Peso para Real");
        System.out.println("[7] Sair");
        System.out.println("=========================================================================");
        while ( valor !=7){
            System.out.println("Escolha uma opção!!");
            valor = scanner.nextInt();
            int quant;
            if ( (valor >= 1) & ( valor <= 6)){
                System.out.println("Escolha a quantidade à converter ");
                quant = scanner.nextInt();
                convert.setValor(quant);
                if (valor == 1){
                    convert.ConvertDollarToKwz();
                } else if (valor == 2) {
                    convert.convertKwzToDollar();
                } else if ( valor == 3) {
                    convert.convertEuroToWon();
                } else if (valor == 4) {
                    convert.convertWonTOEuro();
                } else if (valor == 5){
                    convert.convertRealToPeso();
                } else if (valor == 6) {
                    convert.convertPesoToReal();
                } else {
                    break;
                }
            } else {
                break;
            }
            System.out.println("=========================================================================");
            System.out.println("                                Menu                                     ");
            System.out.println("  ");
            System.out.println("[1] Converter de Dollar para Kwanza");
            System.out.println("[2] Converter de Kwanza para Dollar ");
            System.out.println("[3] Converter de Euro para Won");
            System.out.println("[4] Converter de Won para Euro");
            System.out.println("[5] Converter de Real para Peso");
            System.out.println("[6] Converter de Peso para Real");
            System.out.println("[7] Sair");
            System.out.println("=========================================================================");
        }
    }
}
