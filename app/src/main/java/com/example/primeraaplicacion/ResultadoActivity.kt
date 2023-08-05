package com.example.primeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val resultado=findViewById<TextView>(R.id.tvResultado)
        //con el extra obtenemos lo que enviamos de la otra pantalla
        //? es para asegurar que no sera nulo
        //orEmpty() es para decirle que si no hay un valor a devolver nos dara una string vacia
        val mensaje:String = intent.extras?.getString("mensaje extra").orEmpty()
        //le damos un texto a resultado
        resultado.text = "Hola $mensaje"
    }
}