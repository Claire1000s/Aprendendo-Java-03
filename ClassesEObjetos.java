package classeseobjetos;
import java.util.Scanner;

public class ClassesEObjetos
{
    public static void main(String[] args)
    {
        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nome do aluno: ");
        aluno.nome = entrada.nextLine();
        
        System.out.print("Nota em matemática: ");
        aluno.notaMat = entrada.nextDouble();
        
        System.out.print("Nota em física: ");
        aluno.notaFis = entrada.nextDouble();
        
        System.out.printf("O aluno %s tem %2.2f em matemática e %2.2f em física!\n\n", aluno.nome, aluno.notaMat, aluno.notaFis);
    } 
}