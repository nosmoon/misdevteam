/***************************************************************************************************
 * 파일명   : SP_SL_A_COMM_ACCESS_APT_THRW.java
 * 기능     : 투입율조사
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  투입율조사-현황등록
**/

public class SL_A_COMM_ACCESS_APT_THRWDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList medicur = new ArrayList();
	public ArrayList dlvstatcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String invsgno;

	public SL_A_COMM_ACCESS_APT_THRWDataSet(){}
	public SL_A_COMM_ACCESS_APT_THRWDataSet(String errcode, String errmsg, String invsgno){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.invsgno = invsgno;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setInvsgno(String invsgno){
		this.invsgno = invsgno;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getInvsgno(){
		return this.invsgno;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.invsgno = Util.checkString(cstmt.getString(29));
		ResultSet rset0 = (ResultSet) cstmt.getObject(30);
		while(rset0.next()){
			SL_A_COMM_ACCESS_APT_THRWMEDICURRecord rec = new SL_A_COMM_ACCESS_APT_THRWMEDICURRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.qty = Util.checkString(rset0.getString("qty"));
			rec.qtyratio = Util.checkString(rset0.getString("qtyratio"));
			this.medicur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(31);
		while(rset1.next()){
			SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord rec = new SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord();
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			this.dlvstatcur.add(rec);
		}
	}

	public String medicurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_A_COMM_ACCESS_APT_THRWMEDICURRecord rec = (SL_A_COMM_ACCESS_APT_THRWMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
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

	public String dlvstatcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord rec = (SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord)dlvstatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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

	public String medicurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_A_COMM_ACCESS_APT_THRWMEDICURRecord rec = (SL_A_COMM_ACCESS_APT_THRWMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
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

	public String dlvstatcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord rec = (SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord)dlvstatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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

	public String medicurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_A_COMM_ACCESS_APT_THRWMEDICURRecord rec = (SL_A_COMM_ACCESS_APT_THRWMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.medinm;
			
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

	public String dlvstatcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = dlvstatcur.size();
		for(int i=0; i<size; i++){
			SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord rec = (SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord)dlvstatcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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
	SL_A_COMM_ACCESS_APT_THRWDataSet ds = (SL_A_COMM_ACCESS_APT_THRWDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicur.size(); i++){
		SL_A_COMM_ACCESS_APT_THRWMEDICURRecord medicurRec = (SL_A_COMM_ACCESS_APT_THRWMEDICURRecord)ds.medicur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.dlvstatcur.size(); i++){
		SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord dlvstatcurRec = (SL_A_COMM_ACCESS_APT_THRWDLVSTATCURRecord)ds.dlvstatcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getInvsgno()%>
<%= ds.getMedicur()%>
<%= ds.getDlvstatcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicurRec.medicd%>
<%= medicurRec.medinm%>
<%= medicurRec.qty%>
<%= medicurRec.qtyratio%>
<%= dlvstatcurRec.ciymgbcd%>
<%= dlvstatcurRec.cicdgb%>
<%= dlvstatcurRec.cicodeval%>
<%= dlvstatcurRec.cicdnm%>
<%= dlvstatcurRec.cicdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 08 11:24:22 KST 2006 */