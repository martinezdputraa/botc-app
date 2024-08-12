package com.martinezdputra.botcrandomizer.ui.model

import com.martinezdputra.botcrandomizer.ui.model.characters.EmptyCharacter
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Barber
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Butler
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Drunk
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Goon
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Klutz
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Lunatic
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Moonchild
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Mutant
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Recluse
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Saint
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.SweetHeart
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.outsider.Tinker
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Artist
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Chambermaid
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Chef
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Clockmaker
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Courtier
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Dreamer
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Empath
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Exorcist
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.FlowerGirl
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Fool
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.FortuneTeller
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Gambler
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Gossip
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Grandmother
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Innkeeper
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Investigator
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Juggler
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Librarian
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Mathematician
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Mayor
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Minstrel
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Monk
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Oracle
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Pacifist
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Philosopher
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Professor
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.RavenKeeper
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Sage
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Sailor
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Savant
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Seamstress
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Slayer
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.SnakeCharmer
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Soldier
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.TeaLady
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Towncrier
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Undertaker
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Virgin
import com.martinezdputra.botcrandomizer.ui.model.characters.blue.townsfolk.Washerwoman
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.FangGu
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.Imp
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.NoDashii
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.Po
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.Pukka
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.Shabaloth
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.Vigormortis
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.Vortox
import com.martinezdputra.botcrandomizer.ui.model.characters.red.demon.Zombuul
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Assassin
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Baron
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Cerenovus
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.DevilsAdvocate
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.EvilTwin
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Godfather
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Mastermind
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.PitHag
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Poisoner
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.ScarletWoman
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Spy
import com.martinezdputra.botcrandomizer.ui.model.characters.red.minion.Witch
import com.martinezdputra.botcrandomizer.ui.model.constants.CharacterAlignment
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters
import com.martinezdputra.botcrandomizer.ui.model.constants.Team

abstract class Character {
    companion object {
        fun createCharacters(vararg enumStrings: String) : List<Character> {
            return enumStrings.map {
                createCharacter(it)
            }
        }

        fun createCharacters(vararg enums: Characters) : List<Character> {
            return enums.map {
                createCharacter(it)
            }
        }

        fun createCharacter(enumString: String) : Character {
            return createCharacter(Characters.valueOf(enumString))
        }

        fun createCharacter(characters: Characters) : Character {
            return when(characters) {
                Characters.BUTLER -> Butler()
                Characters.DRUNK -> Drunk()
                Characters.RECLUSE -> Recluse()
                Characters.SAINT -> Saint()
                Characters.CHEF -> Chef()
                Characters.EMPATH -> Empath()
                Characters.FORTUNE_TELLER -> FortuneTeller()
                Characters.INVESTIGATOR -> Investigator()
                Characters.LIBRARIAN -> Librarian()
                Characters.MAYOR -> Mayor()
                Characters.MONK -> Monk()
                Characters.RAVEN_KEEPER -> RavenKeeper()
                Characters.SLAYER -> Slayer()
                Characters.SOLDIER -> Soldier()
                Characters.UNDERTAKER -> Undertaker()
                Characters.VIRGIN -> Virgin()
                Characters.WASHERWOMAN -> Washerwoman()
                Characters.IMP -> Imp()
                Characters.BARON -> Baron()
                Characters.POISONER -> Poisoner()
                Characters.SCARLET_WOMAN -> ScarletWoman()
                Characters.SPY -> Spy()

                Characters.ZOMBUUL -> Zombuul()
                Characters.PUKKA -> Pukka()
                Characters.SHABALOTH -> Shabaloth()
                Characters.PO -> Po()
                Characters.GRANDMOTHER -> Grandmother()
                Characters.SAILOR -> Sailor()
                Characters.CHAMBERMAID -> Chambermaid()
                Characters.EXORCIST -> Exorcist()
                Characters.INNKEEPER -> Innkeeper()
                Characters.GAMBLER -> Gambler()
                Characters.GOON -> Goon()
                Characters.LUNATIC -> Lunatic()
                Characters.TINKER -> Tinker()
                Characters.MOON_CHILD -> Moonchild()
                Characters.GODFATHER -> Godfather()
                Characters.DEVILS_ADVOCATE -> DevilsAdvocate()
                Characters.ASSASSIN -> Assassin()
                Characters.MASTERMIND -> Mastermind()
                Characters.GOSSIP -> Gossip()
                Characters.COURTIER -> Courtier()
                Characters.PROFESSOR -> Professor()
                Characters.MINSTREL -> Minstrel()
                Characters.TEA_LADY -> TeaLady()
                Characters.PACIFIST -> Pacifist()
                Characters.FOOL -> Fool()

                Characters.CLOCKMAKER -> Clockmaker()
                Characters.DREAMER -> Dreamer()
                Characters.SNAKE_CHARMER -> SnakeCharmer()
                Characters.MATHEMATICIAN -> Mathematician()
                Characters.FLOWER_GIRL -> FlowerGirl()
                Characters.TOWN_CRIER -> Towncrier()
                Characters.ORACLE -> Oracle()
                Characters.SAVANT -> Savant()
                Characters.SEAMSTRESS -> Seamstress()
                Characters.PHILOSOPHER -> Philosopher()
                Characters.ARTIST -> Artist()
                Characters.JUGGLER -> Juggler()
                Characters.SAGE -> Sage()
                Characters.MUTANT -> Mutant()
                Characters.SWEETHEART -> SweetHeart()
                Characters.BARBER -> Barber()
                Characters.KLUTZ -> Klutz()
                Characters.EVIL_TWIN -> EvilTwin()
                Characters.WITCH -> Witch()
                Characters.CERENOVUS -> Cerenovus()
                Characters.PIT_HAG -> PitHag()
                Characters.FANG_GU -> FangGu()
                Characters.VIGORMORTIS -> Vigormortis()
                Characters.NO_DASHII -> NoDashii()
                Characters.VORTOX -> Vortox()
            }
        }

        fun emptyCharacter() : Character {
            return EmptyCharacter()
        }
    }

    abstract val character: Characters

    abstract val nameResId: Int

    abstract val descriptionResId: Int

    abstract val imageResId: Int

    abstract val characterAlignment: CharacterAlignment

    abstract val team: Team
}