import java.util.Scanner;


class Main {
  public static void main(String[] args) {
Scanner entrada =new Scanner (System.in);
int contador =0;
String texto ="";
    System.out.print("Digite uma mensagem ");
    texto = entrada.nextLine();
    for(int n=0;n<texto.length();n++){
      if(texto.toUpperCase().charAt(n) == 'A' ||
        texto.toUpperCase().charAt(n)=='E'||
        texto.toUpperCase().charAt(n)=='O'||
        texto.toUpperCase().charAt(n)=='I'||
      texto.toUpperCase().charAt(n)=='U'){
        contador ++;
      }   
    }
    System.out.print("A mensagem tem "+ contador + " Vogais");
  }
}
    
    
    
