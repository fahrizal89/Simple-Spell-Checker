package id.fahrizal.simplespellchecker.data.checker

import org.junit.Assert
import org.junit.Test

internal class SpellCheckerTest {

    @Test
    fun test1(){
        val word1="boats"
        val word2="float"
        val result = SpellChecker.minChanges(word1, word2)

        Assert.assertEquals(3, result)
    }

    @Test
    fun test2(){
        val word1="horse"
        val word2="ros"
        val result = SpellChecker.minChanges(word1, word2)

        Assert.assertEquals(3, result)
    }
    @Test
    fun test3(){
        val word1="zoologicoarchaeologist"
        val word2="zoogeologist"
        val result = SpellChecker.minChanges(word1, word2)

        Assert.assertEquals(10, result)
    }

    @Test
    fun test4(){
        val word1="zologieo"
        val word2="zogeo"
        val result = SpellChecker.minChanges(word1, word2)

        Assert.assertEquals(3, result)
    }

    @Test
    fun test5(){
        val word1="cabbages"
        val word2="rabbit"
        val result = SpellChecker.minChanges(word1, word2)

        Assert.assertEquals(5, result)
    }
}