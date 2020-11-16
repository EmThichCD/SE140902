/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuht.util.test;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import static vuht.util.MathUtility.*;

/**
 *
 * @author tuanv
 */
public class MathUtinityTest {
//@test bien ham nay thanh public static voi main()
    //ham test

    @Test
    public void getFactorial_RunsWell_ifValidArgument() {
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0));
    }
    //can test coi co nem ve ngoai le khong
    @Test(expected = SQLException.class)
    public void getFactorial_throwsException_IfInvalidArgument(){
        getFactorial(-6);
    }
    //ngoai le khong phai la value
    

}
