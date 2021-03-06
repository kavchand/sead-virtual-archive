/*
 * Copyright 2014 The Trustees of Indiana University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dataconservancy.dcs.access.client.event;

import com.google.web.bindery.event.shared.Event;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;

public class ROEditEvent extends Event<ROEditEvent.Handler> {

    /**
     * Implemented by methods that handle MessageReceivedEvent events.
     */
    public interface Handler {
        void onMessageReceived(ROEditEvent event);
    }

    private static final Type<Handler> TYPE =
        new Type<Handler>();


    public static HandlerRegistration register(EventBus eventBus,
    		ROEditEvent.Handler handler) {
      return eventBus.addHandler(TYPE, handler);
    }

   // private final JsDcp dcp;
    private final  boolean setOpen;
    private final String sipPath;

    public ROEditEvent(/*JsDcp dcp,*/ boolean setOpen, String sipPath) {
      /*  this.dcp = dcp;*/
        this.setOpen = setOpen;
        this.sipPath = sipPath;
    }

    @Override
    public Type<Handler> getAssociatedType() {
        return TYPE;
    }

    /*public JsDcp getDcp() {
        return dcp;
    }*/

    @Override
    protected void dispatch(Handler handler) {
        handler.onMessageReceived(this);
    }

	public boolean isSetOpen() {
		return setOpen;
	}

	public String getSipPath() {
		return sipPath;
	}
}