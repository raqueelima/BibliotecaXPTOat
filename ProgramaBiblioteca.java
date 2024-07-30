import java.util.ArrayList;



public class ProgramaBiblioteca {
    
    public static void main(String[] args) {
        Livro objLivro = new Livro("Senhor dos A", "Tanan da Silva", 2024, "terror", "aaa", 2, 25637, 2);
        Filmes objFilmes = new Filmes("Harry Potter", "Fulano", 2014, "Aventura", "Globo", 5, "Ciclano", "Harry", 120, "Um jovem magico...");
        

        
        ArrayList<Publicacao> lista = new ArrayList<Publicacao>();

        

        lista.add(objLivro);
        lista.add(objFilmes);
        
        for (Publicacao publicacao : lista){
            publicacao.imprimeDados();
        }
   
   
   
   
    }

}
