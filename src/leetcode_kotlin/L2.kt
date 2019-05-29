package leetcode_kotlin

class L2 {

    fun addTwoNumbers(l1:ListNode,l2:ListNode):ListNode? {
        var dummyHead = ListNode(0)

        var p:ListNode? = l1
        var q:ListNode?= l2
        var curr = dummyHead

        var carry = 0
        while(p!=null || q != null){
            var x = 0
            if(p != null) {
                x = p.value
            }
            var y = 0
            if(q != null) {
                y = q.value
            }
            var sum = carry + x + y

            println("sum:$sum carry:$carry x:$x y:$y")
            carry = sum / 10
            print("carry:$carry")
            curr.next = ListNode(sum%10)

            curr = curr.next!!
            if(p != null) {
                p = p.next
            }
            if(q!= null) {
                q = q.next
            }

            println("while ")
        }
        if (carry > 0) {
            curr.next = ListNode(carry)
        }
        return dummyHead.next
    }

}


fun main(args: Array<String>) {
    var listNode1 = ListNode(1)
    listNode1.next = ListNode(9)

    var listNode2 = ListNode(1)
    listNode2.next = ListNode(9)

    val l2 = L2()
    var listNode = l2.addTwoNumbers(listNode1, listNode2)
    println("结果：")
    while (listNode != null) {
        print(listNode.value)
        listNode = listNode.next
    }



}

class ListNode constructor(x: Int) {

    var value: Int = 0
    var next: ListNode? = null

    init {
        this.value = x
    }

}


