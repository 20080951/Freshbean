package ie.wit.freshbean.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ie.wit.freshbean.R
import ie.wit.freshbean.adapters.BeanAdapter
import ie.wit.freshbean.main.BeanApp
import kotlinx.android.synthetic.main.activity_purchases.*

class Purchases : AppCompatActivity(){

    lateinit var app: BeanApp


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchases)

        app = this.application as BeanApp
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.adapter = BeanAdapter(app.beansStore.findAll())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_purchases, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_beans -> { startActivity(Intent(this, Beans::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
