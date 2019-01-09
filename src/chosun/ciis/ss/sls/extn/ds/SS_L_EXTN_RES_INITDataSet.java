/***************************************************************************************************
* 파일명 : .java
* 기능 : * 확장현황-확장제한-초기화면
* 작성일자 : 2009-09-08
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 *  확장현황-확장제한-초기화면
 */

public class SS_L_EXTN_RES_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList resiclsfcdcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList dstcinfocur = new ArrayList();
	public ArrayList partlist = new ArrayList();
	public ArrayList arealist = new ArrayList();
	public ArrayList resitypecdcur = new ArrayList();
	public ArrayList paty_clsfcdcur = new ArrayList();
	public ArrayList extntypecdcur = new ArrayList();
	public ArrayList cns_empcnfmstatcdcur = new ArrayList();
	public ArrayList aplcpathcdcur = new ArrayList();
	public ArrayList clamtmthdcdcur = new ArrayList();
	public ArrayList dlvmthdcdcur = new ArrayList();
	public ArrayList cns_empcnfmocomcdcur = new ArrayList();
	public ArrayList chrg_cnfmocomcdcur = new ArrayList();
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList freeclsfcdcur = new ArrayList();
	public ArrayList teamlist = new ArrayList();
	public ArrayList chrg_cnfmstatcdcur = new ArrayList();
	public ArrayList thrwplaccdcur = new ArrayList();
	public ArrayList addrcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_EXTN_RES_INITDataSet(){}
	public SS_L_EXTN_RES_INITDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_L_EXTN_RES_INITTEAMLISTRecord rec = new SS_L_EXTN_RES_INITTEAMLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.teamlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SS_L_EXTN_RES_INITPARTLISTRecord rec = new SS_L_EXTN_RES_INITPARTLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.partlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SS_L_EXTN_RES_INITAREALISTRecord rec = new SS_L_EXTN_RES_INITAREALISTRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.arealist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SS_L_EXTN_RES_INITMEDICDCURRecord rec = new SS_L_EXTN_RES_INITMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(12);
		while(rset4.next()){
			SS_L_EXTN_RES_INITEXTNTYPECDCURRecord rec = new SS_L_EXTN_RES_INITEXTNTYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			this.extntypecdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord rec = new SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			this.cns_empcnfmstatcdcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(14);
		while(rset6.next()){
			SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord rec = new SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			this.cns_empcnfmocomcdcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(15);
		while(rset7.next()){
			SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord rec = new SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord();
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset7.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset7.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset7.getString("cicdgb"));
			this.chrg_cnfmstatcdcur.add(rec);
		}
		ResultSet rset8 = (ResultSet) cstmt.getObject(16);
		while(rset8.next()){
			SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord rec = new SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord();
			rec.cicodeval = Util.checkString(rset8.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset8.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset8.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset8.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset8.getString("cicdgb"));
			this.chrg_cnfmocomcdcur.add(rec);
		}
		ResultSet rset9 = (ResultSet) cstmt.getObject(17);
		while(rset9.next()){
			SS_L_EXTN_RES_INITDSTCINFOCURRecord rec = new SS_L_EXTN_RES_INITDSTCINFOCURRecord();
			rec.dstccd = Util.checkString(rset9.getString("dstccd"));
			rec.dstcnm = Util.checkString(rset9.getString("dstcnm"));
			rec.teamcd = Util.checkString(rset9.getString("teamcd"));
			this.dstcinfocur.add(rec);
		}
		ResultSet rset10 = (ResultSet) cstmt.getObject(18);
		while(rset10.next()){
			SS_L_EXTN_RES_INITADDRCDCURRecord rec = new SS_L_EXTN_RES_INITADDRCDCURRecord();
			rec.addrcd = Util.checkString(rset10.getString("addrcd"));
			rec.addrnm = Util.checkString(rset10.getString("addrnm"));
			rec.resitypecd = Util.checkString(rset10.getString("resitypecd"));
			rec.addrbnji = Util.checkString(rset10.getString("addrbnji"));
			rec.mvindt = Util.checkString(rset10.getString("mvindt"));
			this.addrcdcur.add(rec);
		}
		ResultSet rset11 = (ResultSet) cstmt.getObject(19);
		while(rset11.next()){
			SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord rec = new SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset11.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset11.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset11.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset11.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset11.getString("cicdgb"));
			this.paty_clsfcdcur.add(rec);
		}
		ResultSet rset12 = (ResultSet) cstmt.getObject(20);
		while(rset12.next()){
			SS_L_EXTN_RES_INITRESITYPECDCURRecord rec = new SS_L_EXTN_RES_INITRESITYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset12.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset12.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset12.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset12.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset12.getString("cicdgb"));
			this.resitypecdcur.add(rec);
		}
		ResultSet rset13 = (ResultSet) cstmt.getObject(21);
		while(rset13.next()){
			SS_L_EXTN_RES_INITRESICLSFCDCURRecord rec = new SS_L_EXTN_RES_INITRESICLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset13.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset13.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset13.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset13.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset13.getString("cicdgb"));
			this.resiclsfcdcur.add(rec);
		}
		ResultSet rset14 = (ResultSet) cstmt.getObject(22);
		while(rset14.next()){
			SS_L_EXTN_RES_INITDLVMTHDCDCURRecord rec = new SS_L_EXTN_RES_INITDLVMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset14.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset14.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset14.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset14.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset14.getString("cicdgb"));
			this.dlvmthdcdcur.add(rec);
		}
		ResultSet rset15 = (ResultSet) cstmt.getObject(23);
		while(rset15.next()){
			SS_L_EXTN_RES_INITTHRWPLACCDCURRecord rec = new SS_L_EXTN_RES_INITTHRWPLACCDCURRecord();
			rec.cicodeval = Util.checkString(rset15.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset15.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset15.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset15.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset15.getString("cicdgb"));
			this.thrwplaccdcur.add(rec);
		}
		ResultSet rset16 = (ResultSet) cstmt.getObject(24);
		while(rset16.next()){
			SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord rec = new SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset16.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset16.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset16.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset16.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset16.getString("cicdgb"));
			this.clamtmthdcdcur.add(rec);
		}
		ResultSet rset17 = (ResultSet) cstmt.getObject(25);
		while(rset17.next()){
			SS_L_EXTN_RES_INITFREECLSFCDCURRecord rec = new SS_L_EXTN_RES_INITFREECLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset17.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset17.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset17.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset17.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset17.getString("cicdgb"));
			this.freeclsfcdcur.add(rec);
		}
		ResultSet rset18 = (ResultSet) cstmt.getObject(26);
		while(rset18.next()){
			SS_L_EXTN_RES_INITAPLCPATHCDCURRecord rec = new SS_L_EXTN_RES_INITAPLCPATHCDCURRecord();
			rec.cicodeval = Util.checkString(rset18.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset18.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset18.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset18.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset18.getString("cicdgb"));
			this.aplcpathcdcur.add(rec);
		}
	}

	public String teamlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITTEAMLISTRecord rec = (SS_L_EXTN_RES_INITTEAMLISTRecord)teamlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String partlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = partlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITPARTLISTRecord rec = (SS_L_EXTN_RES_INITPARTLISTRecord)partlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String arealistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITAREALISTRecord rec = (SS_L_EXTN_RES_INITAREALISTRecord)arealist.get(i);
			
			
			String code = rec.area_cd;
			String name = rec.area_nm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITMEDICDCURRecord rec = (SS_L_EXTN_RES_INITMEDICDCURRecord)medicdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String extntypecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extntypecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITEXTNTYPECDCURRecord rec = (SS_L_EXTN_RES_INITEXTNTYPECDCURRecord)extntypecdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String cns_empcnfmstatcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cns_empcnfmstatcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord rec = (SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord)cns_empcnfmstatcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String cns_empcnfmocomcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cns_empcnfmocomcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord rec = (SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord)cns_empcnfmocomcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String chrg_cnfmstatcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = chrg_cnfmstatcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord rec = (SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord)chrg_cnfmstatcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String chrg_cnfmocomcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = chrg_cnfmocomcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord rec = (SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord)chrg_cnfmocomcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String dstcinfocurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITDSTCINFOCURRecord rec = (SS_L_EXTN_RES_INITDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String addrcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITADDRCDCURRecord rec = (SS_L_EXTN_RES_INITADDRCDCURRecord)addrcdcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.addrnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String paty_clsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paty_clsfcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord rec = (SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord)paty_clsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String resitypecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resitypecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITRESITYPECDCURRecord rec = (SS_L_EXTN_RES_INITRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String resiclsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resiclsfcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITRESICLSFCDCURRecord rec = (SS_L_EXTN_RES_INITRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String dlvmthdcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvmthdcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITDLVMTHDCDCURRecord rec = (SS_L_EXTN_RES_INITDLVMTHDCDCURRecord)dlvmthdcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String thrwplaccdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = thrwplaccdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITTHRWPLACCDCURRecord rec = (SS_L_EXTN_RES_INITTHRWPLACCDCURRecord)thrwplaccdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String clamtmthdcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord rec = (SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String freeclsfcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITFREECLSFCDCURRecord rec = (SS_L_EXTN_RES_INITFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String aplcpathcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITAPLCPATHCDCURRecord rec = (SS_L_EXTN_RES_INITAPLCPATHCDCURRecord)aplcpathcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}

	public String teamlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITTEAMLISTRecord rec = (SS_L_EXTN_RES_INITTEAMLISTRecord)teamlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String partlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = partlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITPARTLISTRecord rec = (SS_L_EXTN_RES_INITPARTLISTRecord)partlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String arealistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITAREALISTRecord rec = (SS_L_EXTN_RES_INITAREALISTRecord)arealist.get(i);
			
			
			String code = rec.area_cd;
			String name = rec.area_nm;
			
			sb.append("<input name=\"");
			sb.append("area_cd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITMEDICDCURRecord rec = (SS_L_EXTN_RES_INITMEDICDCURRecord)medicdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String extntypecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extntypecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITEXTNTYPECDCURRecord rec = (SS_L_EXTN_RES_INITEXTNTYPECDCURRecord)extntypecdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String cns_empcnfmstatcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cns_empcnfmstatcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord rec = (SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord)cns_empcnfmstatcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String cns_empcnfmocomcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cns_empcnfmocomcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord rec = (SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord)cns_empcnfmocomcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String chrg_cnfmstatcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = chrg_cnfmstatcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord rec = (SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord)chrg_cnfmstatcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String chrg_cnfmocomcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = chrg_cnfmocomcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord rec = (SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord)chrg_cnfmocomcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dstcinfocurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITDSTCINFOCURRecord rec = (SS_L_EXTN_RES_INITDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String addrcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITADDRCDCURRecord rec = (SS_L_EXTN_RES_INITADDRCDCURRecord)addrcdcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.addrnm;
			
			sb.append("<input name=\"");
			sb.append("addrcd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String paty_clsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paty_clsfcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord rec = (SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord)paty_clsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String resitypecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resitypecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITRESITYPECDCURRecord rec = (SS_L_EXTN_RES_INITRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String resiclsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resiclsfcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITRESICLSFCDCURRecord rec = (SS_L_EXTN_RES_INITRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dlvmthdcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvmthdcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITDLVMTHDCDCURRecord rec = (SS_L_EXTN_RES_INITDLVMTHDCDCURRecord)dlvmthdcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String thrwplaccdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = thrwplaccdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITTHRWPLACCDCURRecord rec = (SS_L_EXTN_RES_INITTHRWPLACCDCURRecord)thrwplaccdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String clamtmthdcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord rec = (SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String freeclsfcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITFREECLSFCDCURRecord rec = (SS_L_EXTN_RES_INITFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String aplcpathcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITAPLCPATHCDCURRecord rec = (SS_L_EXTN_RES_INITAPLCPATHCDCURRecord)aplcpathcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String teamlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = teamlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITTEAMLISTRecord rec = (SS_L_EXTN_RES_INITTEAMLISTRecord)teamlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String partlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = partlist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITPARTLISTRecord rec = (SS_L_EXTN_RES_INITPARTLISTRecord)partlist.get(i);
			
			
			String code = rec.dept_cd;
			String name = rec.dept_nm;
			
			sb.append("<input name=\"");
			sb.append("dept_cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String arealistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = arealist.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITAREALISTRecord rec = (SS_L_EXTN_RES_INITAREALISTRecord)arealist.get(i);
			
			
			String code = rec.area_cd;
			String name = rec.area_nm;
			
			sb.append("<input name=\"");
			sb.append("area_cd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITMEDICDCURRecord rec = (SS_L_EXTN_RES_INITMEDICDCURRecord)medicdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String extntypecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extntypecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITEXTNTYPECDCURRecord rec = (SS_L_EXTN_RES_INITEXTNTYPECDCURRecord)extntypecdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String cns_empcnfmstatcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cns_empcnfmstatcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord rec = (SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord)cns_empcnfmstatcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String cns_empcnfmocomcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cns_empcnfmocomcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord rec = (SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord)cns_empcnfmocomcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String chrg_cnfmstatcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = chrg_cnfmstatcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord rec = (SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord)chrg_cnfmstatcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String chrg_cnfmocomcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = chrg_cnfmocomcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord rec = (SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord)chrg_cnfmocomcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dstcinfocurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dstcinfocur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITDSTCINFOCURRecord rec = (SS_L_EXTN_RES_INITDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
			String code = rec.dstccd;
			String name = rec.dstcnm;
			
			sb.append("<input name=\"");
			sb.append("dstccd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String addrcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = addrcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITADDRCDCURRecord rec = (SS_L_EXTN_RES_INITADDRCDCURRecord)addrcdcur.get(i);
			
			
			String code = rec.addrcd;
			String name = rec.addrnm;
			
			sb.append("<input name=\"");
			sb.append("addrcd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String paty_clsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = paty_clsfcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord rec = (SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord)paty_clsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String resitypecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resitypecdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITRESITYPECDCURRecord rec = (SS_L_EXTN_RES_INITRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String resiclsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = resiclsfcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITRESICLSFCDCURRecord rec = (SS_L_EXTN_RES_INITRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String dlvmthdcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvmthdcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITDLVMTHDCDCURRecord rec = (SS_L_EXTN_RES_INITDLVMTHDCDCURRecord)dlvmthdcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String thrwplaccdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = thrwplaccdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITTHRWPLACCDCURRecord rec = (SS_L_EXTN_RES_INITTHRWPLACCDCURRecord)thrwplaccdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String clamtmthdcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = clamtmthdcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord rec = (SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord)clamtmthdcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String freeclsfcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = freeclsfcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITFREECLSFCDCURRecord rec = (SS_L_EXTN_RES_INITFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

	public String aplcpathcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcdcur.size();
		for(int i=0; i<size; i++){
			SS_L_EXTN_RES_INITAPLCPATHCDCURRecord rec = (SS_L_EXTN_RES_INITAPLCPATHCDCURRecord)aplcpathcdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_EXTN_RES_INITDataSet ds = (SS_L_EXTN_RES_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.teamlist.size(); i++){
		SS_L_EXTN_RES_INITTEAMLISTRecord teamlistRec = (SS_L_EXTN_RES_INITTEAMLISTRecord)ds.teamlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.partlist.size(); i++){
		SS_L_EXTN_RES_INITPARTLISTRecord partlistRec = (SS_L_EXTN_RES_INITPARTLISTRecord)ds.partlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.arealist.size(); i++){
		SS_L_EXTN_RES_INITAREALISTRecord arealistRec = (SS_L_EXTN_RES_INITAREALISTRecord)ds.arealist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		SS_L_EXTN_RES_INITMEDICDCURRecord medicdcurRec = (SS_L_EXTN_RES_INITMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.extntypecdcur.size(); i++){
		SS_L_EXTN_RES_INITEXTNTYPECDCURRecord extntypecdcurRec = (SS_L_EXTN_RES_INITEXTNTYPECDCURRecord)ds.extntypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cns_empcnfmstatcdcur.size(); i++){
		SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord cns_empcnfmstatcdcurRec = (SS_L_EXTN_RES_INITCNS_EMPCNFMSTATCDCURRecord)ds.cns_empcnfmstatcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cns_empcnfmocomcdcur.size(); i++){
		SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord cns_empcnfmocomcdcurRec = (SS_L_EXTN_RES_INITCNS_EMPCNFMOCOMCDCURRecord)ds.cns_empcnfmocomcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.chrg_cnfmstatcdcur.size(); i++){
		SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord chrg_cnfmstatcdcurRec = (SS_L_EXTN_RES_INITCHRG_CNFMSTATCDCURRecord)ds.chrg_cnfmstatcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.chrg_cnfmocomcdcur.size(); i++){
		SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord chrg_cnfmocomcdcurRec = (SS_L_EXTN_RES_INITCHRG_CNFMOCOMCDCURRecord)ds.chrg_cnfmocomcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		SS_L_EXTN_RES_INITDSTCINFOCURRecord dstcinfocurRec = (SS_L_EXTN_RES_INITDSTCINFOCURRecord)ds.dstcinfocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.addrcdcur.size(); i++){
		SS_L_EXTN_RES_INITADDRCDCURRecord addrcdcurRec = (SS_L_EXTN_RES_INITADDRCDCURRecord)ds.addrcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paty_clsfcdcur.size(); i++){
		SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord paty_clsfcdcurRec = (SS_L_EXTN_RES_INITPATY_CLSFCDCURRecord)ds.paty_clsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resitypecdcur.size(); i++){
		SS_L_EXTN_RES_INITRESITYPECDCURRecord resitypecdcurRec = (SS_L_EXTN_RES_INITRESITYPECDCURRecord)ds.resitypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resiclsfcdcur.size(); i++){
		SS_L_EXTN_RES_INITRESICLSFCDCURRecord resiclsfcdcurRec = (SS_L_EXTN_RES_INITRESICLSFCDCURRecord)ds.resiclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlvmthdcdcur.size(); i++){
		SS_L_EXTN_RES_INITDLVMTHDCDCURRecord dlvmthdcdcurRec = (SS_L_EXTN_RES_INITDLVMTHDCDCURRecord)ds.dlvmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.thrwplaccdcur.size(); i++){
		SS_L_EXTN_RES_INITTHRWPLACCDCURRecord thrwplaccdcurRec = (SS_L_EXTN_RES_INITTHRWPLACCDCURRecord)ds.thrwplaccdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.clamtmthdcdcur.size(); i++){
		SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord clamtmthdcdcurRec = (SS_L_EXTN_RES_INITCLAMTMTHDCDCURRecord)ds.clamtmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.freeclsfcdcur.size(); i++){
		SS_L_EXTN_RES_INITFREECLSFCDCURRecord freeclsfcdcurRec = (SS_L_EXTN_RES_INITFREECLSFCDCURRecord)ds.freeclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcpathcdcur.size(); i++){
		SS_L_EXTN_RES_INITAPLCPATHCDCURRecord aplcpathcdcurRec = (SS_L_EXTN_RES_INITAPLCPATHCDCURRecord)ds.aplcpathcdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTeamlist()%>
<%= ds.getPartlist()%>
<%= ds.getArealist()%>
<%= ds.getMedicdcur()%>
<%= ds.getExtntypecdcur()%>
<%= ds.getCns_empcnfmstatcdcur()%>
<%= ds.getCns_empcnfmocomcdcur()%>
<%= ds.getChrg_cnfmstatcdcur()%>
<%= ds.getChrg_cnfmocomcdcur()%>
<%= ds.getDstcinfocur()%>
<%= ds.getAddrcdcur()%>
<%= ds.getPaty_clsfcdcur()%>
<%= ds.getResitypecdcur()%>
<%= ds.getResiclsfcdcur()%>
<%= ds.getDlvmthdcdcur()%>
<%= ds.getThrwplaccdcur()%>
<%= ds.getClamtmthdcdcur()%>
<%= ds.getFreeclsfcdcur()%>
<%= ds.getAplcpathcdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= teamlistRec.dept_cd%>
<%= teamlistRec.dept_nm%>
<%= partlistRec.dept_cd%>
<%= partlistRec.dept_nm%>
<%= partlistRec.supr_dept_cd%>
<%= arealistRec.area_cd%>
<%= arealistRec.area_nm%>
<%= arealistRec.dept_cd%>
<%= arealistRec.supr_dept_cd%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= extntypecdcurRec.cicodeval%>
<%= extntypecdcurRec.cicdnm%>
<%= extntypecdcurRec.cicdynm%>
<%= extntypecdcurRec.ciymgbcd%>
<%= extntypecdcurRec.cicdgb%>
<%= cns_empcnfmstatcdcurRec.cicodeval%>
<%= cns_empcnfmstatcdcurRec.cicdnm%>
<%= cns_empcnfmstatcdcurRec.cicdynm%>
<%= cns_empcnfmstatcdcurRec.ciymgbcd%>
<%= cns_empcnfmstatcdcurRec.cicdgb%>
<%= cns_empcnfmocomcdcurRec.cicodeval%>
<%= cns_empcnfmocomcdcurRec.cicdnm%>
<%= cns_empcnfmocomcdcurRec.cicdynm%>
<%= cns_empcnfmocomcdcurRec.ciymgbcd%>
<%= cns_empcnfmocomcdcurRec.cicdgb%>
<%= chrg_cnfmstatcdcurRec.cicodeval%>
<%= chrg_cnfmstatcdcurRec.cicdnm%>
<%= chrg_cnfmstatcdcurRec.cicdynm%>
<%= chrg_cnfmstatcdcurRec.ciymgbcd%>
<%= chrg_cnfmstatcdcurRec.cicdgb%>
<%= chrg_cnfmocomcdcurRec.cicodeval%>
<%= chrg_cnfmocomcdcurRec.cicdnm%>
<%= chrg_cnfmocomcdcurRec.cicdynm%>
<%= chrg_cnfmocomcdcurRec.ciymgbcd%>
<%= chrg_cnfmocomcdcurRec.cicdgb%>
<%= dstcinfocurRec.dstccd%>
<%= dstcinfocurRec.dstcnm%>
<%= dstcinfocurRec.teamcd%>
<%= addrcdcurRec.addrcd%>
<%= addrcdcurRec.addrnm%>
<%= addrcdcurRec.resitypecd%>
<%= addrcdcurRec.addrbnji%>
<%= addrcdcurRec.mvindt%>
<%= paty_clsfcdcurRec.cicodeval%>
<%= paty_clsfcdcurRec.cicdnm%>
<%= paty_clsfcdcurRec.cicdynm%>
<%= paty_clsfcdcurRec.ciymgbcd%>
<%= paty_clsfcdcurRec.cicdgb%>
<%= resitypecdcurRec.cicodeval%>
<%= resitypecdcurRec.cicdnm%>
<%= resitypecdcurRec.cicdynm%>
<%= resitypecdcurRec.ciymgbcd%>
<%= resitypecdcurRec.cicdgb%>
<%= resiclsfcdcurRec.cicodeval%>
<%= resiclsfcdcurRec.cicdnm%>
<%= resiclsfcdcurRec.cicdynm%>
<%= resiclsfcdcurRec.ciymgbcd%>
<%= resiclsfcdcurRec.cicdgb%>
<%= dlvmthdcdcurRec.cicodeval%>
<%= dlvmthdcdcurRec.cicdnm%>
<%= dlvmthdcdcurRec.cicdynm%>
<%= dlvmthdcdcurRec.ciymgbcd%>
<%= dlvmthdcdcurRec.cicdgb%>
<%= thrwplaccdcurRec.cicodeval%>
<%= thrwplaccdcurRec.cicdnm%>
<%= thrwplaccdcurRec.cicdynm%>
<%= thrwplaccdcurRec.ciymgbcd%>
<%= thrwplaccdcurRec.cicdgb%>
<%= clamtmthdcdcurRec.cicodeval%>
<%= clamtmthdcdcurRec.cicdnm%>
<%= clamtmthdcdcurRec.cicdynm%>
<%= clamtmthdcdcurRec.ciymgbcd%>
<%= clamtmthdcdcurRec.cicdgb%>
<%= freeclsfcdcurRec.cicodeval%>
<%= freeclsfcdcurRec.cicdnm%>
<%= freeclsfcdcurRec.cicdynm%>
<%= freeclsfcdcurRec.ciymgbcd%>
<%= freeclsfcdcurRec.cicdgb%>
<%= aplcpathcdcurRec.cicodeval%>
<%= aplcpathcdcurRec.cicdnm%>
<%= aplcpathcdcurRec.cicdynm%>
<%= aplcpathcdcurRec.ciymgbcd%>
<%= aplcpathcdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 08 16:35:57 KST 2009 */