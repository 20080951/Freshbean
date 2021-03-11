package ie.wit.freshbean.models

import android.util.Log


var lastId = 0L

internal fun getId(): Long {
    return lastId++
}

class BeanMemStore : BeanStore {
    val purchases = ArrayList<BeanModel>()

    override fun findAll(): List<BeanModel> {
        return purchases
    }

    override fun findById(id:Long) : BeanModel? {
        val foundBean: BeanModel? = purchases.find { it.id == id }
        return foundBean
    }

    override fun create(bean: BeanModel) {
        bean.id = getId()
        purchases.add(bean)
        logAll()
    }
    fun logAll() {
        Log.v("Purchase","** Purchases List **")
        purchases.forEach { Log.v("Purchase","${it}") }
    }
}