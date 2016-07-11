package org.epam.pogi.trainings.tmodule01.impl.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.epam.pogi.trainings.tmodule01.api.entity.Dimensionality;
import org.epam.pogi.trainings.tmodule01.api.entity.Measure;

public class MapDimensionality implements Dimensionality {
  Map<Measure, Integer> map;

  public MapDimensionality(Map<Measure, Integer> map) {
    this.map = new HashMap<Measure, Integer>(map);
  }

  public int getDegree( Measure measure ) {
    return map.get( measure );
  }

  public Collection<Measure> getMeasures() {
    return java.util.Collections.unmodifiableSet( map.keySet() );
  }

}
