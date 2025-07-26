/**
 * JBoss, Home of Professional Open Source
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package org.jboss.example.jms.common.bean;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

/**
 * @author <a href="mailto:ovidiu@feodorov.com">Ovidiu Feodorov</a>
 * @version <tt>$Revision: 82920 $</tt>

 * $Id: ManagementHome.java 82920 2009-01-15 17:29:45Z pgier $
 */

public interface ManagementHome extends EJBHome
{
   public Management create() throws RemoteException, CreateException;
}
