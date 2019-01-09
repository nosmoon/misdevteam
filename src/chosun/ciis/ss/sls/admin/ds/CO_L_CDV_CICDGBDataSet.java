/***************************************************************************************************
* 파일명 : CO_L_CDV_CICDGBDataSet.java
* 기능 : 관리자-공통코드-코드구분 목록을 위한 DataSet
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-공통코드-코드구분 목록을 위한 DataSet
 */

public class CO_L_CDV_CICDGBDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_L_CDV_CICDGBDataSet(){}
	public CO_L_CDV_CICDGBDataSet(String errcode, String errmsg){
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
		ResultSet rset2 = (ResultSet) cstmt.getObject(4);
		while(rset2.next()){
			CO_L_CDV_CICDGBCURCOMMLISTRecord rec = new CO_L_CDV_CICDGBCURCOMMLISTRecord();
			rec.cicdgb = Util.checkString(rset2.getString("cicdgb"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			CO_L_CDV_CICDGBCURCOMMLISTRecord rec = (CO_L_CDV_CICDGBCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cicdgb;
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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			CO_L_CDV_CICDGBCURCOMMLISTRecord rec = (CO_L_CDV_CICDGBCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cicdgb;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicdgb");
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			CO_L_CDV_CICDGBCURCOMMLISTRecord rec = (CO_L_CDV_CICDGBCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.cicdgb;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicdgb");
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
	CO_L_CDV_CICDGBDataSet ds = (CO_L_CDV_CICDGBDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		CO_L_CDV_CICDGBCURCOMMLISTRecord curcommlistRec = (CO_L_CDV_CICDGBCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.cicdgb%>
<%= curcommlistRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 13:57:19 KST 2004 */