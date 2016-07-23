package construtores;

public class Aluno 
{
    String name;
    double math, phys, media;
    
    public Aluno(String Nome, double NotaMat, double NotaFis)
    {
        name = Nome;
        math = NotaMat;
        phys = NotaFis;
        media = (math + phys) / 2;
    }
}
