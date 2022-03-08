import org.intellij.lang.annotations.JdkConstants.InputEventMask

data class ClientDados (var nome: String, var cpf: Double){

    var nasc = ""
    var endereco = ""
    var tel = 0
    var email = ""

    constructor(
        nome: String, cpf: Double, nasc: String, endereco: String
    ) : this(nome, cpf){

        this.nasc = nasc
        this.endereco = endereco
    }

    constructor(
        nome: String,
        cpf: Double,
        nasc: String,
        endereco: String,
        tel: Int,
        email: String
    ) : this(nome, cpf, nasc, endereco){

        this.tel = tel
        this.email = email
    }
}