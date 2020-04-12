package com.example.myapplication_kyohon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        data class User(val name : String, var point : Int = 0)

        fun printUsers(users : List<User>) {
            users.forEach { user ->
                print("${user.name} : ${user.point} \n")
            }
        }
        val people = listOf(User("Tarou", 100), User("Hanako"), User("Jirou", 50))
        printUsers(people)

        val age = 21
        println("You ${if (age >= 18) "can" else "can't"} vote for this election")
        val fruits = arrayOf("apple", "orange", "grape", "peach")
        println(fruits[0])

        val list = mutableListOf<String>()
        list.add("apple")
        println(list)

        val array = arrayOf("a","b","c")
        for(i in 0 until array.size) {
            print(array[i])
        }
    }
}
