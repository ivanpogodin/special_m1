package org.epam.pogi.trainings.tmodule01.app;

import java.math.BigDecimal;
import java.text.ParseException;

import org.epam.pogi.trainings.tmodule01.api.control.BaseUnitFormat;
import org.epam.pogi.trainings.tmodule01.api.entity.Dimensionality;
import org.epam.pogi.trainings.tmodule01.api.entity.Unit;
import org.epam.pogi.trainings.tmodule01.sample.ClassicUnits;

public class Resolve {

  public static void main( String[] args ) {
    
    if ( args.length < 3) {
      help();
    } else {
      resolve(args);
    }

  }

  public static void resolve( String[] args )  {
    
    try {
      BaseUnitFormat unitformat = new BaseUnitFormat(ClassicUnits.units);
      BigDecimal value = new BigDecimal(args[0] );
      Unit unitFrom = (Unit)unitformat.parseObject( args[1] );
      Unit unitTo = (Unit)unitformat.parseObject( args[2] );
      final Dimensionality unitFromDim = unitFrom.getDimensionality();
      final Dimensionality unitToDim = unitTo.getDimensionality();
      if (!unitFromDim.equals( unitToDim )) {
        throw new RuntimeException("These are uncomparable units");
      }
      BigDecimal rate = value.multiply( unitFrom.getMultiplicity() ).divide( unitTo.getMultiplicity() );
      System.out.println(args[0] + " " + args[1] + " = " + rate + " " + args[2]);
    } catch ( Exception e ) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
  private static void help() {
    System.out.println("Using this application:");
    System.out.println("  this <number> <unit-from> <unit-to>");
    System.out.println("  e.g.");
    System.out.println("    this 1000 g kg");
  }

}
