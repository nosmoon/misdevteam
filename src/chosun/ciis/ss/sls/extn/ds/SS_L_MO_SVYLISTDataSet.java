/***************************************************************************************************
* 파일명 : SS_L_MO_SVYLISTDataSet.java
* 기능 :
* 작성일자 : 2016.02.29
* 작성자 : 장선희
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
 *
 */


public class SS_L_MO_SVYLISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList mosvylist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_MO_SVYLISTDataSet(){}
	public SS_L_MO_SVYLISTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_MO_SVYLISTMOSVYLISTRecord rec = new SS_L_MO_SVYLISTMOSVYLISTRecord();
			rec.svyid = Util.checkString(rset0.getString("svyid"));
			rec.svynm = Util.checkString(rset0.getString("svynm"));
			this.mosvylist.add(rec);
		}
	}

	public String mosvylistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mosvylist.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVYLISTMOSVYLISTRecord rec = (SS_L_MO_SVYLISTMOSVYLISTRecord)mosvylist.get(i);


			String code = rec.svyid;
			String name = rec.svynm;

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

	public String mosvylistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mosvylist.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVYLISTMOSVYLISTRecord rec = (SS_L_MO_SVYLISTMOSVYLISTRecord)mosvylist.get(i);


			String code = rec.svyid;
			String name = rec.svynm;

			sb.append("<input name=\"");
			sb.append("svyid");
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

	public String mosvylistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = mosvylist.size();
		for(int i=0; i<size; i++){
			SS_L_MO_SVYLISTMOSVYLISTRecord rec = (SS_L_MO_SVYLISTMOSVYLISTRecord)mosvylist.get(i);


			String code = rec.svyid;
			String name = rec.svynm;

			sb.append("<input name=\"");
			sb.append("svyid");
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
	SS_L_MO_SVYLISTDataSet ds = (SS_L_MO_SVYLISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.mosvylist.size(); i++){
		SS_L_MO_SVYLISTMOSVYLISTRecord mosvylistRec = (SS_L_MO_SVYLISTMOSVYLISTRecord)ds.mosvylist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMosvylist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= mosvylistRec.svyid%>
<%= mosvylistRec.svynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 29 18:14:36 KST 2016 */