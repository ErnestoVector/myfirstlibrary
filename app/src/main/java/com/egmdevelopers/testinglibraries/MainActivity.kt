package com.egmdevelopers.testinglibraries

import android.annotation.SuppressLint
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.egmdevelopers.myfirstlibrary.LatLonDistanceCalculator
import com.egmdevelopers.myfirstlibrary.Point

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        puntos()
    }

    /********************************************************************************************************************/
    /**     ON CLICK                                                                                                    */
    /********************************************************************************************************************/
    fun onClick(view: View) {
        when (view.id) {
            R.id.fab    -> {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            }
        }
    }

    /********************************************************************************************************************/
    /**     VISTA                                                                                                       */
    /********************************************************************************************************************/
    @SuppressLint("SetTextI18n")
    private fun puntos() {
        val buenosAiresObeliscoPoint    = Point(-34.6037389, -58.3815704)
        val nycStatueOfLibertPoint      = Point(40.6892494, -74.0445004)
        val distance = LatLonDistanceCalculator.calculateDistance(buenosAiresObeliscoPoint, nycStatueOfLibertPoint)

        tvMainText.text = "Entre el Obelisco (Argentina) y la estatua de la libertad (USA) hay ${distance.toFloat()} km"
    }

    /********************************************************************************************************************/
    /**     MENU                                                                                                        */
    /********************************************************************************************************************/
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
