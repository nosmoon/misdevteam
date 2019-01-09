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
public class SSReader1100DAO {

    /**
     * ������Ȳ-���ں��� �ʱ�ȭ
     * @param dm SS_L_RDR_DSCT_INITDM ��ü
     * @return SS_L_RDR_DSCT_INITDataSet ��ü
     * @throws AppException
     */
    public SS_L_RDR_DSCT_INITDataSet selectInitList(SS_L_RDR_DSCT_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_DSCT_INITDataSet ds = (SS_L_RDR_DSCT_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    /**
     * ������Ȳ-���ں��� ��ȸ
     * @param dm SS_L_RDR_DSCTDM ��ü
     * @return SS_L_RDR_DSCTDataSet ��ü
     * @throws AppException
     */
    public SS_L_RDR_DSCTDataSet selectRdrDsctList(SS_L_RDR_DSCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_RDR_DSCTDataSet ds = (SS_L_RDR_DSCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    /**
     * ������Ȳ-���ں��� ��
     * @param dm SS_S_RDR_DSCTDM ��ü
     * @return SS_S_RDR_DSCTDataSet ��ü
     * @throws AppException
     */
    public SS_S_RDR_DSCTDataSet selectRdrDsctDetail(SS_S_RDR_DSCTDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public SS_L_CAMP_TM_EXTN_INITDataSet initCampTm(SS_L_CAMP_TM_EXTN_INITDM dm) throws AppException {
        DBManager manager = new DBManager("Oracle");
        SS_L_CAMP_TM_EXTN_INITDataSet ds = (SS_L_CAMP_TM_EXTN_INITDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public SS_L_CAMP_TM_EXTNDataSet selectCampTmList(SS_L_CAMP_TM_EXTNDM dm) throws AppException{
        DBManager manager = new DBManager("CCT");
    	
        SS_L_CAMP_TM_EXTNDataSet ds = (SS_L_CAMP_TM_EXTNDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public SS_L_TM_AGENTLISTDataSet selectTmAgentList(SS_L_TM_AGENTLISTDM dm) throws AppException {
        DBManager manager = new DBManager("CCT");
    	
        SS_L_TM_AGENTLISTDataSet ds = (SS_L_TM_AGENTLISTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
     }
    
    public SS_L_TM_CAMPLISTDataSet selectTmCampList(SS_L_TM_CAMPLISTDM dm) throws AppException {
        DBManager manager = new DBManager("CCT");
    	
    	SS_L_TM_CAMPLISTDataSet ds = (SS_L_TM_CAMPLISTDataSet)manager.executeCall(dm);
        if(!"".equals(ds.errcode)){
           throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
     }
}