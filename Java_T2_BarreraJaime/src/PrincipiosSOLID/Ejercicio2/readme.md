# Principios SOLID

Los principios SOLID son un conjunto de cinco reglas fundamentales para el diseño de software orientado a objetos. Aplicarlos ayuda a mejorar la calidad del código, facilitando su mantenimiento, escalabilidad y reutilización.

## 1. Single Responsibility Principle (SRP)
El **Principio de Responsabilidad Única** establece que una clase debe tener una única responsabilidad, es decir, una sola razón para cambiar. Esto mejora la cohesión del código y facilita su mantenimiento al evitar mezclar múltiples responsabilidades en una misma clase.

En el acrónimo SOLID, la S se refiere precisamente a este principio, donde la "razón para cambiar" es identificada como "responsabilidad".

## 2. Open/Closed Principle (OCP)
El **Principio Abierto/Cerrado** indica que una clase debe estar **abierta para su extensión, pero cerrada para su modificación**. Esto significa que se deben poder agregar nuevas funcionalidades sin modificar el código existente, utilizando herencia o interfaces.

## 3. Liskov Substitution Principle (LSP)
El **Principio de Sustitución de Liskov** establece que los objetos de una subclase deben poder ser sustituidos por objetos de su superclase sin afectar el comportamiento correcto del programa. En otras palabras, las subclases deben ser capaces de mantener las propiedades y comportamientos de la clase padre.

## 4. Interface Segregation Principle (ISP)
El **Principio de Segregación de Interfaces** sugiere que las interfaces deben ser **específicas para cada tipo de cliente**. En lugar de tener una única interfaz que obligue a las clases a implementar muchos métodos que no utilizarán, es preferible contar con muchas interfaces que definan un número reducido de métodos, cada una enfocada en una funcionalidad específica.

De esta manera, las clases solo implementarán las interfaces que realmente necesiten y evitarán la implementación innecesaria de métodos. El ISP promueve la segregación de interfaces para mantener la cohesión y prevenir la dependencia de código innecesario.

## 5. Dependency Inversion Principle (DIP)
El **Principio de Inversión de Dependencias** establece que **los módulos de alto nivel no deben depender de los módulos de bajo nivel, sino de abstracciones**. Además, las abstracciones no deben depender de los detalles, sino que los detalles deben depender de las abstracciones.

Según este principio, los módulos de alto nivel no deben depender de los módulos de bajo nivel; ambos deben depender de abstracciones. Además, las abstracciones no deben depender de los detalles, sino que los detalles deben depender de las abstracciones.

El objetivo del DIP es reducir las dependencias entre los módulos del código y lograr un bajo acoplamiento entre las clases. Al depender de abstracciones en lugar de clases concretas, el código se vuelve más flexible, reutilizable y fácil de mantener, ya que los cambios en las clases concretas no afectarán a los módulos de alto nivel que dependen de ellas.

---

Aplicar SOLID en el desarrollo de software garantiza un código más modular, mantenible y escalable, lo que facilita futuras modificaciones y mejora la calidad del proyecto.
