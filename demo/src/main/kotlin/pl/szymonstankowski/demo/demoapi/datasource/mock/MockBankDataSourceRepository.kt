package pl.szymonstankowski.demo.demoapi.datasource.mock

import org.springframework.stereotype.Repository
import pl.szymonstankowski.demo.demoapi.datasource.BankDataSource
import pl.szymonstankowski.demo.demoapi.model.Bank

@Repository
class MockBankDataSourceRepository : BankDataSource {

    val banks = mutableListOf(
        Bank("1234567", 1.12, 15),
        Bank("12345", 5.12, 19),
        Bank("123450987", 4.12, 18),
        Bank("12345670987654", 3.12, 16),
    )

    override fun createNewBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }){
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exists")
        }
        banks.add(bank)
        return bank
    }

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank = banks.firstOrNull()
    { it.accountNumber == accountNumber } ?: throw NoSuchElementException(
        "Could not find bank with account number" +
                " $accountNumber"
    )


}