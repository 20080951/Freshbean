import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ie.wit.freshbean.R
import ie.wit.freshbean.adapters.BeanAdapter
import ie.wit.freshbean.main.BeanApp
import kotlinx.android.synthetic.main.fragment_purchases.view.*

class PurchasesFragment : Fragment() {
    lateinit var app: BeanApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as BeanApp
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_purchases, container, false)

        root.recyclerView.setLayoutManager(LinearLayoutManager(activity))
        root.recyclerView.adapter = BeanAdapter(app.beansStore.findAll())

        return root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            PurchasesFragment().apply {
                arguments = Bundle().apply { }
            }
    }
}