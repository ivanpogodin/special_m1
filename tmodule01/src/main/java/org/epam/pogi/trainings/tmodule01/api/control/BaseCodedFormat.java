package org.epam.pogi.trainings.tmodule01.api.control;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.epam.pogi.trainings.tmodule01.api.entity.Coded;
import org.epam.pogi.trainings.tmodule01.api.entity.Measure;

public class BaseCodedFormat<CODED extends Coded> extends Format {
  /**
   * 
   */
  private static final long serialVersionUID = 2385740750735962046L;
  
  Set<CODED> knowns;
  
  public BaseCodedFormat() {
    this(null);
  }

  public BaseCodedFormat( Collection<CODED> knownMeasures ) {
    super();
    if (knownMeasures != null) {
      this.knowns = new HashSet<CODED> ( knownMeasures );
    } else {
      this.knowns = new HashSet<CODED> ();
    }
  }

  protected StringBuffer formatCoded( CODED obj, StringBuffer toAppendTo, FieldPosition pos ) {
    toAppendTo.append( obj.getCode() );
    pos.setBeginIndex( 0 );
    pos.setEndIndex( 0 );
    return toAppendTo;
  }

  public CODED parseCoded( String source, ParsePosition pos ) {
    final String sourceTrimmed = source.trim();
    final int posBegin = source.indexOf( sourceTrimmed );
    for ( CODED m : knowns ) {
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
    return formatCoded( (CODED)obj, toAppendTo, pos);
  }

  @Override
  public Object parseObject( String source, ParsePosition pos ) {
    return parseCoded(source, pos);
  }

}
