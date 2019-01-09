/***************************************************************************************************
* ���ϸ� : SSExtn2800DAO.java
* ��� : ��������� ���� DAO
* �ۼ����� : 2013-06-27
* �ۼ��� : ����
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

/**
 * Ȯ����Ȳ-������� �� ���� DAO
 */
public class SSExtn2800DAO {
    /**
     * Ȯ����Ȳ-������� �ʱ�ȭ��
     * @param dm SS_L_RDR_XTN_INITDM
     * @return SS_L_RDR_XTN_INITDataSet
     * @throws AppException
     */
	public SSExtn2800DAO() {
	}

	
	/**
	 * �������ڰ���(��ȸ)
	 * 
	 * @param SS_L_TEAM_SRCH_INITDM
	 * @return SS_L_TEAM_SRCH_INITDataSet
	 * @throws AppException
	 */
	public SS_L_TEAM_SRCH_INITDataSet selectInitList(SS_L_TEAM_SRCH_INITDM dm)
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_TEAM_SRCH_INITDataSet ds = (SS_L_TEAM_SRCH_INITDataSet) manager
				.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		} else {
			return ds;
		}
	}
	
	
	/**
	 * �������ڰ���(��ȸ)
	 * 
	 * @param SS_L_RDR_RDRAREADM
	 * @return SS_L_RDR_RDRAREADataSet
	 * @throws AppException
	 */
	public SS_L_RDR_RDRAREADataSet selectRdrareaList(SS_L_RDR_RDRAREADM dm)
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_L_RDR_RDRAREADataSet ds = (SS_L_RDR_RDRAREADataSet) manager
				.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		} else {
			return ds;
		}
	}

	/**
	 * �������ڰ���(�󼼺���)
	 * 
	 * @param SS_S_RDR_RDRAREADM
	 * @return SS_S_RDR_RDRAREADataSet
	 * @throws AppException
	 */
	public SS_S_RDR_RDRAREADataSet selectRdrareaDetail(SS_S_RDR_RDRAREADM dm)
			throws AppException {
		DBManager manager = new DBManager("Oracle");
		SS_S_RDR_RDRAREADataSet ds = (SS_S_RDR_RDRAREADataSet) manager
				.executeCall(dm);
		if (!"".equals(ds.errcode)) {
			throw new AppException(ds.errcode, ds.errmsg);
		} else {
			return ds;
		}
	}
    

}
