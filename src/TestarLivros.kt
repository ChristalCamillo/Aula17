//- Crie um objeto livrofavorito do tipo Livro.
//- Altere o atributo titulo para “O Pequeno Príncipe”
//- Altere o atributo qtdPaginas para 98
//- Escreva na tela a mensagem: “O livro X possui Y páginas”, onde no
//lugar de X deverá aparecer o valor do atributo titulo e, no lugar de Y
//deverá aparecer o valor do atributo qtdPaginas.
//- Altere a quantidade de paginasLidas para 20
//- Chame o método verificarProgresso
//- Altere a quantidade de paginasLidas para 50;
//- Chame o método verificarProgresso
//- Instancie outros 10 livros no método main e chame os métodos
//desenvolvidos, conforme o exemplo anterior.

fun main() {
    val livroFavorito = Livros("O Pequeno Principe", 98, 20)


    val quantidade = livroFavorito.solicitarQuantidadeLivros()

    for (i in 1..quantidade) {
        val LivroCadastrado = livroFavorito.criarLivro()
        LivroCadastrado.mostrarTituloePagina()
        LivroCadastrado.verificarProgresso()
        LivroCadastrado.paginas = 50
        LivroCadastrado.verificarProgresso()
        livroFavorito.inserirLivroLista(LivroCadastrado)

    }

    livroFavorito.exibirLivroLista()
}