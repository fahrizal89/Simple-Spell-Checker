package id.fahrizal.simplespellchecker.data.checker

import kotlin.math.min

object SpellChecker {

    fun minChanges(word1: String, word2: String): Int {
        val dp = ArrayList<IntArray>()
        val w1 = " $word1"
        val w2 = " $word2"
        for(i in w1.indices){
            val x = IntArray(w2.length)
            x[0]=i
            dp.add(x)
        }

        for(y in w1.indices){
            val chr1 = w1[y]

            for (x in 1 until w2.length){
                if(y == 0){
                    //initialize min distance for x = 0
                    dp[0][x] = x
                    continue
                }

                //find the minimum changes
                //chr2 = w2[x], corner = dp[y-1][x-1], top = dp[y-1][x], left= dp[y][x-1]
                if(chr1 != w2[x]){
                    val minimum = min(min(dp[y-1][x], dp[y][x-1]), dp[y-1][x-1])
                    dp[y][x]= 1+ minimum
                }
                else{
                    dp[y][x]= dp[y-1][x-1]
                }
            }
        }

        return dp.last().last()
    }
}
