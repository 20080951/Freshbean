package ie.wit.freshbean.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ie.wit.freshbean.R
import ie.wit.freshbean.main.BeanApp
import ie.wit.freshbean.models.BeanModel
import kotlinx.android.synthetic.main.fragment_beans.*
import kotlinx.android.synthetic.main.fragment_beans.view.*






class BeansFragment : Fragment() {
    var totalPurchase = 0
lateinit var app: BeanApp


    override fun onCreate(savedInstanceState: Bundle?) {
        app = activity?.application as BeanApp
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_beans, container, false)
        activity?.title = getString(R.string.action_beans)

        root.btnAdd01.setOnClickListener{
                price.text = number.text
            }
        setButtonListener(root)
        return root;


    }

    companion object {
        @JvmStatic
        fun newInstance() =
            BeansFragment().apply {
                arguments = Bundle().apply {}
            }
    }


    fun setButtonListener(layout: View) {

        layout.purchaseButton.setOnClickListener{
            val amount = if(layout.price.text.isNotEmpty())
                layout.price.text.toString().toInt() else{0}

            val orderType02 = if(layout.orderType02.checkedRadioButtonId == R.id.ground02) "Badger and Dodo, GROUND" else "Badegr and Dodo, WHOLE"

            totalPurchase += amount
            layout.totalSoFar.text = "$$totalPurchase"

            app.beansStore.create(BeanModel(orderType02 = orderType02, amount = amount))
        }

    }
}