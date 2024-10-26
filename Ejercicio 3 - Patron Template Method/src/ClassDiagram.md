# Sistema de Creación de Pasteles

## Diagrama de Clase

```mermaid
classDiagram
    class Cake {
        -String flavour
        -List~String~ ingredients
        -Boolean baking
        -String decoration
        -Boolean packaging
        +Cake()
        +void prepareIngredients()*
        +void bakeCake()
        +void decorateCake()*
        +void packCake()
        +Cake makeCake()
        +String toString()
    }

    class VanillaCake {
        +VanillaCake()
        +void prepareIngredients()
        +void decorateCake()
    }

    class ChocolateCake {
        +ChocolateCake()
        +void prepareIngredients()
        +void decorateCake()
    }

    Cake <|-- VanillaCake
    Cake <|-- ChocolateCake
```

## Explicación

Existe una relación de herencia entre la clase abstracta `Cake` y sus subclases concretas `VanillaCake` y `ChocolateCake`. La clase `Cake` define los atributos comunes a todos los tipos de pasteles, como **flavour (sabor)**, **ingredients (ingredientes)**, **baking (estado de horneado)**, **decoration (decoración)** y **packaging (estado de empaquetado)**.

Contiene sus métodos tanto concretos como abstractos, donde los métodos **prepareIngredients()** y **decorateCake()** están marcados como abstractos, lo que significa que deben ser implementados por las subclases `VanillaCake` y `ChocolateCake`, las cuales proporcionan sus propias implementaciones, especificando los ingredientes y la decoración correspondientes para cada tipo de pastel.
