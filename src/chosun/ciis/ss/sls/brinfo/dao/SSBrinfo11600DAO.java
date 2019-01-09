/***************************************************************************************************
 * ���ϸ� : SSBrinfo1600DAO.java
 * ��� : ����Info-�߼۳뼱�� ���� DAO
 * �ۼ����� : 2004-04-01
 * �ۼ��� : ��â��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dao;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ss.sls.brinfo.rec.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ����Info-�߼۳뼱�� ���� DAO
 */
public class SSBrinfo11600DAO {

    /**
     * ����Info-�߼۳뼱(�����뼱��ȸ)
     * @param dm SS_MO_L_BSNSDM ��ü
     * @return SS_MO_L_BSNSDataSet ��ü
     * @throws AppException
     */
    public SS_MO_L_BSNSDataSet mo_selectBsnsList(SS_MO_L_BSNSDM dm) throws AppException { //����Ͽ�_NEW
    	DBManager manager = new DBManager("Oracle");
    	SS_MO_L_BSNSDataSet ds = (SS_MO_L_BSNSDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    /**
     * ����Info-�߼۳뼱(�����뼱��ȸ)-���ͻ�
     * @param dm SS_MO_S_BSNSDM
     * @return SS_MO_S_BSNSDataSet
     * @throws AppException
     */
    public SS_MO_S_BSNSDataSet mo_selectBsnsDetail(SS_MO_S_BSNSDM dm) throws AppException { //�����_NEW
        DBManager manager = new DBManager("Oracle");
        SS_MO_S_BSNSDataSet ds = (SS_MO_S_BSNSDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

}
