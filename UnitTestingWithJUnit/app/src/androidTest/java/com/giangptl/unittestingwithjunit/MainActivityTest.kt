package com.giangptl.unittestingwithjunit

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    var rule: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java, false, false)

    @Test
    fun start() {
        val intent = Intent()
        intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        rule.launchActivity(intent)
        onView(withId(R.id.btn_click_here)).perform(click())
    }

}