package models

class Lampada {
    private var idLampada:String = ""
        private var encendreApagar:Boolean = false
        private var color:String = "blanc"
        private var intensitat:Int = 0


        constructor(onOff:Boolean, color:String, intensitat:Int, id:String){
            this.idLampada=id
            this.encendreApagar=onOff
            this.color=color
            this.intensitat=intensitat
        }

        fun encendre() {
            this.encendreApagar = true
        }

        fun apagar() {
            this.encendreApagar = false
        }

        fun getColor(): String {
            return this.color
        }

        fun setColor(c: Array<String>) {
            this.color = c.toString()
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
            return "La lampada d'id: ${this.idLampada}  està: ${this.encendreApagar} amb el color: ${this.color} en intensitat: ${this.intensitat}."
        }
    }