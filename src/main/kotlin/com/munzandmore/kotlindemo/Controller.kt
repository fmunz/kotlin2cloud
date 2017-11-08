/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.munzandmore.kotlindemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/hello/{name}")
    fun hello(@PathVariable name: String) = "Hello, $name"
    
    @GetMapping("/time")
    fun time() = java.util.Date().toString()  
    
    @GetMapping("/info")
    fun info() : String {
      var cont : String? = System.getenv("APAAS_CONTAINER_NAME") 
      return "ACCS Container is: $cont "
    } 

}