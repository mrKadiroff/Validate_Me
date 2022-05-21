package com.example.validatelib

import android.content.Context
import android.text.InputType
import android.util.Patterns
import android.widget.EditText
import android.widget.Toast

object ValidateMe {

    fun UserId(context: Context, message:String, editText: EditText){
        if (message.length >= 5) {
            if (message.isNotEmpty()){
                Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Bo'sh bo'lishi mumkin emas")
            }

        }else{
            editText.setError("Kamida 5 ta belgi va harf qatnashgan bo'lishi kerak")
        }
    }




    fun Password(context: Context, message:String, editText: EditText){
        if (message.length >= 5) {
            Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
            if (message.any { it in "!,+^" }){
                Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("!,+^ belgilarini qo'shing")

            }
        }else{
            editText.setError("8 ta belgi va harf qatnashgan bo'lishi kerak")
        }
    }


    fun ReEnterPassword(context: Context, message:String, message2:String, editText: EditText){
        if (message == message2) {
            Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
        }else{
            editText.setError("Parol bir xil emas")
        }
    }


    fun FirstName(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty()){
            Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
        }else{
            editText.setError("Bo'sh bo'lishi mumkin emas")
        }
    }


    fun LastName(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty()){
            Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
        }else{
            editText.setError("Bo'sh bo'lishi mumkin emas")
        }
    }

    fun CharSequence?.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

    fun EmailAdress(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty() || Patterns.EMAIL_ADDRESS.matcher(message).matches()){
            if (message.isEmpty()){
                Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Email noto'g'ri kiritildi")
            }
        }else{
            editText.setError("Bo'sh bo'lishi mumkin emas")
        }
    }



    fun IpAddaress(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty() || Patterns.IP_ADDRESS.matcher(message).matches()){
            if (message.isEmpty()){
                Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Ip Adress noto'g'ri kiritildi")
            }
        }else{
            editText.setError("Bo'sh bo'lishi mumkin emas")
        }
    }


    fun TelephoneNumber(context: Context, message:String, editText: EditText){
        if (message.isNotEmpty() || editText.inputType == InputType.TYPE_CLASS_NUMBER){
            if (message.length >= 12){
                Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Telefon raqam noto'g'ri kiritildi")
            }
        }else{
            editText.setError("Bo'sh bo'lishi mumkin emas")
        }
    }


    fun ZipCode(context: Context, message:String, editText: EditText){
        if (message.length >= 5) {
            if (message.isNotEmpty()){
                Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
            }else{
                editText.setError("Bo'sh bo'lishi mumkin emas")
            }

        }else{
            editText.setError("Kamida 5 ta belgi va harf qatnashgan bo'lishi kerak")
        }
    }

    fun Yearr(context: Context, message:String, editText: EditText){
        if (editText.inputType == InputType.TYPE_CLASS_NUMBER) {
            Toast.makeText(context, "Malades", Toast.LENGTH_SHORT).show()
        }else{
            editText.setError("4 ta raqam bo'lishi kerak")
        }
    }


}