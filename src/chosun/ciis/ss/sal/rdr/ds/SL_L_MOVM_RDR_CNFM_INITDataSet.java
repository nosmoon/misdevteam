/***************************************************************************************************
* 파일명 : SL_L_MOVM_RDR_CNFM_INITDataSet.java
* 기능 : 독자-이사독자관리(인수)-초기화면을 위한 DataSet
* 작성일자 : 2004-01-14
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자-이사독자관리(인수)-초기화를 위한 DataSet
 */

public class SL_L_MOVM_RDR_CNFM_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList dlvmthdcdcur = new ArrayList();
	public ArrayList resitypecdcur = new ArrayList();
	public ArrayList dstcinfocur = new ArrayList();
	public ArrayList curaplcpathcd = new ArrayList();
	public ArrayList thrwplaccdcur = new ArrayList();
	public ArrayList addrcdcur = new ArrayList();
	public ArrayList resiclsfcdcur = new ArrayList();
	public ArrayList paty_clsfcdcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_MOVM_RDR_CNFM_INITDataSet(){}
	public SL_L_MOVM_RDR_CNFM_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord rec = new SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curaplcpathcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord rec = new SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord();
			rec.dstccd = Util.checkString(rset1.getString("dstccd"));
			rec.dstcnm = Util.checkString(rset1.getString("dstcnm"));
			rec.teamcd = Util.checkString(rset1.getString("teamcd"));
			this.dstcinfocur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord rec = new SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord();
			rec.addrcd = Util.checkString(rset2.getString("addrcd"));
			rec.addrnm = Util.checkString(rset2.getString("addrnm"));
			rec.resitypecd = Util.checkString(rset2.getString("resitypecd"));
			this.addrcdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord rec = new SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.paty_clsfcdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord rec = new SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			this.resitypecdcur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(9);
		while(rset5.next()){
			SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord rec = new SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			this.resiclsfcdcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(10);
		while(rset6.next()){
			SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord rec = new SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord();
			rec.cicodeval = Util.checkString(rset6.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset6.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset6.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset6.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset6.getString("cicdgb"));
			this.dlvmthdcdcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(11);
		while(rset7.next()){
			SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord rec = new SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord();
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset7.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset7.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset7.getString("cicdgb"));
			this.thrwplaccdcur.add(rec);
		}
	}

	public String curaplcpathcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaplcpathcd.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord rec = (SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord)addrcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord)paty_clsfcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord)dlvmthdcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord)thrwplaccdcur.get(i);
			
			
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

	public String curaplcpathcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaplcpathcd.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord rec = (SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord)addrcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord)paty_clsfcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord)dlvmthdcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord)thrwplaccdcur.get(i);
			
			
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

	public String curaplcpathcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curaplcpathcd.size();
		for(int i=0; i<size; i++){
			SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord rec = (SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord)curaplcpathcd.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord)dstcinfocur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord)addrcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord)paty_clsfcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord)resitypecdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord)resiclsfcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord)dlvmthdcdcur.get(i);
			
			
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
			SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord rec = (SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord)thrwplaccdcur.get(i);
			
			
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
	SL_L_MOVM_RDR_CNFM_INITDataSet ds = (SL_L_MOVM_RDR_CNFM_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curaplcpathcd.size(); i++){
		SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord curaplcpathcdRec = (SL_L_MOVM_RDR_CNFM_INITCURAPLCPATHCDRecord)ds.curaplcpathcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord dstcinfocurRec = (SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord)ds.dstcinfocur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.addrcdcur.size(); i++){
		SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord addrcdcurRec = (SL_L_MOVM_RDR_CNFM_INITADDRCDCURRecord)ds.addrcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.paty_clsfcdcur.size(); i++){
		SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord paty_clsfcdcurRec = (SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord)ds.paty_clsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resitypecdcur.size(); i++){
		SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord resitypecdcurRec = (SL_L_MOVM_RDR_CNFM_INITRESITYPECDCURRecord)ds.resitypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resiclsfcdcur.size(); i++){
		SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord resiclsfcdcurRec = (SL_L_MOVM_RDR_CNFM_INITRESICLSFCDCURRecord)ds.resiclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlvmthdcdcur.size(); i++){
		SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord dlvmthdcdcurRec = (SL_L_MOVM_RDR_CNFM_INITDLVMTHDCDCURRecord)ds.dlvmthdcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.thrwplaccdcur.size(); i++){
		SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord thrwplaccdcurRec = (SL_L_MOVM_RDR_CNFM_INITTHRWPLACCDCURRecord)ds.thrwplaccdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCuraplcpathcd()%>
<%= ds.getDstcinfocur()%>
<%= ds.getAddrcdcur()%>
<%= ds.getPaty_clsfcdcur()%>
<%= ds.getResitypecdcur()%>
<%= ds.getResiclsfcdcur()%>
<%= ds.getDlvmthdcdcur()%>
<%= ds.getThrwplaccdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curaplcpathcdRec.cicodeval%>
<%= curaplcpathcdRec.cicdnm%>
<%= curaplcpathcdRec.ciymgbcd%>
<%= curaplcpathcdRec.cicdgb%>
<%= curaplcpathcdRec.cicdynm%>
<%= dstcinfocurRec.dstccd%>
<%= dstcinfocurRec.dstcnm%>
<%= dstcinfocurRec.teamcd%>
<%= addrcdcurRec.addrcd%>
<%= addrcdcurRec.addrnm%>
<%= addrcdcurRec.resitypecd%>
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
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jan 18 20:09:17 KST 2004 */