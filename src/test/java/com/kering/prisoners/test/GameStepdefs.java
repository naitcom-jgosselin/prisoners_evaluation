package com.kering.prisoners.test;

import com.kering.prisoners.Prisoner;
import com.kering.prisoners.game.FriendOrFoeGame;
import com.kering.prisoners.game.GameResult;
import com.kering.prisoners.test.context.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class GameStepdefs {

    TestContext context;
    FriendOrFoeGame game;

    public GameStepdefs(TestContext context, FriendOrFoeGame game) {
        this.context = context;
        this.game = game;
    }

    @When("^(.*) and (.*) play together$")
    public void bobAndDavePlayTogether(String firstPrisoner, String secondPrisoner) {
        GameResult result = game.play(context.getPrisoner(firstPrisoner),context.getPrisoner(secondPrisoner));
        context.setLatestGameResult(result);
    }

    @Then("^there should be no winner$")
    public void thereShouldBeNoWinner() {
        GameResult result = context.getLatestGameResult();
        assertTrue(result.isDraw());
        assertTrue(result.getWinner() == null);
    }
}
