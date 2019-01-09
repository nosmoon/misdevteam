/***************************************************************************************************
 * ���ϸ�   : SSReader1900DAO.java
 * ���     : ������Ȳ-��۵��ڰ��� DAO
 * �ۼ����� : 2015-06-26
 * �ۼ���   : �弱��
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.dao.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 *
 */
public class SSReader1900DAO {
    public SSReader1900DAO() {
    }

    /**
     * ���ڰ���-��۵��ڰ��� �ʱ�ȭ��
     * @param SS_L_POSTDLVRDR_INITDM
     * @return SS_L_POSTDLVRDR_INITDataSet
     */
    public SS_L_POSTDLVRDR_INITDataSet initList(SS_L_POSTDLVRDR_INITDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_L_POSTDLVRDR_INITDataSet ds = (SS_L_POSTDLVRDR_INITDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ���ڰ���-��۵��ڰ��� ��ȸ
     * @param SS_L_POSTDLVRDRDM
     * @return SS_L_POSTDLVRDRDataSet
     */
    public SS_L_POSTDLVRDRDataSet selectList(SS_L_POSTDLVRDRDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_L_POSTDLVRDRDataSet ds = (SS_L_POSTDLVRDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ������Ȳ-��۵��ڰ��� ����ȸ
     * @param SS_S_POSTDLVRDRDM
     * @return SS_S_POSTDLVRDRDataSet
     */
    public SS_S_POSTDLVRDRDataSet detailList(SS_S_POSTDLVRDRDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_S_POSTDLVRDRDataSet ds = (SS_S_POSTDLVRDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ������Ȳ-��۵��ڰ��� ����
     * @param SS_A_POSTDLVRDRDM
     * @return SS_A_POSTDLVRDRDataSet
     */
    public SS_A_POSTDLVRDRDataSet insertList(SS_A_POSTDLVRDRDM dm) throws AppException {    	
        DBManager manager = new DBManager("Oracle");
        SS_A_POSTDLVRDRDataSet ds = (SS_A_POSTDLVRDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
