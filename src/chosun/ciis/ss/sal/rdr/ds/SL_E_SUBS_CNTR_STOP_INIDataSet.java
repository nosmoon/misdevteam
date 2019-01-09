/***************************************************************************************************
* 파일명 : SL_E_SUBS_CNTR_STOP_INIDataSet.java
* 기능 : 독자정보관리(중지독자팝업-초기화)
* 작성일자 : 2004-02-11
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
 * 독자정보관리(중지독자팝업-초기화)
 *
 */


public class SL_E_SUBS_CNTR_STOP_INIDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList suspresncdcur = new ArrayList();
	public ArrayList freeclsfcdcur = new ArrayList();
	public ArrayList susptypecdcur = new ArrayList();
	public ArrayList objcur = new ArrayList();
	public ArrayList readercur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_E_SUBS_CNTR_STOP_INIDataSet(){}
	public SL_E_SUBS_CNTR_STOP_INIDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SL_E_SUBS_CNTR_STOP_INIREADERCURRecord rec = new SL_E_SUBS_CNTR_STOP_INIREADERCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.dlvdong = Util.checkString(rset0.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset0.getString("dlvser_no"));
			rec.dlvbnji = Util.checkString(rset0.getString("dlvbnji"));
			this.readercur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord rec = new SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.susptypecdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord rec = new SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.suspresncdcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(8);
		while(rset3.next()){
			SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord rec = new SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.freeclsfcdcur.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			SL_E_SUBS_CNTR_STOP_INIOBJCURRecord rec = new SL_E_SUBS_CNTR_STOP_INIOBJCURRecord();
			rec.rdr_no = Util.checkString(rset4.getString("rdr_no"));
			rec.medicd = Util.checkString(rset4.getString("medicd"));
			rec.medinm = Util.checkString(rset4.getString("medinm"));
			rec.freeyn = Util.checkString(rset4.getString("freeyn"));
			rec.freeynnm = Util.checkString(rset4.getString("freeynnm"));
			rec.freeclsf = Util.checkString(rset4.getString("freeclsf"));
			rec.qty = rset4.getInt("qty");
			this.objcur.add(rec);
		}
	}

	public String readercurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INIREADERCURRecord rec = (SL_E_SUBS_CNTR_STOP_INIREADERCURRecord)readercur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdrnm;
			
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

	public String susptypecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = susptypecdcur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord rec = (SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord)susptypecdcur.get(i);
			
			
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

	public String suspresncdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncdcur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord rec = (SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord)suspresncdcur.get(i);
			
			
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
			SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord rec = (SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String objcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = objcur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INIOBJCURRecord rec = (SL_E_SUBS_CNTR_STOP_INIOBJCURRecord)objcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String readercurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INIREADERCURRecord rec = (SL_E_SUBS_CNTR_STOP_INIREADERCURRecord)readercur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdrnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String susptypecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = susptypecdcur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord rec = (SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord)susptypecdcur.get(i);
			
			
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

	public String suspresncdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncdcur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord rec = (SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord)suspresncdcur.get(i);
			
			
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
			SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord rec = (SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String objcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = objcur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INIOBJCURRecord rec = (SL_E_SUBS_CNTR_STOP_INIOBJCURRecord)objcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String readercurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = readercur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INIREADERCURRecord rec = (SL_E_SUBS_CNTR_STOP_INIREADERCURRecord)readercur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.rdrnm;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String susptypecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = susptypecdcur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord rec = (SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord)susptypecdcur.get(i);
			
			
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

	public String suspresncdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = suspresncdcur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord rec = (SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord)suspresncdcur.get(i);
			
			
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
			SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord rec = (SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String objcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = objcur.size();
		for(int i=0; i<size; i++){
			SL_E_SUBS_CNTR_STOP_INIOBJCURRecord rec = (SL_E_SUBS_CNTR_STOP_INIOBJCURRecord)objcur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
	SL_E_SUBS_CNTR_STOP_INIDataSet ds = (SL_E_SUBS_CNTR_STOP_INIDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.readercur.size(); i++){
		SL_E_SUBS_CNTR_STOP_INIREADERCURRecord readercurRec = (SL_E_SUBS_CNTR_STOP_INIREADERCURRecord)ds.readercur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.susptypecdcur.size(); i++){
		SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord susptypecdcurRec = (SL_E_SUBS_CNTR_STOP_INISUSPTYPECDCURRecord)ds.susptypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.suspresncdcur.size(); i++){
		SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord suspresncdcurRec = (SL_E_SUBS_CNTR_STOP_INISUSPRESNCDCURRecord)ds.suspresncdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.freeclsfcdcur.size(); i++){
		SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord freeclsfcdcurRec = (SL_E_SUBS_CNTR_STOP_INIFREECLSFCDCURRecord)ds.freeclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.objcur.size(); i++){
		SL_E_SUBS_CNTR_STOP_INIOBJCURRecord objcurRec = (SL_E_SUBS_CNTR_STOP_INIOBJCURRecord)ds.objcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getReadercur()%>
<%= ds.getSusptypecdcur()%>
<%= ds.getSuspresncdcur()%>
<%= ds.getFreeclsfcdcur()%>
<%= ds.getObjcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= readercurRec.rdr_no%>
<%= readercurRec.rdrnm%>
<%= readercurRec.rdrtel_no1%>
<%= readercurRec.rdrtel_no2%>
<%= readercurRec.rdrtel_no3%>
<%= readercurRec.rdrptph_no1%>
<%= readercurRec.rdrptph_no2%>
<%= readercurRec.rdrptph_no3%>
<%= readercurRec.dlvzip%>
<%= readercurRec.dlvaddr%>
<%= readercurRec.dlvdtlsaddr%>
<%= readercurRec.dlvdong%>
<%= readercurRec.dlvser_no%>
<%= readercurRec.dlvbnji%>
<%= susptypecdcurRec.cicodeval%>
<%= susptypecdcurRec.cicdnm%>
<%= susptypecdcurRec.cicdynm%>
<%= susptypecdcurRec.ciymgbcd%>
<%= susptypecdcurRec.cicdgb%>
<%= suspresncdcurRec.cicodeval%>
<%= suspresncdcurRec.cicdnm%>
<%= suspresncdcurRec.cicdynm%>
<%= suspresncdcurRec.ciymgbcd%>
<%= suspresncdcurRec.cicdgb%>
<%= freeclsfcdcurRec.cicodeval%>
<%= freeclsfcdcurRec.cicdnm%>
<%= freeclsfcdcurRec.cicdynm%>
<%= freeclsfcdcurRec.ciymgbcd%>
<%= freeclsfcdcurRec.cicdgb%>
<%= objcurRec.rdr_no%>
<%= objcurRec.medicd%>
<%= objcurRec.medinm%>
<%= objcurRec.freeyn%>
<%= objcurRec.freeynnm%>
<%= objcurRec.freeclsf%>
<%= objcurRec.qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 11 21:56:53 KST 2004 */