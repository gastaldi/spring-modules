/* 
 * Created on Jun 22, 2005
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2005 the original author or authors.
 */
package org.springmodules.remoting.xmlrpc.support;

import org.springmodules.remoting.xmlrpc.XmlRpcElementNames;

/**
 * <p>
 * XML-RPC fault. Returned to the client when an error ocurred when invoking a
 * remote method.
 * </p>
 * 
 * @author Alex Ruiz
 * 
 * @version $Revision: 1.1 $ $Date: 2005/06/23 01:47:19 $
 */
public final class XmlRpcFault {

  /**
   * Struct containing the code and message of this fault.
   */
  private XmlRpcStruct faultStruct;

  /**
   * Constructor.
   * 
   * @param code
   *          the new code of this fault.
   * @param message
   *          the new message of this fault.
   */
  public XmlRpcFault(int code, String message) {
    super();
    this.faultStruct = new XmlRpcStruct();

    XmlRpcInteger faultCode = new XmlRpcInteger(new Integer(code));
    this.faultStruct.add(XmlRpcElementNames.FAULT_CODE, faultCode);

    XmlRpcString faultString = new XmlRpcString(message);
    this.faultStruct.add(XmlRpcElementNames.FAULT_STRING, faultString);
  }

  /**
   * Getter for field <code>{@link #faultStruct}</code>.
   * 
   * @return the field <code>faultStruct</code>.
   */
  public XmlRpcStruct getFaultStruct() {
    return this.faultStruct;
  }

}