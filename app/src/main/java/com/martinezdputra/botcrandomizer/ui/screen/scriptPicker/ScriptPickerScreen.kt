package com.martinezdputra.botcrandomizer.ui.screen.scriptPicker

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.martinezdputra.botcrandomizer.R
import com.martinezdputra.botcrandomizer.ui.model.Script
import com.martinezdputra.botcrandomizer.ui.model.scripts.BadMoonRising
import com.martinezdputra.botcrandomizer.ui.model.scripts.SectsAndViolets
import com.martinezdputra.botcrandomizer.ui.model.scripts.TroubleBrewing
import com.martinezdputra.botcrandomizer.ui.theme.BoTCRandomizerTheme

@Composable
fun ScriptPickerScreen(
    scripts: List<Script> = listOf(
        TroubleBrewing(),
        BadMoonRising(),
        SectsAndViolets(),
    ),
    onScriptSelect: (Script) -> Unit,
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = stringResource(id = R.string.text_pick_a_script))
            Spacer(modifier = Modifier.height(8.dp))
            LazyColumn(
                modifier = Modifier.weight(1.0f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(scripts) { script ->
                    ScriptSelectionItem(
                        script = script,
                        onScriptSelect = onScriptSelect,
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier.size(64.dp),
                    painter = painterResource(id = R.drawable.ic_labor_and_play),
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    modifier = Modifier.weight(1.0f),
                    fontSize = 9.sp,
                    lineHeight = 12.sp,
                    color = Color.Gray,
                    text = stringResource(id = R.string.text_app_copyright),
                )
            }
        }

    }
}

@Composable
fun ScriptSelectionItem(
    script: Script,
    onScriptSelect: (Script) -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onScriptSelect(script)
            },
        shape = RoundedCornerShape(8.dp),
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(42.dp),
                painter = painterResource(id = script.scriptIconResId),
                contentDescription = null,
            )
            Divider(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(horizontal = 8.dp)
                    .width(1.dp),
                color = Color.Gray
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(id = script.scriptNameResId)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScriptPickerPreview() {
    BoTCRandomizerTheme {
        ScriptPickerScreen {

        }
    }
}