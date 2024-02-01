package controllers

import models.Lampada

fun main() {
    var colors = listOf("vermell", "verd", "blau", "groc", "rosa", "taronja", "lila")
    var intensitat= listOf(1,2,3,4,5)

    val lampada1 = Lampada(false, "blanc", 0, "Menjador")
    val lampada2 = Lampada(false, "blanc", 0, "Cuina")

    lampada1.encendre()
    repeat(3) { lampada1.canviarColor(colors) }
    lampada1.canviarIntensitat(5)

    lampada2.encendre()
    repeat(2) { lampada2.canviarColor(colors) }
    lampada2.canviarIntensitat(5)
    lampada2.apagar()
    lampada2.canviarColor(colors)
    lampada2.encendre()
    lampada2.canviarColor(colors)
    lampada2.canviarIntensitat(5)

    println(lampada1)
    println(lampada2)
}
