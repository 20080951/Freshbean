package ie.wit.freshbean.models



interface BeanStore {
    fun findAll() : List<BeanModel>
    fun findById(id: Long) : BeanModel?
    fun create(bean: BeanModel)
}
