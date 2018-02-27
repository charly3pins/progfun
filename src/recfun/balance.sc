package recfun


object balance {
	/**
   * Exercise 2
   */
		def balance(chars: List[Char], i: Int = 0): Boolean = {
			if (chars.isEmpty || i < 0)
	      i == 0
	    else if (chars.head == '(')
	      balance(chars.tail, i + 1)
	    else if (chars.head == ')')
	      balance(chars.tail, i - 1)
	    else
	      balance(chars.tail, i)
	  }                                       //> balance: (chars: List[Char], i: Int)Boolean

	   /*
    * Test
    */
    balance("(if (zero? x) max (/ 1 x))".toList) == true
                                                  //> res0: Boolean = true
   	balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList) == true
                                                  //> res1: Boolean = true
  		balance(":-)".toList) == false    //> res2: Boolean = true
  		balance("())(".toList) == false   //> res3: Boolean = true
}