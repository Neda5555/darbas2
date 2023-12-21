package com.example.darbas2;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testUIComponentsDisplayed() {
        // Check if UI components are displayed
        Espresso.onView(withId(R.id.editText)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.spinner)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.button)).check(matches(isDisplayed()));
        Espresso.onView(withId(R.id.textView)).check(matches(isDisplayed()));
    }





}
