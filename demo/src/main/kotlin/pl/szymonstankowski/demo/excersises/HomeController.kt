package pl.szymonstankowski.demo.excersises

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {



//    @GetMapping("/")
//    fun home():String{
//        var xenomorph = Alien()
//        xenomorph.name="Szymon"
//
//        return "Welcome ${xenomorph.name}!"
//    }

    @GetMapping("/java")
    fun javaClass():String{
        val marco = Belters();
        marco.name="Marco Inaros"
        return ("Hello ${marco.name}")
    }
    @GetMapping("/convertjavatokotlin")
    fun convert():String{
        return "Code -> Convert Java file to Kotlin file"
    }

    @GetMapping("/calculate/{num1}/{num2}")
    fun calculator(@PathVariable num1: Int, @PathVariable num2: Int):String{
        var result = num1*num2
        return result.toString()

    }


}