package chosun.ciis.co.smtb.ejb;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

import somo.framework.expt.AppException;
//import somo.framework.db.BaseDataSet;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.ds.*;
/**
 *
 */

public interface CO_SMTB_1000EJB extends javax.ejb.EJBObject 
{
	CO_SMTB_1020_UDataSet co_smtb_1020_u(CO_SMTB_1020_UDM dm) throws AppException, RemoteException;
}