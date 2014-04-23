/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calc.Calc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author KrRD
 */
public class CalcTest {
    
    public CalcTest() {
    }
    @Test
public void testsumar()
{
int result = Calc.sumar(7,3);
assertEquals( 10, result);
}

 @Test
public void testrestar()
{
int result = Calc.restar(5,3);
assertEquals( 2, result);
}
}
