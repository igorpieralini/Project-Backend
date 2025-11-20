package com.pieralini.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);

        System.out.println("  ____            _           _      ___        _        ___    ____  _____ _____  _    ");
        System.out.println(" |  _ \\ _ __ ___ (_) ___  ___| |_   / _ \\      / |      / _ \\  | __ )| ____|_   _|/ \\   ");
        System.out.println(" | |_) | '__/ _ \\| |/ _ \\/ __| __| | | | |     | |     | | | | |  _ \\|  _|   | | / _ \\  ");
        System.out.println(" |  __/| | | (_) | |  __/ (__| |_  | |_| |  _  | |  _  | |_| | | |_) | |___  | |/ ___ \\ ");
        System.out.println(" |_|   |_|  \\___// |\\___|\\___|\\__|  \\___/  (_) |_| (_)  \\___/  |____/|_____| |_/_/   \\_\\");
        System.out.println("               |__/                                                                       ");

        System.out.println("🚀 Backend iniciado com sucesso! http://localhost:8080");
    }
}