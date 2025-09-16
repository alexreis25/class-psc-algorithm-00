import java.util.Scanner;
public class SeEncontre {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        String sala = "A219" , salaInformada ; 

        System.out.println("\nDigite o número da sala que deseja ir: ");
        salaInformada = scanner.next();

        if (sala.equals(salaInformada)){
            System.out.println("Você está no caminho certo. ");
        }else{
            System.out.println("Você está perdido(a), se encontre.");
        }
        scanner.close();
    }
}
