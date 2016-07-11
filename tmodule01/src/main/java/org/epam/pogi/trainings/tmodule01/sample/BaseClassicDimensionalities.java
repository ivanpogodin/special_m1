package org.epam.pogi.trainings.tmodule01.sample;

import org.epam.pogi.trainings.tmodule01.api.entity.Dimensionality;
import org.epam.pogi.trainings.tmodule01.impl.entity.MapDimensionality;

public class BaseClassicDimensionalities {
  public static Dimensionality LENGTH = new MapDimensionality( java.util.Collections.singletonMap( ClassicMeasures.LENGTH, 1 ) );
  public static Dimensionality MASS = new MapDimensionality( java.util.Collections.singletonMap( ClassicMeasures.MASS, 1 ) );
  public static Dimensionality TIME = new MapDimensionality( java.util.Collections.singletonMap( ClassicMeasures.TIME, 1 ) );
  public static Dimensionality ELECTRIC_CURRENT = new MapDimensionality(java.util.Collections.singletonMap( ClassicMeasures.ELECTRIC_CURRENT, 1 ) );
  public static Dimensionality THERMODYNAMIC_TEMPERATURE = new MapDimensionality(java.util.Collections.singletonMap( ClassicMeasures.THERMODYNAMIC_TEMPERATURE, 1 ) );
  public static Dimensionality AMOUNT_OF_SUBSTANCE = new MapDimensionality(java.util.Collections.singletonMap( ClassicMeasures.AMOUNT_OF_SUBSTANCE, 1 ) );
  public static Dimensionality LUMINOUS_INTENCITY = new MapDimensionality(java.util.Collections.singletonMap( ClassicMeasures.LUMINOUS_INTENCITY, 1 ) );

}
