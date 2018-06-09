/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

import bisq.asset.Coin;
import bisq.asset.RegexAddressValidator;
import org.intellij.lang.annotations.Language;

/**
 * Created by will on 6/8/18 at 11:52 PM.
 * 
 * @author Will "n9Mtq4" Bresnahan
 */
public class Nano extends Coin {

    @Language("RegExp")
    private static final String NANO_REGEX = "^(nano_|xrb_)[13456789abcdefghijkmnopqrstuwxyz]{60}";

    public Nano() {
        super("Nano", "NANO", new RegexAddressValidator(NANO_REGEX));
    }

}
