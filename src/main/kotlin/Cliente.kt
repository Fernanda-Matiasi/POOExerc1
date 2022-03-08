 class Cliente{

    var nome = ""
    var nasc = ""
    var cpf = 0.0
    var endereco = ""
    var tel = 0
    var email = ""

    var pagaCompra = 10
    var peca = ""

    fun precoProd(peca: String) {
        println("$peca custa R$10,00")
    }

    fun recebeLoja(){
        println("Você pagou $pagaCompra reais")
    }

    fun confirmacao(){
        println("Compra finalizada com sucesso, nota enviada para $email")
    }

}