# The Trivia Game Kata

## Descripción

En esta kata, trabajarás con el código de un juego de trivia que tiene reglas complejas y diversas. El código actual es funcional pero difícil de entender y mantener debido a su complejidad y falta de claridad. El objetivo de esta kata es refactorizar el código para mejorar su estructura, hacerlo más claro y preparar el sistema para futuras expansiones. Esto implica aplicar principios de diseño orientado a objetos, mejorar la separación de responsabilidades y asegurar que el código sea fácil de mantener y extender.

## Objetivo

- **Mejorar la claridad y estructura:** Refactorizar el código para que sea más legible y entendible, eliminando duplicaciones y simplificando la lógica.
- **Facilitar la extensibilidad:** Asegurarse de que el código esté diseñado de manera que sea fácil añadir nuevas funcionalidades o reglas en el futuro sin necesidad de modificar grandes partes del código existente.

## Complejidad

- **Nivel:** Intermedio

## Reglas del Juego de Trivia

### 1. Jugadores
- El juego puede tener entre 2 y 6 jugadores.
- Los jugadores se turnan para responder preguntas y moverse en el tablero.

### 2. Tablero
- El tablero tiene 12 espacios, numerados del 0 al 11.
- Los jugadores se mueven en un ciclo alrededor del tablero. Si un jugador avanza más allá del espacio 11, su posición se reinicia al espacio correspondiente (por ejemplo, si están en el espacio 11 y se mueven 2 espacios, su nueva posición será el espacio 1).

### 3. Categorías de Preguntas
- Hay cuatro categorías de preguntas en el juego: **Pop**, **Science**, **Sports**, y **Rock**.
- La categoría de la pregunta que un jugador debe responder depende de la casilla en la que aterriza:
    - Espacios 0, 4, 8: **Pop**
    - Espacios 1, 5, 9: **Science**
    - Espacios 2, 6, 10: **Sports**
    - Espacios 3, 7, 11: **Rock**

### 4. Preguntas
- El juego tiene un conjunto de preguntas predefinidas para cada categoría.
- Cada vez que un jugador aterriza en una casilla y debe responder a una pregunta, se saca la primera pregunta de la lista correspondiente.

### 5. Lanzamiento de Dados
- Al comienzo de su turno, un jugador lanza un dado que determina cuántos espacios avanza en el tablero.
- Si un jugador está en la **Penalty Box** y lanza un número impar, sale de la **Penalty Box** y avanza en el tablero. Si lanza un número par, permanece en la **Penalty Box** y no se mueve.

### 6. Penalty Box
- Si un jugador responde incorrectamente a una pregunta, es enviado a la **Penalty Box**.
- Un jugador en la **Penalty Box** puede salir si lanza un número impar en su siguiente turno. Si lanza un número par, permanece en la **Penalty Box**.

### 7. Puntos y Monedas
- Cada vez que un jugador responde correctamente a una pregunta, gana una moneda de oro.
- El juego continúa hasta que un jugador alcanza 6 monedas de oro.

### 8. Finalización del Turno
- Después de que un jugador responde a una pregunta, el turno pasa al siguiente jugador.

### 9. Ganador del Juego
- El juego se gana cuando un jugador ha acumulado 6 monedas de oro. La partida termina inmediatamente con ese jugador como ganador.


## Instrucciones

1. **Analizar el Código Existente:**
    - Antes de realizar cualquier cambio, asegúrate de entender cómo funciona el código actual. Identifica áreas problemáticas como métodos largos, condicionales complejas o duplicación de código.

2. **Refactorización:**
    - Aplica técnicas de refactorización como Extract Method, Replace Conditional with Polymorphism, y otros principios de diseño orientado a objetos.
    - Introduce patrones de diseño como el Strategy Pattern o el State Pattern para manejar la lógica de reglas complejas.

3. **Pruebas:**
    - Asegúrate de que el código refactorizado esté bien cubierto por pruebas unitarias. Las pruebas deben verificar que el sistema de reglas del juego funciona correctamente después de la refactorización.

4. **Documentación:**
    - Documenta los cambios realizados y explica cómo la refactorización ha mejorado la estructura y claridad del código.

## Resultado Esperado

Después de completar la refactorización, el código debería ser más claro, con una lógica de juego bien estructurada y lista para ser extendida en el futuro. Todas las pruebas deben pasar, garantizando que el comportamiento del sistema sigue siendo correcto.

¡Buena suerte y disfruta del proceso de refactorización!
