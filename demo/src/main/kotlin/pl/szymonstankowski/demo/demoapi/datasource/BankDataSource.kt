package pl.szymonstankowski.demo.demoapi.datasource

import pl.szymonstankowski.demo.demoapi.model.Bank

interface BankDataSource {

    fun createNewBank(bank: Bank): Bank

    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber: String): Bank


}