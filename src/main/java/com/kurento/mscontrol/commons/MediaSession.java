/*
 * Kurento Commons MSControl: Simplified Media Control API for the Java Platform based on jsr309
 * Copyright (C) 2011  Tikal Technologies
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.kurento.mscontrol.commons;

import com.kurento.commons.config.Parameters;
import com.kurento.mscontrol.commons.mediacomponent.MediaComponent;
import com.kurento.mscontrol.commons.mediamixer.MediaMixer;
import com.kurento.mscontrol.commons.networkconnection.NetworkConnection;

/**
 * A MediaSession is a container and factory for media objects. It handles the
 * cleanup on <code>release()</code>.
 * 
 * @author mparis
 * 
 */
public interface MediaSession extends MediaObject {

	/**
	 * Create a NetworkConnection.
	 * 
	 * @return a NetworkConnection
	 * @throws MsControlException
	 */
	public NetworkConnection createNetworkConnection() throws MsControlException;

	/**
	 * Create a NetworkConnection.
	 * 
	 * @param predefinedConfig
	 *            Defines the configuration of the NetworkConnection.
	 * @return a NetworkConnection
	 * @throws MsControlException
	 */
	public NetworkConnection createNetworkConnection(
			Configuration<NetworkConnection> predefinedConfig)
			throws MsControlException;

	/**
	 * </p> Create a MediaComponent.
	 * 
	 * @param predefinedConfig
	 *            Defines the concrete MediaComponent to create. <br>
	 *            The list of predefined Configurations is dependent on the
	 *            implementation.
	 * @param params
	 *            Parameters to create a MediaComponent. The possible parameters
	 *            for each concrete component must be defined on the
	 *            implementation.
	 * @return a MediaComponent
	 * @throws MsControlException
	 */
	public MediaComponent createMediaComponent(Configuration<MediaComponent> predefinedConfig,
			Parameters params) throws MsControlException;

	/**
	 * Create a MediaMixer.
	 * 
	 * @param predefinedConfig
	 *            Defines the set of resources in the MediaMixer, and their
	 *            arrangement. See MediaMixer for the list of predefined
	 *            Configurations.
	 * @param params
	 *            Customization parameters, like MediaObject.MEDIAOBJECT_ID, or
	 *            MediaMixer.MAX_PORTS.
	 * @return a MediaMixer Throws: MsControlException
	 */
	public MediaMixer createMediaMixer(Configuration<MediaMixer> predefinedConfig,
			Parameters params)
			throws MsControlException;

	/**
	 * Create a MediaMixer.
	 * 
	 * @return a MediaMixer Throws: MsControlException
	 */
	public MediaMixer createMediaMixer() throws MsControlException;
}
