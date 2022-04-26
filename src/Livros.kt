//a. A classe possui os atributos titulo, qtdPaginas e paginasLidas
//
//b. Crie ainda o método verificarProgresso que deverá calcular a
//porcentagem de leitura do livro até o momento. Para isso,
//deverá usar os valores dos atributos qtdPaginas e
//paginasLidas, através da formula: porcentagem = paginasLidas
//* 100 / qtdPaginas. O valor da porcentagem deverá ser
//mostrado na tela conforme a mensagem “Você já leu X por
//cento do livro”, onde o valor de X é o valor calculado pela
//fórmula apresentada anteriormente


class Livros(titulo: String, qtdPaginas: Int, PaginasLidas: Int) {
    var tituloLivro = titulo
    var paginas = qtdPaginas
    var lidas = PaginasLidas
    var lista: ArrayList<Livros> = ArrayList()

    fun verificarProgresso(){
        var porcentagem = (paginas * 100) / lidas
        println("Você já leu $porcentagem% do livro")
    }

    fun inserirLivroLista(livro: Livros) {
        lista.add(livro)
    }


    fun mostrarTituloePagina() {
        println("O livro $tituloLivro possui $paginas páginas")
    }

    fun exibirLivroLista() {
        println("------- LISTA DE LIVROS ------")
        lista.forEach {
            it.tituloLivro
        }
    }

    fun solicitarQuantidadeLivros(): Int {
        println("------- QUANTIDADE DE LIVROS ------")
        println("Quantos livros serão cadastrados? ")

        return readln().toInt()
    }

    fun criarLivro(): Livros {
        println("------- CADASTRO DE LIVROS ------")
        println("Digite o título do livro: ")
        var tituloLivro = readln()

        println("Digite o numero de paginas: ")
        val paginas = readln().toInt()

        println("Digite quantas paginas você já leu: ")
        val lidas = readln().toInt()

        return Livros(titulo = tituloLivro, PaginasLidas = paginas, qtdPaginas = lidas)
    }
}
