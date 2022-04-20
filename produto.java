import java.util.Scanner;
public class Atvidde2 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner (System.in);
        double preco = 0;
        double total = 0;
        int i = 0;
        int qtde = 0;
        
        System.out.println("digite a quantidade de produtos ; ");
               qtde =
        Integer.parseInt(Ler.nextLine());
                while (i < qtde){
                i = i + 1;
        System.out.println("informe o valor do "+i+" produto");
              preco =
        Double.parseDouble(Ler.nextLine());
              total = total + preco;
     } 
          System.out.println("tota " + total );
    }
}
