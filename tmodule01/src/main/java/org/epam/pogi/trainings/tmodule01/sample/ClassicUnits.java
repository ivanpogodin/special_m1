package org.epam.pogi.trainings.tmodule01.sample;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.epam.pogi.trainings.tmodule01.api.entity.Measure;
import org.epam.pogi.trainings.tmodule01.api.entity.Unit;
import org.epam.pogi.trainings.tmodule01.impl.entity.SimpleUnit;

public class ClassicUnits {

  public static Unit GRAM = new SimpleUnit( "g", "gram", "1/1000 kg",
      BaseClassicDimensionalities.MASS, BigDecimal.valueOf( 0.0001 ) );

  public static Unit TON = new SimpleUnit( "t", "ton", "1000 kg",
      BaseClassicDimensionalities.MASS, BigDecimal.valueOf( 1000L ) );

  public static Set<Unit> units;
  static {
    HashSet<Unit> tmp = new HashSet<Unit>(BaseClassicUnits.units);
    tmp.add( GRAM );
    tmp.add( TON );
    units = java.util.Collections.unmodifiableSet( tmp );
  }
}
