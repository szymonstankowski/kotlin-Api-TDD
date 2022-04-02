package pl.szymonstankowski.demo.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import pl.szymonstankowski.demo.demoapi.model.Bank
import pl.szymonstankowski.demo.service.BankService

@RestController
class BankController(private val bankService: BankService) {

    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(e: NoSuchElementException): ResponseEntity<String> =
        ResponseEntity(e.message, HttpStatus.NOT_FOUND)

    @ExceptionHandler(IllegalArgumentException::class)
    fun handleBadRequest(e: IllegalArgumentException): ResponseEntity<String> =
        ResponseEntity(e.message, HttpStatus.BAD_REQUEST)


    @GetMapping("/api/banks")
    fun getBanks():Collection<Bank>{
        return bankService.getBanks()
    }
    @GetMapping("/api/banks/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String)= bankService.getBank(accountNumber)

    @PostMapping("/api/banks")
    @ResponseStatus(HttpStatus.CREATED)
    fun addBank(@RequestBody bank: Bank): Bank = bankService.addBank(bank)

}