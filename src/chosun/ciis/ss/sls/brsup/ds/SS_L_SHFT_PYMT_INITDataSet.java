/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMT_INITDataSet.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-초기화면
* 작성일자 : 2004-04-01
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-납부자관리-초기화면
 *
 */


public class SS_L_SHFT_PYMT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cardcur = new ArrayList();
	public ArrayList bankcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_SHFT_PYMT_INITDataSet(){}
	public SS_L_SHFT_PYMT_INITDataSet(String errcode, String errmsg){
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
			SS_L_SHFT_PYMT_INITBANKCURRecord rec = new SS_L_SHFT_PYMT_INITBANKCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			this.bankcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(4);
		while(rset1.next()){
			SS_L_SHFT_PYMT_INITCARDCURRecord rec = new SS_L_SHFT_PYMT_INITCARDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.cardcur.add(rec);
		}
	}

	public String bankcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_PYMT_INITBANKCURRecord rec = (SS_L_SHFT_PYMT_INITBANKCURRecord)bankcur.get(i);


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

	public String cardcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cardcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_PYMT_INITCARDCURRecord rec = (SS_L_SHFT_PYMT_INITCARDCURRecord)cardcur.get(i);


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

	public String bankcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_PYMT_INITBANKCURRecord rec = (SS_L_SHFT_PYMT_INITBANKCURRecord)bankcur.get(i);


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

	public String cardcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cardcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_PYMT_INITCARDCURRecord rec = (SS_L_SHFT_PYMT_INITCARDCURRecord)cardcur.get(i);


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

	public String bankcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_PYMT_INITBANKCURRecord rec = (SS_L_SHFT_PYMT_INITBANKCURRecord)bankcur.get(i);


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

	public String cardcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cardcur.size();
		for(int i=0; i<size; i++){
			SS_L_SHFT_PYMT_INITCARDCURRecord rec = (SS_L_SHFT_PYMT_INITCARDCURRecord)cardcur.get(i);


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
	SS_L_SHFT_PYMT_INITDataSet ds = (SS_L_SHFT_PYMT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bankcur.size(); i++){
		SS_L_SHFT_PYMT_INITBANKCURRecord bankcurRec = (SS_L_SHFT_PYMT_INITBANKCURRecord)ds.bankcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cardcur.size(); i++){
		SS_L_SHFT_PYMT_INITCARDCURRecord cardcurRec = (SS_L_SHFT_PYMT_INITCARDCURRecord)ds.cardcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBankcur()%>
<%= ds.getCardcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bankcurRec.cicodeval%>
<%= bankcurRec.cicdnm%>
<%= cardcurRec.cicodeval%>
<%= cardcurRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 07 21:52:40 KST 2004 */