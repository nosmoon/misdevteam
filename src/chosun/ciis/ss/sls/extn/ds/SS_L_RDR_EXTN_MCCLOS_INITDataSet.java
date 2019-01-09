/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_MCCLOS_INITDataSet.java
* 기능 : 확장현황-조선IS확장-MC확장
* 작성일자 : 2005-02-19
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-조선IS확장-MC확장
 */


public class SS_L_RDR_EXTN_MCCLOS_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curdeptcd = new ArrayList();
	public ArrayList curmedicd = new ArrayList();
	public ArrayList curresitype = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_EXTN_MCCLOS_INITDataSet(){}
	public SS_L_RDR_EXTN_MCCLOS_INITDataSet(String errcode, String errmsg){
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
		ResultSet rset3 = (ResultSet) cstmt.getObject(3);
		while(rset3.next()){
			SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord rec = new SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord();
			rec.deptcd = Util.checkString(rset3.getString("deptcd"));
			rec.boksnm = Util.checkString(rset3.getString("boksnm"));
			this.curdeptcd.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(4);
		while(rset4.next()){
			SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord rec = new SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord();
			rec.cicodeval = Util.checkString(rset4.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset4.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset4.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset4.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset4.getString("cicdynm"));
			this.curmedicd.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(5);
		while(rset5.next()){
			SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord rec = new SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord();
			rec.cicodeval = Util.checkString(rset5.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset5.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset5.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset5.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset5.getString("cicdynm"));
			this.curresitype.add(rec);
		}
	}

	public String curdeptcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord rec = (SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
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

	public String curmedicdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord rec = (SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curresitypeOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresitype.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord rec = (SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord)curresitype.get(i);
			
			
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

	public String curdeptcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord rec = (SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String curmedicdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord rec = (SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curresitypeChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresitype.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord rec = (SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord)curresitype.get(i);
			
			
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

	public String curdeptcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curdeptcd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord rec = (SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord)curdeptcd.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.boksnm;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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

	public String curmedicdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedicd.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord rec = (SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord)curmedicd.get(i);
			
			
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

	public String curresitypeRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curresitype.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord rec = (SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord)curresitype.get(i);
			
			
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
	SS_L_RDR_EXTN_MCCLOS_INITDataSet ds = (SS_L_RDR_EXTN_MCCLOS_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curdeptcd.size(); i++){
		SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord curdeptcdRec = (SS_L_RDR_EXTN_MCCLOS_INITCURDEPTCDRecord)ds.curdeptcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curmedicd.size(); i++){
		SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord curmedicdRec = (SS_L_RDR_EXTN_MCCLOS_INITCURMEDICDRecord)ds.curmedicd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curresitype.size(); i++){
		SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord curresitypeRec = (SS_L_RDR_EXTN_MCCLOS_INITCURRESITYPERecord)ds.curresitype.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurdeptcd()%>
<%= ds.getCurmedicd()%>
<%= ds.getCurresitype()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curdeptcdRec.deptcd%>
<%= curdeptcdRec.boksnm%>
<%= curmedicdRec.cicodeval%>
<%= curmedicdRec.cicdnm%>
<%= curmedicdRec.ciymgbcd%>
<%= curmedicdRec.cicdgb%>
<%= curmedicdRec.cicdynm%>
<%= curresitypeRec.cicodeval%>
<%= curresitypeRec.cicdnm%>
<%= curresitypeRec.ciymgbcd%>
<%= curresitypeRec.cicdgb%>
<%= curresitypeRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 19 17:26:38 KST 2005 */