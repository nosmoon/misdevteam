/***************************************************************************************************
* 파일명 : SS_L_CA_HEAD_INITDataSet.java
* 기능 : 사이버센터-사이버센터장-초기화면
* 작성일자 : 2005-04-18
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.ca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * 사이버센터-사이버센터장-초기화면
 */


public class SS_L_CA_HEAD_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curacctbank = new ArrayList();
	public ArrayList curcntrstatcd = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_CA_HEAD_INITDataSet(){}
	public SS_L_CA_HEAD_INITDataSet(String errcode, String errmsg){
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
			SS_L_CA_HEAD_INITCURCNTRSTATCDRecord rec = new SS_L_CA_HEAD_INITCURCNTRSTATCDRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.curcntrstatcd.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_CA_HEAD_INITCURACCTBANKRecord rec = new SS_L_CA_HEAD_INITCURACCTBANKRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.curacctbank.add(rec);
		}
	}

	public String curcntrstatcdOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcntrstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_CA_HEAD_INITCURCNTRSTATCDRecord rec = (SS_L_CA_HEAD_INITCURCNTRSTATCDRecord)curcntrstatcd.get(i);
			
			
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

	public String curacctbankOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curacctbank.size();
		for(int i=0; i<size; i++){
			SS_L_CA_HEAD_INITCURACCTBANKRecord rec = (SS_L_CA_HEAD_INITCURACCTBANKRecord)curacctbank.get(i);
			
			
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

	public String curcntrstatcdChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcntrstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_CA_HEAD_INITCURCNTRSTATCDRecord rec = (SS_L_CA_HEAD_INITCURCNTRSTATCDRecord)curcntrstatcd.get(i);
			
			
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

	public String curacctbankChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curacctbank.size();
		for(int i=0; i<size; i++){
			SS_L_CA_HEAD_INITCURACCTBANKRecord rec = (SS_L_CA_HEAD_INITCURACCTBANKRecord)curacctbank.get(i);
			
			
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

	public String curcntrstatcdRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcntrstatcd.size();
		for(int i=0; i<size; i++){
			SS_L_CA_HEAD_INITCURCNTRSTATCDRecord rec = (SS_L_CA_HEAD_INITCURCNTRSTATCDRecord)curcntrstatcd.get(i);
			
			
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

	public String curacctbankRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curacctbank.size();
		for(int i=0; i<size; i++){
			SS_L_CA_HEAD_INITCURACCTBANKRecord rec = (SS_L_CA_HEAD_INITCURACCTBANKRecord)curacctbank.get(i);
			
			
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
	SS_L_CA_HEAD_INITDataSet ds = (SS_L_CA_HEAD_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcntrstatcd.size(); i++){
		SS_L_CA_HEAD_INITCURCNTRSTATCDRecord curcntrstatcdRec = (SS_L_CA_HEAD_INITCURCNTRSTATCDRecord)ds.curcntrstatcd.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curacctbank.size(); i++){
		SS_L_CA_HEAD_INITCURACCTBANKRecord curacctbankRec = (SS_L_CA_HEAD_INITCURACCTBANKRecord)ds.curacctbank.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcntrstatcd()%>
<%= ds.getCuracctbank()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcntrstatcdRec.cicodeval%>
<%= curcntrstatcdRec.cicdnm%>
<%= curcntrstatcdRec.ciymgbcd%>
<%= curcntrstatcdRec.cicdgb%>
<%= curcntrstatcdRec.cicdynm%>
<%= curacctbankRec.cicodeval%>
<%= curacctbankRec.cicdnm%>
<%= curacctbankRec.ciymgbcd%>
<%= curacctbankRec.cicdgb%>
<%= curacctbankRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 18 15:31:41 KST 2005 */