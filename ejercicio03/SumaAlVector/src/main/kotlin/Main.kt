fun main(args: Array<String>) {
    val matriz = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    val vector = IntArray(3)
    suma(matriz, vector)
    imprimirVector(vector, matriz)

    println(diagonalDerecha(matriz))
    println(diagonalIzquierda(matriz))
}



fun diagonalDerecha(matriz: Array<Array<Int>>): Int {
    var numero = 0
    for ( i in matriz.indices){
            numero+=matriz[i][i]

    }
    return numero

}
fun diagonalIzquierda(matriz: Array<Array<Int>>): Int {
    var resta = 0
    for (i in (matriz.size -1 downTo 0)){
        resta+=matriz[i][i]
    }
    return resta
}

fun imprimirVector(vector: IntArray, matriz: Array<Array<Int>>) {
    for (i in vector.indices){
        print("[${vector[i]}]")
    }
    println()

    for (i in matriz.indices){
        for (j in matriz.indices){
            print("[${matriz[i][j]}]")
        }
        println()
    }
}

fun suma(matriz: Array<Array<Int>>, vector: IntArray) {
    for (i in matriz.indices){
        for (j in matriz.indices){
            if (matriz[i][j]== matriz[0][j]){
                vector[0]+=matriz[i][j]
            }
            if (matriz[i][j]== matriz[1][j]){
                vector[1]+=matriz[i][j]
            }
            if (matriz[i][j]== matriz[2][j]){
                vector[2]+=matriz[i][j]
            }


        }
    }
}
