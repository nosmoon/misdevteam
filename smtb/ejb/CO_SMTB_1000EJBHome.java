package chosun.ciis.co.smtb.ejb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface CO_SMTB_1000EJBHome extends EJBHome {
    public CO_SMTB_1000EJB create() throws RemoteException, CreateException;

}