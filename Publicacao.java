public abstract class Publicacao{
// atributos
    protected String titulo;
    protected String autor;
    protected int ano;
    protected String genero;
    protected String editora;
    protected int qntd;

// construtores
    public Publicacao(String titulo , String autor , int ano , String genero , String editora , int qntd){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.editora = editora;
        this.qntd = qntd;
        
// get dos atributos
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
   public int getAno(){
        return ano;
   }
   public String getGenero(){
        return genero;
   }
   public String getEditora(){
        return editora;
   }
   public int getQntd(){
        return qntd;
   }

   public abstract void imprimeDados();

}