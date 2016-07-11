package org.epam.pogi.trainings.tmodule01.api.control;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.epam.pogi.trainings.tmodule01.api.entity.Measure;

public class BaseMeasureFormat extends Format {
  /**
   * 
   */
  private static final long serialVersionUID = 2385740750735962046L;
  
  Set<Measure> knownMeasures;
  
  public BaseMeasureFormat() {
    this(null);
  }

  public BaseMeasureFormat( Collection<Measure> knownMeasures ) {
    super();
    if (knownMeasures != null) {
      this.knownMeasures = new HashSet<Measure> ( knownMeasures );
    } else {
      this.knownMeasures = new HashSet<Measure> ();
    }
  }

  public StringBuffer formatMeasure( Measure obj, StringBuffer toAppendTo, FieldPosition pos ) {
    toAppendTo.append( obj.getCode() );
    pos.setBeginIndex( 0 );
    pos.setEndIndex( 0 );
    return toAppendTo;
  }

  public Measure parseMeasure( String source, ParsePosition pos ) {
    final String sourceTrimmed = source.trim();
    final int posBegin = source.indexOf( sourceTrimmed );
    for ( Measure m : knownMeasures ) {
      final String code = m.getCode();
      if (sourceTrimmed.startsWith( code ) ) {
        pos.setIndex( posBegin + code.length() );
        return m;
      }
    }
    pos.setIndex( posBegin );
    return null;
  }

  @Override
  public StringBuffer format( Object obj, StringBuffer toAppendTo, FieldPosition pos ) {
    if ( !( obj instanceof Measure ) ) {
      throw new IllegalArgumentException();
    }
    return formatMeasure( (Measure)obj, toAppendTo, pos);
  }

  @Override
  public Object parseObject( String source, ParsePosition pos ) {
    return parseMeasure(source, pos);
  }

}
