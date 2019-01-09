/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.hd.emsy.wb;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.util.Util;
//import utils.system;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.hd.emsy.HD_MailsSender;
import chosun.ciis.hd.emsy.dm.*;
import chosun.ciis.hd.emsy.ds.*;
import chosun.ciis.hd.emsy.rec.*;
/**
 * 
 */
 
public class HD_EMSY_1000WB extends BaseWB {
	public void hd_emsy_2004_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EMSY_2004_ADataSet ds = null;
		HD_EMSY_2004_ADM dm = new HD_EMSY_2004_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.rec_yn = Util.checkString(req.getParameter("rec_yn"));
		dm.recemail = Util.checkString(req.getParameter("recemail"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

		dm.print();

		ds = (HD_EMSY_2004_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_emsy_2006_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EMSY_2006_LDataSet ds = null;
		HD_EMSY_2006_LDM dm = new HD_EMSY_2006_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));

		dm.print();

		ds = (HD_EMSY_2006_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_emsy_2002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EMSY_2002_LDataSet ds = null;
		HD_EMSY_2002_LDM dm = new HD_EMSY_2002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();

		ds = (HD_EMSY_2002_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		//System.out.println(ds.curlist.get(0));
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_emsy_1000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		DBManager manager = new DBManager("MISHDL");
		HD_EMSY_1000_LDataSet ds = null;
		HD_EMSY_1000_LDM dm = new HD_EMSY_1000_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();

		ds = (HD_EMSY_1000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_emsy_1100_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EMSY_1100_ADataSet ds = null;
		HD_EMSY_1100_ADM dm = new HD_EMSY_1100_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.sfromemail = Util.checkString(req.getParameter("sfromemail"));
		dm.smailsubject = Util.checkString(req.getParameter("smailsubject"));
		dm.smailcontent = Util.checkString(req.getParameter("smailcontent"));

		dm.print();

		ds = (HD_EMSY_1100_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_emsy_1200_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EMSY_1200_ADataSet ds = null;
		HD_EMSY_1200_ADM dm = new HD_EMSY_1200_ADM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();

		ds = (HD_EMSY_1200_ADataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_emsy_2000_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		HD_EMSY_2000_LDataSet ds = null;
		HD_EMSY_2000_LDM dm = new HD_EMSY_2000_LDM();
		
		HashMap rMap = new HashMap(); 
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.emp_no = Util.checkString(req.getParameter("emp_no"));
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.enc_prn = Util.checkString(req.getParameter("enc_prn"));
		
		String test_mode = Util.checkString(req.getParameter("test_mode"));
		String test_mail_id = Util.checkString(req.getParameter("test_mail_id"));
		
		rMap = get_Saly_Mail_MetaData(dm.cmpy_cd, dm.saly_yy, dm.saly_no);
		
		DBManager manager = new DBManager("MISHDL");
		
		dm.print();

		ds = (HD_EMSY_2000_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		String tmp = req.getParameter("enc_html").toString();
		//가지고온 ds로  html 파일을 만들어준다
		try {
			fileNewWriter(ds.strsql1, dm.emp_no);
			fileWriter(ds.strsql2, dm.emp_no);
			fileWriter(Util.checkString(tmp), dm.emp_no);
			fileWriter(ds.strsql3, dm.emp_no);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			HD_MailsSender ms = new HD_MailsSender();
			String sToEmail = "";
			if (test_mode.equals("Y")){
				sToEmail = test_mail_id;
			}else{
				sToEmail = ds.strsql6;
			}
			String sFromEmail = rMap.get("sfromemail").toString();
			String sMailSubject = rMap.get("smailsubject").toString();
			String sMailContent = getBrString(rMap.get("smailcontent").toString());	 
			
			//메일보낸다.
			ms.sendmail(sMailSubject,  sMailContent, sFromEmail, sToEmail, "/webstore/pub/ciis/hd_saly_email/", dm.emp_no+".html", dm.cmpy_cd, dm.saly_yy, dm.saly_no, dm.emp_no );
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("ds", ds);
	}
	
	public static String getBrString(String str)
	{
		if (str == null)
		{
			return "";
		}
		return defaultString(str).replaceAll("\n", "<br>");
	}
	
	public static String defaultString(String str)
    {
        return str != null ? str : "";
    }
	
	public HashMap get_Saly_Mail_MetaData(String cmpy_cd, String saly_yy, String saly_no) {
		DBManager manager = new DBManager("MISHDL");
		HD_EMSY_1009_LDataSet ds = null;
		HD_EMSY_1009_LDM dm = new HD_EMSY_1009_LDM();
		dm.cmpy_cd = cmpy_cd;
		dm.saly_yy = saly_yy;
		dm.saly_no = saly_no;
		dm.print();
		
		ds = (HD_EMSY_1009_LDataSet)manager.executeCall(dm);
		
		return (HashMap) ds.curlist.get(0);
	}
	
	
	
	public boolean fileNewWriter(String context, String emp_no) throws Exception {
		//local
		//String filePath = "C:\\saly_email\\"+emp_no+".html";
		//개발계
		//String filePath = "/was/ciis/hd_saly_email/"+emp_no+".html";
		//운영계 
//		String filePath = "/was/csi/hd_saly_email/"+emp_no+".html";
		//신 운영계  /webstore/pub/ciis
		String filePath = "/webstore/pub/ciis/hd_saly_email/"+emp_no+".html";
		FileWriter writeFile = new FileWriter(filePath); // 인자가 true이면
																// append가 됨.
																// 인자가 없으면 덮어씌우기
		writeFile.write(context+"\n");
		writeFile.close();
		return true;
	}
	
	public boolean fileWriter(String context, String emp_no) throws Exception {
		//local
		//String filePath = "C:\\saly_email\\"+emp_no+".html";
		//개발계
		//String filePath = "/was/ciis/hd_saly_email/"+emp_no+".html";
		//운영계
		//String filePath = "/was/csi/hd_saly_email/"+emp_no+".html";
		//신 운영계
		String filePath = "/webstore/pub/ciis/hd_saly_email/"+emp_no+".html";
		FileWriter writeFile = new FileWriter(filePath, true); // 인자가 true이면
																// append가 됨.
																// 인자가 없으면 덮어씌우기
		writeFile.write(context+"\n");
		writeFile.close();
		return true;
	}
	
	public void hd_emsy_2007_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		
		HD_EMSY_2007_LDataSet ds = null;
		HD_EMSY_2007_LDM dm = new HD_EMSY_2007_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.suc_yn = Util.checkString(req.getParameter("suc_yn"));

		dm.print();

		ds = (HD_EMSY_2007_LDataSet)manager.executeCall(dm);
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", ds);
	}
	
	public void hd_emsy_2009_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		
		HD_EMSY_2009_LDataSet ds = null;
		HD_EMSY_2009_LDM dm = new HD_EMSY_2009_LDM();
		
		DBManager manager = new DBManager("MISHDL");
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));

		dm.print();
		
		ds = (HD_EMSY_2009_LDataSet)manager.executeCall(dm);
		
		ArrayList rlist = new ArrayList();
		
		StringBuffer data = new StringBuffer();
		System.out.println("여긴 2009");
		for (int i = 0; i < ds.curlist.size(); i++) {
		      HD_EMSY_2009_LCURLISTRecord rec = (HD_EMSY_2009_LCURLISTRecord)ds.curlist.get(i);

		      if (dm.cmpy_cd.equals("334"))
		      {
		        System.out.println(" 회사 :334 ");
		        data.append(" <table width='860' border='0' cellspacing='0' cellpadding='0'> ");
		        data.append(" <tr> <td> ");
		        data.append(" <table width='550' border='1' cellspacing='0' cellpadding='0'> ");
		        data.append(" <tr><td height='22' colspan='2' bgcolor='ddf7ff'><div align='center' class='style3'>지 급 내 역 </div></td> ");
		        data.append(" <td colspan='2' bgcolor='ddf7ff'><div align='center' class='style3'>공 제 내 역 </div></td></tr> ");
		        data.append(" <tr><td width='138' height='22' bgcolor='f7f7f7'><div align='center' class='style3'>기 본 급 </div></td> ");
		        data.append(" <td width='137' height='22'><div align='right' class='style4'>&nbsp;" + rec.base_saly + "</div></td> ");
		        data.append(" <td width='138' height='22' bgcolor='f7f7f7' class='style3'><div align='center'>소 득 세 </div></td> ");
		        data.append(" <td width='137' height='22'><div align='right' class='style4'>&nbsp;" + rec.deci_incm_tax + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>상여 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.bns_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>주 민 세 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.deci_res_tax + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>식대</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.non_tax_food_alon + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>국민 연금 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.np_slf_ctrb_amt + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>자가운전수당 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.non_tax_auto_driv_alon + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>건강보험료</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hlth_insr_fee + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>취재수당</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.non_tax_jrnst + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>고용보험료</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.emp_insr_fee + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>직무수당</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.posk_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>연장 근로 수당 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.evngt_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>장기요양보험료 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hlth_insr_med_care_insr_fee + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>경조</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.congr_fee + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기타공제 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기타</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.etc_alon_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>선지급금</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adpay_amt + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>휴일수당</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hody_duty_alon + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>건강보험료정산</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hlth_insr_fee_adjm + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>연차수당 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.yymm_alon + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>동호회 월회비</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.crc_dus_tot + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>복리후생</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.welfare_fee + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>전월과오</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.prvmm_mstk_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");

		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>급여소급</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.retr_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp; </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");

		        data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감소득세</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_incm_tax + "</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감주민세</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_res_tax + "</div></td></tr> ");

		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감농특세</div></td> "); //정산차감농어촌특별세
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_farm_spc_tax + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='ffffcc'><div align='center' class='style3'>지 급 총 액 </div></td> ");
		        data.append(" <td height='22' bgcolor='ffffcc'><div align='right' class='style4'>&nbsp;" + rec.tot_pay_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='ffffcc' class='style3'><div align='center'>공 제 총 액 </div></td> ");
		        data.append(" <td height='22' bgcolor='ffffcc'><div align='right' class='style4'>&nbsp;" + rec.saly_dduc_stot + "</div></td></tr> ");
		        data.append(" <tr><td height='22' colspan='2' bgcolor='ffffcc'><div align='center' class='style3'></div>&nbsp;</td> ");
		        data.append(" <td height='22' bgcolor='ffffcc' class='style3'><div align='center'>차인지급액</div></td> ");
		        data.append(" <td height='22' bgcolor='ffffcc' align='right' class='style4'>&nbsp;" + rec.cal_pay_amt + "</td></tr></table> ");
		        data.append(" </td> <td> ");
		        data.append("  <table width='280' border='0' cellspacing='0' cellpadding='0'> ");
		        data.append("   <tr><td height='132'></td></tr>");
		        data.append("   <tr><td height='132'></td></tr>");
		        //data.append("   <tr><td height='132'></td></tr>");

			        if ((rec.etc_dduc_amt1.equals("")) && (rec.etc_dduc_amt2.equals("")) && (rec.etc_dduc_amt3.equals("")) && (rec.etc_dduc_amt4.equals("")) && (rec.etc_dduc_amt5.equals(""))) {
			          data.append("   <tr><td height='132'></td></tr>");
			        } else {
			          data.append("   <tr height='132'>");
			          data.append("     <td height='132'> ");
			          data.append("     <table width='280' border='1' cellspacing='0' cellpadding='0'>");
			          data.append("\t\t<tr> <td colspan='2' height='22' bgcolor='ddf7ff' class='style3'><div align='center'>기타공제내용</div></td></tr> ");
			          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm1 + "</div></td> ");
			          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt1 + "</td></tr>");
			          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm2 + "</div></td> ");
			          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt2 + "</td></tr>");
			          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm3 + "</div></td> ");
			          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt3 + "</td></tr>");
			          
			          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm4 + "</div></td> "); //경제아이_기타공제항목 5개로 늘림_20150610
			          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt4 + "</td></tr>");
			          
			          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm5 + "</div></td> ");
			          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt5 + "</td></tr>");
			          
			          data.append(" \t\t<tr> <td colspan='2' height='44' bgcolor='ffffff' class='style3'><div align='left'>&nbsp;" + rec.etc_dduc_remk + "</div></td> ");
			          data.append(" \t\t     </tr>");
			          data.append("     </table>");
			          data.append("     </td>");
			          data.append("   </tr>");
			        }
		        data.append("\t\t\t</tr> ");
		        data.append("  </table> ");
		        data.append("  </td></tr> ");
		        data.append("  </table> ");
		      }
		      else
		      {
		        data.append(" <table width='860' border='0' cellspacing='0' cellpadding='0'> ");
		        data.append(" <tr> <td> ");
		        data.append(" <table width='560' border='1' cellspacing='0' cellpadding='0'> ");
		        data.append(" <tr><td height='22' colspan='2' bgcolor='ddf7ff'><div align='center' class='style3'>지 급 내 역 </div></td> ");
		        data.append(" <td colspan='2' bgcolor='ddf7ff'><div align='center' class='style3'>공 제 내 역 </div></td></tr> ");
		        data.append(" <tr><td width='138' height='22' bgcolor='f7f7f7'><div align='center' class='style3'>기 본 급 </div></td> ");
		        data.append(" <td width='137' height='22'><div align='right' class='style4'>&nbsp;" + rec.base_saly + "</div></td> ");
		        data.append(" <td width='138' height='22' bgcolor='f7f7f7' class='style3'><div align='center'>소 득 세 </div></td> ");
		        data.append(" <td width='137' height='22'><div align='right' class='style4'>&nbsp;" + rec.deci_incm_tax + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>직 무 급</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.posk_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>주 민 세 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.deci_res_tax + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>특파원기본체재비</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.corr_base_stay_fee + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>국민 연금 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.np_slf_ctrb_amt + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>조출 수당 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.ovt_alon + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>건강보험료</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hlth_insr_fee + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>야간당직비</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.vgl_fee + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>고용보험료</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.emp_insr_fee + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>휴일 기본 수당 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.week_hody_base_alon + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>언론인금고</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.jnl_lon + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>휴일 보상  수당 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.week_hody_cmpn_alon + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>사내 복지 기금 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.welf_lon + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>개인연금 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.prsn_pens_dduc + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기지급기본체재비</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.corr_base_stay_fee_tm + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>전월 과오</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.prvmm_mstk_dduc + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기지급조출수당</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.ovt_alon_tm + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>연차 수당 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.yymm_alon + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기지금야간당직비</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.vgl_fee_tm + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>급여 소급</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.retr_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>단기대여금</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adv_dduc + "</div></td></tr> ");
			        if ((dm.saly_yy.equals("2013")) && (dm.saly_no.equals("01")) && (dm.cmpy_cd.equals("100"))) {
			          data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>특별위로금</div></td> ");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.etcsaly_spc + "</div></td> ");
			          data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>노동조합비 </div></td> ");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.labor_dduc_amt + "</div></td></tr> ");
			        }
			        else
			        {
			          data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td>");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
			          data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>노동조합비 </div></td> ");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.labor_dduc_amt + "</div></td></tr> ");
			        }
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>단체회비</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.paty_crc_dduc_amt + "</div></td></tr> ");

		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>휘트니스회비</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.fitness_amt + "</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기타공제 </div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt + "</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>주 차 비</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.park_fee_dduc + "</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>급여압류</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.seiz_dduc_amt + "</div></td></tr> ");
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
			        if ((dm.saly_yy.equals("2012")) && (dm.saly_no.equals("09"))) {
			          data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>소득세 환급액</div></td> ");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_incm_tax + "</div></td></tr> ");
			          data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
			          data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>주민세 환급액</div></td> ");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_res_tax + "</div></td></tr> ");
			        }
			        else
			        {
			          data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감소득세</div></td> ");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_incm_tax + "</div></td></tr> ");
			          data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
			          data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감주민세</div></td> ");
			          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_res_tax + "</div></td></tr> ");
			        }
		        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감농특세</div></td> "); //정산차감농특세
		        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_farm_spc_tax + "</div></td></tr> ");
		        data.append(" <tr><td height='22' bgcolor='ffffcc'><div align='center' class='style3'>지 급 총 액 </div></td> ");
		        data.append(" <td height='22' bgcolor='ffffcc'><div align='right' class='style4'>&nbsp;" + rec.tot_pay_saly + "</div></td> ");
		        data.append(" <td height='22' bgcolor='ffffcc' class='style3'><div align='center'>공 제 총 액 </div></td> ");
		        data.append(" <td height='22' bgcolor='ffffcc'><div align='right' class='style4'>&nbsp;" + rec.saly_dduc_stot + "</div></td></tr> ");
		        data.append(" <tr><td height='22' colspan='2' bgcolor='ffffcc'><div align='center' class='style3'>*연봉=월급(기본급+직무급)*12</div></td> ");
		        data.append(" <td height='22' bgcolor='ffffcc' class='style3'><div align='center'>차인지급액</div></td> ");
		        data.append(" <td height='22' bgcolor='ffffcc' align='right' class='style4'>&nbsp;" + rec.cal_pay_amt + "</td></tr></table> ");
		        data.append(" </td> <td> ");
		        data.append("  <table width='280' border='0' cellspacing='0' cellpadding='0'> ");
		        data.append("   <tr><td height='132'></td></tr>");
		        data.append("   <tr><td height='132'></td></tr>");
		        data.append("   <tr><td height='132'></td></tr>");

			        if ((rec.etc_dduc_amt1.equals("")) && (rec.etc_dduc_amt2.equals("")) && (rec.etc_dduc_amt3.equals(""))) {
			          data.append("   <tr><td height='132'></td></tr>");
			        } else {
			          data.append("   <tr height='132'>");
			          data.append("     <td height='132'> ");
			          data.append("     <table width='280' border='1' cellspacing='0' cellpadding='0'>");
			          data.append("\t\t<tr> <td colspan='2' height='22' bgcolor='ddf7ff' class='style3'><div align='center'>기타공제내용</div></td></tr> ");
			          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm1 + "</div></td> ");
			          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt1 + "</td></tr>");
			          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm2 + "</div></td> ");
			          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt2 + "</td></tr>");
			          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm3 + "</div></td> ");
			          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt3 + "</td></tr>");
			          data.append(" \t\t<tr> <td colspan='2' height='44' bgcolor='ffffff' class='style3'><div align='left'>&nbsp;" + rec.etc_dduc_remk + "</div></td> ");
			          data.append(" \t\t     </tr>");
			          data.append("     </table>");
			          data.append("     </td>");
			          data.append("   </tr>");
			        }
		        data.append("\t\t\t</tr> ");
		        data.append("  </table> ");
		        data.append("  </td></tr> ");
		        data.append("  </table> ");
		      }

		      HashMap rMap = new HashMap();
		      rMap.put("dept_nm", rec.dept_nm);
		      rMap.put("emp_no", rec.emp_no);
		      rMap.put("flnm", rec.flnm);
		      rMap.put("prn", rec.prn);
		      rMap.put("dhtml", data.toString());

		      rlist.add(rMap);

		      data.setLength(0);
		    }
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", rlist);
	}
	
	public void hd_emsy_2010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EMSY_2010_LDataSet ds = null;
		HD_EMSY_2010_LDM dm = new HD_EMSY_2010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.saly_yy = Util.checkString(req.getParameter("saly_yy"));
		dm.saly_no = Util.checkString(req.getParameter("saly_no"));
		dm.fr_emp_no = Util.checkString(req.getParameter("fr_emp_no"));
		dm.to_emp_no = Util.checkString(req.getParameter("to_emp_no"));

		dm.print();
		
		ds = (HD_EMSY_2010_LDataSet)manager.executeCall(dm);

		ArrayList rlist = new ArrayList();
		
		StringBuffer data = new StringBuffer();
		
		System.out.println(" 여긴 2010 ");
		for (int i = 0; i < ds.curlist.size(); i++)
	    {
	      HD_EMSY_2010_LCURLISTRecord rec = (HD_EMSY_2010_LCURLISTRecord)ds.curlist.get(i);
	      System.out.println(rec.adjm_dedu_res_tax);
	      System.out.println(rec.saly_dduc_stot);

	      if (dm.cmpy_cd.equals("334"))
	      {
	        System.out.println(" 회사 : 334 "); 
	        data.append(" <table width='840' border='0' cellspacing='0' cellpadding='0'> ");
	        data.append(" <tr> <td> ");
	        data.append(" <table width='560' border='1' cellspacing='0' cellpadding='0'> ");
	        data.append(" <tr><td height='22' colspan='2' bgcolor='ddf7ff'><div align='center' class='style3'>지 급 내 역 </div></td> ");
	        data.append(" <td colspan='2' bgcolor='ddf7ff'><div align='center' class='style3'>공 제 내 역 </div></td></tr> ");
	        data.append(" <tr><td width='138' height='22' bgcolor='f7f7f7'><div align='center' class='style3'>기 본 급 </div></td> ");
	        data.append(" <td width='137' height='22'><div align='right' class='style4'>&nbsp;" + rec.base_saly + "</div></td> ");
	        data.append(" <td width='138' height='22' bgcolor='f7f7f7' class='style3'><div align='center'>소 득 세 </div></td> ");
	        data.append(" <td width='137' height='22'><div align='right' class='style4'>&nbsp;" + rec.deci_incm_tax + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>상여 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.bns_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>주 민 세 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.deci_res_tax + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>식대</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.non_tax_food_alon + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>국민 연금 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.np_slf_ctrb_amt + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>자가운전수당 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.non_tax_auto_driv_alon + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>건강보험료</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hlth_insr_fee + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>취재수당</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.non_tax_jrnst + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>고용보험료</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.emp_insr_fee + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>직무수당</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.posk_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>학자금 상환액</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.repay_scl_exps + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>연장 근로 수당</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.evngt_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>장기요양보험료</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hlth_insr_med_care_insr_fee + "</div></td></tr> ");

	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>경조</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.congr_fee + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기타공제 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt + "</div></td></tr> ");

	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기타</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.etc_alon_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>선지급금</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adpay_amt + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>휴일수당</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hody_duty_alon + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>건강보험료정산</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hlth_insr_fee_adjm + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>연차 수당 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.yymm_alon + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>동호회 월회비</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.crc_dus_tot + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>복리후생 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.welfare_fee + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>전월과오</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.prvmm_mstk_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp; </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");

	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>급여소급</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.retr_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");

	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp; </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td></tr> ");
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");

	        data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감소득세</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_incm_tax + "</div></td></tr> ");
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감주민세</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_res_tax + "</div></td></tr> ");

	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감농특세</div></td> "); //정산차감농특세
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_farm_spc_tax + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='ffffcc'><div align='center' class='style3'>지 급 총 액 </div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc'><div align='right' class='style4'>&nbsp;" + rec.tot_pay_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc' class='style3'><div align='center'>공 제 총 액 </div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc'><div align='right' class='style4'>&nbsp;" + rec.saly_dduc_stot + "</div></td></tr> ");
	        data.append(" <tr><td height='22' colspan='2' bgcolor='ffffcc'><div align='center' class='style3'>*연봉=월급(기본급+직무급)*12</div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc' class='style3'><div align='center'>차인지급액</div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc' align='right' class='style4'>&nbsp;" + rec.cal_pay_amt + "</td></tr></table> ");
	        data.append(" </td> <td> ");
	        data.append("  <table width='280' border='0' cellspacing='0' cellpadding='0'> ");
	        data.append("   <tr><td height='132'></td></tr>");
	        data.append("   <tr><td height='132'></td></tr>");
	        //data.append("   <tr><td height='132'></td></tr>");

		        if ((rec.etc_dduc_amt1.equals("")) && (rec.etc_dduc_amt2.equals("")) && (rec.etc_dduc_amt3.equals("")) && (rec.etc_dduc_amt4.equals("")) && (rec.etc_dduc_amt5.equals(""))) {
		          data.append("   <tr><td height='132'></td></tr>");
		        } else {
		          data.append("   <tr height='132'>");
		          data.append("     <td height='132'> ");
		          data.append("     <table width='280' border='1' cellspacing='0' cellpadding='0'>");
		          data.append("\t\t<tr> <td colspan='2' height='22' bgcolor='ddf7ff' class='style3'><div align='center'>기타공제내용</div></td></tr> ");
		          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm1 + "</div></td> ");
		          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt1 + "</td></tr>");
		          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm2 + "</div></td> ");
		          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt2 + "</td></tr>");
		          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm3 + "</div></td> ");
		          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt3 + "</td></tr>");
		          
		          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm4 + "</div></td> "); //경제아이 기타공제항목 5개로 늘림_20150610
		          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt4 + "</td></tr>");
		          
		          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm5 + "</div></td> ");
		          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt5 + "</td></tr>");
		          
		          data.append(" \t\t<tr> <td colspan='2' height='44' bgcolor='ffffff' class='style3'><div align='left'>&nbsp;" + rec.etc_dduc_remk + "</div></td> ");
		          data.append(" \t\t     </tr>");
		          data.append("     </table>");
		          data.append("     </td>");
		          data.append("   </tr>");
		        }
	        data.append("\t\t\t</tr> ");
	        data.append("  </table> ");
	        data.append("  </td></tr> ");
	        data.append("  </table> ");
	      }
	      else
	      {
	        System.out.println(" 회사  그외(조선일보만사용)");
	        data.append(" <table width='840' border='0' cellspacing='0' cellpadding='0'> ");
	        data.append(" <tr> <td> ");
	        data.append(" <table width='560' border='1' cellspacing='0' cellpadding='0'> ");
	        data.append(" <tr><td height='22' colspan='2' bgcolor='ddf7ff'><div align='center' class='style3'>지 급 내 역 </div></td> ");
	        data.append(" <td colspan='2' bgcolor='ddf7ff'><div align='center' class='style3'>공 제 내 역 </div></td></tr> ");
	        data.append(" <tr><td width='138' height='22' bgcolor='f7f7f7'><div align='center' class='style3'>기 본 급 </div></td> ");
	        data.append(" <td width='137' height='22'><div align='right' class='style4'>&nbsp;" + rec.base_saly + "</div></td> ");
	        data.append(" <td width='138' height='22' bgcolor='f7f7f7' class='style3'><div align='center'>소 득 세 </div></td> ");
	        data.append(" <td width='137' height='22'><div align='right' class='style4'>&nbsp;" + rec.deci_incm_tax + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>직 무 급</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.posk_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>주 민 세 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.deci_res_tax + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>특파원기본체재비</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.corr_base_stay_fee + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>국민 연금 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.np_slf_ctrb_amt + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>조출 수당 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.ovt_alon + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>건강보험료</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.hlth_insr_fee + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>야간당직비</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.vgl_fee + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>고용보험료</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.emp_insr_fee + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>휴일 기본 수당 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.week_hody_base_alon + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>언론인금고</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.jnl_lon + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>휴일 보상  수당 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.week_hody_cmpn_alon + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>사내 복지 기금 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.welf_lon + "</div></td></tr> ");

	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>개인연금 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.prsn_pens_dduc + "</div></td></tr> ");

	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기지급기본체재비</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.corr_base_stay_fee_tm + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>전월 과오</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.prvmm_mstk_dduc + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기지급조출수당</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.ovt_alon_tm + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>연차 수당 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.yymm_alon + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기지금야간당직비</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.vgl_fee_tm + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>급여 소급 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.retr_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>단기대여금</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adv_dduc + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>특별위로금</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.etcsaly_spc + "</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>노동조합비 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.labor_dduc_amt + "</div></td></tr> ");
		        if ((dm.saly_yy.equals("2013")) && (dm.saly_no.equals("01")) && (dm.cmpy_cd.equals("100"))) {
		          data.append(" <tr><td height='22' bgcolor='f7f7f7' class='style3'><div align='center' >특별위로금</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.etcsaly_spc + "</div></td> ");
		          data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>단체회비</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.paty_crc_dduc_amt + "</div></td></tr> ");
		        }
		        else
		        {
		          data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		          data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>단체회비</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.paty_crc_dduc_amt + "</div></td></tr> ");
		        }
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>휘트니스회비</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.fitness_amt + "</div></td></tr> ");
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>기타공제 </div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt + "</div></td></tr> ");
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>주 차 비</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.park_fee_dduc + "</div></td></tr> ");
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>급여압류</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.seiz_dduc_amt + "</div></td></tr> ");
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		        if ((dm.saly_yy.equals("2012")) && (dm.saly_no.equals("09"))) {
		          data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>소득세 환급액</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_incm_tax + "</div></td></tr> ");
		          data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		          data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>주민세 환급액</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_res_tax + "</div></td></tr> ");
		        }
		        else
		        {
		          data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감소득세</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_incm_tax + "</div></td></tr> ");
		          data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
		          data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감주민세</div></td> ");
		          data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_res_tax + "</div></td></tr> ");
		        }
	        data.append(" <tr><td height='22'><div align='center' class='style3'>&nbsp;</div></td> ");
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;</div></td> ");
	        data.append(" <td height='22' bgcolor='f7f7f7'><div align='center' class='style3'>정산차감농특세</div></td> "); //정산차감농특세
	        data.append(" <td height='22'><div align='right' class='style4'>&nbsp;" + rec.adjm_dedu_farm_spc_tax + "</div></td></tr> ");
	        data.append(" <tr><td height='22' bgcolor='ffffcc'><div align='center' class='style3'>지 급 총 액 </div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc'><div align='right' class='style4'>&nbsp;" + rec.tot_pay_saly + "</div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc' class='style3'><div align='center'>공 제 총 액 </div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc'><div align='right' class='style4'>&nbsp;" + rec.saly_dduc_stot + "</div></td></tr> ");
	        data.append(" <tr><td height='22' colspan='2' bgcolor='ffffcc'><div align='center' class='style3'>*연봉=월급(기본급+직무급)*12</div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc' class='style3'><div align='center'>차인지급액</div></td> ");
	        data.append(" <td height='22' bgcolor='ffffcc' align='right' class='style4'>&nbsp;" + rec.cal_pay_amt + "</td></tr></table> ");
	        data.append(" </td> <td> ");
	        data.append("  <table width='280' border='0' cellspacing='0' cellpadding='0'> ");
	        data.append("   <tr><td height='132'></td></tr>");
	        data.append("   <tr><td height='132'></td></tr>");
	        data.append("   <tr><td height='132'></td></tr>");

		        if ((rec.etc_dduc_amt1.equals("")) && (rec.etc_dduc_amt2.equals("")) && (rec.etc_dduc_amt3.equals(""))) {
		          data.append("   <tr><td height='132'></td></tr>");
		        } else {
		          data.append("   <tr height='132'>");
		          data.append("     <td height='132'> ");
		          data.append("     <table width='280' border='1' cellspacing='0' cellpadding='0'>");
		          data.append("\t\t<tr> <td colspan='2' height='22' bgcolor='ddf7ff' class='style3'><div align='center'>기타공제내용</div></td></tr> ");
		          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm1 + "</div></td> ");
		          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt1 + "</td></tr>");
		          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm2 + "</div></td> ");
		          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt2 + "</td></tr>");
		          data.append(" \t\t<tr> <td height='22' bgcolor='f7f7f7' class='style3'><div align='center'>&nbsp;" + rec.etc_dduc_nm3 + "</div></td> ");
		          data.append(" \t\t     <td height='22' bgcolor='ffffff' align='right' class='style4'>&nbsp;" + rec.etc_dduc_amt3 + "</td></tr>");
		          data.append(" \t\t<tr> <td colspan='2' height='44' bgcolor='ffffff' class='style3'><div align='left'>&nbsp;" + rec.etc_dduc_remk + "</div></td> ");
		          data.append(" \t\t     </tr>");
		          data.append("     </table>");
		          data.append("     </td>");
		          data.append("   </tr>");
		        }
	        data.append("\t\t\t</tr> ");
	        data.append("  </table> ");
	        data.append("  </td></tr> ");
	        data.append("  </table> ");
	      }

	      HashMap rMap = new HashMap();
	      rMap.put("dept_nm", rec.dept_nm);
	      rMap.put("emp_no", rec.emp_no);
	      rMap.put("flnm", rec.flnm);
	      rMap.put("prn", rec.prn);
	      rMap.put("dhtml", data.toString());

	      rlist.add(rMap);

	      data.setLength(0);
	    }
		
		if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
		
		req.setAttribute("ds", rlist);
	}
	
	
}