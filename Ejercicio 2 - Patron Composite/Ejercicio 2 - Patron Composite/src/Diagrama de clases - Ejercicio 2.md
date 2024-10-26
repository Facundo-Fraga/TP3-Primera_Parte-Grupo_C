# Sistema de gestión de archivos y directorios

## Diagrama de Clase

```mermaid
classDiagram
    class FileSystemComponent {
        +String name
        +showDetails() void
    }
    
    class File {
        +int size
        +showDetails() void
    }
    
    class Directory {
        +List~FileSystemComponent~ components
        +addComponent(FileSystemComponent) void
        +removeComponent(FileSystemComponent) void
        +showDetails() void
    }
    
    FileSystemComponent <|-- File
    FileSystemComponent <|-- Directory
    Directory o-- FileSystemComponent : contiene
```

### Explicación de cada clase

- **FileSystemComponent:** en este caso, FileSystemComponent será la clase base abstracta que se encargue de definir la estructura común para archivos y directorios. Contiene un método showDetails() que será implementado en las subclases.
- **File:** representa un archivo que tiene un nombre y un tamaño. Implementa el método showDetails() para mostrar su nombre y tamaño.
- **Directory:** representa un directorio que puede contener tanto archivos como otros directorios (hace uso de una lista de la clase FileSystemComponent). Tiene métodos para agregar y eliminar componentes y el método showDetails() que mostrará su contenido de manera recursiva.
