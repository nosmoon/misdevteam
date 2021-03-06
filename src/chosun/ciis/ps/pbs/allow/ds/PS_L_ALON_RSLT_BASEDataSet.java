/***************************************************************************************************
* 파일명 : SP_PS_L_ALON_RSLT_BASE.java
* 수당-수당관리 수당처리 조회화면
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
 * 수당-수당관리 조회화면
 *
 */



public class PS_L_ALON_RSLT_BASEDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_ALON_RSLT_BASEDataSet(){}
	public PS_L_ALON_RSLT_BASEDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			PS_L_ALON_RSLT_BASECURCOMMLISTRecord rec = new PS_L_ALON_RSLT_BASECURCOMMLISTRecord();
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.boemp_nm = Util.checkString(rset0.getString("boemp_nm"));
			rec.dutycd_nm = Util.checkString(rset0.getString("dutycd_nm"));
			rec.aloncd = Util.checkString(rset0.getString("aloncd"));
			rec.trgtnoit = rset0.getInt("trgtnoit");
			rec.fix_rateclsf = Util.checkString(rset0.getString("fix_rateclsf"));
			rec.amt = rset0.getInt("amt");
			rec.ratiocalcclsf = Util.checkString(rset0.getString("ratiocalcclsf"));
			rec.ratio = rset0.getFloat("ratio");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_ALON_RSLT_BASECURCOMMLISTRecord rec = (PS_L_ALON_RSLT_BASECURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bonm;
			String name = rec.flnm;

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
			PS_L_ALON_RSLT_BASECURCOMMLISTRecord rec = (PS_L_ALON_RSLT_BASECURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bonm;
			String name = rec.flnm;

			sb.append("<input name=\"");
			sb.append("bonm");
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
			PS_L_ALON_RSLT_BASECURCOMMLISTRecord rec = (PS_L_ALON_RSLT_BASECURCOMMLISTRecord)curcommlist.get(i);


			String code = rec.bonm;
			String name = rec.flnm;

			sb.append("<input name=\"");
			sb.append("bonm");
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
	PS_L_ALON_RSLT_BASEDataSet ds = (PS_L_ALON_RSLT_BASEDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_ALON_RSLT_BASECURCOMMLISTRecord curcommlistRec = (PS_L_ALON_RSLT_BASECURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.bonm%>
<%= curcommlistRec.flnm%>
<%= curcommlistRec.boemp_no%>
<%= curcommlistRec.boemp_nm%>
<%= curcommlistRec.dutycd_nm%>
<%= curcommlistRec.aloncd%>
<%= curcommlistRec.trgtnoit%>
<%= curcommlistRec.fix_rateclsf%>
<%= curcommlistRec.amt%>
<%= curcommlistRec.ratiocalcclsf%>
<%= curcommlistRec.ratio%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 20:26:29 KST 2004 */