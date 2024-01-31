package org.example



fun main() {
    val matriz = arrayOf(
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"))
    imprimir(matriz)
    var pieza = ""
    var f = 0
    var c= 0
    println("que piezas quieres colocar")
    pieza = readln().toString()
    println("en que fila lo quieres poner")
    f = readln().toIntOrNull()?:0
    println("en que columna lo quieres poner")
    c = readln().toIntOrNull()?:0




        when (pieza){
            "dama" -> dama(f,c, matriz)
            "torre" -> torre(f,c, matriz)
            "caballo" -> caballo(f,c, matriz)
            "alfi" -> alfi(f,c, matriz)

        }



}

fun alfi(f: Int, c: Int, matriz: Array<Array<String>>) {
    matriz[f][c] = " A "

   // diagonalizq (f,c,matriz)
    diagonaldrc(f,c,matriz)
    imprimir(matriz)

}

fun caballo(f: Int, c: Int, matriz: Array<Array<String>>) {

    matriz[f][c] = "[C]"
    imprimir(matriz)
    saltar(f,c,matriz)
    imprimir(matriz)
}

fun saltar(f: Int, c: Int, matriz: Array<Array<String>>) {
    var i = f
    var j = c

        if(i+2 < matriz.size-1 && j+2 < matriz.size  && j>0){
            matriz[i+2][j+1]= "[*]"
            matriz[i+2][j-1]= "[*]"
        }else if (i+2 < matriz.size-1 && j+2 < matriz.size-1 ){
            matriz[i+2][j+1]= "[*]"
        }else if (i+2 < matriz.size-1 && j >0){
            matriz[i+2][j-1]= "[*]"
        }

        if (i > 0 && j+2 < matriz.size-1  && j>0){
            matriz[i-2][j-1]= "[*]"
            matriz[i-2][j+1]= "[*]"

        }else if (i > 0 && j+2 < matriz.size-1){
            matriz[i-2][j+1]= "[*]"
        }else if (i > 0 && j > 0){
            matriz[i-2][j-1]= "[*]"
        }


        if (j+2 < matriz.size-1 && i+2 < matriz.size-1  && i>0){
            matriz[i+1][j+2]= "[*]"
            matriz[i-1][j+2]= "[*]"
        }else if (j+2 < matriz.size-1 && i+2 < matriz.size-1){
            matriz[i+1][j+2]= "[*]"
        }else if (j < matriz.size-1  && i>0){
            matriz[i-1][j+2]= "[*]"
        }


        if (j > 0 && i+2 < matriz.size-1  && i>0){
            matriz[i+1][j-2]= "[*]"
            matriz[i-1][j-2]= "[*]"
        }else if (j > 0 && i+2 < matriz.size-1){
            matriz[i+1][j-2]= "[*]"
        }else if (j<0  && i>0){
        matriz[i-1][j-2]= "[*]"
        }








}

fun torre(f: Int, c: Int, matriz: Array<Array<String>>) {
    matriz[f][c] = " T "
    imprimir(matriz)
    columna(f,c,matriz)
    fila(f,c,matriz)

}
fun dama(f: Int, c: Int, matriz: Array<Array<String>>) {
    println()

    matriz[f][c] = "[D]"
    columna(f,c,matriz)
    fila(f,c,matriz)
    diagonalizq (f,c,matriz)
    diagonaldrc(f,c,matriz)


    imprimir(matriz)

}

fun diagonaldrc(f: Int, c: Int, matriz: Array<Array<String>>) {
    var menosfila = f
    var masfila = f
    var mascolumna = c
    var menoscolumna = c
    for (i in matriz.indices){
        for (j in matriz.indices){
            if (menosfila < matriz.size-1 && menoscolumna > 0){
                menosfila++
                menoscolumna--
                matriz[menosfila][menoscolumna] = "[*]"
            }
            if (masfila > 0 && mascolumna < matriz.size-1 ){
                masfila--
                mascolumna++
                matriz[masfila][mascolumna]= "[*]"
            }
        }
    }
}

fun diagonalizq(f: Int, c: Int, matriz: Array<Array<String>>) {
    var menosfila = f
    var masfila = f
    var mascolumna = c
    var menoscolumna = c
    for (i in matriz.indices){
        for (j in matriz.indices){
            if (menosfila > 0 && menoscolumna > 0){
                menosfila--
                menoscolumna--
                matriz[menosfila][menoscolumna] = "[*]"
            }
            if (masfila < matriz.size-1 && mascolumna < matriz.size-1 ){
                masfila++
                mascolumna++
                matriz[masfila][mascolumna]= "[*]"
            }
        }
    }
}

fun fila(f: Int, c: Int, matriz: Array<Array<String>>) {
    var menos = f
    var mas = f
    for (i in matriz.indices){
        for (j in matriz.indices){
            if (menos > 0){

                menos--
                matriz[menos][c]= "[*]"
            }
            if (mas < matriz.size-1 ){
                mas++
                matriz[mas][c]= "[*]"
            }
        }
    }
}

fun columna(f: Int, c: Int, matriz: Array<Array<String>>) {
    var menos = c
    var mas = c
    for (i in matriz.indices){
        for (j in matriz.indices){
            if (menos > 0){

                menos--
                matriz[f][menos]= "[*]"
            }
            if (mas < matriz.size-1 ){
                mas++
                matriz[f][mas]= "[*]"
            }
        }
    }
}


fun imprimir(matriz: Array<Array<String>>) {
    for (i in matriz.indices){
        for (j in matriz.indices){
            print(matriz[i][j])
        }
        println()
    }
    println()
}

