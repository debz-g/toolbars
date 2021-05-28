package com.debz.toolbars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.debz.toolbars.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//  This function is automatically called when a menu is created.By overriding it we can specify the functions of the menu items
        menuInflater.inflate(R.menu.res_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//
        when(item.itemId){
            R.id.mi_add_contact -> Toast.makeText(this,"Adding new contacts",Toast.LENGTH_SHORT).show()
            R.id.mi_settings -> Toast.makeText(this,"This page is under construction",Toast.LENGTH_SHORT).show()
            R.id.mi_favourites -> Toast.makeText(this,"Mom and Dad are enough",Toast.LENGTH_SHORT).show()
            R.id.mi_feedback -> Toast.makeText(this,"Sed its still under construction",Toast.LENGTH_SHORT).show()
            R.id.mi_close -> finish()        }
        return true
    }
}