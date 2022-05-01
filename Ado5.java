import java.util.Scanner;


class Main {
  public static void main(String[] args) {
int menu ;


    Scanner entrada=new Scanner (System.in);
do{
System.out.print("menu \n 1=Instruções \n 2=Jogar \n  3=credito \n 4=Sair ");
  menu = entrada.nextInt();



switch(menu){
  case 1 :
    System.out.println("So aperta ");
    break;
  case 2 :
    System.out.println("Voce ganhou parabens " );
    break;
  case 3:
    System.out.println("Feito por Thiago Pavezzi");
    break;
  case 4 :
    System.out.println(menu!=0);
    break;
  default:
    System.out.print("opção invalida ");
    break;



    
}




  
}while(menu!=4);



    
  }
}
