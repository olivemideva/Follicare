package com.example.group14

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.group14.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    fun onCreate() {
        // Obtain the FirebaseAnalytics instance.
        analytics = Firebase.analytics
    }
    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawableLayout)
        val navView : NavigationView = findViewById(R.id.navigation_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId)  {
                R.id.nav_profile -> Toast.makeText(applicationContext,"View Profile", Toast.LENGTH_SHORT).show()
                R.id.nav_Services -> Toast.makeText(applicationContext," My services", Toast.LENGTH_SHORT).show()
                R.id.nav_bookings -> Toast.makeText(applicationContext," Bookings", Toast.LENGTH_SHORT).show()
                R.id.nav_jobsdone -> Toast.makeText(applicationContext," Jobs done", Toast.LENGTH_SHORT).show()
                R.id.nav_Notifications -> Toast.makeText(applicationContext,"view Notifications",
                    Toast.LENGTH_SHORT).show()
                R.id.nav_Settings -> Toast.makeText(applicationContext,"view Settings", Toast.LENGTH_SHORT).show()
                R.id.nav_Deleteaccount -> Toast.makeText(applicationContext," Delete account",
                    Toast.LENGTH_SHORT).show()
                R.id.nav_Logout -> Toast.makeText(applicationContext,"Logout", Toast.LENGTH_SHORT).show()

            }
            true
        }

        toggle = ActionBarDrawerToggle(this, drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            when(it.itemId)  {
                R.id.nav_profile -> Toast.makeText(applicationContext,"View Profile",Toast.LENGTH_SHORT).show()
                R.id.nav_Bookappointment -> Toast.makeText(applicationContext," Book appointment",Toast.LENGTH_SHORT).show()
                R.id.nav_Mybookings -> Toast.makeText(applicationContext,"show My bookings",Toast.LENGTH_SHORT).show()
                R.id.nav_Notifications -> Toast.makeText(applicationContext,"view Notifications",Toast.LENGTH_SHORT).show()
                R.id.nav_Settings -> Toast.makeText(applicationContext,"view Settings",Toast.LENGTH_SHORT).show()
                R.id.nav_Deleteaccount -> Toast.makeText(applicationContext," Delete account",Toast.LENGTH_SHORT).show()
                R.id.nav_Logout -> Toast.makeText(applicationContext,"Logout",Toast.LENGTH_SHORT).show()

            }
            true
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}