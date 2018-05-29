/*
    This file is part of Peers, a java SIP softphone.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
    Copyright 2010 Yohann Martineau 
*/

package com.alianza.qa.peers.media;

import net.sourceforge.peers.media.AbstractSoundManager;
import net.sourceforge.peers.media.MediaMode;

import java.net.InetAddress;

public interface Config {
    InetAddress getLocalInetAddress();

    InetAddress getPublicInetAddress();

    String getDomain();

    MediaMode getMediaMode();

    boolean isMediaDebug();

    int getRtpPort();

    String getStorageDirectory();

    String getMediaFile();

    AbstractSoundManager getSoundManager();
}
