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


package org.dataconservancy.dcs.access.client.model;

import com.google.gwt.user.client.rpc.IsSerializable;
import org.dataconservancy.dcs.access.ui.client.model.JsModel;

/**
 * Models Data Contributor/Creator.
 */
public final class JsAssociatedWith
        extends JsModel implements IsSerializable {

    protected JsAssociatedWith() {
    }

    public String getId() {
        return getString("prov:id");
    }
    
    public String getAgentId(){
    	return ((JsRef)getObject("prov:agent")).getRef();
    }
    
    public String getActivityId(){
    	return ((JsRef)getObject("prov:activity")).getRef();
    }
    
    public String getEventType(){
    	return ((JsEventType)getObject("ext:event-type")).getContent();
    }
}