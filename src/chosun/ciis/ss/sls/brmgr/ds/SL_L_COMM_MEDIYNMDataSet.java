/***************************************************************************************************
 * 파일명   : SL_L_COMM_MEDIYNMDataSet.java
 * 기능     : 지국경영-아파트투입율-매체 약어표
 * 작성일자 : 2005/10/07
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
**  지국경영-아파트투입율-매체 약어표
**/

public class SL_L_COMM_MEDIYNMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curmedilist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_COMM_MEDIYNMDataSet(){}
	public SL_L_COMM_MEDIYNMDataSet(String errcode, String errmsg){
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
			SL_L_COMM_MEDIYNMCURMEDILISTRecord rec = new SL_L_COMM_MEDIYNMCURMEDILISTRecord();
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cimgtcd2 = Util.checkString(rset0.getString("cimgtcd2"));
			this.curmedilist.add(rec);
		}
	}

	public String curmedilistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedilist.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_MEDIYNMCURMEDILISTRecord rec = (SL_L_COMM_MEDIYNMCURMEDILISTRecord)curmedilist.get(i);
			
			
			String code = rec.cicdnm;
			String name = rec.cimgtcd2;
			
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

	public String curmedilistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedilist.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_MEDIYNMCURMEDILISTRecord rec = (SL_L_COMM_MEDIYNMCURMEDILISTRecord)curmedilist.get(i);
			
			
			String code = rec.cicdnm;
			String name = rec.cimgtcd2;
			
			sb.append("<input name=\"");
			sb.append("cicdnm");
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

	public String curmedilistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curmedilist.size();
		for(int i=0; i<size; i++){
			SL_L_COMM_MEDIYNMCURMEDILISTRecord rec = (SL_L_COMM_MEDIYNMCURMEDILISTRecord)curmedilist.get(i);
			
			
			String code = rec.cicdnm;
			String name = rec.cimgtcd2;
			
			sb.append("<input name=\"");
			sb.append("cicdnm");
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
	SL_L_COMM_MEDIYNMDataSet ds = (SL_L_COMM_MEDIYNMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curmedilist.size(); i++){
		SL_L_COMM_MEDIYNMCURMEDILISTRecord curmedilistRec = (SL_L_COMM_MEDIYNMCURMEDILISTRecord)ds.curmedilist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurmedilist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curmedilistRec.cicdnm%>
<%= curmedilistRec.cimgtcd2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 07 17:27:43 KST 2005 */