package Exercicios;
public class Exercicio01no10 {

    public static void main(String[] args) {
    
        double salario = 3589.15;

    if(salario<=1903.98){
        System.out.println("Isento");
    }else if(salario>=1908.99 && salario<=2826.65){
        System.out.println("7,5%");
    }else if(salario>=2826.66 && salario<=3751.05){
        System.out.println("15%");
    }else if(salario>=3751.06 && salario<=4664.68){
        System.out.println("22,5%");
    }else{
        System.out.println("27,5%");
    }
    }
}