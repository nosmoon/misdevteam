/***************************************************************************************************
 * ���ϸ� : SSExtn300DAO.java
 * ��� : �������˵��ڰ��� - �������� DAO
 * �ۼ����� : 2015.12.03
 * �ۼ��� : �弱��
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dao;

import somo.framework.db.*;
import somo.framework.expt.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;


/**
 * �������˵��ڰ��� - �������� DAO
 */
public class SSExtn4300DAO {

    /**
     * �������˵��ڰ���-��������-�ʱ�ȭ��
     * @param  SS_L_MO_SVY_INITDM
     * @return SS_L_MO_SVY_INITDataSet
     * @throws AppException
     */
    public SS_L_MO_SVY_INITDataSet svyRdrInit(SS_L_MO_SVY_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MO_SVY_INITDataSet ds = (SS_L_MO_SVY_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     * �������˵��ڰ���-�����ش絶�ڸ���Ʈ
     * @param  SS_L_MO_SVY_RDRDM
     * @return SS_L_MO_SVY_RDRDataSet
     * @throws AppException
     */
    public SS_L_MO_SVY_RDRDataSet svyRdrList(SS_L_MO_SVY_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MO_SVY_RDRDataSet ds = (SS_L_MO_SVY_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     * �������˵��ڰ���-�����ش絶�ڻ� �� ���丮��Ʈ
     * @param  SS_S_MO_SVY_RDRDM
     * @return SS_S_MO_SVY_RDRDataSet
     * @throws AppException
     */
    public SS_S_MO_SVY_RDRDataSet svyRdrDetail(SS_S_MO_SVY_RDRDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_MO_SVY_RDRDataSet ds = (SS_S_MO_SVY_RDRDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     * �������˵��ڰ���-��������-��������, �ν�Ȯ��, ��ü����
     * @param SS_A_MO_SVY_BSCOMPDM
     * @return SS_A_MO_SVY_BSCOMPDataSet
     * @throws AppException
     */
    public SS_A_MO_SVY_BSCOMPDataSet svyBsComp(SS_A_MO_SVY_BSCOMPDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_A_MO_SVY_BSCOMPDataSet ds = (SS_A_MO_SVY_BSCOMPDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }



    /**
     * �������˵��ڰ���-��������-�������,ķ������������ ��������Ʈ
     * @param SS_L_MO_SVYLISTDM
     * @return SS_L_MO_SVYLISTDataSet
     * @throws AppException
     */
    public SS_L_MO_SVYLISTDataSet svyList(SS_L_MO_SVYLISTDM dm) throws AppException {
    	DBManager manager = new DBManager("Oracle");
    	SS_L_MO_SVYLISTDataSet ds = (SS_L_MO_SVYLISTDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		throw new AppException(ds.errcode, ds.errmsg);
    	}
    	return ds;
    }

}
