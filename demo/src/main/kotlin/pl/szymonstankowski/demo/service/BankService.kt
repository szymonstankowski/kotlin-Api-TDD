package pl.szymonstankowski.demo.service

import org.springframework.stereotype.Service
import pl.szymonstankowski.demo.demoapi.datasource.BankDataSource
import pl.szymonstankowski.demo.demoapi.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank {
        return dataSource.createNewBank(bank)
    }


}