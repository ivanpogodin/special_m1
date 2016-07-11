package org.epam.pogi.trainings.tmodule01.api.math;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.epam.pogi.trainings.tmodule01.api.entity.Dimensionality;
import org.epam.pogi.trainings.tmodule01.api.entity.Measure;
import org.epam.pogi.trainings.tmodule01.impl.entity.MapDimensionality;

public class DimensionalityDivision implements BinaryOperation<Dimensionality> {
  
  public Dimensionality operate( Dimensionality dividend, Dimensionality divisor ) {
    Set<Measure> measures = new HashSet<Measure>();
    measures.addAll( dividend.getMeasures() );
    measures.addAll( divisor.getMeasures() );
    Map<Measure, Integer> map = new HashMap<Measure, Integer>();
    for (Measure m : measures) {
      int dividendDegree = dividend.getDegree( m );
      int divisorDegree = divisor.getDegree( m );
      if ( dividendDegree != divisorDegree ) {
        map.put(m, dividendDegree-divisorDegree);
      }
    }
    Dimensionality result = new MapDimensionality(map);
    return result;
  }
}