package ie.wit.freshbean.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import ie.wit.freshbean.R
import ie.wit.freshbean.models.BeanModel
import kotlinx.android.synthetic.main.activity_beans.view.*
import kotlinx.android.synthetic.main.card_bean.view.*

class BeanAdapter constructor(private var beans: List<BeanModel>)
    : RecyclerView.Adapter<BeanAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.card_bean,
                        parent,
                        false
                )
        )
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val bean = beans[holder.adapterPosition]
        holder.bind(bean)
    }

    override fun getItemCount(): Int = beans.size

    class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(bean: BeanModel) {
            itemView.amount.text = bean.amount.toString()
            itemView.OrderType02.text = bean.orderType02
            itemView.imageIcon.setImageResource(R.mipmap.ic_launcher_round)
        }
    }
}