package ie.wit.freshbean.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ie.wit.freshbean.R
import ie.wit.freshbean.main.BeanApp
import ie.wit.freshbean.models.BeanModel
import kotlinx.android.synthetic.main.activity_beans.*


class Beans : AppCompatActivity() {
    var totalPurchase = 0
    lateinit var app: BeanApp

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beans)
        app = this.application as BeanApp

    btnAdd01.setOnClickListener{
        price.text = number.text
    }

        purchaseButton.setOnClickListener {

        val amount = if (price.text.isNotEmpty())
                price.text.toString().toInt() else 0
                    val orderType02 = if (orderType02.checkedRadioButtonId == R.id.ground02) "Badger and Dodo, Ground " else "Badger and Dodo Whole"
            totalPurchase += amount
                totalSoFar.text = "$$totalPurchase"

                app.beansStore.create(BeanModel(orderType02 = orderType02, amount = amount))


        }
    }

}

