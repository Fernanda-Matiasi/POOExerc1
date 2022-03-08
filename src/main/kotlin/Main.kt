fun main() {
    val pessoa = Cliente()

    pessoa.nome = "Chiquinha"
    pessoa.cpf = 123.45678910
    pessoa.nasc = "12/10/1998"
    pessoa.email = "chiquinha@gmail.com"
    pessoa.endereco = "Rua Terra, 185 - Galaxia/RJ"
    pessoa.tel = 888987854

    println("Nome do(a) cliente - ${pessoa.nome}")
    println("CPF - ${pessoa.cpf}")
    println("Data de Nacimento - ${pessoa.nasc}")
    println("Email - ${pessoa.email}")
    println("Endereço - ${pessoa.endereco}")
    println("Celular - ${pessoa.tel}")

    println("Digite a peça de roupa que você quer comprar: ")
    val peca = readLine()!!

    pessoa.precoProd(peca)
    pessoa.pagaCompra
    pessoa.recebeLoja()
    pessoa.confirmacao()

}