package chosun.ciis.pr.prtexec.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 *
 */

public class PR_PRTEXEC_2000DAO {

	/**
     *  주간발행기준정보 조회
     * @param dm
     * @return
     * @throws AppException
     */
	public PR_PRTEXEC_2000_LDataSet getPr_prtexec_2000(PR_PRTEXEC_2000_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2000_LDataSet ds = (PR_PRTEXEC_2000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2001_LDataSet getPr_prtexec_2001(PR_PRTEXEC_2001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2001_LDataSet ds = (PR_PRTEXEC_2001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2002_LDataSet getPr_prtexec_2002(PR_PRTEXEC_2002_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2002_LDataSet ds = (PR_PRTEXEC_2002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2003_ADataSet getPr_prtexec_2003(PR_PRTEXEC_2003_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2003_ADataSet ds = (PR_PRTEXEC_2003_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2005_ADataSet getPr_prtexec_2005(PR_PRTEXEC_2005_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2005_ADataSet ds = (PR_PRTEXEC_2005_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2006_UDataSet getPr_prtexec_2006(PR_PRTEXEC_2006_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2006_UDataSet ds = (PR_PRTEXEC_2006_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2007_ADataSet getPr_prtexec_2007(PR_PRTEXEC_2007_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2007_ADataSet ds = (PR_PRTEXEC_2007_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2008_LDataSet getPr_prtexec_2008(PR_PRTEXEC_2008_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2008_LDataSet ds = (PR_PRTEXEC_2008_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2009_LDataSet getPr_prtexec_2009(PR_PRTEXEC_2009_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2009_LDataSet ds = (PR_PRTEXEC_2009_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2010_LDataSet getPr_prtexec_2010(PR_PRTEXEC_2010_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2010_LDataSet ds = (PR_PRTEXEC_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2011_LDataSet getPr_prtexec_2011(PR_PRTEXEC_2011_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2011_LDataSet ds = (PR_PRTEXEC_2011_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2012_ADataSet getPr_prtexec_2012(PR_PRTEXEC_2012_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2012_ADataSet ds = (PR_PRTEXEC_2012_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2013_UDataSet getPr_prtexec_2013(PR_PRTEXEC_2013_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2013_UDataSet ds = (PR_PRTEXEC_2013_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2014_UDataSet getPr_prtexec_2014(PR_PRTEXEC_2014_UDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2014_UDataSet ds = (PR_PRTEXEC_2014_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2015_ADataSet getPr_prtexec_2015(PR_PRTEXEC_2015_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2015_ADataSet ds = (PR_PRTEXEC_2015_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_2016_ADataSet getPr_prtexec_2016(PR_PRTEXEC_2016_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_2016_ADataSet ds = (PR_PRTEXEC_2016_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_3000_ADataSet getPr_prtexec_3000(PR_PRTEXEC_3000_ADM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_3000_ADataSet ds = (PR_PRTEXEC_3000_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_4000_LDataSet getPr_prtexec_4000(PR_PRTEXEC_4000_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_4000_LDataSet ds = (PR_PRTEXEC_4000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_4001_LDataSet getPr_prtexec_4001(PR_PRTEXEC_4001_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_4001_LDataSet ds = (PR_PRTEXEC_4001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_4002_LDataSet getPr_prtexec_4002(PR_PRTEXEC_4002_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_4002_LDataSet ds = (PR_PRTEXEC_4002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_4003_LDataSet getPr_prtexec_4003(PR_PRTEXEC_4003_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_4003_LDataSet ds = (PR_PRTEXEC_4003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public PR_PRTEXEC_4004_LDataSet getPr_prtexec_4004(PR_PRTEXEC_4004_LDM dm) throws AppException {

        DBManager manager = new DBManager("MISMAT");

        PR_PRTEXEC_4004_LDataSet ds = (PR_PRTEXEC_4004_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}