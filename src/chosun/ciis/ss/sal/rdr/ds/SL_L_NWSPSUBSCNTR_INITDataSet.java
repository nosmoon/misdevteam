/***************************************************************************************************
* 파일명 : SL_L_NWSPSUBSCNTR_INITDataSet.java
* 기능 : 독자정보관리-구독추가변경팝업(초기화면)
* 작성일자 : 2004-02-12
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
 * 독자정보관리-구독추가변경팝업(초기화면)
 *
 */


public class SL_L_NWSPSUBSCNTR_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rdr_extntypecdcur = new ArrayList();
	public ArrayList bomedicdcur = new ArrayList();
	public ArrayList freeclsfcdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String curryymm;

	public SL_L_NWSPSUBSCNTR_INITDataSet(){}
	public SL_L_NWSPSUBSCNTR_INITDataSet(String errcode, String errmsg, String curryymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.curryymm = curryymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCurryymm(String curryymm){
		this.curryymm = curryymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCurryymm(){
		return this.curryymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.curryymm = Util.checkString(cstmt.getString(4));
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord rec = new SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.areanwspyn = Util.checkString(rset0.getString("areanwspyn"));
			rec.subsuprc = rset0.getInt("subsuprc");
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.bomedicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord rec = new SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.rdr_extntypecdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord rec = new SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			this.freeclsfcdcur.add(rec);
		}
	}

	public String bomedicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord rec = (SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
			String code = rec.medicd;
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

	public String rdr_extntypecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntypecdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord rec = (SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord rec = (SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String bomedicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord rec = (SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String rdr_extntypecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntypecdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord rec = (SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord rec = (SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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

	public String bomedicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bomedicdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord rec = (SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord)bomedicdcur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String rdr_extntypecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntypecdcur.size();
		for(int i=0; i<size; i++){
			SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord rec = (SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord)rdr_extntypecdcur.get(i);
			
			
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
			SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord rec = (SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord)freeclsfcdcur.get(i);
			
			
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
	SL_L_NWSPSUBSCNTR_INITDataSet ds = (SL_L_NWSPSUBSCNTR_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord bomedicdcurRec = (SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord)ds.bomedicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_extntypecdcur.size(); i++){
		SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord rdr_extntypecdcurRec = (SL_L_NWSPSUBSCNTR_INITRDR_EXTNTYPECDCURRecord)ds.rdr_extntypecdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.freeclsfcdcur.size(); i++){
		SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord freeclsfcdcurRec = (SL_L_NWSPSUBSCNTR_INITFREECLSFCDCURRecord)ds.freeclsfcdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurryymm()%>
<%= ds.getBomedicdcur()%>
<%= ds.getRdr_extntypecdcur()%>
<%= ds.getFreeclsfcdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bomedicdcurRec.medicd%>
<%= bomedicdcurRec.cicdnm%>
<%= bomedicdcurRec.remk%>
<%= bomedicdcurRec.areanwspyn%>
<%= bomedicdcurRec.subsuprc%>
<%= bomedicdcurRec.ciymgbcd%>
<%= bomedicdcurRec.cicdgb%>
<%= rdr_extntypecdcurRec.cicodeval%>
<%= rdr_extntypecdcurRec.cicdnm%>
<%= rdr_extntypecdcurRec.cicdynm%>
<%= rdr_extntypecdcurRec.ciymgbcd%>
<%= rdr_extntypecdcurRec.cicdgb%>
<%= freeclsfcdcurRec.cicodeval%>
<%= freeclsfcdcurRec.cicdnm%>
<%= freeclsfcdcurRec.cicdynm%>
<%= freeclsfcdcurRec.ciymgbcd%>
<%= freeclsfcdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 13 17:00:18 KST 2004 */