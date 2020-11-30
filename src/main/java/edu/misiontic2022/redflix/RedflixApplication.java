package edu.misiontic2022.redflix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import edu.misiontic2022.redflix.vista.VistaPrincipal;

@SpringBootApplication
public class RedflixApplication {

    public static void main(String[] args) {
        new VistaPrincipal().setVisible(true);
        iniciarSpring();
    }

    public static void iniciarSpring() {
        SpringApplication.run(RedflixApplication.class);
    }

}
