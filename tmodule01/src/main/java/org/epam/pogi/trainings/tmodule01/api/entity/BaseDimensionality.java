package org.epam.pogi.trainings.tmodule01.api.entity;

import java.util.Collection;
import java.util.HashSet;

public abstract class BaseDimensionality implements Dimensionality {

  @Override
  public int hashCode() {
    //TODO improve this method
    return this.getMeasures().size();
  }

  public boolean equals( Object obj ) {
    if ( obj == null ) {
      return false;
    }
    if ( !( obj instanceof Dimensionality ) ){
      return false;
    }
    Dimensionality d2 = (Dimensionality)obj;
    Collection<Measure> m0 = this.getMeasures();
    Collection<Measure> m1 = new HashSet<Measure> (d2.getMeasures());
    
    for (Measure m : m0 ){
      if (this.getDegree( m ) != d2.getDegree( m )) {
        return false;
      }
      m1.remove( m );
    }
    for (Measure m : m1 ){
      if (this.getDegree( m ) != d2.getDegree( m )) {
        return false;
      }
    }
    return true;
  }

}
