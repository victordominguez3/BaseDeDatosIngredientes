import models.Ingrediente
import java.io.File

class IngredientesRepositoryMemory {

    val DB = leerCSV()

    fun leerCSV(): List<Ingrediente> {
        val path = "${System.getProperty("user.dir")}${File.separator}src${File.separator}main${File.separator}resources${File.separator}DBIngredientes.csv"
        val fichero = File(path)

        return fichero.readLines()
            .drop(1)
            .map { linea -> linea.split(";") }
            .map { columnas ->
                Ingrediente(
                    columnas[0],
                    columnas[1],
                    columnas[2].toDouble(),
                    columnas[3].toInt()
                )
            }
    }

}