fun main(args: Array<String>) {
    var columna = 0
    var fila = 0
    var matrizO = arrayOf(
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]"),
        arrayOf("[ ]","[ ]","[ ]","[ ]","[ ]")
    )
    colocarMosca(matrizO)
    do {


        imprimirMatriz(matrizO)
       println("en que columna esta")
       columna= readln().toIntOrNull()?:0
        println("en que fila esta")
        fila= readln().toIntOrNull()?:0
        uff(matrizO,fila,columna)


    }while ( muerta(matrizO, columna,fila))


}

fun uff(matrizO: Array<Array<String>>, fila: Int, columna: Int) {

                if ( fila+1 < matrizO.size || fila -1 > 0 || matrizO[columna][fila+1] == "[M]" || matrizO[columna][fila-1] == "[M]" ){
                    imprimirMatriz(matrizO)
                    println("1")
                    colocarMosca(matrizO)


                }
                if( columna+1 < matrizO.size || columna -1 > 0 || matrizO[columna +1][fila] == "[M]" || matrizO[columna-1][fila] == "[M]"){
                    imprimirMatriz(matrizO)
                    println("2")
                    colocarMosca(matrizO)


                }
                if(matrizO[columna +1][fila-1] == "[M]" || matrizO[columna+1][fila+1] == "[M]"){
                    imprimirMatriz(matrizO)
                    println("3")
                    colocarMosca(matrizO)


                }
                if(matrizO[columna -1][fila-1] == "[M]" || matrizO[columna-1][fila+1] == "[M]"){
                    imprimirMatriz(matrizO)
                    println("4")
                    colocarMosca(matrizO)


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
        if (matrizO[columna][fila] == "[M]"){
            muerte = false
            println("muerta")
        }

        return muerte
}

fun colocarMosca(matrizO: Array<Array<String>>) {


    var i = (0..4).random()
    var j = (0..4).random()
    matrizO[2][2] = "[M]"
}

