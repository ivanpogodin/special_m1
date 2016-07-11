package org.epam.pogi.trainings.tmodule01.impl.entity;

import org.epam.pogi.trainings.tmodule01.api.entity.Coded;
import org.epam.pogi.trainings.tmodule01.api.entity.Descripted;
import org.epam.pogi.trainings.tmodule01.api.entity.Named;

public class BaseEntity implements Coded, Named, Descripted {

  String code;
  String name;
  String description;

  public BaseEntity( String code , String name , String description ) {
    super();
    this.code = code;
    this.name = name;
    this.description = description;
  }
  public String getCode() {
    return code;
  }
  public String getName() {
    return name;
  }
  public String getDescription() {
    return description;
  }

}
