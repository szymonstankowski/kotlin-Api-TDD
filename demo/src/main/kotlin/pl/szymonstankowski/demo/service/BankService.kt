package pl.szymonstankowski.demo.service

import org.springframework.stereotype.Service
import pl.szymonstankowski.demo.demoapi.datasource.BankDataSource
import pl.szymonstankowski.demo.demoapi.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }
}