package controles


class Dni: DNIControl<String> {


        override fun numero(a: String): Boolean {
        val reg = Regex("^[1-9][0-9]{7}$")
        if (reg.matches(a))
            return true

        return false

    }


    override fun letra(a: String): String {
        TODO("Not yet implemented")
    }

}