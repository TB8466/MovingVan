package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class MyFirstController {

    @GetMapping("/")
    @ResponseBody
    public String setDate(){
        LocalDate today = LocalDate.now(); // I DAG
        LocalDate yesterday = LocalDate.of(2021,2,10); // CUSTOM DATO
        int diff = yesterday.compareTo(today); //COMPARE I DAG TIL CUSTOM DATO
        return ""+diff;
    }

    @GetMapping("/Date")
    @ResponseBody
    public String CustomDate(@RequestParam int year, int month, int date){
        LocalDate today = LocalDate.now(); // I DAG
        LocalDate yesterday = LocalDate.of(year,month,date); // CUSTOM DATO
        int diff = yesterday.compareTo(today); //COMPARE I DAG TIL CUSTOM DATO
        return ""+diff;
    }
}
