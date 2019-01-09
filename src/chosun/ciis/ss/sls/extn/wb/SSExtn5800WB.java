/***************************************************************************************************
* 파일명 : SSExtn5800WB.java
* 기능 : 확장관리-글쓰기 노트
* 작성일자 : 2018-02-09
* 작성자 : 민기홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;
 
import javax.ejb.*;
import java.util.*;				//추가
import java.lang.*;				//추가
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * WB
 */

public class SSExtn5800WB{

	public void ininExtn5800(HttpServletRequest req, HttpServletResponse res) throws AppException{
		// TODO Auto-generated method stub
		String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
        String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);
        SS_SLS_EXTN_5800_ADM dm = new SS_SLS_EXTN_5800_ADM();
        dm.setCmpy_cd(cmpycd);
        dm.setIncmg_pers(incmgpers);
//        dm.print();
        
        SSExtn5800DAO dao = new SSExtn5800DAO();
        SS_SLS_EXTN_5800_ADataSet ds = dao.SS_SLS_EXTN_5800_A(dm);
        
        req.setAttribute("ds", ds);
	}
	
	public void selectExtn5800WB(HttpServletRequest req, HttpServletResponse res) throws AppException {
		// TODO Auto-generated method stub
		String deptcd = Util.checkString(req.getParameter("deptcd"));
		String partcd = Util.checkString(req.getParameter("partcd"));
		String areacd = Util.checkString(req.getParameter("areacd"));
		String bocd = Util.checkString(req.getParameter("bocd"));
		String fromdt = Util.checkString(req.getParameter("fromdt"));
		String todt = Util.checkString(req.getParameter("todt"));
//		String bonm = Util.checkString(req.getParameter("bonm"));
		String rdrgb = Util.checkString(req.getParameter("rdrgb"));
		String prodgb = Util.checkString(req.getParameter("prodgb"));
		String dlvct = Util.checkString(req.getParameter("dlvct"));
		String dlvstat = Util.checkString(req.getParameter("dlvstat"));
		String pay_mthd = Util.checkString(req.getParameter("paymthd"));
		String pay_gb = Util.checkString(req.getParameter("paygb"));
		String errgb = Util.checkString(req.getParameter("errgb"));
		String rcvr_nm = Util.checkString(req.getParameter("rcvr_nm"));
		
		SS_SLS_EXTN_5810_LDM dm = new SS_SLS_EXTN_5810_LDM();
		dm.setDeptcd(deptcd);
		dm.setPartcd(partcd);
		dm.setAreacd(areacd);
		dm.setBocd(bocd);
		dm.setFromdt(fromdt);
		dm.setTodt(todt);
		dm.setRdrgb(rdrgb);
		dm.setProdgb(prodgb);
		dm.setDlvct(dlvct);
		dm.setDlvstat(dlvstat);
		dm.setPay_mthd(pay_mthd);
		dm.setPay_gb(pay_gb);
		dm.setErrgb(errgb);
		dm.setRcvr_nm(rcvr_nm);
		
//		dm.print();
		
		SSExtn5800DAO dao = new SSExtn5800DAO();
		SS_SLS_EXTN_5810_LDataSet ds = dao.SS_SLS_EXTN_5810_L(dm);
		
		req.setAttribute("ds", ds);
		
	}

	public void updateExtn5800(HttpServletRequest req, HttpServletResponse res) throws AppException {
		// TODO Auto-generated method stub
		String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
		System.out.println("multiUpdateData: "+multiUpdateData);
		
		SS_SLS_EXTN_5820_UDM dm = new SS_SLS_EXTN_5820_UDM();
		
		String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
		
		Hashtable hash = new Hashtable();
		if(!"".equals(multiUpdateData)) {
			hash = getHashMultiUpdateData(multiUpdateData);
			String rdr_extndt 		= Util.checkString((String)hash.get("rdr_extndt"));
			String rdr_extnno 		= Util.checkString((String)hash.get("rdr_extnno"));
			String bocd 			= Util.checkString((String)hash.get("bocd"));
			String rcvr_bocd 		= Util.checkString((String)hash.get("rcvr_bocd"));
			String rcvr_nm 			= Util.checkString((String)hash.get("rcvr_nm"));
			String rcvr_telno1 		= Util.checkString((String)hash.get("rcvr_telno1"));
			String rcvr_telno2 		= Util.checkString((String)hash.get("rcvr_telno2"));
			String rcvr_telno3 		= Util.checkString((String)hash.get("rcvr_telno3"));
			String rcvr_ptphno1 	= Util.checkString((String)hash.get("rcvr_ptphno1"));
			String rcvr_ptphno2 	= Util.checkString((String)hash.get("rcvr_ptphno2"));
			String rcvr_ptphno3 	= Util.checkString((String)hash.get("rcvr_ptphno3"));
			String rcvr_zip 		= Util.checkString((String)hash.get("rcvr_zip"));
			String rcvr_addr 		= Util.checkString((String)hash.get("rcvr_addr"));
			String rcvr_dtlsaddr	= Util.checkString((String)hash.get("rcvr_dtlsaddr"));
			String remk 			= Util.checkString((String)hash.get("remk"));
			String bo_headcnfmdt 	= Util.checkString((String)hash.get("bo_headcnfmdt"));
			String dlvdt 			= Util.checkString((String)hash.get("dlvdt"));
			String bldmngnn			= Util.checkString((String)hash.get("bldmngnn"));
			String ordr_no			= Util.checkString((String)hash.get("ordr_no"));
			String subscnfmstatcd   = Util.checkString((String)hash.get("subscnfmstatcd"));
			
			dm.setRdr_extndt(rdr_extndt);
			dm.setRdr_extnno(rdr_extnno);
			dm.setBocd(bocd);
			dm.setRcvr_bocd(rcvr_bocd);
			dm.setRcvr_nm(rcvr_nm);
			dm.setRcvr_telno1(rcvr_telno1);
			dm.setRcvr_telno2(rcvr_telno2);
			dm.setRcvr_telno3(rcvr_telno3);
			dm.setRcvr_ptphno1(rcvr_ptphno1);
			dm.setRcvr_ptphno2(rcvr_ptphno2);
			dm.setRcvr_ptphno3(rcvr_ptphno3);
			dm.setRcvr_zip(rcvr_zip);
			dm.setRcvr_addr(rcvr_addr);
			dm.setRcvr_dtlsaddr(rcvr_dtlsaddr);
			dm.setRemk(remk);
			dm.setBo_headcnfmdt(bo_headcnfmdt);
			dm.setDlvdt(dlvdt);
			dm.setBldnmgnn(bldmngnn);
			dm.setOrdr_no(ordr_no);
			dm.setSubscnfmstatcd(subscnfmstatcd);
			dm.setIncmgpers(incmgpers);
		}
		
		dm.print();
		
		SSExtn5800DAO dao = new SSExtn5800DAO();
		
		SS_SLS_EXTN_5820_UDataSet ds = dao.updateBuyerInfo(dm);
		
		req.setAttribute("ds", ds);
	}
	
    public final String ROW_SEPARATOR = "|";
    public final String COL_SEPARATOR = "\\^";
    public final String COL_APPENDER = "##";
    
    public Hashtable getHashMultiUpdateData(String multiUpdateData) throws AppException {
      	Hashtable 	hash	= new Hashtable();
      	
      	try{
        	String[][] temp_arr = null;
        	
        	StringTokenizer st = new StringTokenizer(multiUpdateData, ROW_SEPARATOR);
        	int rowCount  = 0;
        	int colCount  = st.countTokens();
        	int col = 0;
        	int row = 0;
        	while(st.hasMoreTokens()){
        		row = 0;
        		String token 	 	= st.nextToken();
        		String[] token_arr 	= token.split(COL_SEPARATOR);
        		System.out.println(Arrays.toString(token_arr));
        		if(temp_arr == null){
        			rowCount = token_arr.length;
        			temp_arr = new String[rowCount][colCount];
        		}
        		for(int i=0; i<token_arr.length; i++){
        			temp_arr[row++][col] = token_arr[i];
        		}
        		col++;
        	}
        	for(int i=0; i<temp_arr.length; i++){
        		StringBuffer sb = new StringBuffer();
        		String header   = temp_arr[i][0];
        		for(int j=1; j<temp_arr[i].length; j++){
        			sb.append(StringUtil.nvl(temp_arr[i][j]));
        			if(j<temp_arr[i].length-1){
        				sb.append(COL_APPENDER);
        			}
        		}        		
        		hash.put(header, sb.toString());
        	}        	
      	}catch(Exception e){
      		throw new AppException("BaseWB.getHashMultiUpdateData", e.getLocalizedMessage()+ multiUpdateData);
      	}
      	return hash;   
    }

	public void dlvComplete(HttpServletRequest req, HttpServletResponse res) throws AppException{
		// TODO Auto-generated method stub
		String rdr_no = Util.checkString(req.getParameter("rdr_no"));
		String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
		String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
		String rcvr_qty	= Util.checkString(req.getParameter("rcvr_qty"));
		String medicd = Util.checkString(req.getParameter("medicd"));
		String rcvr_bocd = Util.checkString(req.getParameter("rcvr_bocd"));
		String campid = Util.checkString(req.getParameter("campid"));
		String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
		String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
		
		SS_SLS_EXTN_5830_UDM dm = new SS_SLS_EXTN_5830_UDM();
		dm.setRdr_no(rdr_no);
		dm.setRdr_extnno(rdr_extnno);
		dm.setRdr_extndt(rdr_extndt);
		dm.setRcvr_qty(rcvr_qty);
		dm.setMedicd(medicd);
		dm.setRcvr_bocd(rcvr_bocd);
		dm.setCampid(campid);
		dm.setIncmgpers(incmgpers);
		dm.setSubscnfmstatcd(subscnfmstatcd);
//		dm.print();
		
		SSExtn5800DAO dao = new SSExtn5800DAO();
		
		SS_SLS_EXTN_5830_UDataSet ds = dao.dlvComplete(dm);
		
		req.setAttribute("ds", ds);
	}

	public void isDlvChg(HttpServletRequest req, HttpServletResponse res) throws AppException {
		// TODO Auto-generated method stub
		String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
		String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
		String medicd = Util.checkString(req.getParameter("medicd"));
		String campid = Util.checkString(req.getParameter("campid"));
		String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
		String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
		
		SS_SLS_EXTN_5840_UDM dm = new SS_SLS_EXTN_5840_UDM();
		dm.setRdr_extndt(rdr_extndt);
		dm.setRdr_extnno(rdr_extnno);
		dm.setMedicd(medicd);
		dm.setCampid(campid);
		dm.setSubscnfmstatcd(subscnfmstatcd);
		dm.setIncmgpers(incmgpers);
		
		SSExtn5800DAO dao = new SSExtn5800DAO();
		
		SS_SLS_EXTN_5840_UDataSet ds= dao.isDlvChg(dm);
		
		req.setAttribute("ds", ds);
	}
	
	public void isPayCanc(HttpServletRequest req, HttpServletResponse res) throws AppException {
		// TODO Auto-generated method stub
		String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
		String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
		String medicd = Util.checkString(req.getParameter("medicd"));
		String campid = Util.checkString(req.getParameter("campid"));
		String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
		String incmgpers = Util.getSessionParameterValue(req, "emp_no", true);
		
		SS_SLS_EXTN_5850_UDM dm = new SS_SLS_EXTN_5850_UDM();
		dm.setRdr_extndt(rdr_extndt);
		dm.setRdr_extnno(rdr_extnno);
		dm.setMedicd(medicd);
		dm.setCampid(campid);
		dm.setSubscnfmstatcd(subscnfmstatcd);
		dm.setIncmgpers(incmgpers);
		
		dm.print();
		
		SSExtn5800DAO dao = new SSExtn5800DAO();
		
		SS_SLS_EXTN_5850_UDataSet ds= dao.isPayCanc(dm);
		
		req.setAttribute("ds", ds);
	}

}    