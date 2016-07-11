package org.epam.pogi.trainings.tmodule01.api.entity;

import java.util.Collection;

public interface Dimensionality  {
  int getDegree(Measure measure);
  Collection<Measure> getMeasures();
}
