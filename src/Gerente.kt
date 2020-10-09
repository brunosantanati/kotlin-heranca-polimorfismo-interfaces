class Gerente : FuncionarioAdmin, Autenticavel {

    constructor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int
    ) : super(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
    )

    override val bonificacao: Double
        get() {
            return salario + salario
        }
}