package com.martinezdputra.botcrandomizer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.martinezdputra.botcrandomizer.ui.model.Character
import com.martinezdputra.botcrandomizer.ui.model.constants.Scripts
import com.martinezdputra.botcrandomizer.ui.theme.BoTCRandomizerTheme
import com.martinezdputra.botcrandomizer.ui.screen.characterSelector.CharacterDistributionScreen
import com.martinezdputra.botcrandomizer.ui.screen.Route
import com.martinezdputra.botcrandomizer.ui.screen.characterSelector.CharacterDistributionViewModel
import com.martinezdputra.botcrandomizer.ui.screen.scriptDetail.ScriptDetailScreen
import com.martinezdputra.botcrandomizer.ui.screen.scriptDetail.ScriptDetailViewModel
import com.martinezdputra.botcrandomizer.ui.screen.scriptPicker.ScriptPickerScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoTCRandomizerTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { scaffoldPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = Route.HOME,
                        modifier = Modifier.padding(scaffoldPadding)
                    ) {
                        composable(Route.HOME) {
                            ScriptPickerScreen { script ->
                                navController.navigate(
                                    Route.SCRIPT_DETAIL + "/${script.scriptEnum.name}"
                                )
                            }
                        }
                        composable(
                            route = Route.SCRIPT_DETAIL + "/{scriptName}",
                            arguments = listOf(
                                navArgument("scriptName") {
                                    type = NavType.StringType
                                },
                            )
                        ) {
                            val scriptName = it.arguments?.getString("scriptName")!!
                            val script = Scripts.getScriptObjectFromString(scriptName)

                            val viewModel = ScriptDetailViewModel()

                            val allCharacters = script.townsfolkCharacters +
                                    script.outsiderCharacters +
                                    script.minionCharacters +
                                    script.demonCharacters

                            val charactersMap = remember {
                                mutableStateMapOf(
                                    *allCharacters.map { allCharacter ->
                                        allCharacter.character.name to false
                                    }.toTypedArray()
                                )
                            }

                            val onCharacterSelected = { character: Character ->
                                charactersMap[character.character.name] = !charactersMap.getOrDefault(character.character.name, false)
                                viewModel.onMapUpdated(charactersMap)
                            }

                            ScriptDetailScreen(
                                viewModel = viewModel,
                                script = script,
                                characterStates = charactersMap,
                                onCharacterSelected = onCharacterSelected,
                            ) {
                                val selectedChars = charactersMap.filter { (_, isSelected) ->
                                    isSelected
                                }.keys.toList()
                                val selectedCharNames = selectedChars.joinToString(separator = "&")
                                navController.navigate(
                                    Route.CHARACTER_DISTRIBUTION + "/${selectedCharNames}" + "/${script.scriptEnum.name}"
                                )
                            }
                        }
                        composable(
                            route = Route.CHARACTER_DISTRIBUTION + "/{characters}/{scriptName}",
                            arguments = listOf(
                                navArgument("characters") {
                                    type = NavType.StringType
                                },
                                navArgument("scriptName") {
                                    type = NavType.StringType
                                },
                            )
                        ) {
                            val characterNamesArgs = it.arguments?.getString("characters")!!
                            val characterNames = characterNamesArgs.split("&")

                            val scriptName = it.arguments?.getString("scriptName")!!
                            val script = Scripts.getScriptObjectFromString(scriptName)

                            val allSelectedCharacters = characterNames.map { characterName ->
                                Character.createCharacter(characterName)
                            }

                            val viewModel = CharacterDistributionViewModel().apply {
                                setSelectedCharacters(allSelectedCharacters)
                            }

                            viewModel.setSelectedCharacters(allSelectedCharacters)
                            CharacterDistributionScreen(
                                viewModel = viewModel,
                                script = script,
                            )
                        }
                    }
                }
            }
        }
    }
}