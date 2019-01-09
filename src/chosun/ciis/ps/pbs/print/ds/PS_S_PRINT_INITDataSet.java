/***************************************************************************************************
* 파일명   : PS_S_PRINT_INIT.java
* 기능     : 출력 - 초기 화면
* 작성일자 : 2006-02-01
* 작성자   : 전현표 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :   
* 백업     :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.print.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.rec.*;

/**
 * 출력 - 초기 화면
 *
 */

public class PS_S_PRINT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asinbocdcur = new ArrayList();
	public ArrayList medicdlist = new ArrayList();
	public ArrayList sendclsfcur = new ArrayList();
	public ArrayList medisercur = new ArrayList();
	public ArrayList sendkindcur = new ArrayList();
	public ArrayList hdqtsenddtcur = new ArrayList();
	public ArrayList rdr_extntyecdcur = new ArrayList();
	public ArrayList bocdcurlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_PRINT_INITDataSet(){}
	public PS_S_PRINT_INITDataSet(String errcode, String errmsg, String sysdate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sysdate = sysdate;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSysdate(String sysdate){
		this.sysdate = sysdate;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSysdate(){
		return this.sysdate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.sysdate = Util.checkString(cstmt.getString(6));
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PS_S_PRINT_INITMEDICDLISTRecord rec = new PS_S_PRINT_INITMEDICDLISTRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.medicdlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			PS_S_PRINT_INITBOCDCURLISTRecord rec = new PS_S_PRINT_INITBOCDCURLISTRecord();
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset1.getString("sellnetclsf"));
			this.bocdcurlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			PS_S_PRINT_INITSENDCLSFCURRecord rec = new PS_S_PRINT_INITSENDCLSFCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.sendclsfcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			PS_S_PRINT_INITSENDKINDCURRecord rec = new PS_S_PRINT_INITSENDKINDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.sendkindcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			PS_S_PRINT_INITMEDISERCURRecord rec = new PS_S_PRINT_INITMEDISERCURRecord();
			rec.mediser_no = Util.checkString(rset4.getString("mediser_no"));
			rec.mediser_view = Util.checkString(rset4.getString("mediser_view"));
			this.medisercur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			PS_S_PRINT_INITHDQTSENDDTCURRecord rec = new PS_S_PRINT_INITHDQTSENDDTCURRecord();
			rec.hdqtsenddt = Util.checkString(rset5.getString("hdqtsenddt"));
			rec.hdqtsenddt_view = Util.checkString(rset5.getString("hdqtsenddt_view"));
			this.hdqtsenddtcur.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(13);
		while(rset6.next()){
			PS_S_PRINT_INITASINBOCDCURRecord rec = new PS_S_PRINT_INITASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset6.getString("bocd"));
			rec.bonm = Util.checkString(rset6.getString("bonm"));
			rec.deptcd = Util.checkString(rset6.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset6.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
		ResultSet rset7 = (ResultSet) cstmt.getObject(14);
		while(rset7.next()){
			PS_S_PRINT_INITRDR_EXTNTYECDCURRecord rec = new PS_S_PRINT_INITRDR_EXTNTYECDCURRecord();
			rec.cicodeval = Util.checkString(rset7.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset7.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset7.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset7.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset7.getString("cicdgb"));
			this.rdr_extntyecdcur.add(rec);
		}
	}

	public String medicdlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdlist.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITMEDICDLISTRecord rec = (PS_S_PRINT_INITMEDICDLISTRecord)medicdlist.get(i);
			
			
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

	public String bocdcurlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcurlist.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITBOCDCURLISTRecord rec = (PS_S_PRINT_INITBOCDCURLISTRecord)bocdcurlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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

	public String sendclsfcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITSENDCLSFCURRecord rec = (PS_S_PRINT_INITSENDCLSFCURRecord)sendclsfcur.get(i);
			
			
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

	public String sendkindcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendkindcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITSENDKINDCURRecord rec = (PS_S_PRINT_INITSENDKINDCURRecord)sendkindcur.get(i);
			
			
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

	public String medisercurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medisercur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITMEDISERCURRecord rec = (PS_S_PRINT_INITMEDISERCURRecord)medisercur.get(i);
			
			
			String code = rec.mediser_no;
			String name = rec.mediser_view;
			
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

	public String hdqtsenddtcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = hdqtsenddtcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITHDQTSENDDTCURRecord rec = (PS_S_PRINT_INITHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
			String code = rec.hdqtsenddt;
			String name = rec.hdqtsenddt_view;
			
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

	public String asinbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITASINBOCDCURRecord rec = (PS_S_PRINT_INITASINBOCDCURRecord)asinbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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

	public String rdr_extntyecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntyecdcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITRDR_EXTNTYECDCURRecord rec = (PS_S_PRINT_INITRDR_EXTNTYECDCURRecord)rdr_extntyecdcur.get(i);
			
			
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

	public String medicdlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdlist.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITMEDICDLISTRecord rec = (PS_S_PRINT_INITMEDICDLISTRecord)medicdlist.get(i);
			
			
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

	public String bocdcurlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcurlist.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITBOCDCURLISTRecord rec = (PS_S_PRINT_INITBOCDCURLISTRecord)bocdcurlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String sendclsfcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITSENDCLSFCURRecord rec = (PS_S_PRINT_INITSENDCLSFCURRecord)sendclsfcur.get(i);
			
			
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

	public String sendkindcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendkindcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITSENDKINDCURRecord rec = (PS_S_PRINT_INITSENDKINDCURRecord)sendkindcur.get(i);
			
			
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

	public String medisercurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medisercur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITMEDISERCURRecord rec = (PS_S_PRINT_INITMEDISERCURRecord)medisercur.get(i);
			
			
			String code = rec.mediser_no;
			String name = rec.mediser_view;
			
			sb.append("<input name=\"");
			sb.append("mediser_no");
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

	public String hdqtsenddtcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = hdqtsenddtcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITHDQTSENDDTCURRecord rec = (PS_S_PRINT_INITHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
			String code = rec.hdqtsenddt;
			String name = rec.hdqtsenddt_view;
			
			sb.append("<input name=\"");
			sb.append("hdqtsenddt");
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

	public String asinbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITASINBOCDCURRecord rec = (PS_S_PRINT_INITASINBOCDCURRecord)asinbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String rdr_extntyecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntyecdcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITRDR_EXTNTYECDCURRecord rec = (PS_S_PRINT_INITRDR_EXTNTYECDCURRecord)rdr_extntyecdcur.get(i);
			
			
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

	public String medicdlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdlist.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITMEDICDLISTRecord rec = (PS_S_PRINT_INITMEDICDLISTRecord)medicdlist.get(i);
			
			
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

	public String bocdcurlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcurlist.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITBOCDCURLISTRecord rec = (PS_S_PRINT_INITBOCDCURLISTRecord)bocdcurlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String sendclsfcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendclsfcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITSENDCLSFCURRecord rec = (PS_S_PRINT_INITSENDCLSFCURRecord)sendclsfcur.get(i);
			
			
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

	public String sendkindcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendkindcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITSENDKINDCURRecord rec = (PS_S_PRINT_INITSENDKINDCURRecord)sendkindcur.get(i);
			
			
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

	public String medisercurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medisercur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITMEDISERCURRecord rec = (PS_S_PRINT_INITMEDISERCURRecord)medisercur.get(i);
			
			
			String code = rec.mediser_no;
			String name = rec.mediser_view;
			
			sb.append("<input name=\"");
			sb.append("mediser_no");
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

	public String hdqtsenddtcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = hdqtsenddtcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITHDQTSENDDTCURRecord rec = (PS_S_PRINT_INITHDQTSENDDTCURRecord)hdqtsenddtcur.get(i);
			
			
			String code = rec.hdqtsenddt;
			String name = rec.hdqtsenddt_view;
			
			sb.append("<input name=\"");
			sb.append("hdqtsenddt");
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

	public String asinbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITASINBOCDCURRecord rec = (PS_S_PRINT_INITASINBOCDCURRecord)asinbocdcur.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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

	public String rdr_extntyecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntyecdcur.size();
		for(int i=0; i<size; i++){
			PS_S_PRINT_INITRDR_EXTNTYECDCURRecord rec = (PS_S_PRINT_INITRDR_EXTNTYECDCURRecord)rdr_extntyecdcur.get(i);
			
			
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
	PS_S_PRINT_INITDataSet ds = (PS_S_PRINT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdlist.size(); i++){
		PS_S_PRINT_INITMEDICDLISTRecord medicdlistRec = (PS_S_PRINT_INITMEDICDLISTRecord)ds.medicdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bocdcurlist.size(); i++){
		PS_S_PRINT_INITBOCDCURLISTRecord bocdcurlistRec = (PS_S_PRINT_INITBOCDCURLISTRecord)ds.bocdcurlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendclsfcur.size(); i++){
		PS_S_PRINT_INITSENDCLSFCURRecord sendclsfcurRec = (PS_S_PRINT_INITSENDCLSFCURRecord)ds.sendclsfcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sendkindcur.size(); i++){
		PS_S_PRINT_INITSENDKINDCURRecord sendkindcurRec = (PS_S_PRINT_INITSENDKINDCURRecord)ds.sendkindcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.medisercur.size(); i++){
		PS_S_PRINT_INITMEDISERCURRecord medisercurRec = (PS_S_PRINT_INITMEDISERCURRecord)ds.medisercur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.hdqtsenddtcur.size(); i++){
		PS_S_PRINT_INITHDQTSENDDTCURRecord hdqtsenddtcurRec = (PS_S_PRINT_INITHDQTSENDDTCURRecord)ds.hdqtsenddtcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		PS_S_PRINT_INITASINBOCDCURRecord asinbocdcurRec = (PS_S_PRINT_INITASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_extntyecdcur.size(); i++){
		PS_S_PRINT_INITRDR_EXTNTYECDCURRecord rdr_extntyecdcurRec = (PS_S_PRINT_INITRDR_EXTNTYECDCURRecord)ds.rdr_extntyecdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getMedicdlist()%>
<%= ds.getBocdcurlist()%>
<%= ds.getSendclsfcur()%>
<%= ds.getSendkindcur()%>
<%= ds.getMedisercur()%>
<%= ds.getHdqtsenddtcur()%>
<%= ds.getAsinbocdcur()%>
<%= ds.getRdr_extntyecdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdlistRec.cicodeval%>
<%= medicdlistRec.cicdnm%>
<%= medicdlistRec.cicdynm%>
<%= medicdlistRec.ciymgbcd%>
<%= medicdlistRec.cicdgb%>
<%= bocdcurlistRec.bocd%>
<%= bocdcurlistRec.bonm%>
<%= bocdcurlistRec.deptcd%>
<%= bocdcurlistRec.sellnetclsf%>
<%= sendclsfcurRec.cicodeval%>
<%= sendclsfcurRec.cicdnm%>
<%= sendclsfcurRec.cicdynm%>
<%= sendclsfcurRec.ciymgbcd%>
<%= sendclsfcurRec.cicdgb%>
<%= sendkindcurRec.cicodeval%>
<%= sendkindcurRec.cicdnm%>
<%= sendkindcurRec.cicdynm%>
<%= sendkindcurRec.ciymgbcd%>
<%= sendkindcurRec.cicdgb%>
<%= medisercurRec.mediser_no%>
<%= medisercurRec.mediser_view%>
<%= hdqtsenddtcurRec.hdqtsenddt%>
<%= hdqtsenddtcurRec.hdqtsenddt_view%>
<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
<%= rdr_extntyecdcurRec.cicodeval%>
<%= rdr_extntyecdcurRec.cicdnm%>
<%= rdr_extntyecdcurRec.cicdynm%>
<%= rdr_extntyecdcurRec.ciymgbcd%>
<%= rdr_extntyecdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 11:07:41 KST 2009 */