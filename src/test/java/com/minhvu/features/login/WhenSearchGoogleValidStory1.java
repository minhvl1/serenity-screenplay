package com.minhvu.features.login;

import com.minhvu.tasks.OpenTheApplication;
import com.minhvu.tasks.Search;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class WhenSearchGoogleValidStory1 {
    public static final Target BUTTON_SEARCH =
            Target.the("search button")
                    .locatedBy("//textarea[@class='gLFyf']");
    Actor minh= Actor.named("MinhVu");

    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;

    @Before
    public void minhCanBrowseTheWeb() {
        minh.can(BrowseTheWeb.with(hisBrowser));
    }

    @WithTag("SearchGoogle1")
    @Test
    public void search_results_keyword_in_the_google() {

        minh.wasAbleTo(
                Open.url("https://www.google.com.vn/"),
                Click.on(BUTTON_SEARCH),
                Enter.theValue("youtube").into(BUTTON_SEARCH).thenHit(Keys.ENTER),
                Ensure.thatTheCurrentPage().currentUrl().contains("youtube")
        );

    }
}