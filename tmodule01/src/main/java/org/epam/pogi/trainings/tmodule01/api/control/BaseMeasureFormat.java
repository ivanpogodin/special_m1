package org.epam.pogi.trainings.tmodule01.api.control;

import java.util.Collection;

import org.epam.pogi.trainings.tmodule01.api.entity.Measure;

public class BaseMeasureFormat extends BaseCodedFormat<Measure> {

  /**
   * 
   */
  private static final long serialVersionUID = -1433054093130133666L;

  public BaseMeasureFormat() {
    super();
    // TODO Auto-generated constructor stub
  }

  public BaseMeasureFormat( Collection<Measure> knownMeasures ) {
    super( knownMeasures );
  }
  
  
}
