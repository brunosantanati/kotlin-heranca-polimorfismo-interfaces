fun main() {
    println("Bem vindo ao Bytebank")

    val bruno = Funcionario(
        nome = "Bruno",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${bruno.nome}")
    println("cpf ${bruno.cpf}")
    println("salario ${bruno.salario}")
    println("bonificação ${bruno.bonificacao()}")
}