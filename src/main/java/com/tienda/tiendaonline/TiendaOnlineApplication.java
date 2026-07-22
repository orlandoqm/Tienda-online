package com.tienda.tiendaonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TiendaOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiendaOnlineApplication.class, args);
    }

}
