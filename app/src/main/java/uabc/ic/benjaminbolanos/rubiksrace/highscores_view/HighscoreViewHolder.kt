package uabc.ic.benjaminbolanos.rubiksrace.highscores_view

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uabc.ic.benjaminbolanos.rubiksrace.R

class HighscoreViewHolder(view: View): RecyclerView.ViewHolder(view){
    val highscoreCombinacion = arrayOf<ImageView>(view.findViewById(R.id.highscore_item_combinacion_1), view.findViewById(
        R.id.highscore_item_combinacion_2
    ), view.findViewById(R.id.highscore_item_combinacion_3),
            view.findViewById(R.id.highscore_item_combinacion_4), view.findViewById(R.id.highscore_item_combinacion_5), view.findViewById(
            R.id.highscore_item_combinacion_6
        ),
            view.findViewById(R.id.highscore_item_combinacion_7), view.findViewById(R.id.highscore_item_combinacion_8), view.findViewById(
            R.id.highscore_item_combinacion_9
        ))
    val highscoreTiempo = view.findViewById<TextView>(R.id.highscore_item_tiempo)
    val highscoreMovimientos = view.findViewById<TextView>(R.id.highscore_item_movimientos)
    val eliminarButton = view.findViewById<Button>(R.id.highscore_item_eliminar)

    /**
     * Método que toma los datos de un Highscore y los muestra en un fragmento del RecyclerView.
     */
    fun render(highscoreItem: Highscore){
        for(i in 0..8){
            highscoreItem.combinacion?.get(i)?.let { highscoreCombinacion[i].setImageResource(it.valor) }
        }
        highscoreTiempo.text = highscoreItem.tiempoString()
        highscoreMovimientos.text = StringBuffer("${highscoreItem.movimientos} Movimientos")
    }
}