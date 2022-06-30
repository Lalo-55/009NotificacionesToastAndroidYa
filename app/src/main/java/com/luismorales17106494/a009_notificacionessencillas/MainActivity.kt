package com.luismorales17106494.a009_notificacionessencillas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luismorales17106494.a009_notificacionessencillas.databinding.ActivityMainBinding

/*
9 - Notificaciones sencillas mediante la clase Toast

Android permite mostrar una ventana emergente temporal que informa al usuario mediante
un mensaje que aparece en la pantalla por un lapso pequeño de tiempo (luego de pasado un
tiempo la ventana desaparece).
Esta ventana que se superpone a la interfaz que se está mostrando en ese momento se
administra mediante una clase llamada Toast.

Problema:
Generar un número aleatorio entre 1 y 100000. Mostrar mediante una ventana emergente
dicho número por un lapso de tiempo. Luego mediante un control EditText ("Number") pedir
al operador que ingrese el número que vio en la pantalla. Cuando se presione un botón controlar
el número generado aleatoriamente con el que ingresó el usuario y mediante otro Toast
informar si acertó o no.

 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numRandom = (Math.random() * 100).toInt()
        Toast.makeText(this, numRandom.toString(), Toast.LENGTH_LONG).show()


        binding.btVerificar.setOnClickListener() {
            if (binding.editTextNumber.text.isNotBlank()) {

                if (numRandom == binding.editTextNumber.text.toString().toInt()) {
                    Toast.makeText(this, "Has acertado", Toast.LENGTH_LONG).show()

                } else {
                    Toast.makeText(this, "No has acertado \nEl número es $numRandom", Toast.LENGTH_LONG).show()
                }

            } else {
                Toast.makeText(this, "Ingrese un número", Toast.LENGTH_LONG).show()
            }
        }


    }
}