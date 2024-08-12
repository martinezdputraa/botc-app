package com.martinezdputra.botcrandomizer.ui.model.scripts

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.Character
import com.martinezdputra.botcrandomizer.ui.model.Script
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Butler
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Drunk
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Recluse
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Saint
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.Imp
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Baron
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Poisoner
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.ScarletWoman
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Spy
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters
import com.martinezdputra.botcrandomizer.ui.model.constants.Scripts
import com.martinezdputra.botcrandomizer.ui.model.constants.Scripts.TROUBLE_BREWING

class TroubleBrewing : Script {
    override val scriptNameResId: Int
        get() = R.string.script_trouble_brewing_name
    override val scriptIconResId: Int
        get() = R.drawable.ic_trouble_brewing
    override val scriptEnum: Scripts
        get() = TROUBLE_BREWING

    override val townsfolkCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.WASHERWOMAN,
            Characters.LIBRARIAN,
            Characters.INVESTIGATOR,
            Characters.CHEF,
            Characters.EMPATH,
            Characters.FORTUNE_TELLER,
            Characters.UNDERTAKER,
            Characters.MONK,
            Characters.RAVEN_KEEPER,
            Characters.VIRGIN,
            Characters.SLAYER,
            Characters.SOLDIER,
            Characters.MAYOR,
        )

    override val outsiderCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.BUTLER,
            Characters.SAINT,
            Characters.RECLUSE,
            Characters.DRUNK,
        )

    override val minionCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.POISONER,
            Characters.SPY,
            Characters.BARON,
            Characters.SCARLET_WOMAN,
        )

    override val demonCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.IMP,
        )
}