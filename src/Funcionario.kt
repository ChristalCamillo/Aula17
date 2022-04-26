//1. Crie uma classe Funcionario que obedeça à descrição abaixo:
//   1. A classe possui os atributos nome, sobrenome, horasTrabalhadas e valorPorHora
//
//   2. O método nomeCompleto deve escrever na tela o atributo nome concatenado ao atributo sobrenome.
//
//   3. O método calcularSalario faz o cálculo de quanto o funcionário irá receber no mês, multiplicando o atributo horasTrabalhadas pelo atributo valorPorHora. Em seguida, escreve o valor na tela.
//
//   4. O método incrementarHoras adiciona um valor passado por parâmetro ao valor já existente no atributo valorPorHora
//
class Funcionario(
    nomeParametro: String,
    sobrenomeParametro: String,
    horasTrabalhadasParametro: Double,
    valorPorHoraParametro: Double
) {
    var nome: String = nomeParametro
    var sobrenome: String = sobrenomeParametro
    var horasTrabalhadas: Double = horasTrabalhadasParametro
    var valorPorHora: Double = valorPorHoraParametro
    var listaFuncionarioAtributo: ArrayList<Funcionario> = ArrayList()

    fun nomeCompleto() {
        println("Dados funcionário - Nome: $nome $sobrenome")
    }

    fun calcularSalario() {
        val salario = horasTrabalhadas * valorPorHora
        println("O salário é de: R$ $salario")
    }

    fun incrementarHoras(novaHora: Double) {
        horasTrabalhadas += novaHora
    }

    fun inserirFuncionarioLista(funcionario: Funcionario) {
        listaFuncionarioAtributo.add(funcionario)
    }

    fun exibirFuncionariosLista() {
        println("------- LISTA DE FUNCIONÁRIOS ------")
        listaFuncionarioAtributo.forEach {
            it.nomeCompleto()
        }
    }

    fun solicitarQuantidadeFuncionarios(): Int{
        println("------- QUANTIDADE DE FUNCIONÁRIOS ------")
        println("Quantos funcionários serão cadastrados? ")
        val quantidade = readln().toInt()

        return quantidade
    }

    fun criarFuncionario(): Funcionario {
        println("------- CADASTRO DE FUNCIONÁRIOS ------")
        println("Digite o nome: ")
        val nomeFuncionario = readln()

        println("Digite o sobrenome: ")
        val sobrenomeFuncionario = readln()

        println("Digite quantidade de horas trabalhadas: ")
        val horasTrabalhadasFuncionario = readln().toDouble()

        println("Digite quantidade do valor hora: ")
        val valorHoraFuncionario = readln().toDouble()

        return Funcionario(
            nomeParametro = nomeFuncionario,
            sobrenomeParametro = sobrenomeFuncionario,
            horasTrabalhadasParametro = horasTrabalhadasFuncionario,
            valorPorHoraParametro = valorHoraFuncionario
        )
    }
}