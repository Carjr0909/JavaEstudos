package L4;
/*
Peça a idade do aluno e classifique-o:
Menor que 4: "Muito jovem para escola"
4 a 5 anos: "Educação Infantil"
6 a 10 anos: "Ensino Fundamental I"
11 a 14 anos: "Ensino Fundamental II"
15 a 17 anos: "Ensino Médio"
Acima de 17: "Ensino Superior ou outros"
Data: 12/04/25
Programador: Carlos
Professora: Luciana
*/
import java.util.Scanner;
public class L4ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double id;

        System.out.println("Informe sua nota ");
        id = ler.nextDouble();

        if(id < 4){
            System.out.println("Muito novo pra escola");
        }
        else if(id >= 4 && id < 6){
            System.out.println("Educação infantil");
        }
        else if(id >= 6 && id < 11 ){
            System.out.println("Ensino fundamental 1");
        }
        else if(id >= 11 && id < 14 ){
            System.out.println("Ensino fundamental 2");
        }
        else if(id >= 15 && id < 17 ){
            System.out.println("Ensino médio");
        }
        else{
            System.out.println("Ensino Superior ou outros");
        }
    }
}