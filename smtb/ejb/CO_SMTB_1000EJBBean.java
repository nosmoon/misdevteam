package chosun.ciis.co.smtb.ejb;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;

import somo.framework.ejb.BaseSessionBean;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.co.smtb.dao.CO_SMTB_1000DAO;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.ds.*;

public class CO_SMTB_1000EJBBean extends somo.framework.ejb.BaseSessionBean implements javax.ejb.SessionBean 
{
	public CO_SMTB_1020_UDataSet co_smtb_1020_u(CO_SMTB_1020_UDM dm) throws AppException 
	{
		CO_SMTB_1020_UDataSet ds = null;

		try 
		{
			CO_SMTB_1000DAO dao = new CO_SMTB_1000DAO();
			ds = dao.co_smtb_1020_u(dm);
		}
		catch (SysException e) 
		{
			throw new EJBException();
		}
		return ds;
	}
}