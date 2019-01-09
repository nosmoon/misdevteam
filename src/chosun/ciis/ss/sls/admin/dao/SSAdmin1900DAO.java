/***************************************************************************************************
* ���ϸ� : SSAdmin1900DAO.java
* ��� : �ּ��ڵ� ����
* �ۼ����� : 2014-07-28
* �ۼ��� :  ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dao;

import java.io.*;
import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.dm.*;

/**
 * ������-��纰 �����ȣ ����ó���� ���� DAO
 */

public class SSAdmin1900DAO {

    public SS_L_ADDRCD_TRSFBODataSet selectAddrcdTrsfbo(SS_L_ADDRCD_TRSFBODM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_ADDRCD_TRSFBODataSet ds = (SS_L_ADDRCD_TRSFBODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_ADDRCD_ACPTBODataSet selectAddrcdAcptbo(SS_L_ADDRCD_ACPTBODM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_ADDRCD_ACPTBODataSet ds = (SS_L_ADDRCD_ACPTBODataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_A_ADDRCD_BOCHGDataSet saveAddrcd(SS_A_ADDRCD_BOCHGDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_A_ADDRCD_BOCHGDataSet ds = (SS_A_ADDRCD_BOCHGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}