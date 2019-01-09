/***************************************************************************************************
 * ���ϸ� : SSReader1100DAO.java
 * ��� : ������Ȳ-���ں����� ���� DAO
 * �ۼ����� : 2004-01-12
 * �ۼ��� : ����ȫ
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������ :
 * �������� :
 * ��� :
 ***************************************************************************************************/

package chosun.ciis.ss.sls.rdr.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDRDM;
import chosun.ciis.ss.sls.move.dm.SS_L_MOVM_RDR_INITDM;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDRDataSet;
import chosun.ciis.ss.sls.move.ds.SS_L_MOVM_RDR_INITDataSet;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.dm.*;

/**
 * ������Ȳ-���ں��� ���� DAO
 */
public class SSReader11100DAO {

    /**
     * ������Ȳ-���ں��� �ʱ�ȭ
     * @param dm SS_L_RDR_DSCT_INITDM ��ü
     * @return SS_L_RDR_DSCT_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_RDR_DSCT_INITDataSet mo_selectInitList(SS_L_RDR_DSCT_INITDM dm) throws AppException { //�����
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    /**
     * ������Ȳ-���ں��� ��ȸ
     * @param dm SS_MO_L_RDR_DSCTDM ��ü
     * @return SS_MO_L_RDR_DSCTDataSet ��ü
     * @throws AppException
     */
    public SS_MO_L_RDR_DSCTDataSet mo_selectRdrDsctList(SS_MO_L_RDR_DSCTDM dm) throws AppException { //����Ͽ�
        DBManager manager = new DBManager("Oracle");
        SS_MO_L_RDR_DSCTDataSet ds = (SS_MO_L_RDR_DSCTDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

    /**
     * ������Ȳ-���ں��� ��
     * @param dm SS_S_RDR_DSCTDM ��ü
     * @return SS_S_RDR_DSCTDataSet ��ü
     * @throws AppException
     */
    public SS_S_RDR_DSCTDataSet mo_selectRdrDsctDetail(SS_S_RDR_DSCTDM dm) throws AppException { //����Ͽ�
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet) manager.executeCall(dm);
/*        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
*/
        return ds;
    }

}