fun main(args: Array<String>) {
    var columna = 0
    var fila = 0
    var r1 = 0
    var r2 = 0

    var matrizO = arrayOf(
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]")
    )
    colocarMosca(matrizO)
    do {



       println("en que fila esta")
       fila= readln().toIntOrNull()?:0
        println("en que columna esta")
        columna= readln().toIntOrNull()?:0
        uff(matrizO,fila,columna)


    }while ( muerta(matrizO, columna,fila))
    println("muerta")


}

fun colocarMosca(matrizO: Array<Array<String>>){
    for (i in matrizO.indices){
        for (j in matrizO.indices){
            if (matrizO[i][j] == "[M]"){
                matrizO[i][j] = "[ ]"
            }
        }

    }



    var i = (0..4).random()
    var j = (0..4).random()

    matrizO[i][j] = "[M]"



}

fun uff(matrizO: Array<Array<String>>, columna: Int, fila: Int) {
                if (muerta(matrizO, columna, fila)){}

                else if ((columna + 1 < matrizO.size) && (matrizO[fila][columna + 1] == "[M]" || (columna - 1 >= 0 && matrizO[fila][columna - 1] == "[M]"))) {
                    imprimirMatriz(matrizO)
                    colocarMosca(matrizO)
                    println("casi pero no")



                }else if ((fila + 1 < matrizO.size) && (matrizO[fila + 1][columna] == "[M]" || (fila - 1 >= 0 && matrizO[fila - 1][columna] == "[M]"))) {
                    imprimirMatriz(matrizO)
                    colocarMosca(matrizO)
                    println("casi pero no")

                }else if ((fila + 1 < matrizO.size || fila -1< 0 && columna - 1 > 0) || (columna + 1 < matrizO.size && matrizO[fila - 1][columna - 1] == "[M]" && matrizO[fila - 1][columna + 1] == "[M]")) {

                    imprimirMatriz(matrizO)
                    colocarMosca(matrizO)
                    println("casi pero no")



                }



}

fun imprimirMatriz(matrizO: Array<Array<String>>) {
    for (i in matrizO.indices){
        for (j in matrizO.indices){
            print(matrizO[i][j])
        }
        println()
    }
}

fun muerta(matrizO: Array<Array<String>>, columna: Int, fila: Int):Boolean {
    var muerte = true
        if (matrizO[fila][columna] == "[M]"){
            muerte = false
        }

        return muerte
}



