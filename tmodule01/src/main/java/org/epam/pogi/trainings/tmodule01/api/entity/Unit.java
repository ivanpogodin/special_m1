package org.epam.pogi.trainings.tmodule01.api.entity;

import java.math.BigDecimal;

public interface Unit extends Coded, Named, Descripted {

  Dimensionality getDimensionality();
  
  BigDecimal getMultiplicity();

}
