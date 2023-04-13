import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicios {

    public void media (){
        // calcular nota semestral de um aluno
        //a nota sera obtida pela media bimestral
        // cada bimestre é composto pela nota de 2 provas
        // média mior que 7 exibe aprovado se não informa a media e reprovado

        Scanner sc = new Scanner(System.in);
        // entrada de dados
        System.out.println("Notas 1° Bimestre:\n");
        System.out.println("1° Prova:\n");
        double primeiroA = sc.nextDouble();
        System.out.println("2° Prova:\n");
        double primeiroB = sc.nextDouble();

        System.out.println("Notas 2° Bimestre:\n");
        System.out.println("1° Prova:\n");
        double segundoA = sc.nextDouble();
        System.out.println("2° Prova:\n");
        double segundoB = sc.nextDouble();

        System.out.println("Notas 3° Bimestre:\n");
        System.out.println("1° Prova:\n");
        double terceiroA = sc.nextDouble();
        System.out.println("2° Prova:\n");
        double terceiroB = sc.nextDouble();

        // calculo da média
        double primeiroBimestre = primeiroA+primeiroB;
        double segundoBimestre =  segundoA+segundoB;
        double terceiroBimestre = terceiroA+terceiroB;
        double media = (primeiroBimestre+segundoBimestre+terceiroBimestre)/3;

        // exibe se foi aprovado ou reprovado
        if(media >= 7){
            System.out.println("Sua Média Semestral é: "+media);
            System.out.println("Você Foi Aprovado");
               }else{
            System.out.println("Sua Média Semestral é: "+media);
            System.out.println("Você Foi Reprovado");

        }

    }
    public void conversaoVelocidade (){

        //recebe velocidade em m/s e converta para km/h
        Scanner sc  = new Scanner(System.in);
        // entrada de dados
        System.out.println("Informe a velocidade em m/s:\n");
        int velocidadeMs =  sc.nextInt();
        //  conversão de m/s pra km/h
        double km = velocidadeMs * 3.6;
        // mostra o resultado
        System.out.println("A Velocidade é de: "+km+"Km/h");

    }

}

