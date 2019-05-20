package imooc_liuyubo.A_02_Array


class K_Array (capacity: Int = 10){

    //数组
    private var data:IntArray = IntArray(capacity)
    //数组内的元素
    var size:Int = 0
        get() {return field}
    fun getCapacity() :Int{
        return data.size
    }

    fun isEmpty():Boolean{
        return size==0
    }






}