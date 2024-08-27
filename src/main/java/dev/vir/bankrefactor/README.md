# Banking Kata Refactor

## Enunciado

En esta kata, trabajarás con un sistema bancario simple que permite a los usuarios realizar operaciones básicas en una cuenta bancaria, como depósitos, retiros y consultas de saldo. El código inicial es funcional, pero tiene problemas en cuanto a claridad, mantenimiento y extensibilidad. Tu tarea es refactorizar el código para mejorar su estructura, aplicando principios de diseño orientado a objetos y patrones de diseño cuando sea necesario.

### Descripción del Problema

El sistema bancario maneja las siguientes operaciones:

1. **Depósito**: El usuario puede depositar una cantidad de dinero en su cuenta.
2. **Retiro**: El usuario puede retirar dinero de su cuenta.
3. **Consulta de saldo**: El usuario puede consultar el saldo actual de su cuenta.
4. **Historial de transacciones**: El sistema debe mantener un registro de todas las transacciones realizadas.

### Reglas del Sistema

1. **Depósito**:
    - El saldo de la cuenta aumenta por la cantidad depositada.
    - No se pueden depositar cantidades negativas.

2. **Retiro**:
    - El saldo de la cuenta disminuye por la cantidad retirada.
    - No se pueden retirar cantidades negativas.
    - No se permite retirar más dinero del que hay disponible en la cuenta (el saldo no puede ser negativo).

3. **Consulta de saldo**:
    - El sistema debe permitir al usuario consultar el saldo actual en cualquier momento.

4. **Historial de transacciones**:
    - El sistema debe registrar cada transacción con la fecha, tipo de transacción (depósito o retiro) y la cantidad.
    - El usuario debe poder ver el historial de todas las transacciones realizadas en su cuenta.

### Código Inicial

El código inicial del sistema es funcional pero necesita mejoras.

### Tareas
Tu tarea es refactorizar el código del sistema bancario para mejorar su estructura, claridad y mantenibilidad. Algunas sugerencias para la refactorización incluyen:

### Mejora de la claridad y mantenibilidad:
- Refactoriza el código para eliminar duplicación y mejorar la organización.
- Introduce métodos adicionales si es necesario para reducir la complejidad.

### Separación de responsabilidades:
- Aplica el principio de responsabilidad única para separar las preocupaciones. Por ejemplo, el manejo del historial de transacciones podría extraerse a una clase separada.
Extensibilidad:

- Prepara el sistema para futuras extensiones. Por ejemplo, podrías necesitar agregar diferentes tipos de cuentas o nuevas reglas de negocio.

### Pruebas:
- Asegúrate de que el código esté bien cubierto por pruebas unitarias.

### Tareas Adicionales (Opcionales):
- Historial de Transacciones Mejorado: Implementa un sistema más avanzado para manejar las transacciones, donde cada transacción se registre como un objeto con propiedades específicas (fecha, tipo, cantidad) en lugar de simples cadenas de texto.
- Tipos de Cuentas: Introduce diferentes tipos de cuentas (por ejemplo, cuenta de ahorro, cuenta corriente) y refactoriza el código para soportar estas diferencias de manera clara y extensible.
