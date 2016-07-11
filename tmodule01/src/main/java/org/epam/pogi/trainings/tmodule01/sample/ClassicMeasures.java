package org.epam.pogi.trainings.tmodule01.sample;

import java.util.HashSet;
import java.util.Set;

import org.epam.pogi.trainings.tmodule01.api.entity.Measure;
import org.epam.pogi.trainings.tmodule01.impl.entity.SimpleMeasure;

public class ClassicMeasures {
  private enum C {
    L,
    M,
    T,
    I,
    Θ,
    N,
    J
  }
  public static Measure LENGTH = new SimpleMeasure(C.L.toString(), "Length", "Linear measurements");
  public static Measure MASS = new SimpleMeasure(C.M.toString(), "Mass", "Weight measurements");
  public static Measure TIME = new SimpleMeasure(C.T.toString(), "Time", "Linear measurements");
  public static Measure ELECTRIC_CURRENT = new SimpleMeasure(C.I.toString(), "Electric current", "Linear measurements");
  public static Measure THERMODYNAMIC_TEMPERATURE = new SimpleMeasure(C.Θ.toString(), "Thermodynamic temperature", "Linear measurements");
  public static Measure AMOUNT_OF_SUBSTANCE = new SimpleMeasure(C.N.toString(), "Length", "Amount of substance");
  public static Measure LUMINOUS_INTENCITY = new SimpleMeasure(C.J.toString(), "Length", "Luminous intencity");
  public static Set<Measure> measures;
  static {
    HashSet<Measure> tmp = new HashSet<Measure>();
    tmp.add( LENGTH );
    tmp.add( MASS );
    tmp.add( TIME );
    tmp.add( ELECTRIC_CURRENT );
    tmp.add( THERMODYNAMIC_TEMPERATURE );
    tmp.add( AMOUNT_OF_SUBSTANCE );
    tmp.add( LUMINOUS_INTENCITY );
    measures = java.util.Collections.unmodifiableSet( tmp );
  }
  

}
