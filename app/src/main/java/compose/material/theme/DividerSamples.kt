package compose.material.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuDefaults.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Full-width divider with padding
 */
@Composable
fun ListDivider() {
    Divider(
        modifier = Modifier.padding(horizontal = 14.dp),
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.08f)
    )
}


@Composable
fun ListDividerPadding() {
    Divider(
        modifier = Modifier.padding(20.dp),
        color = MaterialTheme.colorScheme.primary.copy(alpha = 0.09f)
    )
}