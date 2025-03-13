/*
 * Copyright (C) 2025 Garbi-Collector
 *
 * Este archivo es parte de SoundTribe-Users, un microservicio del software SoundTribe-Users, encargado de la gestión de Usuarios.
 *
 * SoundTribe-Users se distribuye bajo la Licencia Pública General GNU (GPL) versión 3 o posterior.
 * Puedes redistribuirlo y/o modificarlo bajo los términos de la Licencia Pública General GNU, tal como lo publica
 * la Free Software Foundation.
 *
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN GARANTÍA ALGUNA; sin siquiera la garantía
 * implícita de COMERCIABILIDAD o IDONEIDAD PARA UN PROPÓSITO PARTICULAR. Consulta la Licencia Pública General GNU para más
 * detalles.
 *
 * Debes haber recibido una copia de la Licencia Pública General GNU junto con este programa; si no, consulta
 * <https://www.gnu.org/licenses/>.
 */
package gabri.dev.javaspringcompose;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase Main.
 */
@SpringBootApplication
public class JavaSpringComposeApplication {
    /**
     * Main program.
     * @param args application args
     */
    public static void main(String[] args) {
        SpringApplication.run(JavaSpringComposeApplication.class, args);
    }
}
