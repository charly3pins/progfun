package recfun

object pascal {
  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1
      else pascal(c - 1, r - 1) + pascal(c, r - 1)
    }                                             //> pascal: (c: Int, r: Int)Int
    
    /*
    * Test
    */
    pascal(0,2) == 1                              //> res0: Boolean = true
    pascal(1,2) == 2                              //> res1: Boolean = true
  	  pascal(1,3) == 3                        //> res2: Boolean = true
  }