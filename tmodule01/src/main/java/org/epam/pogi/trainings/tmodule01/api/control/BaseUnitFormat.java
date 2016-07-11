package org.epam.pogi.trainings.tmodule01.api.control;

import java.util.Collection;

import org.epam.pogi.trainings.tmodule01.api.entity.Unit;

public class BaseUnitFormat extends BaseCodedFormat<Unit> {

  /**
   * 
   */
  private static final long serialVersionUID = -1433054093130133666L;

  public BaseUnitFormat() {
    super();
    // TODO Auto-generated constructor stub
  }

  public BaseUnitFormat( Collection<Unit> knownMeasures ) {
    super( knownMeasures );
  }
  
  
}
