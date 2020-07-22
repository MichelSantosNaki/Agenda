package repository

import entity.ContactEntity

class ContactRepository {
    // OBS: ContactyEntity foi criado uma pacote com uma classe para ter um contato completo ao invés de ficar criando nome e telefone cada vez que for usar
    companion object{ // utilizado para continuar implementando sempre as mesmas coisas, pois se nao utilizar ele sempre iria inicializar do zero

        private val  contactList = mutableListOf<ContactEntity>() // cria umas lista mutavél do tipo Contact Entity
        fun  save(contact : ContactEntity){ // cria a função para salvar do tipo ContactEnttyty
            contactList.add(contact) //usa a lista mutavel e adiciona contact


        }

        fun delete(contact : ContactEntity) {

            var index = 0

            for(item in contactList.withIndex()){
                if(item.value.name == contact.name && item.value.phone== contact.phone){
                    index = item.index
                    break
                }
            }
            contactList.removeAt(index)
        }

        fun getList():List<ContactEntity>{ // receve umas lista com várias coisas dentro dela
            return contactList
        }
    }




}