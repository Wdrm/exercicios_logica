import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // receba velocidade em m/s e converta para km/h
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercícios de Lógica de Programação:\n"+
                "0 Encerra\n"+
                "1 Média Semestral\n"+
                "2 Converão de Velocidade de m/s para Km/h\n");

                int opcao = sc.nextInt();
                switch (opcao) {
                    case 0:
                        break;
                    case 1: Exercicios exerA = new Exercicios(); exerA.media();
                    break;
                    case 2: Exercicios exerB = new Exercicios(); exerB.conversaoVelocidade();
                }
    }
}