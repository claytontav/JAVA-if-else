import java.util.Scanner;

class ControleDeDecisao{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();

        if(idade < 17){
            
            System.out.println("Você ainda não tem idade para se alista. ");

        }else if(idade == 17){

            System.out.println("Falta um ano para você se alista. ");

        }else if(idade == 18){

            System.out.println("Você já pode se alistar. ");

        }else if(idade > 18){

            System.out.println("Você já passou da idade de se alistar. ");
        }
    }
}