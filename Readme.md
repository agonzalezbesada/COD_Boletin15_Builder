# PATRON BUILDER PIZZA

## ¿Cual es la función de este patrón?

Poder crear objetos iguales o muy similares que son necesarios crear repetitivamente ahorrando código, y permitiendo personalizarlos.

Por ejemplo un Builder que crea un objeto *Mochila*, pero esta mochila puede tener una gran cantidad de atributos, en este caso comprendidos por su aspecto o contenido,
Para el ejemplo usaremos el contenido. 

Su contenido pueden ser, lapiz, goma ,boligrafo, afilalapiz, papel, libreta, archivador, grapadora...

Existen muchos tipos diferentes de mochila resultantes de esto.

Y si quisiesemos crear nosotros ese objeto, tendríamos que especificar gran cantidad de valores para
sus atributos. Aquí es donde entra el Factory, nos permite crear estos objetos, *Mochila* de manera muy sencilla
y pudiendo personalizarlos muy fácilmente.

---
Diagrama de clases
---
```mermaid
classDiagram
    class Main{
    +mochila1 : Mochila
    +main()
    }
        
    class BuilderMochilas{
    -_mochila : Mochilas
    +build() _mochila
    +setLapiz(lapiz : boolean) this
    +setGoma(goma : boolean) this
    +setBoligrafo(boligrafo : boolean) this
    +setAfilalapiz(afilalapiz : boolean) this
    +setPapel(papel : boolean) this
    +setLibreta(libreta : boolean) this
    +setArchivador(archivador : boolean) this
    +setGrapadora(grapadora : boolean) this
    }
    
    class Mochila{
    -lapiz : boolean = true
    -goma : boolean = true
    -boligrfo : boolean = true
    -afilalapiz : boolean = false
    -papel : boolean = true
    -libreta : boolean = true
    -Archivador : boolean = false
    -Grapadora : boolean = false
    +Mochilas()
    +Mochilas(lapiz : boolean,goma : boolean,boligrafo : boolean,afilalapiz : boolean,papel : boolean,libreta : boolean,archivador : boolean,grapadora : boolean)
    +toString() String
    }
    
    Main "1" *-- "1..*" BuilderMochilas : association
    BuilderMochilas "1" *-- "1" Mochila : association
```
## Podríamos combinarlo con el patrón Factory?

Si, podríamos hacer un Factory que dentro de los diferentes tipos de objeto que nos provee,

estos pudiesen ser personalizados mediante el Builder

