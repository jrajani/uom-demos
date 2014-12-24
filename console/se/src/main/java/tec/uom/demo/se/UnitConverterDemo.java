package tec.uom.demo.se;

import static tec.uom.se.util.SI.*;
import static tec.uom.se.util.SIPrefix.*;

import java.math.BigInteger;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.UnitConverter;
import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;

import tec.uom.se.function.RationalConverter;
import tec.uom.se.quantity.Quantities;

public class UnitConverterDemo {

	public static void main(String[] args) {
		UnitConverter c1 = new RationalConverter(1, 10^2);
		UnitConverter c2 = new RationalConverter( BigInteger.ONE, BigInteger.TEN.pow(2));
		Unit<Length> sourceUnit = METRE;
		Unit<Length> targetUnit = CENTI(METRE);
		UnitConverter converter = sourceUnit.getConverterTo(targetUnit);
		double length1 = 4.0;
		double length2 = 6.0;
		double result1 = converter.convert(length1);
		double result2 = converter.convert(length2);
		System.out.println(result1);
		System.out.println(result2);
//		Quantity<Length> quantLength1 = Quantities.getQuantity(4.0, sourceUnit);
//		Quantity<Length> quantLength2 = Quantities.getQuantity(6.0, targetUnit);
//		Quantity<Length> quantResult1 = quantLength1.to(targetUnit);
//		System.out.println(quantResult1);
//		
//		double mass1 = 5.0;
//		double result3 = converter.convert(mass1); // does compile
//		System.out.println(result3);
//		Quantity<Mass> quantMass1 = Quantities.getQuantity(5.0, KILOGRAM);
		//quantMass1.to(targetUnit); // won't compile
 	}
}
