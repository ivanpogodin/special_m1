package org.epam.pogi.trainings.tmodule01.sample;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.epam.pogi.trainings.tmodule01.api.entity.Measure;
import org.epam.pogi.trainings.tmodule01.api.entity.Unit;
import org.epam.pogi.trainings.tmodule01.impl.entity.SimpleUnit;

public class BaseClassicUnits {

  public static Unit METER = new SimpleUnit( "m", "metre",
      "The distance travelled by light in vacuum in 1/299792458 second.", BaseClassicDimensionalities.LENGTH,
      BigDecimal.valueOf( 1L ) );

  public static Unit KILOGRAM = new SimpleUnit( "kg", "kilogram", "The mass of the international prototype kilogram",
      BaseClassicDimensionalities.MASS, BigDecimal.valueOf( 1L ) );

  public static Unit SECOND =
      new SimpleUnit(
          "s",
          "second",
          "The duration of 9192631770 periods of the radiation corresponding to the transition between the two hyperfine levels of the ground state of the caesium-133 atom",
          BaseClassicDimensionalities.TIME, BigDecimal.valueOf( 1L ) );

  public static Unit AMPERE =
      new SimpleUnit(
          "A",
          "ampere",
          "The constant current which, if maintained in two straight parallel conductors of infinite length, of negligible circular cross-section, and placed 1 m apart in vacuum, would produce between these conductors a force equal to 2×10−7 newtons per metre of length",
          BaseClassicDimensionalities.ELECTRIC_CURRENT, BigDecimal.valueOf( 1L ) );

  public static Unit KELVIN = new SimpleUnit( "K", "kelvin",
      "1/273.16 of the thermodynamic temperature of the triple point of water",
      BaseClassicDimensionalities.THERMODYNAMIC_TEMPERATURE, BigDecimal.valueOf( 1L ) );

  public static Unit MOLE =
      new SimpleUnit(
          "mol",
          "mole",
          "The amount of substance of a system which contains as many elementary entities as there are atoms in 0.012 kilogram of carbon-12",
          BaseClassicDimensionalities.AMOUNT_OF_SUBSTANCE, BigDecimal.valueOf( 1L ) );

  public static Unit CANDELA =
      new SimpleUnit(
          "cd",
          "candela",
          "The luminous intensity, in a given direction, of a source that emits monochromatic radiation of frequency 5.4×1014 hertz and that has a radiant intensity in that direction of 1/683 watt per steradian",
          BaseClassicDimensionalities.LUMINOUS_INTENCITY, BigDecimal.valueOf( 1L ) );

  public static Set<Unit> units;
  static {
    HashSet<Unit> tmp = new HashSet<Unit>();
    tmp.add( METER );
    tmp.add( KILOGRAM );
    tmp.add( SECOND );
    tmp.add( AMPERE );
    tmp.add( KELVIN );
    tmp.add( MOLE );
    tmp.add( CANDELA );
    units = java.util.Collections.unmodifiableSet( tmp );
  }
}
