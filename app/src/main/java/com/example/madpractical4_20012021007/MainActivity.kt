package com.example.madpractical4_20012021007

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import com.example.madpractical4_20012021007.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBrowse.setOnClickListener {
            Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse("https://${binding.url.text.toString()}"))
                .apply {
                    startActivity(this)
                }
        }

        binding.buttonCall.setOnClickListener {
            Intent(Intent.ACTION_DIAL)
                .setData(Uri.parse("tel:${binding.number.text.toString()}"))
                .apply {
                    startActivity(this)
                }
        }
        binding.buttonContact.setOnClickListener {
            Intent(Intent.ACTION_VIEW)
                .setType(ContactsContract.Contacts.CONTENT_TYPE)
                .apply {
                    startActivity(this)
                }
        }
        binding.buttonCallLog.setOnClickListener {
            Intent(Intent.ACTION_VIEW)
                .setType(CallLog.Calls.CONTENT_TYPE)
                .apply {
                    startActivity(this)
                }

        }
        binding.buttonGallery.setOnClickListener {
            Intent(Intent.ACTION_VIEW)
                .setType("image/*")
                .apply {
                    startActivity(this)
                }
        }
        binding.buttonCamera.setOnClickListener {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                .apply {
                    startActivity(this)
                }
        }
        binding.buttonAlarm.setOnClickListener {
            Intent(AlarmClock.ACTION_SHOW_ALARMS)
                .apply {
                    startActivity(this)
                }
        }
    }
}