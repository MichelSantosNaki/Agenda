package Business

import java.lang.Exception

class ContactBusiness {

    fun validade(name:String, phone : String){

        if (name==""){
            throw Exception("Nome é obrigatório")
        }

        if (phone == ""){
            throw Exception ("Telefone é obrigatório")
        }
    }

    fun valdiadeDelete(name: String, phone: String){

        if ( name == "" || phone == ""){
            throw Exception("É necessário adicionar um contato válido antes de remover")
        }
    }

    fun  save(name: String, phone: String){

        validade(name,phone)
    }

    fun delete(name: String, phone: String){
        valdiadeDelete(name,phone)
    }
}

