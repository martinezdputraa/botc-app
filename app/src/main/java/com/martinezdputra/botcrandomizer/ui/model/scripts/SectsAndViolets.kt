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

class SectsAndViolets : Script {
    override val scriptNameResId: Int
        get() = R.string.script_sects_violets_name
    override val scriptIconResId: Int
        get() = R.drawable.ic_sects_and_violets
    override val scriptEnum: Scripts
        get() = Scripts.SECTS_AND_VIOLETS

    override val townsfolkCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.CLOCKMAKER,
            Characters.DREAMER,
            Characters.SNAKE_CHARMER,
            Characters.MATHEMATICIAN,
            Characters.FLOWER_GIRL,
            Characters.TOWN_CRIER,
            Characters.ORACLE,
            Characters.SAVANT,
            Characters.SEAMSTRESS,
            Characters.PHILOSOPHER,
            Characters.ARTIST,
            Characters.JUGGLER,
            Characters.SAGE,
        )

    override val outsiderCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.MUTANT,
            Characters.SWEETHEART,
            Characters.BARBER,
            Characters.KLUTZ,
        )

    override val minionCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.EVIL_TWIN,
            Characters.WITCH,
            Characters.CERENOVUS,
            Characters.PIT_HAG,
        )

    override val demonCharacters: List<Character>
        get() = Character.createCharacters(
            Characters.FANG_GU,
            Characters.VIGORMORTIS,
            Characters.NO_DASHII,
            Characters.VORTOX,
        )
}