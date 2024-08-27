# The Gilded Rose Kata

## Enunciado

Bienvenido a la **Kata de Gilded Rose**. Esta kata está diseñada para ayudarte a practicar y mejorar tus habilidades de refactorización en un código heredado.

### Descripción del Problema

Gilded Rose es una pequeña tienda de objetos mágicos, y su sistema de gestión de inventario necesita ser mejorado. Actualmente, el sistema tiene una clase llamada `Item` y una clase `GildedRose` que gestiona el inventario. El código de `GildedRose` es difícil de mantener y debe ser refactorizado sin cambiar su comportamiento.

### Reglas del Inventario

Cada artículo en el inventario tiene las siguientes propiedades:
- `name`: el nombre del artículo.
- `sellIn`: el número de días que quedan para vender el artículo.
- `quality`: un valor que representa lo valioso que es el artículo.

El sistema debe actualizar estas propiedades diariamente de acuerdo con las siguientes reglas:

1. Al final de cada día, el sistema reduce los valores de `sellIn` y `quality` para cada artículo.
2. Una vez que la fecha de venta ha pasado (`sellIn` < 0), la `quality` del artículo disminuye dos veces más rápido.
3. La `quality` de un artículo nunca es negativa.
4. "Aged Brie" incrementa su `quality` a medida que envejece.
5. La `quality` de un artículo nunca es mayor que 50.
6. "Sulfuras", siendo un artículo legendario, nunca tiene que ser vendido ni disminuye su `quality`.
7. "Backstage passes", como los de un concierto de TAFKAL80ETC, incrementan su `quality` a medida que su `sellIn` se aproxima:
    - `quality` incrementa en 2 cuando faltan 10 días o menos.
    - `quality` incrementa en 3 cuando faltan 5 días o menos.
    - `quality` cae a 0 después del concierto.
9. "Conjured" es un **nuevo tipo de artículo** que se degrada el doble de rápido que los artículos normales.

### Requisitos

- Tu tarea 1: es refactorizar el código de `GildedRose` sin cambiar el comportamiento existente. Debes hacer que el código sea más limpio, mantenible y preparado para futuras extensiones.
- Tu tarea 2: es añadir un nuevo tipo de artículo llamado "Conjured". Debe seguir las reglas de degradación de calidad de los artículos "Conjured".
- Por supuesto debes añadir los tests necesarios para comprobar que el código sigue funcionando correctamente después de la refactorización y la adición del nuevo tipo de artículo.
- Asegúrate de que el código sigue funcionando correctamente después de la refactorización. Puedes usar los tests existentes para comprobarlo.
- Puedes añadir tests adicionales si lo consideras necesario.

### Notas

- No puedes cambiar la clase `Item` ni su propiedad `name`.
- El método `updateQuality` debe permanecer en la clase `GildedRose`.
- No puedes cambiar la firma del método `updateQuality`.
- Puedes hacer cualquier cambio en la clase `GildedRose` siempre y cuando no cambie su comportamiento.