package com.martinezdputra.botcrandomizer.ui.model

import com.martinezdputra.botcrandomizer.ui.model.constants.Team

abstract class DemonCharacter : RedCharacter() {
    override val team: Team
        get() = Team.DEMON
}