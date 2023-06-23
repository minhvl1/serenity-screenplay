package com.minhvu.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchBox {
    public static final Target BUTTON_SEARCH =
            Target.the("search button")
                    .locatedBy("//textarea[@class='gLFyf']");
}
