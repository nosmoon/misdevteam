/***************************************************************************************************
* 파일명 : SS_L_POSTDLVRDRDataSet.java
* 기능 : 독자관리 우송독자관리 조회
* 작성일자 : 2016/06/17
* 작성자 : 장선희
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_L_POSTDLVRDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList postrdrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_POSTDLVRDRDataSet(){}
	public SS_L_POSTDLVRDRDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_L_POSTDLVRDRPOSTRDRLISTRecord rec = new SS_L_POSTDLVRDRPOSTRDRLISTRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.modiyn = Util.checkString(rset0.getString("modiyn"));
			this.postrdrlist.add(rec);
		}
	}

	public String postrdrlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = postrdrlist.size();
		for(int i=0; i<size; i++){
			SS_L_POSTDLVRDRPOSTRDRLISTRecord rec = (SS_L_POSTDLVRDRPOSTRDRLISTRecord)postrdrlist.get(i);
			
			
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

	public String postrdrlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = postrdrlist.size();
		for(int i=0; i<size; i++){
			SS_L_POSTDLVRDRPOSTRDRLISTRecord rec = (SS_L_POSTDLVRDRPOSTRDRLISTRecord)postrdrlist.get(i);
			
			
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

	public String postrdrlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = postrdrlist.size();
		for(int i=0; i<size; i++){
			SS_L_POSTDLVRDRPOSTRDRLISTRecord rec = (SS_L_POSTDLVRDRPOSTRDRLISTRecord)postrdrlist.get(i);
			
			
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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_POSTDLVRDRDataSet ds = (SS_L_POSTDLVRDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.postrdrlist.size(); i++){
		SS_L_POSTDLVRDRPOSTRDRLISTRecord postrdrlistRec = (SS_L_POSTDLVRDRPOSTRDRLISTRecord)ds.postrdrlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPostrdrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= postrdrlistRec.rdr_no%>
<%= postrdrlistRec.rdrnm%>
<%= postrdrlistRec.dlvzip%>
<%= postrdrlistRec.dlvaddr%>
<%= postrdrlistRec.dlvdtlsaddr%>
<%= postrdrlistRec.bonm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 09:50:03 KST 2015 */