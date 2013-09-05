package ar.edu.tadp.ageofempires

abstract class Atacante {

  def potencialOfensivo: Int

  def atacarA(unDefensor: Defensor): Unit = {
    if (unDefensor.potencialDefensivo < this.potencialOfensivo) {
      unDefensor.perderEnergia(this.potencialOfensivo - unDefensor.potencialDefensivo)
    }
  }

}
