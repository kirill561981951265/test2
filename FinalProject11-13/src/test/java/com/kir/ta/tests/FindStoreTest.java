package com.kir.ta.tests;

import com.kir.ta.page.FindAStore;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static net.bytebuddy.matcher.ElementMatchers.is;

public class FindStoreTest extends CommonConditions {
    @Test
    public void findShose()
    {
        Assertions.assertThat(new FindAStore(driver)
                .openPage()
                .findAStore()).isNotNull();
    }
    @Test
    public void subskribe()
    {
        assertThat(new FindAStore(driver)
                .openPage()
                .subskribe()).isNotNull();
    }
    @Test
    public void subskribeerror() throws InterruptedException {
        assertThat(new FindAStore(driver)
                .openPage()
                .subskribeerror()).isNotNull();
    }

}