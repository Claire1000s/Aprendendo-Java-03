package construtores;

public class Construtores 
{
    public static void main(String[] args)
    {
        String nome = "Leticia";
        double notaMat = 8.0, notaFis = 7.0;
        
        Aluno aluno = new Aluno(nome,notaMat,notaFis);
        
        System.out.printf("Nome: %s\nNotaMat: %2.2f\nNotaFis: %2.2f\n\nMédia: %2.2f\n\n", aluno.name, aluno.math, aluno.phys, aluno.media);
    }
}