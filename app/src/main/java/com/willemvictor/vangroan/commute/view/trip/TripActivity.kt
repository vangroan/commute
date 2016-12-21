package com.willemvictor.vangroan.commute.view.trip

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.willemvictor.vangroan.commute.R
import kotlinx.android.synthetic.main.activity_trip.*

class TripActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trip)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_trip, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.action_add -> onSaveClick()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun onSaveClick() {
        finish()
    }
}
