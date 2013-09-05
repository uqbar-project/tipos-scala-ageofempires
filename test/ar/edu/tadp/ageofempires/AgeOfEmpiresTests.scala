package ar.edu.tadp.ageofempires

import org.junit.Test
import org.junit.Before
import org.junit.Assert._

class AgeOfEmpiresTests {
  
  var guerrero:Guerrero = null
  var espadachin:Espadachin = null
  var misil:Misil = null
  
  @Before
  def setUp() = {
    guerrero = new Guerrero(30, 20)
    espadachin = new Espadachin(20, 20, 0.5, new Espada(20))
    misil = new Misil
  }
  
  @Test
  def unGuerreroAtacaAUnEspadachin() = {
    guerrero.atacarA(espadachin)
    assertEquals(espadachin.energia, 90)
  }
  
  @Test
  def potencialOfensivoEspadachin() = {
    assertEquals(espadachin.potencialOfensivo, 30)
  }
  
  @Test
  def unEspadachinAtacaAUnGuerrero() = {
    espadachin.atacarA(guerrero)
    assertEquals(guerrero.energia, 90)
  }
  
  @Test
  def unMisilAtacaAUnGuerrero() = {
    misil.atacarA(guerrero)
    assertEquals(guerrero.energia, 0)
  }
  
}