/***************************************************************************************************
 * 파일명 : PL_CLS_1000DAO.java
 * 기능 : 마감관리-입금일마감
 * 작성일자 : 2009.05.13
 * 작성자 : 김상옥
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.pl.cls.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;

/**
 * 
 */
public class PL_CLS_1800DAO {
	
    public PL_CLS_1810_LDataSet pl_cls_1810_l(PL_CLS_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1810_LDataSet ds = (PL_CLS_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public PL_CLS_1815_LDataSet pl_cls_1815_l(PL_CLS_1815_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1815_LDataSet ds = (PL_CLS_1815_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    public PL_CLS_1820_ADataSet pl_cls_1820_a(PL_CLS_1820_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1820_ADataSet ds = (PL_CLS_1820_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public PL_CLS_1830_ADataSet pl_cls_1830_a(PL_CLS_1830_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1830_ADataSet ds = (PL_CLS_1830_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public PL_CLS_1840_ADataSet pl_cls_1840_a(PL_CLS_1840_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISPLS");
        PL_CLS_1840_ADataSet ds = (PL_CLS_1840_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
