package com.Kir.ta.tests;

import com.Kir.ta.page.ShoesPage;
import org.testng.annotations.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingTests extends CommonConditions {
    @Test
    public void buyingTwoIdenticalPairs()
    {
       new ShoesPage(driver)
               .openPage()
               .chooseTheFirstPair();
    }
}
