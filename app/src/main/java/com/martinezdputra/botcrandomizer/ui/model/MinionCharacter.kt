package com.martinezdputra.botcrandomizer.ui.model

import com.martinezdputra.botcrandomizer.ui.model.constants.Team

abstract class MinionCharacter : RedCharacter() {
    override val team: Team
        get() = Team.MINION
}