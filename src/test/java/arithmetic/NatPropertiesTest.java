package arithmetic;

import com.pholser.junit.quickcheck.generator.Size;
import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assume.assumeTrue;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitQuickcheck.class)
public class NatPropertiesTest {
    // a == a
    @Property
    public void numberEqualsSelf(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
        assertEquals(a, a);
    }

    // TODO: write your properties below
    // Put a comment before them explaining what sort of property you're testing

    //Testing Lesstan Zero True case
    @Property
    public void numberLessThanZTrueCase(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
        Nat zero = new Zero();
        Nat one = new Succ(zero);
        assertTrue(zero.lessThan(a.add(one)));
    }

    //Testing Lesstan Zero False case
    @Property
    public void numberLessThanZFalseCase(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
        Nat zero = new Zero();
        Nat zero2 = zero.multiply(a);
        assertFalse(zero.lessThan(zero2));
    }    
      //Testing Lesstan Suc True
      @Property
      public void numberLessThanSTrueCase(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
        final Nat zero = new Zero();
        final Nat two = new Succ(new Succ(zero));
        final Nat three = new Succ(two);
        final Nat six = new Succ(new Succ(new Succ(three)));
   
        assertTrue(three.lessThan(six));
      }

 //Testing Lesstan Suc False
 @Property
 public void numberLessThanSFalseCase(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
   final Nat zero = new Zero();
   final Nat two = new Succ(new Succ(zero));
   final Nat three = new Succ(two);
   final Nat six = new Succ(new Succ(new Succ(three)));

   assertFalse(six.lessThan(three));
 }    

  //Testing Lesstan Suc sameNumber
  @Property
  public void numberLessThanSFalseCaseSameNumber(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
    final Nat zero = new Zero();
    final Nat two = new Succ(new Succ(zero));
    final Nat two2 = new Succ(new Succ(a.multiply(zero)));
    assertFalse(two.lessThan(two2));
  }    
    //testing multiply zero
    @Property
    public void numberMultiple(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
           // 3 * 2
        final Nat zero = new Zero();
        assertEquals(a.multiply(zero), zero);
    }


    // testing add zero to zero
    @Property
    public void numberAdd(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
          // 2 + 3
        final Nat zero = new Zero();
        final Nat zero2 = a.multiply(zero);
        assertEquals(zero, zero.add(zero2));
    }
  
    // testing subtraction from zero and zero 
    @Property
    public void numberSubtract(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
        final Nat zero1 = new Zero();
        final Nat zero2 = a.multiply(zero1); 
        assertEquals(zero1, zero1.subtract(zero2));
    }
  
    // @Property
    // public void number(@From(NatGenerator.class) @Size(max = 10) final Nat a) {
    //     assertEquals(a, a);
    // }
  

}
