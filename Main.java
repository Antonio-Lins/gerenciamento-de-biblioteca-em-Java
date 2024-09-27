import java.util.ArrayList;
import java.util.List;

class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }
}

class Funcionario {
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + cargo;
    }
}

class Endereco {
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return rua + ", " + cidade;
    }
}

class Biblioteca {
    private String nome;
    private Endereco endereco;
    private List<Livro> livros;
    private List<Funcionario> funcionarios;

    public Biblioteca(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.livros = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirLivros() {
        System.out.println("Livros na biblioteca " + nome + ":");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void exibirFuncionarios() {
        System.out.println("Funcionários na biblioteca " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    @Override
    public String toString() {
        return "Biblioteca: " + nome + ", Endereço: " + endereco.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Endereco endereco = new Endereco("Rua Principal", "Cidade A");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", endereco);

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        Funcionario func1 = new Funcionario("Maria", "Bibliotecária");
        Funcionario func2 = new Funcionario("José", "Assistente");

        // Adicionando livros e funcionários
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.adicionarFuncionario(func1);
        biblioteca.adicionarFuncionario(func2);

        // Exibindo informações
        System.out.println(biblioteca);
        biblioteca.exibirLivros();
        biblioteca.exibirFuncionarios();
    }
}
