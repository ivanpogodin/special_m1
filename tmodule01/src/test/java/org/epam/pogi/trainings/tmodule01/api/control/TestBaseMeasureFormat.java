package org.epam.pogi.trainings.tmodule01.api.control;

import java.text.ParseException;
import java.util.Collection;
import java.util.Set;

import junit.framework.Assert;

import org.epam.pogi.trainings.tmodule01.impl.entity.SimpleMeasure;
import org.epam.pogi.trainings.tmodule01.sample.ClassicMeasures;
import org.junit.Test;
import org.epam.pogi.trainings.tmodule01.api.entity.Measure;

public class TestBaseMeasureFormat {
  @Test
  public void testFormat() {
    BaseMeasureFormat format = new BaseMeasureFormat();
    
    Assert.assertEquals( "QQ", format.format( new SimpleMeasure("QQ", "", "") ) );
    Assert.assertEquals( "L", format.format( ClassicMeasures.LENGTH ) );
    String fmt = format.format( ClassicMeasures.LENGTH );
    System.out.println("fmt=" + fmt);
    Assert.assertEquals( "L", fmt );
  }

  @Test
  public void testParse() throws ParseException {
    
    final SimpleMeasure m1 = new SimpleMeasure("asdfsdf", "", "");
    Collection<Measure> mSet = java.util.Collections.singletonList( (Measure)m1 );
    BaseMeasureFormat format = new BaseMeasureFormat(mSet);
    
    Assert.assertEquals( m1, format.parseObject( "asdfsdf" ) );
    Assert.assertEquals( m1, format.parseObject( "asdfsdf" ) );
  }
}
