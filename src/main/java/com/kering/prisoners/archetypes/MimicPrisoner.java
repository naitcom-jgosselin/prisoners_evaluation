package com.kering.prisoners.archetypes;

import com.kering.prisoners.Decision;
import com.kering.prisoners.Prisoner;
import com.kering.prisoners.game.FriendOrFoeGame;

public class MimicPrisoner extends Prisoner {
    public MimicPrisoner(String name) {
        super(name);
    }

    @Override
    public Decision makesDecision(FriendOrFoeGame game) {
        throw new UnsupportedOperationException();
    }
}
