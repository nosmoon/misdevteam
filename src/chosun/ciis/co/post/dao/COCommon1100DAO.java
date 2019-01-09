/***************************************************************************************************
* ���ϸ� : SSCommon1100DAO.java
* ��� : �μ�,���� �� ���� DAO
* �ۼ����� : 2003-11-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.co.post.dao;

import java.sql.SQLException;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.co.post.ds.*;
import chosun.ciis.co.post.dm.*;

/**
 * �Ǹű� ���� ������ ���� DAO
 */
public class COCommon1100DAO {
    /**
     * �����ȣ(�����ȸ)
     * @param dm CO_L_ZIPDM
     * @return CO_L_ZIPDataSet
     * @throws AppException
     */
    public CO_L_ZIPDataSet selectZipList(CO_L_ZIPDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_L_ZIPDataSet ds = (CO_L_ZIPDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �����ȣ(�����ȸ)
     * @param dm CO_L_ZIP_ALLDM
     * @return CO_L_ZIP_ALLDataSet
     * @throws AppException
     */
    public CO_L_ZIP_ALLDataSet selectZipListAll(CO_L_ZIP_ALLDM dm) throws AppException, SQLException {
        DBManager manager = new DBManager("MISCOM");
        CO_L_ZIP_ALLDataSet ds = (CO_L_ZIP_ALLDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
