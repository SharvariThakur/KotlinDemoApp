package com.ndml.kotlindemoapp.kotlin_basics

class SampleClass(param1: String) {

    //lateinit keyword can be used when you want your variable to be not null and you are sure to initialize it later in the code before it's usage to avoid null checks
    lateinit var initializeLater: String

    constructor(param2: String, param3: Int) : this(param2) {
        initializeLater = param2
    }

    /*
    This is the init part and can be used to initialize all the necessary objects before performing any operations.
    init block is executed immediately after the primary constructor.
    If the class has any secondary constructor, init block will be executed before it.
     */
    init {
        initializeLater = "Initializing in init"
    }

    /*
    The variables declared in this object block belong to the class rather than the instance of the class.
    It is similar to accessing static variables in java
     */
    companion object {
        val accessMeAnywhere ="I am from SampleClass"
    }
}