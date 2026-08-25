package calculadorapartidasrankeadas;
import java.util.Scanner;

public class CalculadoraPartidasRankeadas {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Quantas vitorias voce tem?");
        int numberVictories = scanner.nextInt();
        System.out.println("Quantas derrotas?");
        int numberDefeats = scanner.nextInt();
        int calculoRankeada = soma(numberVictories, numberDefeats);
        
        
        
        
        if (calculoRankeada <= 10) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nível: Ferro \n", calculoRankeada);
        } else if (calculoRankeada >= 11 && calculoRankeada <= 20 ) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Bronze \n", calculoRankeada);
        } else if (calculoRankeada >= 21 && calculoRankeada <= 50 ) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Prata \n", calculoRankeada);
        } else if (calculoRankeada >= 51 && calculoRankeada <= 80 ) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Ouro \n", calculoRankeada);
        } else if (calculoRankeada >= 81 && calculoRankeada <= 90 ) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Diamante \n", calculoRankeada);
        } else if (calculoRankeada >= 91 && calculoRankeada <= 100 ) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Lendario \n", calculoRankeada);
        } else if (calculoRankeada >= 101) {
            System.out.printf("O Heroi tem o saldo de %d vitorias e esta no nivel: Imortal \n", calculoRankeada);
        }
    }
    
    public static int soma(int numberVictories, int numberDefeats){
        return numberVictories - numberDefeats;
    }
}