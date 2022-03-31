package pl.szymonstankowski.demo.demoapi.datasource.mock


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceRepositoryTest{

    private val mockDataSource = MockBankDataSourceRepository()

    @Test
    fun shouldProvideACollectionOfBanks(){
        //given


        //when
        val banks = mockDataSource.retrieveBanks()

        //then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)

    }

  @Test
  fun `should provide some mock data`(){
      //given
      val banks = mockDataSource.retrieveBanks()

      //when


      //then
      assertThat(banks).allMatch { it.accountNumber.isNotEmpty() }
      assertThat(banks).anyMatch { it.trust != 0.0 }
      assertThat(banks).anyMatch { it.transactionFee != 0 }
  }
}