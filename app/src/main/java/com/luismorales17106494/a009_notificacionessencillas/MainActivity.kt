package com.luismorales17106494.a009_notificacionessencillas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}