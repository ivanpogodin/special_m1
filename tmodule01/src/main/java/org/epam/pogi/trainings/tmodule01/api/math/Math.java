package org.epam.pogi.trainings.tmodule01.api.math;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.epam.pogi.trainings.tmodule01.api.entity.Dimensionality;
import org.epam.pogi.trainings.tmodule01.api.entity.Measure;
import org.epam.pogi.trainings.tmodule01.api.entity.Unit;
import org.epam.pogi.trainings.tmodule01.impl.entity.MapDimensionality;
import org.epam.pogi.trainings.tmodule01.impl.entity.SimpleUnit;

public class Math {
  public Math() {
  }
  
  private class DimensionalityDivision implements BinaryOperation<Dimensionality> {
    
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
  private class DimensionalityMutiplication implements BinaryOperation<Dimensionality> {
    
    public Dimensionality operate( Dimensionality dividend, Dimensionality divisor ) {
      Set<Measure> measures = new HashSet<Measure>();
      measures.addAll( dividend.getMeasures() );
      measures.addAll( divisor.getMeasures() );
      Map<Measure, Integer> map = new HashMap<Measure, Integer>();
      for (Measure m : measures) {
        int dividendDegree = dividend.getDegree( m );
        int divisorDegree = divisor.getDegree( m );
        if ( dividendDegree != -divisorDegree ) {
          map.put(m, dividendDegree+divisorDegree);
        }
      }
      Dimensionality result = new MapDimensionality(map);
      return result;
    }
  }

  private class UnitDivision implements BinaryOperation<Unit> {

    public Unit operate( Unit dividend, Unit divisor ) {
      Set<Measure> measures = new HashSet<Measure>();
      final Dimensionality dividendDimensionality = dividend.getDimensionality();
      measures.addAll( dividendDimensionality.getMeasures() );
      final Dimensionality divisorDimensionality = divisor.getDimensionality();
      measures.addAll( divisorDimensionality.getMeasures() );
      
      Dimensionality newDimensionality = (new DimensionalityDivision()).operate( dividendDimensionality, divisorDimensionality );
      BigDecimal newMutiplicity = dividend.getMultiplicity().divide( divisor.getMultiplicity() ); 
      SimpleUnit result = new SimpleUnit("( " + dividend.getCode() + " / " + divisor.getCode() + " )", "calculated unit", "", newDimensionality, newMutiplicity);
      return result;
    }
  }

}
