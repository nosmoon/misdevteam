/***************************************************************************************************
 * ���ϸ�   : CoBank1000DAO.java
 * ���     : ����-�����Ա޳��� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 
 * �ۼ���   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/

package chosun.ciis.co.bank.dao;

import java.sql.SQLException;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.co.bank.dm.CO_BANK_1000_MDM;
import chosun.ciis.co.bank.dm.CO_BANK_1010_LDM;
import chosun.ciis.co.bank.ds.CO_BANK_1000_MDataSet;
import chosun.ciis.co.bank.ds.CO_BANK_1010_LDataSet;


/**
 * ����-�����Ա޳���
 */
 
public class CoBank1000DAO {
	
    /**
     * ����-�����Ա޳��� �����ȸ
     * @param dm CO_JOB_1010_LDM
     * @return CO_JOB_1010_LDataSet
     * @throws AppException
     */
    public CO_BANK_1000_MDataSet co_bank_1000_m(CO_BANK_1000_MDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_BANK_1000_MDataSet ds = (CO_BANK_1000_MDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }	
    /**
     * ����-�����Ա޳��� �����ȸ
     * @param dm CO_BANK_1010_LDM
     * @return CO_BANK_1010_LDataSet
     * @throws AppException
     */
    public CO_BANK_1010_LDataSet co_bank_1010_l(CO_BANK_1010_LDM dm) throws AppException, SQLException {    	
        DBManager manager = new DBManager("MISCOM");
        
        CO_BANK_1010_LDataSet ds = (CO_BANK_1010_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

}
