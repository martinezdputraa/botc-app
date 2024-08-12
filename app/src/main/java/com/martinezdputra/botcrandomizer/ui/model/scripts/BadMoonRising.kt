package com.martinezdputra.botcrandomizer.ui.model.scripts

import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.Character
import com.martinezdputra.botcrandomizer.ui.model.Script
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Butler
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Drunk
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Recluse
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Saint
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Chef
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Empath
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.FortuneTeller
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Investigator
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Librarian
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Mayor
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Monk
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.RavenKeeper
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Slayer
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Soldier
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Undertaker
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Virgin
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Washerwoman
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.Imp
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Baron
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Poisoner
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.ScarletWoman
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Spy
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters
import com.martinezdputra.botcrandomizer.ui.model.constants.Scripts

class BadMoonRising : Script {
    override val scriptNameResId: Int
        get() = R.string.script_bad_moon_rising_name
    override val scriptIconResId: Int
        get() = R.drawable.ic_bad_moon_rising
    override val scriptEnum: Scripts
        get() = Scripts.BAD_MOON_RISING

    override val townsfolkCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.GRANDMOTHER,
            Characters.SAILOR,
            Characters.CHAMBERMAID,
            Characters.EXORCIST,
            Characters.INNKEEPER,
            Characters.GAMBLER,
            Characters.GOSSIP,
            Characters.COURTIER,
            Characters.PROFESSOR,
            Characters.MINSTREL,
            Characters.TEA_LADY,
            Characters.PACIFIST,
            Characters.FOOL,
        )

    override val outsiderCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.GOON,
            Characters.LUNATIC,
            Characters.TINKER,
            Characters.MOON_CHILD,
        )

    override val minionCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.GODFATHER,
            Characters.DEVILS_ADVOCATE,
            Characters.ASSASSIN,
            Characters.MASTERMIND,
        )

    override val demonCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.ZOMBUUL,
            Characters.PUKKA,
            Characters.SHABALOTH,
            Characters.PO,
        )
}