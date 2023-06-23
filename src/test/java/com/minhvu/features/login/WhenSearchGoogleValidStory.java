package com.minhvu.features.login;

import com.minhvu.tasks.OpenTheApplication;
import com.minhvu.tasks.Search;
import io.appium.java_client.android.nativekey.PressesKey;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
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
public class WhenSearchGoogleValidStory {
    Actor minh= Actor.named("MinhVu");

    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void minhCanBrowseTheWeb() {
        minh.can(BrowseTheWeb.with(hisBrowser));
    }

    @WithTag("SearchGoogle")
    @Test
    public void search_results_keyword_in_the_google() {
        minh.wasAbleTo(openTheApplication);
        minh.attemptsTo(Search.forTheTerm("youtube"));
        minh.wasAbleTo(Ensure.thatTheCurrentPage().currentUrl().contains("youtube"));
    }
}