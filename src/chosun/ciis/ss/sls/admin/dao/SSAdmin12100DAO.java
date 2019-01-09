/***************************************************************************************************
* ���ϸ� : SSAdmin12100DAO.java_����Ͽ�
* ��� : ������-����Ϸα��� �������� ���� DAO_����Ͽ�
* �ۼ����� : 2017-01-23
* �ۼ��� :  �弱��
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
 *  ������-����Ϸα��� �������� ���� DAO_����Ͽ�
 */

public class SSAdmin12100DAO {

	//�ʱ�
    public SS_MO_L_LOGINAPLC_INITDataSet mo_initMoAplc(SS_MO_L_LOGINAPLC_INITDM dm) throws AppException { //����Ͽ�
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_LOGINAPLC_INITDataSet ds = (SS_MO_L_LOGINAPLC_INITDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    //��ȸ
    public SS_MO_L_LOGINAPLC_APRVDataSet mo_selectMoAplc(SS_MO_L_LOGINAPLC_APRVDM dm) throws AppException { //����Ͽ�
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_LOGINAPLC_APRVDataSet ds = (SS_MO_L_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    //��
    public SS_MO_S_LOGINAPLC_APRVDataSet mo_detailMoAplc(SS_MO_S_LOGINAPLC_APRVDM dm) throws AppException { //����Ͽ�
        DBManager manager = new DBManager("Oracle");
        SS_MO_S_LOGINAPLC_APRVDataSet ds = (SS_MO_S_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }


    //������, ����, ��й�ȣ�ʱ�ȭ
    public SS_MO_A_LOGINAPLC_APRVDataSet mo_updateMoAplc(SS_MO_A_LOGINAPLC_APRVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_A_LOGINAPLC_APRVDataSet ds = (SS_MO_A_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
/*      if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }





}