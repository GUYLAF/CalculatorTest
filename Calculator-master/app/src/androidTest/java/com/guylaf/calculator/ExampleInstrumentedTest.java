package com.guylaf.calculator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activity = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void changeText_sameActivity() {

        onView(withId(R.id.btn5Clicked)).perform(click());
        onView(withId(R.id.Btnplus_id)).perform(click());
        onView(withId(R.id.btn4Clicked)).perform(click());
        onView(withId(R.id.Btnequal_id)).perform(click());
        // Check that the text was changed.
        onView(withId(R.id.result_id)).check(matches(withText("9")));

        onView(withId(R.id.btn1Clicked)).perform(click());
        onView(withId(R.id.btn5Clicked)).perform(click());
        onView(withId(R.id.Btnminus_id)).perform(click());
        onView(withId(R.id.btn5Clicked)).perform(click());
        onView(withId(R.id.Btnequal_id)).perform(click());
        // Check that the text was changed.
        onView(withId(R.id.result_id)).check(matches(withText("10")));
    }

}
