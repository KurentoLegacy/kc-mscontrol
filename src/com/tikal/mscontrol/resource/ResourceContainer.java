package com.tikal.mscontrol.resource;

import com.tikal.mscontrol.MediaObject;
import com.tikal.mscontrol.MsControlException;

/**
 * Gathers the set of methods to control a container of media Resources.
 */
public interface ResourceContainer extends MediaObject {

	/**
	 * Request that all pending allocations/initializations are completed.
	 * 
	 * @throws java.lang.IllegalStateException
	 *             if the container has been released
	 * @throws MsControlException
	 */
	public void confirm() throws MsControlException;

}
