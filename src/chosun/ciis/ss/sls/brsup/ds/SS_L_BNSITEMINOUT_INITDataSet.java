/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고관리-초기화면
* 작성일자 : 2009-04-28
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
 * 통합정보지원시스템-판촉물재고관리-초기화면
 */

public class SS_L_BNSITEMINOUT_INITDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList taslmlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_BNSITEMINOUT_INITDataSet(){}
	public SS_L_BNSITEMINOUT_INITDataSet(String errcode, String errmsg){
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
			SS_L_BNSITEMINOUT_INITTASLMLISTRecord rec = new SS_L_BNSITEMINOUT_INITTASLMLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.taslmlist.add(rec);
		}
	}

	public String taslmlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = taslmlist.size();
		for(int i=0; i<size; i++){
			SS_L_BNSITEMINOUT_INITTASLMLISTRecord rec = (SS_L_BNSITEMINOUT_INITTASLMLISTRecord)taslmlist.get(i);
			
			
			String code = rec.cd;
			String name = rec.cdnm;
			
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

	public String taslmlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = taslmlist.size();
		for(int i=0; i<size; i++){
			SS_L_BNSITEMINOUT_INITTASLMLISTRecord rec = (SS_L_BNSITEMINOUT_INITTASLMLISTRecord)taslmlist.get(i);
			
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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

	public String taslmlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = taslmlist.size();
		for(int i=0; i<size; i++){
			SS_L_BNSITEMINOUT_INITTASLMLISTRecord rec = (SS_L_BNSITEMINOUT_INITTASLMLISTRecord)taslmlist.get(i);
			
			
			String code = rec.cd;
			String name = rec.cdnm;
			
			sb.append("<input name=\"");
			sb.append("cd");
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
	SS_L_BNSITEMINOUT_INITDataSet ds = (SS_L_BNSITEMINOUT_INITDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.taslmlist.size(); i++){
		SS_L_BNSITEMINOUT_INITTASLMLISTRecord taslmlistRec = (SS_L_BNSITEMINOUT_INITTASLMLISTRecord)ds.taslmlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTaslmlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= taslmlistRec.cd%>
<%= taslmlistRec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 20:49:48 PDT 2009 */