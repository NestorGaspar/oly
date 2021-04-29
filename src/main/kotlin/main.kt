fun main(){

    val corredor1 = Maraton("corredor1")
    val corredor2 = Maraton("corredor2")
    val corredor3 = Maraton("corredor3")

    val esgrimista1 = Esgrima("esgrimista1")
    val esgrimista2 = Esgrima("esgrimista2")
    val esgrimista3 = Esgrima("esgrimista3")

    val nadador1 = Natacion("nadador1")
    val nadador2 = Natacion("nadador2")
    val nadador3 = Natacion("nadador3")

    val lista = listOf(corredor1,corredor2,corredor3,esgrimista1,esgrimista2,esgrimista3,nadador1,nadador2,nadador3)

    lista.forEach{
        it.decirNombre()
        it.accion()
    }
}

open class Participante (val nombreParticipante : String) : DecirNombre{ //ponemos el open class porque mas adelante vamos a heredar de esta clase

    override fun decirNombre(){ //el override sobreescribe
        print("Soy $nombreParticipante")
    }

}

class Esgrima (nombre : String) : Participante(nombre), DecirAccion{ //heredamos la clase Participante, tambien tenemos que poner el ,DecirAccion para poder utilizar la funcion de la accion

    override fun accion() {
        println(" y pego espadazos")
    }
}

class Maraton (nombre: String) : Participante(nombre), DecirAccion{

    override fun accion() {
        println(" y corro durante mucho rato")
    }
}

class Natacion (nombre: String) : Participante(nombre),DecirAccion{

    override fun accion() {
        println(" y hago chof, chof, chof")
    }
}

interface DecirAccion{
    fun accion()
}

interface DecirNombre{
    fun decirNombre()
}