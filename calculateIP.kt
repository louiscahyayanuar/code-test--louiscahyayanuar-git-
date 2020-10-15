fun main(){
    val a1 : Int = 0
    val b1 : Int = 0
    val c1 : Int = 0
    val d1 : Int = 10
    
    val a2 : Int = 50
    val b2 : Int = 0
    val c2 : Int = 0
    val d2 : Int = 10

    val selisih : Int = (
        (
            (
                (d2*255*255*255)+
                (c2*255*255)+
                (b2*255)+
                (a2)
            )-
            (
                (d1*255*255*255)+
                (c1*255*255)+
                (b1*255)+
                (a1)
            )
        )
    )
    println("Selisih : $selisih")
}