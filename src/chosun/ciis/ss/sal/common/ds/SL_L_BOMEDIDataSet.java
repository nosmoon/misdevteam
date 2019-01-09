/***************************************************************************************************
* 파일명 : SL_L_BOMEDIDataSet.java
* 기능 : 지국취급매체 목록조회
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 지국취급매체 목록조회
 *
 */


public class SL_L_BOMEDIDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_BOMEDIDataSet(){}
	public SL_L_BOMEDIDataSet(String errcode, String errmsg){
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
			SL_L_BOMEDICURCOMMLISTRecord rec = new SL_L_BOMEDICURCOMMLISTRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cimgtcd2 = Util.checkString(rset0.getString("cimgtcd2"));
			rec.subsuprc = rset0.getInt("subsuprc");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SL_L_BOMEDICURCOMMLISTRecord rec = (SL_L_BOMEDICURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.medicd;
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
			SL_L_BOMEDICURCOMMLISTRecord rec = (SL_L_BOMEDICURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.medicd;
			String name = rec.cicdnm;

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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SL_L_BOMEDICURCOMMLISTRecord rec = (SL_L_BOMEDICURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.medicd;
			String name = rec.cicdnm;

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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_L_BOMEDIDataSet ds = (SL_L_BOMEDIDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SL_L_BOMEDICURCOMMLISTRecord curcommlistRec = (SL_L_BOMEDICURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.medicd%>
<%= curcommlistRec.cicdnm%>
<%= curcommlistRec.cimgtcd2%>
<%= curcommlistRec.subsuprc%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 29 14:36:00 KST 2003 */