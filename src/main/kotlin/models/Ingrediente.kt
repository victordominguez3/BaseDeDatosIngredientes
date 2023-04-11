package models

import MORADO
import RESET
import java.util.*

class Ingrediente(
    val UUID: String,
    val nombre: String,
    val precio: Double,
    val cantidad: Int
) {

    override fun toString(): String {
        return "${MORADO}UUID$RESET: $UUID, ${MORADO}Nombre$RESET: $nombre, ${MORADO}Precio$RESET: $precio€, ${MORADO}Cantidad$RESET: $cantidad"
    }
}