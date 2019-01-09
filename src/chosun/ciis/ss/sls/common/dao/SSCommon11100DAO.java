/***************************************************************************************************
* ���ϸ� : SSCommon11100DAO.java
* ��� : �μ�,���� �� ���� DAO
* �ۼ����� : 2016-12-14
* �ۼ��� : �弱��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * �Ǹű� ���� ������ ���� DAO
 */
public class SSCommon11100DAO {


    /**
     * ����-����Ŀ������Ʈ
     * @param dm SL_MO_L_AREALISTDM
     * @return SL_MO_L_AREALISTDataSet
     * @throws AppException
     */
    public SL_MO_L_AREALISTDataSet mo_selectAreaList(SL_MO_L_AREALISTDM dm) throws AppException{ //����Ͽ�
       DBManager manager = new DBManager("Oracle");
       SL_MO_L_AREALISTDataSet ds = (SL_MO_L_AREALISTDataSet)manager.executeCall(dm);
/*       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
*/
       return ds;
    }


    /**
     * ����-���͸���Ʈ
     * @param dm SL_MO_L_BOLISTDM
     * @return SL_MO_L_BOLISTDataSet
     * @throws AppException
     */
    public SL_MO_L_BOLISTDataSet mo_selectBoList(SL_MO_L_BOLISTDM dm) throws AppException{ //����Ͽ�
       DBManager manager = new DBManager("Oracle");
       SL_MO_L_BOLISTDataSet ds = (SL_MO_L_BOLISTDataSet)manager.executeCall(dm);
/*       if(!"".equals(ds.errcode)){
          throw new AppException(ds.errcode, ds.errmsg);
       }
*/
       return ds;
    }

}
