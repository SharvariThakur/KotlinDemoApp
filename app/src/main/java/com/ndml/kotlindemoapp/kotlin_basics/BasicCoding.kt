class BasicCoding {

    fun variables() {
        //Defining Variables
        /*
    * In Kotlin  variables are defined using var and val keywords.
    * Although type of variable can be defined it is not mandatory to specify the type.
    * Kotlin identifies the type on it's own
    * */

        //var - values can be changed
        var variable = "Variable 1"
        //specifying type explicitly
        var fullName: String = "Akshay"
        //changing the value
        fullName = "Sharvari"
        //? operator is used for making the variable nullable. i.e it can accept null vales.
        var fName: String? = null
        //If we don't use ? and try to assign null value to the variable, IDE will show compile time error (Uncomment the below line to test it)
        //var lName: String = null

        //val - values once defined cannot be changed.
        val mValue = "Non changable"
        //If we try to assign different value to the variable, IDE will show compile time error  (Uncomment the below line to test it)
        //mValue="Change value"
    }

}