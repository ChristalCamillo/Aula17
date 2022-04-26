//1. Crie uma classe Funcionario que obedeça à descrição abaixo:
//   1. A classe possui os atributos nome, sobrenome, horasTrabalhadas e valorPorHora
//
//   2. O método nomeCompleto deve escrever na tela o atributo nome concatenado ao atributo sobrenome.
//
//   3. O método calcularSalario faz o cálculo de quanto o funcionário irá receber no mês, multiplicando o atributo horasTrabalhadas pelo atributo valorPorHora. Em seguida, escreve o valor na tela.
//
//   4. O método incrementarHoras adiciona um valor passado por parâmetro ao valor já existente no atributo valorPorHora
//
class Funcionario(var nome: String,
                  var sobrenome: String,
                  var horasTrabalhadas: Double,
                  var valorPorHora: Double) {

    var lista: ArrayList<Funcionario> = ArrayList()

    fun nomeCompleto() {
        println("O nome é $nome e o sobrenome é $sobrenome")
    }

    fun calcularSalario() {
        var salarioMensal = horasTrabalhadas * valorPorHora
        println("O salário mensal é $salarioMensal")
    }

    fun incrementarHoras(incrementarHoras: Double) {
        valorPorHora += incrementarHoras
    }

    fun inserirFuncionario(funcionario: Funcionario) {      //crio variavel funcionario do tipo classe criada
        val listaFuncionario = ArrayList<Funcionario>()    //Crio lista do tipo classe criada
        listaFuncionario.add(funcionario)               //lista vai adicionar o funcionario que chegar como parâmetro
        lista = listaFuncionario
    }

    fun exibirFuncionariosLista() {
        lista.forEach {
            it.nomeCompleto()
        }
    }
}