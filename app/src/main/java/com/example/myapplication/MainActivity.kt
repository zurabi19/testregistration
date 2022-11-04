package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var saxeliOK:Boolean=false
        var gvariOk:Boolean=false
        var emailiOK:Boolean=false
        var paroliOk:Boolean=false


        val saxeli=findViewById<EditText>(R.id.saxeli)
        val gvari: EditText=findViewById(R.id.gvari)
        val email: EditText=findViewById(R.id.emaili)
        val paroli:EditText=findViewById(R.id.paroli)
        val registracia:Button=findViewById(R.id.registracia)

        var emailStr=email.text.toString()
        var sum=""




        registracia.setOnClickListener(){
            if (saxeli.text.toString().length>2){
                saxeliOK=true}




            if(gvari.text.toString().length>4){
                gvariOk=true}


        val emailchksign="@."

            for (i in emailStr.indices){
                if (emailStr[i]=='@'){
                    sum+="@"}
                if (emailStr[i]=='.'){
                    sum+="."}
            }
        if (emailchksign.contains(sum)){
            emailiOK=true
        }




        var HParoliOk=false
        for (i in paroli.text.toString().indices){
            if (paroli.text.toString()[i].isDigit()){
                HParoliOk=true
            }
        }
        if(paroli.text.toString().length>7&&HParoliOk){
            paroliOk=true
        }






        if (saxeliOK&&gvariOk&&emailiOK&&paroliOk) {
            Toast.makeText(this, "gilocavt", Toast.LENGTH_SHORT).show()

        }else{
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()}



        }

    }


}




