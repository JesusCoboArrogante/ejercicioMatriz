

fun main(args: Array<String>) {
    val matriz: Array<Array<Float>> = arrayOf(
        arrayOf(2.5f,-6.3f,14.7f,4.0f),
        arrayOf(10.8f,12.4f,-8.2f,5.5f),
        arrayOf(-7.2f,3.1f,17.7f,-9.1f)
        )

    val newMatriz = arrayOf(
        floatArrayOf(0.0f,0.0f,0.0f,0.0f,0.0f),
        floatArrayOf(0.0f,0.0f,0.0f,0.0f,0.0f),
        floatArrayOf(0.0f,0.0f,0.0f,0.0f,0.0f),
        floatArrayOf(0.0f,0.0f,0.0f,0.0f,0.0f)
    )



    imprimirPrimera(matriz)
    println()
    copia(matriz,newMatriz)
    fila(newMatriz)
    columna(newMatriz)
    imprimirSegunda(newMatriz)





}

fun imprimirSegunda(newMatriz: Array<FloatArray>) {
    for (i in newMatriz.indices){
        for (j in 0 .. newMatriz.size){
            print("[${newMatriz[i][j]}]")
        }
        println()
    }
}

fun imprimirPrimera(matriz: Array<Array<Float>>) {
    for (i in matriz.indices){
        for (j in 0.. matriz.size){
            print("[${matriz[i][j]}]")
        }
        println()
    }
}



fun copia(matriz: Array<Array<Float>>, newMatriz: Array<FloatArray>) {
    for (i in matriz.indices){
        for (j in 0 .. matriz.size){
               newMatriz[i][j] = matriz[i][j]
        }

    }

}

fun fila(newMatriz: Array<FloatArray>){

    for (i in newMatriz.indices){
        for (j in 0 ..newMatriz.size){
           if (i < 3 && j < 4  ){
               newMatriz[i][4] += newMatriz[i][j]
           }

        }
    }
}


fun columna(newMatriz: Array<FloatArray>) {

    for (i in newMatriz.indices){
        for (j in 0 ..newMatriz.size){
            var prueba = 0.0f
            if ( i < 3 && j < 4 ){
                newMatriz[3][j] += newMatriz[i][j]



            }




        }

    }
}

