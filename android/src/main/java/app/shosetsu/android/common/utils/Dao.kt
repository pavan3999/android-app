package app.shosetsu.android.common.utils

/*
 * This file is part of shosetsu.
 *
 * shosetsu is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * shosetsu is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with shosetsu.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Shosetsu
 *
 * @since 08 / 07 / 2022
 * @author Doomsdayrs
 */

/**
 * Ensure the [list] is compliant to the SQL limits
 */
inline fun <T> ensureSQLSizeCompliant(list: List<T>, use: (List<T>) -> Unit) {
	if (list.size > 900)
		list.chunked(900).forEach(use)
	else use(list)
}