import java.util.Scanner;

public class questões{
    void resolution() {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int contador = 0;

        System.out.println("Digite o valor de N: ");
        n = sc.nextInt();
        System.out.println("Digite o valor de M: ");
        m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            contador++;
        }

        System.out.println(String.format("\nExistem %d números entre N e M", contador - 1));
    }

  void resolutionTwo(){
    Scanner sc = new Scanner(System.in);
    int ano = 0;
    int mes = 0;
    int dia = 0;

    System.out.println("\n DIGITE A IDADE EM ANOS: ");
    int anos = sc.nextInt();
    System.out.println("\n DIGITE A IDADE EM MESES: ");
    int meses = sc.nextInt();
    System.out.println("\n DIGITE A IDADE EM DIAS: ");
    int dias = sc.nextInt();

    int idade = (anos * 365) + (meses * 30) + dias;

    System.out.println(String.format("\n A idade em dias é %d", idade));


  }

  void resolutionThree(){
     Scanner scanf = new Scanner(System.in);
    int[] a = new int[3];
    int[] b = new int[3];
       int media1 = 0;
       int media2 = 0;
       int medias = 0;

    for(int i = 0; i < 3; i++){
      System.out.printf(" \n VETOR 'A' -> DIGITE O VALOR DO SEU NUMERO %d....>", i + 1);
       a[i] = scanf.nextInt();
    }
    for(int i = 0; i < 3; i++){
      System.out.printf("\n VETOR 'B' ->DIGITE O VALOR DO SEU NUMERO %d....>", i + 1);
       b[i] = scanf.nextInt();
    }
    media1 = (a[0] + a[1] + a[2]) / 3;
    media2 = (b[0] + b[1] + b[2]) / 3;
    medias = (media1 + media2)/ 2;

    System.out.printf("\n SUA MEDIA DO VETOR 'A' É %d", media1);

    System.out.printf("\n SUA MEDIA DO VETOR 'B' É %d", media2);

    System.out.printf("\n SUA MEDIA DO VETOR 'A + B' É %d", medias);


    }

  void resolutionFour(){
    Scanner sc = new Scanner(System.in);
    int n;
    
    System.out.println("\n DIGITE A ORDEM DA MATRIZ...: ");
    n = sc.nextInt();
    int[][] matriz = new int[n][n];

    for(int i = 0; i < n; i++){
       for(int j = 0; j < n; i++){
          System.out.printf("\n PREENCHA A MATRIZ 'N'...:");
          matriz[i][j] = sc.nextInt();
          
       }
    }

    for(int i = 0; i < n; i++){
       for(int j = 0; j < n; i++){
           System.out.printf("\n impressao da matriz %d ", matriz[i][i]);
  }
}
}
}


/* 


#include <stdio.h>

int main(){
    int n,m = 0;
    int matriz[n][m];
     printf("\n QUAL SERA A ORDEM DA MATRIZ QUADRADA?....>");
     scanf("%d", &n);
     m = n ;
     for(int i = 0; i < n; i++){
         for(int j = 0; j < m; i++){
             printf("\n PREENCHA A MATRIZ 'N'...:");
             scanf("%d", &matriz[i][j]);
         }
     }

     for(int i = 0; i < n; i++){
         for(int j = 0; j < m; i++){
             printf("\n impressao da matriz %d ", matriz[i][j]);


    return 0;
}
}
}

*/
