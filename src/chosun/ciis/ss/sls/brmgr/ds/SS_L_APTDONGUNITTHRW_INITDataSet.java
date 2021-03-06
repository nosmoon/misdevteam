/***************************************************************************************************
* 파일명 : .java
* 기능 : 아파트투입률 초기조회
* 작성일자 : 2009-08-14
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 아파트투입률 초기조회
 */
 
public class SS_L_APTDONGUNITTHRW_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList aptlistcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_APTDONGUNITTHRW_INITDataSet(){}
	public SS_L_APTDONGUNITTHRW_INITDataSet(String errcode, String errmsg){
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
			SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord rec = new SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord();
			rec.addrcd = Util.checkString(rset0.getString("addrcd"));
			rec.addrnm = Util.checkString(rset0.getString("addrnm"));
			this.aptlistcur.add(rec);
		}
	}

	public String aptlistcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord rec = (SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord)aptlistcur.get(i);
			
			
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

	public String aptlistcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord rec = (SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord)aptlistcur.get(i);
			
			
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

	public String aptlistcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aptlistcur.size();
		for(int i=0; i<size; i++){
			SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord rec = (SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord)aptlistcur.get(i);
			
			
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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_APTDONGUNITTHRW_INITDataSet ds = (SS_L_APTDONGUNITTHRW_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.aptlistcur.size(); i++){
		SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord aptlistcurRec = (SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord)ds.aptlistcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getAptlistcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= aptlistcurRec.addrcd%>
<%= aptlistcurRec.addrnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 16:16:54 KST 2009 */