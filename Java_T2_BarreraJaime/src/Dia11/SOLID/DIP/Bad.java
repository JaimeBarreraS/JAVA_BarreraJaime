package Dia11.SOLID.DIP;

/**
 *
 * @author Jaime Barrera
 */
public class Bad { 
    // DIP - Principio de Inversión de Dependencias: Depender de abstracciones en lugar de depender de clases concretas.
    class MySQLDatabase {
        public void connect() {
            System.out.println("Conectando a MySQL...");
        }
    }

    class DataManager {
        private MySQLDatabase database; // Acoplamiento fuerte

        public DataManager() {
            this.database = new MySQLDatabase();
        }

        public void connect() {
            database.connect();
        }
    }
}
