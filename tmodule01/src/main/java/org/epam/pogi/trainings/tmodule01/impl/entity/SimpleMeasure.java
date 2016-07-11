package org.epam.pogi.trainings.tmodule01.impl.entity;

import org.epam.pogi.trainings.tmodule01.api.entity.Measure;


public class SimpleMeasure extends BaseEntity implements Measure {

  public SimpleMeasure( String code, String name, String description ) {
    super( code, name, description );
  }

}
