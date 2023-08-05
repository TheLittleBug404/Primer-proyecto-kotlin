package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Nos conectamos al edit text
        val edtnombre = findViewById<AppCompatEditText>(R.id.etNombre)
        //Nos creamos una variable para poder conectarlo con el boton de nuestro xml
        val boton = findViewById<AppCompatButton>(R.id.botonPresiona)
        //Este metodo sirve para cuando pulse el boton
        boton.setOnClickListener {
            var mensaje:String = edtnombre.text.toString()
            if(mensaje.isNotEmpty()){
                Log.i("Ricky","Mensaje: $mensaje")
                //usamos un inten para navegar entre pantallas
                //notamos que intent tiene 2 parametros que son
                //1.- donde this es el contexto es desde la pantalla que queremos ir
                //2.- Es a la pantalla que queremos ir en este caso se llama ResultadoActivity
                val nuevaPantalla:Intent = Intent(this,ResultadoActivity::class.java)
                //llevamos un valor de una pantalla a otra
                //esto lo hacemos con el metodo putExtra() donde los parametros son
                //1.- este es la clave que en este ej es mensaje extra
                //2.- este parametro es lo que queremos enviar a la otra pantalla
                nuevaPantalla.putExtra("mensaje extra",mensaje)
                startActivity(nuevaPantalla)
            }
        }
    }
}