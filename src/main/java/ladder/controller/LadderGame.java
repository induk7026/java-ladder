package ladder.controller;

import ladder.domain.line.Height;
import ladder.domain.line.Ladder;
import ladder.domain.player.Players;
import ladder.domain.strategy.RandomPointStrategy;

import static ladder.view.InputView.*;
import static ladder.view.ResultView.*;

public class LadderGame {
    public void start() {
        Players players = inputPlayers();
        Height height = inputHeight();

        Ladder ladder = Ladder.of(players, height, new RandomPointStrategy());
        printLadderResult(players, ladder);
    }
}