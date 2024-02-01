package controllers

import models.Lampada
import utilities.*

fun main() {
    var colors = arrayOf("${RED_BOLD}vermell $RESET", "${GREEN_BOLD}verd $RESET", "${BLUE_BOLD}blau $RESET", "${YELLOW_BOLD}groc $RESET", "${PURPLE_BOLD}lila $RESET")

    val lampada1 = Lampada(false, "blanc", 0, "Menjador")
    val lampada2 = Lampada(false, "blanc", 0, "Cuina")

    //lampada1:
    lampada1.encendre()
    repeat(3) {
        lampada1.setColor(colors.random())
        println("Lampada 1: "+ lampada1.getColor())
    }
    lampada1.setIntensitat(5)


    //lampada2
    lampada2.encendre()
    repeat(2) {
        lampada2.setColor(colors.random())
        println("Lampada 2: "+ lampada2.getColor())
    }
    lampada2.setIntensitat(5)
    lampada2.apagar()
    lampada2.setColor(colors.random())
    lampada2.encendre()
    lampada2.setColor(colors.random())
    lampada2.setIntensitat(5)

    println(lampada1)
    println(lampada2)
}
