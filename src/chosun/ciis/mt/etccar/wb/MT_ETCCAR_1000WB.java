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

package chosun.ciis.mt.etccar.wb;

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
import chosun.ciis.mt.etccar.dm.*;                    
import chosun.ciis.mt.etccar.ds.*;                   
 
/**
 *  
 */

public class MT_ETCCAR_1000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";
    // �������೻����� 
    public void mt_etccar_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1000_LDataSet ds = null;
		
		MT_ETCCAR_1000_LDM dm = new MT_ETCCAR_1000_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt = Util.checkString(req.getParameter("driv_dt"));
		if("".equalsIgnoreCase(Util.checkString(req.getParameter("driv_dt")))){			
			dm.driv = Util.checkString(req.getParameter("driv_dt"));
		}else{
			dm.driv = Util.checkString(req.getParameter("driv_dt").substring(0,6));
		}
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.print();

		ds = (MT_ETCCAR_1000_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    public void mt_etccar_1000_500_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1000_500_LDataSet ds = null;
		
		MT_ETCCAR_1000_500_LDM dm = new MT_ETCCAR_1000_500_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt = Util.checkString(req.getParameter("driv_dt"));
		if("".equalsIgnoreCase(Util.checkString(req.getParameter("driv_dt")))){			
			dm.driv = Util.checkString(req.getParameter("driv_dt"));
		}else{
			dm.driv = Util.checkString(req.getParameter("driv_dt").substring(0,6));
		}
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.print();

		ds = (MT_ETCCAR_1000_500_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // �������೻����� �Է�/����
    public void mt_etccar_1001_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_ETCCAR_1001_ADataSet ds = null;
    	
    	String multiUpData_1 = Util.checkString(req.getParameter("multiUpData_1"));
		String multiUpData_2 = Util.checkString(req.getParameter("multiUpData_2"));
		String[] converted_1 = convertMultiUpdateData(multiUpData_1);
		String[] converted_2 = convertMultiUpdateData(multiUpData_2);
		
		//for (int i=0; i<converted_1.length; i++){
		//	System.out.println("converted_1[" + i + "]=" + converted_1[i] );
		//}
		//for (int i=0; i<converted_2.length; i++){
		//	System.out.println("converted_2[" + i + "]=" + converted_2[i] );
		//}
		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		String incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		String incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		
		String gubun_1 		   = converted_1[0];	
		String drvr_nm		   = converted_1[2];	// ������
		String buyoil_dt       = converted_1[3];	// �����ð�
		String buyoil_tm       = converted_1[4];	// �����ð�
		String oil_kind        = converted_1[5];	// ��������
		String buyoil_qunt     = converted_1[6];	// ������
		String buyoil_gag      = converted_1[7];	// ������ ������
		String outsd_oil_dt    = converted_1[8];	// �ܺα�����
		String outsd_oil_tm    = converted_1[9];	// �ܺα�����
		String outsd_oil_qunt  = converted_1[10];	// �ܺα�����
		String remk      	   = converted_1[11];	// ���
		String occr_dt     	   = converted_1[12];	// �߻�����
		String driv_dt     	   = converted_1[13];	// ��������
		String car_no     	   = converted_1[14];	// ������ȣ
		String seq      	   = converted_1[15];	// seq
		String endgbn_1 = "";
		
		if(gubun_1.equals("")) {
			endgbn_1 = "E";
		} else {
			endgbn_1 = "C";
		}
		
		String gubun_2 		 = converted_2[0];  // ����
		String dest_2 		 = converted_2[2];  // �༱��
		String start_dt_2 	 = converted_2[3];  // �������
		String start_tm_2 	 = converted_2[4];  // ��߽ð�
		String driv_dt_2 	 = converted_2[5];  // ��������
		String ariv_tm_2 	 = converted_2[6];  // �����ð�
		String start_gag_2 	 = converted_2[7];  // ��߰�����
		String ariv_gag_2 	 = converted_2[8];  // ����������
		String drvr_nm_2 	 = converted_2[9];  // �����ڸ�
		String rid_pers_2 	 = converted_2[10]; // ž����
		String rid_deptcd_2  = converted_2[11]; // ž���ںμ�
		String rid_deptnm_2  = converted_2[12]; // ž���ںμ�
		String driv_purp_2 	 = converted_2[13]; // �������
		String car_no_2 	 = converted_2[14]; // ������ȣ
		String seq_2 		 = converted_2[15]; // seq
		String occr_dt_2 	 = converted_2[16]; // �߻�����
		String clos_dt_2 	 = ""; 			    // ��������
		String endgbn_2 = "";
	
		if(gubun_2.equals("")) {
			endgbn_2 = "E";
		} else {
			endgbn_2 = "C";
		}
    	MT_ETCCAR_1001_ADM dm = new MT_ETCCAR_1001_ADM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.seq = seq;
		dm.occr_dt = occr_dt; 
		dm.driv_dt = driv_dt;
		dm.car_no = car_no;
		dm.oil_kind = oil_kind;
		dm.drvr_nm = drvr_nm;
		dm.buyoil_dt = buyoil_dt;
		dm.buyoil_tm = buyoil_tm;
		dm.buyoil_qunt = buyoil_qunt;
		dm.buyoil_gag = buyoil_gag;
		dm.outsd_oil_dt = outsd_oil_dt;
		dm.outsd_oil_tm = outsd_oil_tm;
		dm.outsd_oil_qunt = outsd_oil_qunt;
		dm.remk = remk;
		dm.incmg_pers_ipaddr = cmpy_cd;
		dm.incmg_pers = incmg_pers;
		dm.incmg_pers_ipaddr = incmg_pers_ipaddr;
		dm.gubun_1 = gubun_1.toUpperCase();
		dm.endgbn_1 = endgbn_1;
		
		dm.setOccr_dt_2(occr_dt_2);
		dm.setSeq_2(seq_2);
		dm.setStart_dt_2(start_dt_2);
		dm.setDriv_dt_2(driv_dt_2);
		dm.setCar_no_2(car_no_2);
		dm.setStart_tm_2(start_tm_2);
		dm.setAriv_tm_2(ariv_tm_2);
		dm.setDest_2(dest_2);
		dm.setDrvr_nm_2(drvr_nm_2);
		dm.setStart_gag_2(start_gag_2);
		dm.setAriv_gag_2(ariv_gag_2);
		dm.setRid_pers_2(rid_pers_2);
		dm.setRid_deptcd_2(rid_deptcd_2);
		dm.setRid_deptnm_2(rid_deptnm_2);
		dm.setDriv_purp_2(driv_purp_2);
		dm.setClos_dt_2(clos_dt_2);
		dm.setGubun_2(gubun_2.toUpperCase());
		dm.setEndgbn_2(endgbn_2);
		dm.print();
	
		ds = (MT_ETCCAR_1001_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
//  �������೻����� �Է�/����
    public void mt_etccar_1001_500_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_ETCCAR_1001_500_ADataSet ds = null;
    	
    	String multiUpData_1 = Util.checkString(req.getParameter("multiUpData_1"));
		String multiUpData_2 = Util.checkString(req.getParameter("multiUpData_2"));
		String[] converted_1 = convertMultiUpdateData(multiUpData_1);
		String[] converted_2 = convertMultiUpdateData(multiUpData_2);
		
		//for (int i=0; i<converted_1.length; i++){
		//	System.out.println("converted_1[" + i + "]=" + converted_1[i] );
		//}
		//for (int i=0; i<converted_2.length; i++){
		//	System.out.println("converted_2[" + i + "]=" + converted_2[i] );
		//}
		String cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		String incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		String incmg_pers_ipaddr = Util.checkString(req.getRemoteAddr());
		
		String gubun_1 		   = converted_1[0];	
		String drvr_nm		   = converted_1[2];	// ������
		String buyoil_dt       = converted_1[3];	// �����ð�
		String buyoil_tm       = converted_1[4];	// �����ð�
		String oil_kind        = converted_1[5];	// ��������
		String buyoil_qunt     = converted_1[6];	// ������
		String buyoil_gag      = converted_1[7];	// ������ ������
		String outsd_oil_dt    = converted_1[8];	// �ܺα�����
		String outsd_oil_tm    = converted_1[9];	// �ܺα�����
		String outsd_oil_qunt  = converted_1[10];	// �ܺα�����
		String remk      	   = converted_1[11];	// ���
		String occr_dt     	   = converted_1[12];	// �߻�����
		String driv_dt     	   = converted_1[13];	// ��������
		String car_no     	   = converted_1[14];	// ������ȣ
		String seq      	   = converted_1[15];	// seq
		//String cmpy_cd         = converted_1[16];	// seq
		String endgbn_1 = "";
		
		if(gubun_1.equals("")) {
			endgbn_1 = "E";
		} else {
			endgbn_1 = "C";
		}
		
		String gubun_2 		 = converted_2[0];  // ����
		String dest_2 		 = converted_2[2];  // �༱��
		String start_dt_2 	 = converted_2[3];  // �������
		String start_tm_2 	 = converted_2[4];  // ��߽ð�
		String driv_dt_2 	 = converted_2[5];  // ��������
		String ariv_tm_2 	 = converted_2[6];  // �����ð�
		String start_gag_2 	 = converted_2[7];  // ��߰�����
		String ariv_gag_2 	 = converted_2[8];  // ����������
		String drvr_nm_2 	 = converted_2[9];  // �����ڸ�
		String rid_pers_2 	 = converted_2[10]; // ž����
		String rid_deptcd_2  = converted_2[11]; // ž���ںμ�
		String rid_deptnm_2  = converted_2[12]; // ž���ںμ�
		String driv_purp_2 	 = converted_2[13]; // �������
		String car_no_2 	 = converted_2[14]; // ������ȣ
		String seq_2 		 = converted_2[15]; // seq
		String occr_dt_2 	 = converted_2[16]; // �߻�����
		String cmpy_cd_2 	 = converted_2[17]; // �߻�����
		String clos_dt_2 	 = ""; 			    // ��������
		String endgbn_2 = "";
	
		if(gubun_2.equals("")) {
			endgbn_2 = "E";
		} else {
			endgbn_2 = "C";
		}
    	MT_ETCCAR_1001_500_ADM dm = new MT_ETCCAR_1001_500_ADM();
		
		dm.cmpy_cd = cmpy_cd;
		dm.seq = seq;
		dm.occr_dt = occr_dt; 
		dm.driv_dt = driv_dt;
		dm.car_no = car_no;
		dm.oil_kind = oil_kind;
		dm.drvr_nm = drvr_nm;
		dm.buyoil_dt = buyoil_dt;
		dm.buyoil_tm = buyoil_tm;
		dm.buyoil_qunt = buyoil_qunt;
		dm.buyoil_gag = buyoil_gag;
		dm.outsd_oil_dt = outsd_oil_dt;
		dm.outsd_oil_tm = outsd_oil_tm;
		dm.outsd_oil_qunt = outsd_oil_qunt;
		dm.remk = remk;
		dm.incmg_pers_ipaddr = cmpy_cd;
		dm.incmg_pers = incmg_pers;
		dm.incmg_pers_ipaddr = incmg_pers_ipaddr;
		dm.gubun_1 = gubun_1.toUpperCase();
		dm.endgbn_1 = endgbn_1;
		
		dm.setCmpy_cd_2(cmpy_cd_2);
		dm.setOccr_dt_2(occr_dt_2);
		dm.setSeq_2(seq_2);
		dm.setStart_dt_2(start_dt_2);
		dm.setDriv_dt_2(driv_dt_2);
		dm.setCar_no_2(car_no_2);
		dm.setStart_tm_2(start_tm_2);
		dm.setAriv_tm_2(ariv_tm_2);
		dm.setDest_2(dest_2);
		dm.setDrvr_nm_2(drvr_nm_2);
		dm.setStart_gag_2(start_gag_2);
		dm.setAriv_gag_2(ariv_gag_2);
		dm.setRid_pers_2(rid_pers_2);
		dm.setRid_deptcd_2(rid_deptcd_2);
		dm.setRid_deptnm_2(rid_deptnm_2);
		dm.setDriv_purp_2(driv_purp_2);
		dm.setClos_dt_2(clos_dt_2);
		dm.setGubun_2(gubun_2.toUpperCase());
		dm.setEndgbn_2(endgbn_2);
		dm.print();
	
		ds = (MT_ETCCAR_1001_500_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
    
    // �������೻����� ������ȣ�� ��������
    public void mt_etccar_1002_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1002_MDataSet ds = null;
		
		MT_ETCCAR_1002_MDM dm = new MT_ETCCAR_1002_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.car_no = Util.checkString(req.getParameter("car_no"));
		dm.use_usag = Util.checkString(req.getParameter("use_usag"));
		dm.mang_nm = Util.checkString(req.getParameter("cmpy_mang_nm"));
		dm.car_modl = Util.checkString(req.getParameter("car_modl"));
		dm.print();

		ds = (MT_ETCCAR_1002_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

    public void mt_etccar_1003_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1003_LDataSet ds = null;
		
		MT_ETCCAR_1003_LDM dm = new MT_ETCCAR_1003_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();
	
		ds = (MT_ETCCAR_1003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_etccar_1004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");

    	MT_ETCCAR_1004_ADataSet ds = null;
		MT_ETCCAR_1004_ADM dm = new MT_ETCCAR_1004_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt = Util.checkString(req.getParameter("driv_dt"));
		dm.clos_yn = Util.checkString(req.getParameter("clos_yn"));
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.print();

		ds = (MT_ETCCAR_1004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

	public void mt_etccar_1005_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");

    	MT_ETCCAR_1005_LDataSet ds = null;
		MT_ETCCAR_1005_LDM dm = new MT_ETCCAR_1005_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.driv_dt = Util.checkString(req.getParameter("driv_dt"));

		dm.print();

		ds = (MT_ETCCAR_1005_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}

    //�������� �޺����� 
    public void mt_etccar_1100_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");
		MT_ETCCAR_1100_MDataSet ds = null;
		
		MT_ETCCAR_1100_MDM dm = new MT_ETCCAR_1100_MDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.print();

		ds = (MT_ETCCAR_1100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
	}
}
