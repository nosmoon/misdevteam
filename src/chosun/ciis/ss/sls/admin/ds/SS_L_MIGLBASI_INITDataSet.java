/***************************************************************************************************
* 파일명 : SS_L_MIGLBASI_INITDataSet.java
* 기능 : 관리자-마일리지-지급기준-초기화면을 위한 DataSet
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-마일리지-지급기준-초기화면을 위한 DataSet
 */

public class SS_L_MIGLBASI_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curpontcalcclsfcd = new ArrayList();
	public ArrayList curcmpycd = new ArrayList();
	public ArrayList curpayclsfcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MIGLBASI_INITDataSet(){}
	public SS_L_MIGLBASI_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(3);
		while(rset0.next()){
			SS_L_MIGLBASI_INITCURCMPYCDRecord rec = new SS_L_MIGLBASI_INITCURCMPYCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curcmpycd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_MIGLBASI_INITCURPAYCLSFCDRecord rec = new SS_L_MIGLBASI_INITCURPAYCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curpayclsfcd.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord rec = new SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset2.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset2.getString("cicdynm"));
			this.curpontcalcclsfcd.add(rec);
		}
	}

	public String curcmpycdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcmpycd.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASI_INITCURCMPYCDRecord rec = (SS_L_MIGLBASI_INITCURCMPYCDRecord)curcmpycd.get(i);
			
			
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

	public String curpayclsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curpayclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASI_INITCURPAYCLSFCDRecord rec = (SS_L_MIGLBASI_INITCURPAYCLSFCDRecord)curpayclsfcd.get(i);
			
			
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

	public String curpontcalcclsfcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curpontcalcclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord rec = (SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord)curpontcalcclsfcd.get(i);
			
			
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

	public String curcmpycdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcmpycd.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASI_INITCURCMPYCDRecord rec = (SS_L_MIGLBASI_INITCURCMPYCDRecord)curcmpycd.get(i);
			
			
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

	public String curpayclsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curpayclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASI_INITCURPAYCLSFCDRecord rec = (SS_L_MIGLBASI_INITCURPAYCLSFCDRecord)curpayclsfcd.get(i);
			
			
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

	public String curpontcalcclsfcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curpontcalcclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord rec = (SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord)curpontcalcclsfcd.get(i);
			
			
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

	public String curcmpycdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcmpycd.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASI_INITCURCMPYCDRecord rec = (SS_L_MIGLBASI_INITCURCMPYCDRecord)curcmpycd.get(i);
			
			
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

	public String curpayclsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curpayclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASI_INITCURPAYCLSFCDRecord rec = (SS_L_MIGLBASI_INITCURPAYCLSFCDRecord)curpayclsfcd.get(i);
			
			
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

	public String curpontcalcclsfcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curpontcalcclsfcd.size();
		for(int i=0; i<size; i++){
			SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord rec = (SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord)curpontcalcclsfcd.get(i);
			
			
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
	SS_L_MIGLBASI_INITDataSet ds = (SS_L_MIGLBASI_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcmpycd.size(); i++){
		SS_L_MIGLBASI_INITCURCMPYCDRecord curcmpycdRec = (SS_L_MIGLBASI_INITCURCMPYCDRecord)ds.curcmpycd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curpayclsfcd.size(); i++){
		SS_L_MIGLBASI_INITCURPAYCLSFCDRecord curpayclsfcdRec = (SS_L_MIGLBASI_INITCURPAYCLSFCDRecord)ds.curpayclsfcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curpontcalcclsfcd.size(); i++){
		SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord curpontcalcclsfcdRec = (SS_L_MIGLBASI_INITCURPONTCALCCLSFCDRecord)ds.curpontcalcclsfcd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcmpycd()%>
<%= ds.getCurpayclsfcd()%>
<%= ds.getCurpontcalcclsfcd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcmpycdRec.cicodeval%>
<%= curcmpycdRec.cicdnm%>
<%= curcmpycdRec.ciymgbcd%>
<%= curcmpycdRec.cicdgb%>
<%= curcmpycdRec.cicdynm%>
<%= curpayclsfcdRec.cicodeval%>
<%= curpayclsfcdRec.cicdnm%>
<%= curpayclsfcdRec.ciymgbcd%>
<%= curpayclsfcdRec.cicdgb%>
<%= curpayclsfcdRec.cicdynm%>
<%= curpontcalcclsfcdRec.cicodeval%>
<%= curpontcalcclsfcdRec.cicdnm%>
<%= curpontcalcclsfcdRec.ciymgbcd%>
<%= curpontcalcclsfcdRec.cicdgb%>
<%= curpontcalcclsfcdRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 21:41:14 KST 2004 */