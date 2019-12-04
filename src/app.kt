fun main(){
    // Creo los objetos para cada tipo de clase
    // Le doy los valores que quiero a los objetos creados
    // Muestro por pantalla los valores de los objetos
    // Subo el proyecto directamente desde el idea

    var Apar1 = Aparcamiento("Parking QuemaRueda", 500 , 123)
    println(Apar1)
    var Apar2 = Aparcamiento("Parking RobaCoches", 650, 24)
    println(Apar2)
    var Coch1 = Coches("00002015G", 8 , 12)
    println(Coch1)
    var Coch2 = Coches("646168D", 17, 23)
    println(Coch2)
}