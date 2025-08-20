import java.util.Scanner;

public class atvmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[5];
        int num = 0, cont = 0;
        Menu(sc,num, vet, cont);
        sc.close();
    }

    public static void Menu(Scanner sc,int num, int[] vet, int cont){
        System.out.println("preencha o vetor de 5 números: ");
        vet[num] = sc.nextInt();
        num++;
        if (num == 5){
            Mostrar(cont, vet);
            return;
        }
        Menu(sc, num, vet, cont);
    }

    public static void Mostrar(int cont, int[] vet){
        System.out.println(vet[cont]);
        cont++;
        if (cont == 5){
            return;
        }
        Mostrar(cont, vet);
    }
}