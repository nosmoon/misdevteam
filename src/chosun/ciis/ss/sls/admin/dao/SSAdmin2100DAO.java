/***************************************************************************************************
* ���ϸ� : SSAdmin2100DAO.java
* ��� : ������-����Ϸα��� �������� ���� DAO_����Ͽ�
* �ۼ����� : 2016-09-22
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

public class SSAdmin2100DAO {

	//�ʱ�
    public SS_MO_L_LOGINAPLC_INITDataSet initMoAplc(SS_MO_L_LOGINAPLC_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_LOGINAPLC_INITDataSet ds = (SS_MO_L_LOGINAPLC_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    //��ȸ
    public SS_MO_L_LOGINAPLC_APRVDataSet selectMoAplc(SS_MO_L_LOGINAPLC_APRVDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_MO_L_LOGINAPLC_APRVDataSet ds = (SS_MO_L_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }

    //�α����̷¸���Ʈ 2017-07-10 �弱�� �߰�
    public SS_MO_L_LOGINHISTDataSet selectLoginHist(SS_MO_L_LOGINHISTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_LOGINHISTDataSet ds = (SS_MO_L_LOGINHISTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    //��⺯��,�޴��ȣ�����̷¸���Ʈ 2017-07-13 �弱�� �߰�
    public SS_MO_L_MODIHISTDataSet selectModiHist(SS_MO_L_MODIHISTDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_MO_L_MODIHISTDataSet ds = (SS_MO_L_MODIHISTDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }

    //��
    public SS_MO_S_LOGINAPLC_APRVDataSet detailMoAplc(SS_MO_S_LOGINAPLC_APRVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_S_LOGINAPLC_APRVDataSet ds = (SS_MO_S_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }


    //������, ����, ��й�ȣ�ʱ�ȭ
    public SS_MO_A_LOGINAPLC_APRVDataSet updateMoAplc(SS_MO_A_LOGINAPLC_APRVDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_MO_A_LOGINAPLC_APRVDataSet ds = (SS_MO_A_LOGINAPLC_APRVDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }





}