class Coches{
    // creo la clase Coches
    var matricula:String
    var hEntrada:Int
    var hSalida:Int
    // creo las varialbes de coches

    constructor(){
        // creo un constructor sin parametros
        matricula = "0"
        hEntrada = 0
        hSalida = 0
    }

    constructor(matricula:String, hEntrada:Int , hSalida:Int){
        // creo un constructor con parametros
        this.matricula=matricula
        this.hEntrada=hEntrada
        this.hSalida=hSalida
    }
}