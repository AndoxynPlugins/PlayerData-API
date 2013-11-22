/*
 * Copyright (C) 2013 Dabo Ross <http://www.daboross.net/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.daboross.bukkitdev.playerdata.api;

/**
 *
 * @author daboross
 */
public interface SessionData {

    /**
     * Gets the IP that was used in this session.
     *
     * @return The IP of the player during this session.
     */
    public String getIP();

    /**
     * Gets the login date for this Session.
     *
     * @return A long in milliseconds that represents the date that the player
     * logged in to this session.
     */
    public long getLoginDate();

    /**
     * Gets the logout date for this Session.
     *
     * @return A long in milliseconds that represents the date that the player
     * logged out of this session, or <code>System.currentTimeMilis()</code> if
     * the player is online and this is the latest session for that player.
     */
    public long getLogoutDate();
}