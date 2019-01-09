/***************************************************************************************************
* ���ϸ� : SSMove1000DAO.java
* ��� : �̻絶��-��û��Ȳ�� ���� DAO
* �ۼ����� : 2004-01-05
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.move.dao;

import somo.framework.db.*;
import somo.framework.expt.*;

import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.dm.*;

/**
 * �̻絶��-��û��Ȳ �� ���� DAO
 */
public class SSMove1000DAO {
    /**
     * �̻絶��-��û��Ȳ �ʱ�ȭ��
     * @param dm SS_L_MOVM_RDR_INITDM
     * @return SS_L_MOVM_RDR_INITDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDR_INITDataSet init(SS_L_MOVM_RDR_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDR_INITDataSet ds = (SS_L_MOVM_RDR_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �̻絶��-��û��Ȳ ���
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDRDataSet selectMoveList(SS_L_MOVM_RDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDRDataSet ds = (SS_L_MOVM_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �̻絶��-��û��Ȳ ��
     * @param dm SS_S_MOVM_RDRDM
     * @return SS_S_MOVM_RDRDataSet
     * @throws AppException
     */
    public SS_S_MOVM_RDRDataSet selectMoveDetail(SS_S_MOVM_RDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_S_MOVM_RDRDataSet ds = (SS_S_MOVM_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * �̻絶��-��û��Ȳ ���
     * @param dm SS_A_MOVM_RDR_CANCDM
     * @return SS_A_MOVM_RDR_CANCDataSet
     * @throws AppException
     */
    public SS_A_MOVM_RDR_CANCDataSet selectMoveCancel(SS_A_MOVM_RDR_CANCDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_A_MOVM_RDR_CANCDataSet ds = (SS_A_MOVM_RDR_CANCDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �̻絶��-��û��Ȳ ����
     * @param dm SS_U_MOVM_RDRDM
     * @return SS_U_MOVM_RDRDataSet
     * @throws AppException
     */
    public SS_U_MOVM_RDRDataSet updateMoveRdr(SS_U_MOVM_RDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_U_MOVM_RDRDataSet ds = (SS_U_MOVM_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * �̻絶��-��û��Ȳ �����ٿ�
     * @param dm SS_L_RDR_EXTNDM
     * @return SS_L_RDR_EXTNDataSet
     * @throws AppException
     */
    public SS_L_MOVM_RDRDataSet printMoveRdr(SS_L_MOVM_RDRDM dm) throws AppException{
        DBManager manager = new DBManager("Oracle");
        SS_L_MOVM_RDRDataSet ds = (SS_L_MOVM_RDRDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

}
