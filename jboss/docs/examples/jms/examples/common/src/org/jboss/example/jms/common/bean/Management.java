/**
 * JBoss, Home of Professional Open Source
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package org.jboss.example.jms.common.bean;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

/**
 * @author <a href="mailto:ovidiu@feodorov.com">Ovidiu Feodorov</a>
 * @version <tt>$Revision: 82920 $</tt>

 * $Id: Management.java 82920 2009-01-15 17:29:45Z pgier $
 */

public interface Management extends EJBObject
{
   /**
    * It kills the VM running the node instance. Needed by the failover tests.
    */
   public void killAS() throws Exception, RemoteException;
}
