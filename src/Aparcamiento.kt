class Aparcamiento{
    // creo la clase Aparcamiento
    var nombre:String
    var plazaT:Int
    var plazaL:Int
    // creo las variables tipo var para poder modificarlas

    constructor(){
        // creo un constructor sin parametros
        nombre = ""
        plazaT = 0
        plazaL = 0
    }

    constructor(nombre:String, plazaT:Int, plazaL:Int){
        // creo un constructor con parametros
        this.nombre=nombre
        this.plazaT=plazaT
        this.plazaL=plazaL
    }
}