package PrincipiosSOLID.Ejercicio6;

/**
 *
 * @author Jaime Barrera
 */
class Contacto {
    private String nombre;
    private String email;

    public Contacto(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

class CuentaBancaria {
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}

// Interfaz para enviar correos
interface IMailSender {
    void enviar(Contacto contacto, String cuerpoMensaje);
}

// Implementación de la interfaz de envío de correos
class MailSender implements IMailSender {
    @Override
    public void enviar(Contacto contacto, String cuerpoMensaje) {
        System.out.println("Enviando correo a: " + contacto.getEmail());
        System.out.println("Asunto: Notificación");
        System.out.println("Cuerpo: " + cuerpoMensaje);
        System.out.println("Correo enviado con éxito.");
    }
}

// Clase Principal
public class Main {
    public static void main(String[] args) {
        // Crear contacto y cuenta bancaria
        Contacto contacto = new Contacto("Jaime Barrera", "jaime@email.com");
        CuentaBancaria cuenta = new CuentaBancaria("123456789");

        // Crear servicio de correo y enviar mensaje
        MailSender mailSender = new MailSender();
        mailSender.enviar(contacto, "Este es un mensaje de prueba.");
    }
}
