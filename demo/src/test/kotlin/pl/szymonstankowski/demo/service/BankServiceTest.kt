package pl.szymonstankowski.demo.service

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import pl.szymonstankowski.demo.demoapi.datasource.BankDataSource

internal class BankServiceTest{
    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`(){
        //given
         /*
         ponizsza linia kodu moze byc uzyta tak zeby zwracana byla pusta lista
         lub w linijce 11 moze byc ustawiony
         mockk(relaxed = true)
         */
        //every { dataSource.retrieveBanks() }returns emptyList()

        //when
        val banks = bankService.getBanks()

        //then
        verify(exactly = 1) { dataSource.retrieveBanks() }

    }
}