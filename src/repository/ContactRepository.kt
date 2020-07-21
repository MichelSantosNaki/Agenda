package repository

import entity.ContactEntity

class ContactRepository {
    // OBS: ContactyEntity foi criado uma pacote com uma classe para ter um contato completo ao invés de ficar criando nome e telefone cada vez que for usar
    companion object{

        private val  contactList = mutableListOf<ContactEntity>() // cria umas lista mutavél do tipo Contact Entity
        fun  save(contact : ContactEntity){ // cria a função para salvar do tipo ContactEnttyty
            contactList.add(contact) //usa a lista mutavel e adiciona contact


        }

        fun delete(contact : ContactEntity) {
        }
    }




}