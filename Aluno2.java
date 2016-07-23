package construtores;

public class Aluno2
{
    String name;
    double math, phys, media;
    
    public Aluno2(String Nome, double NotaMat, double NotaFis)
    {
        name = Nome;
        math = NotaMat;
        phys = NotaFis;
        media = (math + phys) / 2;
    }
}
