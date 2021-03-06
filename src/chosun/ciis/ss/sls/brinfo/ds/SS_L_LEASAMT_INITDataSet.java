/***************************************************************************************************
* 파일명 : SS_L_LEASAMT_INITDataSet.java
* 기능 : 지국INFO-전세지원금현화-초기 화면(부서코드조회)
* 작성일자 : 2004-02-09
* 작성자 : 김성규
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국INFO-전세지원금현황-초기 화면(부서조회)
 *
 */


public class SS_L_LEASAMT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deptlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_LEASAMT_INITDataSet(){}
	public SS_L_LEASAMT_INITDataSet(String errcode, String errmsg){
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
			SS_L_LEASAMT_INITDEPTLISTRecord rec = new SS_L_LEASAMT_INITDEPTLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.boksnm = Util.checkString(rset0.getString("boksnm"));
			this.deptlist.add(rec);
		}
	}

	public String deptlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_L_LEASAMT_INITDEPTLISTRecord rec = (SS_L_LEASAMT_INITDEPTLISTRecord)deptlist.get(i);


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

	public String deptlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_L_LEASAMT_INITDEPTLISTRecord rec = (SS_L_LEASAMT_INITDEPTLISTRecord)deptlist.get(i);


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

	public String deptlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = deptlist.size();
		for(int i=0; i<size; i++){
			SS_L_LEASAMT_INITDEPTLISTRecord rec = (SS_L_LEASAMT_INITDEPTLISTRecord)deptlist.get(i);


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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_LEASAMT_INITDataSet ds = (SS_L_LEASAMT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.deptlist.size(); i++){
		SS_L_LEASAMT_INITDEPTLISTRecord deptlistRec = (SS_L_LEASAMT_INITDEPTLISTRecord)ds.deptlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeptlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= deptlistRec.deptcd%>
<%= deptlistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 16:39:26 KST 2004 */