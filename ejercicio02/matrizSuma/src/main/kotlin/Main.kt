

fun main(args: Array<String>) {
    val matriz = arrayOf(
        floatArrayOf(02.5f,-6.3f,14.7f,04.0f,0.0f),
        floatArrayOf(10.8f,12.4f,-8.2f,05.5f,0.0f),
        floatArrayOf(-7.2f,03.1f,17.7f,-9.1f,0.0f))

    val newMatriz = arrayOf(
        floatArrayOf(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f),
        floatArrayOf(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f),
        floatArrayOf(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f),
        floatArrayOf(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f))

    for (i in matriz.indices){
        for (j in matriz.indices){
            print("[${matriz[i][j]}]")
        }
        println()
    }

    copia(matriz,newMatriz)
    fila(newMatriz)
    columna(newMatriz)



    println("--------------------------------------")


    for (i in newMatriz.indices){
        for (j in newMatriz.indices){
            print("[${newMatriz[i][j]}]")
        }
        println()
    }



}



fun copia(matriz: Array<FloatArray>, newMatriz: Array<FloatArray>) {
    for (i in matriz.indices){
        for (j in matriz.indices){
           if (i < 4){
               newMatriz[i][j] = matriz[i][j]
           }



        }

    }

}

fun fila(newMatriz: Array<FloatArray>){

    for (i in newMatriz.indices){
        for (j in newMatriz.indices){
           if (j < 4){
               newMatriz[i][4] += newMatriz[i][j]
           }

        }
    }
}


fun columna(newMatriz: Array<FloatArray>) {

    for (i in newMatriz.indices){
        for (j in newMatriz.indices){
            var prueba = 0.0f
            if ( newMatriz[i][j] > 0 && j < 4 && i < 4 ){
                newMatriz[3][j] += newMatriz[i][j]
                prueba += newMatriz[i][j]


            }else if(newMatriz[i][j] < 0){
                newMatriz[3][j] -= newMatriz[i][j]
            }


        }
    }
}

