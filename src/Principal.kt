//Crie o método main e instancie a classe Funcionário criada, criando um objeto novoFuncionario do tipo Funcionario:
//
//
//   * Atribua o valor “Luis” ao atributo nome.
//   * Atribua o valor “Silva” ao atributo sobrenome.
//   *  Atribua o valor 10 ao atributo horasTrabalhadas
//   *  Atribua o valor 25.50 ao atributo valorPorHora.
//   * Chame o método nomeCompleto.
//   * Chame o método calcularSalario.
//   * Adicione 8 ao atributo horasTrabalhadas utilizando o método incrementarHoras.
//   * Chame novamente o método calcularSalario.
//   * Crie um ArrayList e instancie outros 9 funcionários com diferentes atributos a esse ArrayList
//   * Exiba os valores do ArrayList criado

fun main() {
    var novoFuncionario: Funcionario = Funcionario("Luis", "Silva", 10.00, 25.5)

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8.00)
    novoFuncionario.calcularSalario()



}