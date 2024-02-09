import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        questões questao = new questões();  
        questões questao2 = new questões();
        questões questao3 = new questões();
        questões questao4 = new questões();
      
        Scanner scanf = new Scanner(System.in);
        int x = 0 ;
      
        do{
        System.out.println("\n ====== ESCOLHA SUA QUESTÃO ======= ");
        System.out.println("\n ====== 01. DIFERENÇA DE DOIS INTEIROS");
        System.out.println("\n ====== 02. IDADE EM DIAS");
        System.out.println("\n ====== 03. MÉDIA DE 3 NUMEROS DO VETOR 'A' E 3 NÚMEROS DO VETOR 'B'. DEPOIS FAZ A MÉDIA DAS MÉDIAS");
          System.out.println("\n ====== 04. PREENCHER MATRIZ QUADRADA COM ORDEM DE SUA ESCOLHAS");
        System.out.println("\n ====== 05. SAIR");
        System.out.println("\n DIGITE SUA ESCOLHA...>");
        x = scanf.nextInt();
        
        switch(x){
          case 1:
            questao.resolution();
            break;
          case 2:
            questao2.resolutionTwo();
            break;
          case 3:
            questao3.resolutionThree();
            break;
          case 4:
            questao4.resolutionFour();
            break;
          case 5:
            break;
          default:
            System.out.println("Opção inválida!");
            break;
        }
        }while( x != 4);
      
       System.out.println("Fim do programa");
    }
}
