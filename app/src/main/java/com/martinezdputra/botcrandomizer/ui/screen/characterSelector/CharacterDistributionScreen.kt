package com.martinezdputra.botcrandomizer.ui.screen.characterSelector

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.Character
import com.martinezdputra.botcrandomizer.ui.model.Script
import com.martinezdputra.botcrandomizer.ui.model.constants.CharacterAlignment.BLUE
import com.martinezdputra.botcrandomizer.ui.model.constants.CharacterAlignment.RED
import com.martinezdputra.botcrandomizer.ui.model.constants.Characters
import com.martinezdputra.botcrandomizer.ui.model.scripts.TroubleBrewing
import com.martinezdputra.botcrandomizer.ui.screen.scriptDetail.CharacterCard
import com.martinezdputra.botcrandomizer.ui.theme.BoTCRandomizerTheme

@Composable
fun CharacterDistributionScreen(
    viewModel: CharacterDistributionViewModel,
    script: Script,
) {
    val screenState by viewModel.screenState.collectAsState()
    val currentPlayersCharacter by viewModel.currentPlayersCharacter.collectAsState()
    val playerOrderNumber by viewModel.currentPlayerOrderNumber.collectAsState()
    val summaryRevealed by viewModel.summaryRevealed.collectAsState()

    when (screenState) {
        CharacterDistributionState.PREVIEW -> GamePreviewScreen(
            script = script,
            allCharacters = viewModel.allSelectedCharacters,
            onBeginRoleDistributionButtonClicked = viewModel::onBeginRoleDistributionButtonClicked
        )

        CharacterDistributionState.SELECTION_HIDDEN -> CurrentPlayersCharacterCard(
            playerNumber = playerOrderNumber,
            character = currentPlayersCharacter,
            isRevealed = false,
            onActionButtonClicked = viewModel::showCurrentPlayersCharacter
        )

        CharacterDistributionState.SELECTION_REVEALED -> CurrentPlayersCharacterCard(
            playerNumber = playerOrderNumber,
            character = currentPlayersCharacter,
            isRevealed = true,
            onActionButtonClicked = viewModel::prepareCurrentPlayersCharacter
        )

        CharacterDistributionState.SUMMARY -> CharacterDistributionSummaryScreen(
            charactersSummary = viewModel.assignedCharacters,
            summaryRevealed = summaryRevealed,
            onShowSummary = viewModel::revealSummary,
        )
    }
}

@Composable
fun CharacterDistributionSummaryScreen(
    charactersSummary: List<Character>,
    summaryRevealed: Boolean,
    onShowSummary: () -> Unit,
) {
    if (!summaryRevealed) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = stringResource(id = R.string.text_distribution_finished)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onShowSummary
            ) {
                Text(text = stringResource(id = R.string.text_show_summary))
            }
        }
    } else {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                Text(
                    fontWeight = FontWeight.Medium,
                    text = stringResource(id = R.string.text_character_distribution_summary),
                )
            }
            itemsIndexed(charactersSummary) { index, character ->
                CharacterCard(
                    character = character,
                    playerOrder = (index + 1),
                )
            }
        }
    }
}

@Composable
fun CurrentPlayersCharacterCard(
    playerNumber: Int,
    character: Character,
    isRevealed: Boolean,
    onActionButtonClicked: () -> Unit = {},
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val characterColor = if (!isRevealed) Color.Gray else when (character.characterAlignment) {
            RED -> colorResource(R.color.red_team_color)
            BLUE -> colorResource(R.color.blue_team_color)
        }

        val characterIconResId = if (!isRevealed)
            R.drawable.ic_amnesiac
        else
            character.imageResId

        val characterName = if (!isRevealed)
            "..."
        else
            stringResource(character.nameResId)

        Text(text = stringResource(id = R.string.text_hi_player_number, playerNumber.toString()))
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            modifier = Modifier
                .size(250.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    shape = CircleShape,
                    color = characterColor,
                ),
            painter = painterResource(id = characterIconResId),
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            color = characterColor,
            text = stringResource(id = R.string.text_you_are_the_character, characterName),
        )
        Divider(
            modifier = Modifier
                .padding(vertical = 8.dp)
                .height(1.dp)
        )

        if (isRevealed) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = R.string.text_warning),
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(id = R.string.text_make_sure_to_press_button),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light,
            )
            Spacer(modifier = Modifier.height(8.dp))
        }

        val actionButtonText = stringResource(
            id = if (!isRevealed) R.string.text_show_your_character
            else R.string.text_hide_your_character
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = onActionButtonClicked,
        ) {
            Text(text = actionButtonText)
        }
    }
}

@Composable
fun GamePreviewScreen(
    script: Script,
    allCharacters: List<Character>,
    onBeginRoleDistributionButtonClicked: () -> Unit,
) {
    val groupedCharacters = allCharacters.groupBy {
        it.team
    }.toSortedMap(compareBy {
        it.ordinalValue
    })

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier.padding(
                horizontal = 16.dp,
                vertical = 8.dp
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = script.scriptIconResId),
                contentDescription = null,
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                modifier = Modifier.weight(1.0f),
                fontSize = 16.sp,
                text = stringResource(id = R.string.text_these_are_the_selected_characters)
            )
        }

        Divider(
            modifier = Modifier.fillMaxWidth()
        )

        LazyVerticalGrid(
            modifier = Modifier
                .weight(1.0f)
                .padding(
                    horizontal = 16.dp,
                    vertical = 8.dp
                ),
            columns = GridCells.Fixed(4),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            groupedCharacters.forEach { (team, characters) ->
                item(span = { GridItemSpan(maxLineSpan) }) {
                    Text(
                        text = team.name,
                        fontSize = 10.sp,
                    )
                }
                items(characters) { character ->
                    CharacterIconCard(character = character)
                }
            }
        }

        Divider(
            modifier = Modifier.fillMaxWidth()
        )

        Column(
            modifier = Modifier.padding(
                horizontal = 16.dp,
                vertical = 8.dp,
            )
        ) {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = R.string.text_whenever_youre_ready),
                textAlign = TextAlign.Center,
                fontSize = 10.sp,
                fontWeight = FontWeight.Light
            )

            Button(
                onClick = onBeginRoleDistributionButtonClicked,
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(text = stringResource(id = R.string.text_begin_character_distribution))
            }
        }


    }


}

@Composable
fun CharacterIconCard(
    character: Character
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.size(64.dp),
                painter = painterResource(id = character.imageResId),
                contentDescription = null,
            )
            Text(
                text = stringResource(id = character.nameResId),
                textAlign = TextAlign.Center,
                fontSize = 9.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    BoTCRandomizerTheme {
//        CurrentPlayersCharacterCard(
//            playerNumber = 5,
//            character = Character.emptyCharacter(),
//            isRevealed = false,
//            onActionButtonClicked = {},
//        )
        GamePreviewScreen(
            TroubleBrewing(),
            listOf(
                Character.createCharacter(Characters.SAGE),
                Character.createCharacter(Characters.SAGE),
                Character.createCharacter(Characters.SAGE),
                Character.createCharacter(Characters.SAGE),
                Character.createCharacter(Characters.DRUNK),
                Character.createCharacter(Characters.DRUNK),
                Character.createCharacter(Characters.DRUNK),
                Character.createCharacter(Characters.DRUNK),
                Character.createCharacter(Characters.ASSASSIN),
                Character.createCharacter(Characters.ASSASSIN),
                Character.createCharacter(Characters.ASSASSIN),
                Character.createCharacter(Characters.ASSASSIN),
                Character.createCharacter(Characters.PO),
            ),
            {}
        )
    }
}