package com.example.madpractical4_20012021007

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.core.view.WindowCompat
import com.example.madpractical4_20012021007.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number :Long = 9998445018

        val buttonBrowse = findViewById<Button>(R.id.button_browse)
//
//        val editText1 = findViewById<EditText>(R.id.edit_text_web_url)
        buttonBrowse.setOnClickListener {
//            val editText1 = findViewById<TextInputEditText>(R.id.edit_text_web_url)
//        val url = editText1.text
            Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://sites.google.com/ganpatuniversity.ac.in/mad/home")).apply { startActivity(this) }
        }

        val buttonCall = findViewById<Button>(R.id.button_Call)

        buttonCall.setOnClickListener {
//            val editText2 = findViewById<TextInputEditText>(R.id.edit_text_call_number)
//            val number = editText2.text.toString()
            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:9724670034")).apply { startActivity(this) }
        }

        val buttoncontact = findViewById<Button>(R.id.button_Contact)
        buttoncontact.setOnClickListener { 
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).apply { startActivity(this) }
        }

        val buttoncalllog = findViewById<Button>(R.id.button_Call_Log)
        buttoncalllog.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply { startActivity(this) }
        }

        val buttongallery = findViewById<Button>(R.id.button_Gallery)
        buttongallery.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType("image/*").apply { startActivity(this) }
        }

        val buttoncamera = findViewById<Button>(R.id.button_Camera)
        buttoncamera.setOnClickListener {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply { startActivity(this) }
        }

        val buttonalarm = findViewById<Button>(R.id.button_Alarm)
        buttonalarm.setOnClickListener {
            Intent(AlarmClock.ACTION_SET_ALARM).apply { startActivity(this) }

//            intent.putExtra(AlarmClock.EXTRA_HOUR,parts[0])
//            intent.putExtra(AlarmClock.EXTRA_MINUTES,parts[1])

        }
    }
}
