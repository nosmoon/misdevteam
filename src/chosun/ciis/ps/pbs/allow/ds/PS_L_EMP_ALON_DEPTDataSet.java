/***************************************************************************************************
* 파일명 : SP_PS_L_EMP_ALON_DEPT.java
* 수당-수당관리 지사별 부서코드
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.rec.*;

/**
 * 수당-수당관리 지사별 부서코드 조회화면  
 *
 */ 

 

public class PS_L_EMP_ALON_DEPTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bodeptcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PS_L_EMP_ALON_DEPTDataSet(){}
	public PS_L_EMP_ALON_DEPTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			PS_L_EMP_ALON_DEPTBODEPTCURRecord rec = new PS_L_EMP_ALON_DEPTBODEPTCURRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			this.bodeptcur.add(rec);
		}
	}

	public String bodeptcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bodeptcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMP_ALON_DEPTBODEPTCURRecord rec = (PS_L_EMP_ALON_DEPTBODEPTCURRecord)bodeptcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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

	public String bodeptcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bodeptcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMP_ALON_DEPTBODEPTCURRecord rec = (PS_L_EMP_ALON_DEPTBODEPTCURRecord)bodeptcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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

	public String bodeptcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bodeptcur.size();
		for(int i=0; i<size; i++){
			PS_L_EMP_ALON_DEPTBODEPTCURRecord rec = (PS_L_EMP_ALON_DEPTBODEPTCURRecord)bodeptcur.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.deptnm;
			
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
	PS_L_EMP_ALON_DEPTDataSet ds = (PS_L_EMP_ALON_DEPTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bodeptcur.size(); i++){
		PS_L_EMP_ALON_DEPTBODEPTCURRecord bodeptcurRec = (PS_L_EMP_ALON_DEPTBODEPTCURRecord)ds.bodeptcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBodeptcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bodeptcurRec.deptcd%>
<%= bodeptcurRec.deptnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 08 14:54:16 KST 2004 */