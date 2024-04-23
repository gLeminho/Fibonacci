import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        try {fibonacci();
    
        }catch(InputMismatchException e){
           System.err.println("Erro codigo 1: digite um numero inteiro");
        }

        }    
        private static void fibonacci(){
        ArrayList<Integer>numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        Scanner scn = new Scanner(System.in);
        int tamanho = -5;
        System.out.println("Digite o tamanho da sequencia de fibonacci");
        tamanho = scn.nextInt();

        if(tamanho < 2){System.err.println("Erro insira um numero inteiro maior do que 2"); 
    
        return;
    }

        for(int i = 2; i<tamanho; i++){
            numeros.add((numeros.get(numeros.size() - 1) ) + (numeros.get(numeros.size() - 2)));
        }

        System.out.println(numeros);
        scn.close();

    }
}
