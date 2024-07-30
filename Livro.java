
public class Livro extends Publicacao{
    private int isbn;
    private int edicao;
    

    public Livro(String titulo , String autor , int ano , String genero , String editora , int qntd, int isbn, int edicao){
        super(titulo, autor, ano, genero, editora, qntd);
        this.isbn = isbn;
        this.edicao = edicao;
    }

    public int getIsbn(){
        return isbn;
    }

    public int getEdicao(){
        return edicao;
    }

    public void imprimeDados(){
        System.out.println("Titulo: "+titulo+ "\nAutor: "+autor+ "\nAno de publicacao: "+ano+ "\nGenero do livro: "+genero+"\nEditora: "+editora+"\nQuantidade disponivel: "+qntd+ "ISBN:"+isbn+"Edicao:"+edicao);
       
      }

}
