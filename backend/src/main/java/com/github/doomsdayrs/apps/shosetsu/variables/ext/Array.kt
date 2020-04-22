package com.github.doomsdayrs.apps.shosetsu.variables.ext

import com.github.doomsdayrs.apps.shosetsu.backend.database.room.entities.ExtensionLibraryEntity

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
 * ====================================================================
 */

/**
 * shosetsu
 * 20 / 04 / 2020
 *
 * @author github.com/doomsdayrs
 */

fun Array<ExtensionLibraryEntity>.containsName(name: String): Int {
	forEachIndexed { index, it ->
		if (it.scriptName == name) {
			return index
		}
	}
	return -1
}

fun <T> Array<T>.toArrayList(): ArrayList<T> {
	val arrayList = ArrayList<T>()
	arrayList.addAll(this)
	return arrayList
}