package org.epam.pogi.trainings.tmodule01.impl.entity;

import java.math.BigDecimal;

import org.epam.pogi.trainings.tmodule01.api.entity.Dimensionality;
import org.epam.pogi.trainings.tmodule01.api.entity.Unit;

public class SimpleUnit extends BaseEntity implements Unit {

  Dimensionality dimensionality;
  BigDecimal multiplicity;

  public SimpleUnit( String code  , String name  , String description  , Dimensionality dimensionality  , BigDecimal multiplicity   ) {
    super(code, name, description);
    this.dimensionality = dimensionality;
    this.multiplicity = multiplicity;
  }

  public Dimensionality getDimensionality() {
    return dimensionality;
  }

  public BigDecimal getMultiplicity() {
    return multiplicity;
  }


}
