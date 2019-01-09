/***************************************************************************************************
* ���ϸ� : MT_REPORT_76000WB.java
* ��� :  ���� - ��ǥ - ��ǥȯ�漳�� 
 * �ۼ����� : 2012.06.20
 * �ۼ��� :   �輺��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.mt.commatr.wb;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.mt.commatr.dao.MT_COMMATR_9000DAO;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_5102_IDM;
import chosun.ciis.mt.papinout.dm.MT_PAPINOUT_5200_ADM;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_5102_IDataSet;
import chosun.ciis.mt.papinout.ds.MT_PAPINOUT_5200_ADataSet;


/**
 * 
 */

public class MT_COMMATR_9000WB extends BaseWB{

    /**
     * ����� ���а� ���μ��ڵ� ����� ��ȸ�Ѵ�. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
	/**
	 * PS�Ǵܰ����� ��ȸ
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_commatr_9101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_9101_LDataSet ds = null;
		
		MT_COMMATR_9101_LDM dm = new MT_COMMATR_9101_LDM();
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.aply_dt_fr = Util.checkString(req.getParameter("aply_dt_fr"));
		dm.aply_dt_to = Util.checkString(req.getParameter("aply_dt_to"));
		dm.print();

		ds = (MT_COMMATR_9101_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
    /**
	 * PS�Ǵܰ����� ����,����,����
	 * @param dm
	 * @return
	 * @throws AppException
	 */
    public void mt_commatr_9102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_COMMATR_9102_ADataSet ds = null;
		
		MT_COMMATR_9102_ADM dm = new MT_COMMATR_9102_ADM();
		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		String mode       = converted[0];	//����
		String aply_dt    = converted[3];	//��������
		String uprc       = converted[4];	//�ܰ�
		String cd  		  = converted[5];	//�ڵ�
		
		dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
		dm.incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.setMode(mode);
		dm.setAply_dt(aply_dt);
		dm.setCd(cd);
		dm.setUprc(uprc);
		dm.print();

		ds = (MT_COMMATR_9102_ADataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
    
}
