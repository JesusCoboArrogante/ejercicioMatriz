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
    colocarMosca(matrizO,r1,r2)
    do {


        imprimirMatriz(matrizO)
       println("en que columna esta")
       columna= readln().toIntOrNull()?:0
        println("en que fila esta")
        fila= readln().toIntOrNull()?:0
        uff(matrizO,fila,columna)


    }while ( muerta(matrizO, columna,fila))


}

fun colocarMosca(matrizO: Array<Array<String>>, r1: Int, r2: Int):Int {

    matrizO[r1][r2] = "[i]"

    var i = (0..4).random()
    r1 = i
    var j = (0..4).random()
    r2 = j
    matrizO[i][j] = "[M]"
    return r1 r2
}

fun uff(matrizO: Array<Array<String>>, fila: Int, columna: Int) {

                if ( fila+1 < matrizO.size || fila -1 > 0 || matrizO[columna][fila+1] == "[M]" || matrizO[columna][fila-1] == "[M]" ){
                    imprimirMatriz(matrizO)
                    println("1")



                }else if( columna+1 < matrizO.size || columna -1 > 0 || matrizO[columna +1][fila] == "[M]" || matrizO[columna-1][fila] == "[M]"){
                    imprimirMatriz(matrizO)
                    println("2")


                } else if(matrizO[columna +1][fila-1] == "[M]" || matrizO[columna+1][fila+1] == "[M]"){
                    imprimirMatriz(matrizO)
                    println("3")


                }else if(matrizO[columna -1][fila-1] == "[M]" || matrizO[columna-1][fila+1] == "[M]"){
                    imprimirMatriz(matrizO)
                    println("4")



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



