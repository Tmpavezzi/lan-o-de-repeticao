import java.util.Scanner;


class Main {
  public static void main(String[] args) {
int menu ;
Scanner entrada=new Scanner (System.in);
    
do{
  System.out.println("\n menu \n 0=sair \n 1=Soma \n 2=Subtração \n 3=Multiplicação \n 4=Divisão");
  menu = entrada.nextInt();
  System.out.println("Digite um numero \n");
    double n = entrada.nextDouble();
switch(menu){
  case 1 :
    for( int i=0;i<10;i++){
      System.out.println(n + "+" + i +" =" +(n+i)+ "\n");
    }
      break;
  case 2 :
    for(int r=0;r<10;r++){
      System.out.println(n + "- " + r + " = "+(n-r) +"\n");
    }
    break;
  case 3:
    for(int e=0;e<10;e++){
      System.out.println(n + " x " + e +" = " +(n*e)+"\n");
    }
    break;
  case 4 :
    for(int a=0;a<10;a++){
      System.out.println(n + "/" + a + " = " +(n/a)+"\n");
    }
    break;
  case 0:
    System.out.print(n!=0);
    break;
}
}while(menu!=0);
  }
}
  
