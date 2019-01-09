/***************************************************************************************************
* ���ϸ� :
* ��� :
 * �ۼ����� :
 * �ۼ��� :
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.tn.rpt.wb;

import java.rmi.RemoteException;
import java.util.Hashtable;
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
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;
/**
 *
 */

public class TN_RPT_1000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    //public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    //public final String COL_SEPARATOR = "#";

    /**
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */


	//���ϳ���_������ �߱޴��� ��ݺμ� �޺�����Ʈ
	public void tn_report_1010_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN"); //DAO ������.

		TN_RPT_1010_MDataSet ds = null;
		TN_RPT_1010_MDM dm = new TN_RPT_1010_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.

		dm.print();

		ds = (TN_RPT_1010_MDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
	//���ϳ���_������ �߱޴���_��ȸ
	public void tn_rpt_1020_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1020_LDataSet ds = null;
		TN_RPT_1020_LDM dm = new TN_RPT_1020_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);     //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.
		dm.yyyymm = Util.checkString(req.getParameter("search_yyyymm")); //������ȸ�Ⱓ
		dm.start_fr_dt = Util.checkString(req.getParameter("start_fr_dt"));    //��������
		dm.end_to_dt = Util.checkString(req.getParameter("end_to_dt"));     //��������
		dm.deptidx = Util.checkString(req.getParameter("deptidx_cd"));        //��ݺμ��ڵ�
		dm.type_gb = Util.checkString(req.getParameter("type_gb")); 			//���ñ���

		dm.print();

		ds = (TN_RPT_1020_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
	//���ϳ���_���峻����ȸ_��ȸ
	public void tn_rpt_1050_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1050_LDataSet ds = null;
		TN_RPT_1050_LDM dm = new TN_RPT_1050_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.
		dm.srch_date = Util.checkString(req.getParameter("srch_date"));   //��ȸ�Ⱓ

		dm.print();

		ds = (TN_RPT_1050_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
//	���ϳ���_�����Ͱ���_��ȸ
	public void tn_rpt_1500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1500_LDataSet ds = null;
		TN_RPT_1500_LDM dm = new TN_RPT_1500_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.
		dm.srch_date = Util.checkString(req.getParameter("srch_date"));   //��ȸ�Ⱓ

		dm.print();

		ds = (TN_RPT_1500_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
//	���ϳ���_�����Ͱ��� ��(ȸ��)_��ȸ
	public void tn_rpt_1510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_RPT_1510_LDataSet ds = null;
		TN_RPT_1510_LDM dm = new TN_RPT_1510_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));   //ȸ���ε���
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.code = Util.checkString(req.getParameter("code"));

		dm.print();
		ds = (TN_RPT_1510_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		req.setAttribute("ds", ds);
	}
//	���ϳ���_�����Ͱ��� ��(����)_��ȸ
	public void tn_rpt_1520_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_RPT_1520_LDataSet ds = null;
		TN_RPT_1520_LDM dm = new TN_RPT_1520_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.
		dm.memberidx = Util.checkString(req.getParameter("memberidx"));   //ȸ���ε���
		dm.promiseidx = Util.checkString(req.getParameter("promiseidx"));   //�����ε���
		dm.seq = Util.checkString(req.getParameter("seq"));   //����
		dm.code = Util.checkString(req.getParameter("code"));   
		
		dm.print();
		ds = (TN_RPT_1520_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		req.setAttribute("ds", ds);
	}
//	���ϳ���_�������_��ȸ
	public void tn_rpt_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		TN_RPT_1600_LDataSet ds = null; 
		TN_RPT_1600_LDM dm = new TN_RPT_1600_LDM();
		dm.srch_startdate = Util.checkString(req.getParameter("srch_startdate"));
		dm.srch_enddate = Util.checkString(req.getParameter("srch_enddate"));
		dm.srch_proofstatus = Util.checkString(req.getParameter("srch_proofstatus"));
		dm.srch_defaultmonth = Util.checkString(req.getParameter("srch_defaultmonth"));
		
		dm.print();
		ds = (TN_RPT_1600_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		req.setAttribute("ds", ds);
	}
//	���ϳ���_���Ը��_��ȸ
	public void tn_rpt_1800_l(HttpServletRequest req, HttpServletResponse res) throws AppException {		
		DBManager manager = new DBManager("MISTNN");
		TN_RPT_1800_LDataSet ds = null; 
		TN_RPT_1800_LDM dm = new TN_RPT_1800_LDM();
		dm.srch_startdate = Util.checkString(req.getParameter("srch_startdate"));
		dm.srch_enddate = Util.checkString(req.getParameter("srch_enddate"));
		dm.paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
		dm.print();
		ds = (TN_RPT_1800_LDataSet)manager.executeCall(dm);
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		req.setAttribute("ds", ds);
	}
	//���ϳ���_����������Ȳ_��ȸ
	public void tn_rpt_1400_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		
		TN_RPT_1400_LDataSet ds = null;
		TN_RPT_1400_LDM dm = new TN_RPT_1400_LDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.
		dm.srch_date = Util.checkString(req.getParameter("srch_date"));   //��ȸ�Ⱓ

		dm.print();

		ds = (TN_RPT_1400_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
		
		req.setAttribute("ds", ds);
	}

	//���ϳ���_���¹�ȣ����_��ȸ
	public void tn_rpt_1101_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1101_LDataSet ds = null;
		TN_RPT_1101_LDM dm = new TN_RPT_1101_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);

		dm.print();

		ds = (TN_RPT_1101_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
	//���ϳ���_���¹�ȣ����_����
	public void tn_rpt_1102_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1102_ADataSet ds = null;
		TN_RPT_1102_ADM dm = new TN_RPT_1102_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mode = ((String)hash.get("m")).toUpperCase(); //���
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true); //ȸ���ڵ�
		
		dm.bank_cd = (String)hash.get("bank_cd");
		dm.bank_gb = (String)hash.get("bank_gb");
		dm.bank_nm = (String)hash.get("bank_nm");
		dm.bank_acct_no = (String)hash.get("bank_acct_no");
		dm.use_yn = (String)hash.get("use_yn");
		dm.remk = (String)hash.get("remk");
			
		dm.incmg_pers_ipadd = req.getRemoteAddr();  //IP �ּ�
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true); //�Է���
        dm.print();

		ds = (TN_RPT_1102_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	//���ϳ���_���⿹����ȸ_��ȸ
	public void tn_rpt_1131_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");

		TN_RPT_1131_LDataSet ds = null;
		TN_RPT_1131_LDM dm = new TN_RPT_1131_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.
		dm.srch_date = Util.checkString(req.getParameter("srch_date"));   //��ȸ�Ⱓ

		dm.print();

		ds = (TN_RPT_1131_LDataSet)manager.executeCall(dm);
			
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);
	}
	
	public void tn_rpt_1141_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");
		
		TN_RPT_1141_LDataSet ds = null;
		TN_RPT_1141_LDM dm = new TN_RPT_1141_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_dt = Util.checkString(req.getParameter("fr_dt"));
		dm.to_dt = Util.checkString(req.getParameter("to_dt"));
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();
		
		ds = (TN_RPT_1141_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
	        System.out.println("DAO..error.");
	        throw new AppException(ds.errcode, ds.errmsg);
		}
			
		req.setAttribute("ds", ds);

	}

	public void tn_rpt_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");		
		
		TN_RPT_1301_LDataSet ds = null;
		TN_RPT_1301_LDM dm = new TN_RPT_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));

		dm.print();


		ds = (TN_RPT_1301_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);


		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.clos_dt = (String)hash.get("clos_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.clos_dt = Util.getSessionParameterValue(req,"clos_dt",true);
		*******************************************************************************************/
	}	
	

	public void tn_rpt_1302_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");		

		TN_RPT_1302_IDataSet ds = null;
		TN_RPT_1302_IDM dm = new TN_RPT_1302_IDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true); //ȸ���ڵ� ����� ���� ������ ���� ����� ���� �����ϱ����.
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.to_off = Util.checkString(req.getParameter("to_off"));
		dm.to_on = Util.checkString(req.getParameter("to_on"));
		dm.off_remk = Util.checkString(req.getParameter("off_remk"));
		dm.on_remk = Util.checkString(req.getParameter("on_remk"));
		dm.to_off_yet = Util.checkString(req.getParameter("to_off_yet"));
		dm.to_on_yet = Util.checkString(req.getParameter("to_on_yet"));
		dm.off_yet_remk = Util.checkString(req.getParameter("off_yet_remk"));
		dm.on_yet_remk = Util.checkString(req.getParameter("on_yet_remk"));

		dm.print();

		ds = (TN_RPT_1302_IDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}	
	
	public void tn_rpt_1700_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");	
		TN_RPT_1700_MDataSet ds = null;
		TN_RPT_1700_MDM dm = new TN_RPT_1700_MDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.print();
		
		ds = (TN_RPT_1700_MDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	
	}	
	public void tn_rpt_1701_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISTNN");	
		TN_RPT_1701_LDataSet ds = null;
		TN_RPT_1701_LDM dm = new TN_RPT_1701_LDM();

		dm.cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
		dm.clos_dt = Util.checkString(req.getParameter("clos_dt"));
		dm.fundidx = Util.checkString(req.getParameter("fundidx"));
		dm.paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
		dm.clsf = Util.checkString(req.getParameter("clsf"));

		dm.print();
		
		ds = (TN_RPT_1701_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	
	}
	
}
