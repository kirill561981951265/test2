package com.kir.ta.tests;

import com.kir.ta.page.ShoesPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static net.bytebuddy.matcher.ElementMatchers.is;

public class ShoppingTests extends CommonConditions {



    @Test
     public void kiringChosePair()
    {
        Assertions.assertThat(new ShoesPage(driver)
                .openPage()
                .chooseTheFirstPair1());
    }


    @Test
    public void kiringChoseCoast()
    {
        assertThat(new ShoesPage(driver)
                .openPage()
                .chooseTheCoast());
    }

    @Test
    public void kiringChochooseTheCitys()
    {
        assertThat(new ShoesPage(driver)
                .openPage()
                .chooseTheCity());
    }
}

