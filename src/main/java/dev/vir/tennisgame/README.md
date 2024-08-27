# The Tennis Refactoring Kata

## Enunciado

En esta kata, trabajarás con un sistema que gestiona la puntuación de un juego de tenis. El código existente funciona correctamente, pero es difícil de entender y mantener debido a su complejidad y falta de claridad. Tu tarea es refactorizar el código para mejorar su legibilidad, estructura y adherencia a los principios de diseño orientado a objetos.

### Descripción del Problema

El juego de tenis tiene una forma específica de puntuar, que se describe a continuación:

1. **Sistema de Puntuación**:
    - Los jugadores comienzan con una puntuación de 0.
    - La primera puntuación se llama "15", la segunda "30", la tercera "40".
    - Si ambos jugadores tienen 40, se llama "Deuce".
    - Si un jugador tiene 40 y gana el siguiente punto mientras el otro jugador tiene menos de 40, ese jugador gana el juego.
    - Si ambos jugadores tienen 40 y un jugador gana el siguiente punto, se obtiene "Ventaja" para ese jugador.
    - Si un jugador con "Ventaja" gana el siguiente punto, gana el juego. Si pierde, la puntuación vuelve a "Deuce".

2. **Objetivo**:
    - Refactorizar el código que maneja la puntuación del juego de tenis para hacerlo más legible, mantenible y adherente a los principios de diseño orientado a objetos.

### Instrucciones

1. **Comprender el Código Existente**:
    - Antes de realizar cualquier cambio, asegúrate de comprender cómo funciona el código actual y cómo se calcula y maneja la puntuación en un juego de tenis.

2. **Refactorización**:
    - Simplifica la lógica de puntuación del juego.
    - Aplica técnicas de refactorización como Extract Method, Replace Conditional with Polymorphism, y Introduce State Pattern para manejar los diferentes estados del juego (por ejemplo, "Deuce", "Ventaja", etc.).

3. **Pruebas**:
    - Asegúrate de que el código refactorizado esté bien cubierto por pruebas unitarias. Las pruebas deben verificar que el sistema de puntuación funciona correctamente después de la refactorización.

4. **Documentación**:
    - Documenta los cambios realizados y explica cómo la refactorización ha mejorado la estructura y la claridad del código.

### Consideraciones

- **Claridad y Legibilidad**: El código debe ser fácil de entender y seguir. Refactoriza para que las reglas del juego de tenis sean claramente representadas en el código.
- **Principio de Responsabilidad Única (SRP)**: Asegúrate de que cada clase o método cumpla una única responsabilidad.
- **Extensibilidad**: El sistema debe ser fácil de extender para manejar reglas adicionales o variaciones en el futuro.

### Resultado Esperado

Después de completar la refactorización, el código debería ser más claro, con una lógica de puntuación bien estructurada que refleje las reglas del juego de tenis. Todas las pruebas deben pasar, garantizando que el comportamiento del sistema sigue siendo correcto.

¡Buena suerte y disfruta del proceso de refactorización!