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

public class SSAdmin2000DAO {

    public SS_L_NEWJUSO_BOCHGDataSet selectNewjusoChg(SS_L_NEWJUSO_BOCHGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_NEWJUSO_BOCHGDataSet ds = (SS_L_NEWJUSO_BOCHGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
    
    public SS_U_NEWJUSO_BOCHGDataSet updateNewjusoChg(SS_U_NEWJUSO_BOCHGDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_U_NEWJUSO_BOCHGDataSet ds = (SS_U_NEWJUSO_BOCHGDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
}