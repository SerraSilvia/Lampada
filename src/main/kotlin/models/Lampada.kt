package models

class Lampada {
        private var ences:Boolean = false
        private var color:String = "blanc"
        private var intensitat:Int = 0
        private var idLampada:String = ""

        constructor(onOff:Boolean, color:String, intensitat:Int, id:String){
            this.idLampada=id
            this.ences=onOff
            this.color=color
            this.intensitat=intensitat
        }

        fun encendre() {
            this.ences = true
        }

        fun apagar() {
            this.ences = false
        }

        fun getColor(): String {
            return this.color
        }

        fun setColor(c: String) {
            this.color = c
        }


        fun getIntensitat():Int{
            return this.intensitat
        }

        fun setIntensitat(i:Int){
            this.intensitat=i
        }

        fun getId():String{
            return this.idLampada
        }

        fun setId(id: String){
            this.idLampada=id
        }

        override fun toString(): String{
            return "La lampada d'id: ${this.idLampada}  està: ${this.ences} amb el color: ${this.color} en intensitat: ${this.intensitat}."
        }
    }