package pl.szymonstankowski.demo.demoapi.model

data class Bank(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
    ) {

        // konstruktor moze byc zdefiniowany jako primary w naglowku klasy, mozna miec wiecej konstruktorow wew klasy
        // ale sa one wtedy jako secondary

        // get()=field gettery sa zaimplementowane domyslnie wiec nie trzeba ich definiowac
        // set(value){field=value} gdyby potrzebny bul setter


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Bank

        if (accountNumber != other.accountNumber) return false
        if (trust != other.trust) return false
        if (transactionFee != other.transactionFee) return false

        return true
    }

    override fun hashCode(): Int {
        var result = accountNumber.hashCode()
        result = 31 * result + trust.hashCode()
        result = 31 * result + transactionFee
        return result
    }

    override fun toString(): String {
        return "Bank(accountNumber='$accountNumber', trust=$trust, transactionFee=$transactionFee)"
    }


}