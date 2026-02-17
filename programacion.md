# **<center>Parte Teórica - Programación**

## 15. ¿Cuáles son los tipos de datos primitivos en Java?
Java tiene 8 tipos de datos primitivos divididos en cuatro categorias:


### Enteros:
```
- byte: Tiene un tamaño de 8 bits y un rango que va desde -128 a 127.
- short: Tiene un tamaño de 16 bits y un rango que va desde -32,768 a 32,767.
- int: Tiene un tamaño de 32 bits y un rango que va desde -2,147,483,648 a 2,147,483,647.
- long: Tiene un tamaño de 64 bits y un rango que va desde -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
```

### Decimales:
```
- float: Tiene un tamaño de 32 bits y una precisión aproximada entre 6-7 dígitos decimales.
- double: Tiene un tamaño de 64 bits y una precisión aproximada de 15 dígitos decimales.
```

### Caracter
```
- char: Tiene un tamaño de 16 bits y un rango que va desde 0 a 65,535 (caracteres Unicode)
```

### Booleano
```
boolean: Recibe valores de "true" o "false".
```

## 16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?
Las estructuras de control permiten dirigir el flujo del programa.

### Condicionales
```
- if
- else
- switch

Permiten ejecutar bloques de código según una condición.
```

### Bucles
```
- for
- while
- do-while

Permiten repetir un bloque de código mientras se cumpla una condición.
```

## 17. ¿Por qué es importante usar nombres significativos para variables y métodos?
Los nombres significativos son fundamentales porque:

- **Mejoran la legibilidad**: El código se lee muchas más veces de las que se escribe.
- **Facilitan el mantenimiento**: Otro desarrollador (o tú mismo en el futuro) entenderá el código rápidamente.
- **Reducen la necesidad de comentarios**: El código se auto-documenta.
- **Previenen errores**: Nombres claros evitan confusiones.
- **Mejoran la colaboración**: El equipo trabaja más eficientemente.

## 18. ¿Qué es la Programación Orientada a Objetos (POO)?
La Programación Orientada a Objetos es un paradigma de programación que organiza el código en objetos que combinan:

- Datos (atributos/propiedades).
- Comportamientos (métodos/funciones).

## 19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?
1. Encapsulamiento.
2. Abstracción.
3. Herencia.
4. Polimorfismo.

Estos principios permiten estructurar mejor el software.

## 20. ¿Qué es la herencia en POO y cómo se utiliza en Java?
La herencia es un mecanismo que permite crear nuevas clases (clases hijas o subclases) basadas en clases existentes (clases padre o superclases), reutilizando y extendiendo su funcionalidad.

## 21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?
Los modificadores de acceso controlan la visibilidad y accesibilidad de clases, métodos, constructores y atributos en Java.

Java tiene 4 niveles de acceso los cuales son:
```
1. private: accesible solo dentro de la misma clase.
2. default: accesible solo dentro del mismo paquete.
3. protected: accesible desde la misma clase, subclases y mismo paquete.
4. public: accesible desde cualquier clase.
```

## 22. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?
Las variables de entorno son variables del sistema operativo que almacenan información de configuración accesible para todos los programas que se ejecutan en el sistema.

**¿Por qué son importantes?**

1. **Separación de configuración del código.**
- Evita hardcodear valores sensibles en el código fuente.
- Permite diferentes configuraciones según el ambiente (desarrollo, pruebas, producción).

2. **Seguridad.**
- Protege información sensible (contraseñas, API keys, tokens).
- No se sube al control de versiones.
- Facilita rotación de credenciales.

3. **Portabilidad**
- El mismo código funciona en diferentes entornos.
- Cada desarrollador puede tener su configuración local.
- Facilita despliegue en diferentes servidores.

4. **Flexibilidad**
- Cambiar configuración sin recompilar.
- Ajustar comportamiento según el ambiente.
- Facilita pruebas y debugging.