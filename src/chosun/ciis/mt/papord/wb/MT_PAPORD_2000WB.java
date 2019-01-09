/***************************************************************************************************
* ���ϸ� : MT_PRNPAP_2000WB
* ��� :  �������� / �μ���� ����
* �ۼ����� : 2009-04-07 
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
 
public class MT_PAPORD_2000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";
    
    /**
	 * �����纰 �⺻���ֺ��� ��ȸ
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_2001_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_2001_LDataSet ds = null;
		
		MT_PAPORD_2001_LDM dm = new MT_PAPORD_2001_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aply_dt_fr_s = Util.checkString(req.getParameter("aply_dt_fr_s"));
		dm.aply_dt_to_s = Util.checkString(req.getParameter("aply_dt_to_s"));
		dm.print();

		ds = (MT_PAPORD_2001_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * �����纰 �⺻���ֺ��� ����, ����, ����
	 * @param dm
	 * @return ds
	 * @throws AppException
	 */
    public void mt_papord_2002_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_PAPORD_2002_ADataSet ds = null;
		
		MT_PAPORD_2002_ADM dm = new MT_PAPORD_2002_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String mode              = converted[0];	//mode
		String aply_dt           = converted[2];	//��������
		String papcmpy_cd        = converted[3];	//�������ڵ�
		String ordr_ratio        = converted[4];	//���ֺ���
		String occr_dt           = converted[5];	//�߻�����
		String seq               = converted[6];	//seq
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode);
		dm.setAply_dt(aply_dt);
		dm.setPapcmpy_cd(papcmpy_cd);
		dm.setOrdr_ratio(ordr_ratio);
		dm.setOccr_dt(occr_dt);
		dm.setSeq(seq);
		dm.print();

		ds = (MT_PAPORD_2002_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
}
