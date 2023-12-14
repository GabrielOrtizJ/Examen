package com.example.examen_gabriel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.examen_gabriel.adapters.PlanetaAdapter
import com.example.examen_gabriel.model.Planeta

private fun <E> MutableList<E>.add(index: E, element: E) {

}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listaViewItems: ListView = findViewById(R.id.listViewItems)
        var listaPlanetas = leerPlaneta()
        var planetaAdapter = PlanetaAdapter(this, listaPlanetas)
        listaViewItems.adapter = planetaAdapter



        listaViewItems.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                Toast.makeText(
                    applicationContext,
                    "nombre: " + listaPlanetas[position].nombre
                            + "Tipo planeta: " + listaPlanetas[position].tipoPlaneta,
                    Toast.LENGTH_LONG
                ).show()
            }
    }

    private fun leerPlaneta(): ArrayList<Planeta> {
        var lista = ArrayList<Planeta>()
        val planetas = mutableListOf<String>()
        planetas.add("Mercurio", "Terrestre")
        planetas.add("Venus", "Terrestre")
        planetas.add("Tierra", "Terrestre")
        planetas.add("Marte", "Terrestre")
        planetas.add("Jupiter", "Gigante Gaseoso")
        planetas.add("Saturno", "Gigante Gaseoso")
        planetas.add("Urano", "Gigante Helado")
        planetas.add("Nepturno", "Gigante Helado")


        for (indice in (0..10)) {

            var planeta = Planeta("Nombre$indice", "tipo del planeta$indice")
            lista.add(planeta)
        }
        return lista
    }

    private fun Planeta(nombre: String, tipoPlaneta: String): Planeta {

    }

}



