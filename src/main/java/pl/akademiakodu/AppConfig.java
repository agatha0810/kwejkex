// Projekt KWEJK z Kursu Java
/*
*
* Projekt robiony na kursie Java Bootcamp Online
* Szkoła : Akademia Kodu
* Projekt robiony grupowo, w czasie zajęć dnia 15.09.2018
* Cel: edukacyjny
*
* */


package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);


    }

}
