# PATRON BUILDER PIZZA

## ¿Cual es la función de este patrón?

Poder crear objetos iguales o muy similares que son necesarios crear repetitivamente ahorrando código, y permitiendo personalizarlos

## Podríamos combinarlo con el patrón Factory?

Si, podríamos hacer un Factory que dentro de los diferentes tipos de objeto que nos provee,

estos pudiesen ser personalizados mediante el Builder

---
Diagrama de clases
---
```mermaid
classDiagram
    class Main{
    +pizza1 : Pizzas
    +pizza2 : Pizzas
    +pizza3 : Pizzas
    +main()
    }
    
    class Pizzas{
    -masa : int = 0
    -size : int = 1
    -relleno : boolean = false
    -salsa : boolean = false
    -cebolla : boolean = false
    -sinGluten : boolean = false
    -pina : boolean = false
    -champinones : boolean = false
    -jamon : boolean = true
    -recogida : int = 0
    +Pizzas()
    +Pizzas(masa : int,size : int,relleno : boolean,cebolla : boolean,sinGluten : boolean,pina : boolean,champinones : boolean,jamon : boolean,recogida : int)
    +toString() : String
    }
    
    class BuilderPizzas{
    -_pizza : Pizzas
    +build() : _pizza
    +setMasa(masa : int) : this
    +setSize(size : int) : this
    +setRelleno(relleno : boolean) : this
    +setSalsa(salsa : boolean) : this
    +setCebolla(cebolla : boolean) : this
    +setSinGluten(sinGluten : boolean) : this
    +setChampinones(champinones : boolean) : this
    +setJamon(jamon : boolean) : this
    +setRecogida(recogida : int) : this
    
    }
    
    Main "1" *-- "1..*" BuilderPizzas : association
    BuilderPizzas "1" *-- "1" Pizzas : association
```


