/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-빌링_자동이체-이체신청개선 목록 조회검색
* 작성일자 :2009/05/20 
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-빌링_자동이체-이체신청개선 목록 조회검색
 */

public class SS_L_SHFTAPLCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList shftaplclist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_SHFTAPLCDataSet(){}
	public SS_L_SHFTAPLCDataSet(String errcode, String errmsg){
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
			SS_L_SHFTAPLCSHFTAPLCLISTRecord rec = new SS_L_SHFTAPLCSHFTAPLCLISTRecord();
			rec.sysid = Util.checkString(rset0.getString("sysid"));
			rec.svctype = Util.checkString(rset0.getString("svctype"));
			rec.aplcclsf = Util.checkString(rset0.getString("aplcclsf"));
			rec.basidt = Util.checkString(rset0.getString("basidt"));
			rec.aplcdt = Util.checkString(rset0.getString("aplcdt"));
			rec.filenm = Util.checkString(rset0.getString("filenm"));
			rec.datacnt = rset0.getInt("datacnt");
			rec.procdt = Util.checkString(rset0.getString("procdt"));
			rec.procpers = Util.checkString(rset0.getString("procpers"));
			rec.procstat = Util.checkString(rset0.getString("procstat"));
			rec.proccnt = rset0.getInt("proccnt");
			this.shftaplclist.add(rec);
		}
	}

	public String shftaplclistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftaplclist.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLCSHFTAPLCLISTRecord rec = (SS_L_SHFTAPLCSHFTAPLCLISTRecord)shftaplclist.get(i);
			
			
			String code = rec.sysid;
			String name = rec.svctype;
			
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

	public String shftaplclistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftaplclist.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLCSHFTAPLCLISTRecord rec = (SS_L_SHFTAPLCSHFTAPLCLISTRecord)shftaplclist.get(i);
			
			
			String code = rec.sysid;
			String name = rec.svctype;
			
			sb.append("<input name=\"");
			sb.append("sysid");
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

	public String shftaplclistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = shftaplclist.size();
		for(int i=0; i<size; i++){
			SS_L_SHFTAPLCSHFTAPLCLISTRecord rec = (SS_L_SHFTAPLCSHFTAPLCLISTRecord)shftaplclist.get(i);
			
			
			String code = rec.sysid;
			String name = rec.svctype;
			
			sb.append("<input name=\"");
			sb.append("sysid");
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
	SS_L_SHFTAPLCDataSet ds = (SS_L_SHFTAPLCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.shftaplclist.size(); i++){
		SS_L_SHFTAPLCSHFTAPLCLISTRecord shftaplclistRec = (SS_L_SHFTAPLCSHFTAPLCLISTRecord)ds.shftaplclist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getShftaplclist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= shftaplclistRec.sysid%>
<%= shftaplclistRec.svctype%>
<%= shftaplclistRec.aplcclsf%>
<%= shftaplclistRec.basidt%>
<%= shftaplclistRec.aplcdt%>
<%= shftaplclistRec.filenm%>
<%= shftaplclistRec.datacnt%>
<%= shftaplclistRec.procdt%>
<%= shftaplclistRec.procpers%>
<%= shftaplclistRec.procstat%>
<%= shftaplclistRec.proccnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 10:43:55 PDT 2009 */