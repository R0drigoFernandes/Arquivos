public class Main {
    

public void main(String[] args) {
    Save save = new Save(args);
    String arq[][] = new String[5][5];
    String inf = "";
    int x = 0 , y = 0;
    System.out.println("O que deseja fazer?");
    System.out.println("1 - Criar um arquivo");
    System.out.println("2 - Ler um arquivo");
    System.out.println("3 - Sair");
    int op = Integer.parseInt(System.console().readLine());
    if (op == 1) {
        System.out.println("Qual o nome do arquivo?");
        for(int i = 0; i < 5; i++) {
            arq[i][0] = System.console().readLine();
        }
        
    }
   save.criar(x, y, arq, inf); 


}
}