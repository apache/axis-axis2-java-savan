/*
 * Copyright  1999-2004 The Apache Software Foundation.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.savan.eventing;

import javax.xml.namespace.QName;

public interface EventingConstants {

    String EVENTING_NAMESPACE = "http://schemas.xmlsoap.org/ws/2004/08/eventing";
    String EXTENDED_EVENTING_NAMESPACE = "http://ws.apache.org/ws/2007/05/eventing-extended";
    String EVENTING_PREFIX = "wse";
    String DEFAULT_DELIVERY_MODE =
            "http://schemas.xmlsoap.org/ws/2004/08/eventing/DeliveryModes/Push";
    String DEFAULT_FILTER_IDENTIFIER = FilterDialects.XPath;

    QName EXPIRES_QNAME = new QName(
            EventingConstants.EVENTING_NAMESPACE, EventingConstants.ElementNames.Expires);

    interface TransferedProperties {
        String SUBSCRIBER_UUID = "SAVAN_EVENTING_SUBSCRIBER_UUID";
    }

    interface ElementNames {
        String Subscribe = "Subscribe";
        String EndTo = "EndTo";
        String Delivery = "Delivery";
        String Mode = "Mode";
        String NotifyTo = "NotifyTo";
        String Expires = "Expires";
        String Filter = "Filter";
        String Dialect = "Dialect";
        String SubscribeResponse = "SubscribeResponse";
        String SubscriptionManager = "SubscriptionManager";
        String Renew = "Renew";
        String RenewResponse = "RenewResponse";
        String Identifier = "Identifier";
        String Unsubscribe = "Unsubscribe";
        String GetStatus = "GetStatus";
        String GetStatusResponse = "GetStatusResponse";
        String Topic = "topic";
    }

    interface Actions {
        String Subscribe = "http://schemas.xmlsoap.org/ws/2004/08/eventing/Subscribe";
        String SubscribeResponse =
                "http://schemas.xmlsoap.org/ws/2004/08/eventing/SubscribeResponse";
        String Renew = "http://schemas.xmlsoap.org/ws/2004/08/eventing/Renew";
        String RenewResponse = "http://schemas.xmlsoap.org/ws/2004/08/eventing/RenewResponse";
        String Unsubscribe = "http://schemas.xmlsoap.org/ws/2004/08/eventing/Unsubscribe";
        String UnsubscribeResponse =
                "http://schemas.xmlsoap.org/ws/2004/08/eventing/UnsubscribeResponse";
        String GetStatus = "http://schemas.xmlsoap.org/ws/2004/08/eventing/GetStatus";
        String GetStatusResponse =
                "http://schemas.xmlsoap.org/ws/2004/08/eventing/GetStatusResponse";
        String Publish = "http://ws.apache.org/ws/2007/05/eventing-extended/Publish";
    }

    interface Properties {
        String SOAPVersion = "SOAPVersion";
    }

    interface FilterDialects {
        String XPath = "http://www.w3.org/TR/1999/REC-xpath-19991116";
    }
}
