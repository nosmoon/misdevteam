/***************************************************************************************************
* ���ϸ� : MT_PRNPAP_3000WB
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-08 
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.mt.papord.wb;

import java.rmi.RemoteException;
import java.util.StringTokenizer;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.mt.papord.dm.*;                    
import chosun.ciis.mt.papord.ds.*;     
 
public class MT_PAPORD_3000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * �����纰 ���庰 ���� �������緮 ����, ����, ���� 
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_3001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_3001_ADataSet ds = null;
		
		MT_PAPORD_3001_ADM dm = new MT_PAPORD_3001_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String mode         = converted[0];		//����
		String aply_dt      = converted[2];		//��������
		String papcmpy_cd   = converted[3];		//�������ڵ�
		String fac_clsf     = converted[4];		//�����ڵ�
		String matr_cd      = converted[5];		//�����ڵ�
		String roll_wgt     = converted[7];		//���߷�
		String roll_cnt     = converted[8];		//�Ѽ�
		String amss_wgt     = converted[9];		//�߷�
		String occr_dt      = converted[11];	//�߻�����
		String seq          = converted[12];	//�Ϸù�ȣ
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode);
		dm.setAply_dt(aply_dt);
		dm.setPapcmpy_cd(papcmpy_cd);
		dm.setFac_clsf(fac_clsf);
		dm.setMatr_cd(matr_cd);
		dm.setRoll_wgt(roll_wgt);
		dm.setRoll_cnt(roll_cnt);
		dm.setAmss_wgt(amss_wgt);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.print();

		ds = (MT_PAPORD_3001_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * �����纰 ���庰 ���� �������緮 ��ȸ 
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_3003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_3003_LDataSet ds = null;
		
		MT_PAPORD_3003_LDM dm = new MT_PAPORD_3003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt_fr_s = Util.checkString(req.getParameter("aply_dt_fr_s"));
		dm.aply_dt_to_s = Util.checkString(req.getParameter("aply_dt_to_s"));
		dm.fac_clsf_s = Util.checkString(req.getParameter("fac_clsf_s"));
		dm.papcmpy_cd_s = Util.checkString(req.getParameter("papcmpy_cd_s"));
		dm.print();

		ds = (MT_PAPORD_3003_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
