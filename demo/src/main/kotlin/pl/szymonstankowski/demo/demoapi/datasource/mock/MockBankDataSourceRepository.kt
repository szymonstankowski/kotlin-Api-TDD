package pl.szymonstankowski.demo.demoapi.datasource.mock

import org.springframework.stereotype.Repository
import pl.szymonstankowski.demo.demoapi.datasource.BankDataSource
import pl.szymonstankowski.demo.demoapi.model.Bank

@Repository
class MockBankDataSourceRepository : BankDataSource {

    val banks = listOf(
        Bank("1234567", 1.12, 15),
        Bank("12345", 5.12, 19),
        Bank("123450987", 4.12, 18),
        Bank("12345670987654", 3.12, 16),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}