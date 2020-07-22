package Business

import entity.ContactEntity
import repository.ContactRepository
import java.lang.Exception

class ContactBusiness {

    private fun validade(name: String, phone: String) {

        if (name == "") {
            throw Exception("Nome é obrigatório")
        }

        if (phone == "") {
            throw Exception("Telefone é obrigatório")
        }
    }

    private fun valdiadeDelete(name: String, phone: String) {

        if (name == "" || phone == "") {
            throw Exception("É necessário adicionar um contato válido antes de remover")
        }
    }

    // contator de contatos no Main Form
    fun getContactCountDescription(): String{
        val list = getList()

         return when {
            list.isEmpty() -> "0 Contatos"
             list.size == 1 -> "1 Contato"
             else -> "${list.size} Contatos"
        }
    }

    fun save(name: String, phone: String) {

        validade(name, phone)
        val contact = ContactEntity(name, phone)
        ContactRepository.save(contact)

    }

    fun delete(name: String, phone: String) {
        valdiadeDelete(name, phone)
        val contact = ContactEntity(name, phone)
        ContactRepository.delete(contact)
    }

    fun getList():List<ContactEntity>{ // recebe umas lista com várias coisas dentro dela
        return ContactRepository.getList()
    }
}

