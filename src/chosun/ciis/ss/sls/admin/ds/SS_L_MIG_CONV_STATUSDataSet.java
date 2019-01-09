/***************************************************************************************************
* 파일명 : SS_L_MIG_CONV_STATUSDataSet.java
* 기능 : 관리자-작업-마이그레이션-목록을 위한 DataSet
* 작성일자 : 2004-02-13
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
 * 관리자-작업-마이그레이션-목록을 위한 DataSet
 */

public class SS_L_MIG_CONV_STATUSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SS_L_MIG_CONV_STATUSDataSet(){}
	public SS_L_MIG_CONV_STATUSDataSet(String errcode, String errmsg, long totalcnt){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SS_L_MIG_CONV_STATUSCURCOMMLISTRecord rec = new SS_L_MIG_CONV_STATUSCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.start_time = rset0.getTimestamp("start_time");
			rec.end_time = rset0.getTimestamp("end_time");
			rec.src_tblnm = Util.checkString(rset0.getString("src_tblnm"));
			rec.trg_tblnm = Util.checkString(rset0.getString("trg_tblnm"));
			rec.status = Util.checkString(rset0.getString("status"));
			rec.src_count = rset0.getInt("src_count");
			rec.trg_count = rset0.getInt("trg_count");
			rec.err_code = Util.checkString(rset0.getString("err_code"));
			rec.err_msg = Util.checkString(rset0.getString("err_msg"));
			rec.sp_name = Util.checkString(rset0.getString("sp_name"));
			rec.sp_desc = Util.checkString(rset0.getString("sp_desc"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(12);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIG_CONV_STATUSCURCOMMLISTRecord rec = (SS_L_MIG_CONV_STATUSCURCOMMLISTRecord)curcommlist.get(i);


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

	public String curcommlistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIG_CONV_STATUSCURCOMMLISTRecord rec = (SS_L_MIG_CONV_STATUSCURCOMMLISTRecord)curcommlist.get(i);


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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_MIG_CONV_STATUSCURCOMMLISTRecord rec = (SS_L_MIG_CONV_STATUSCURCOMMLISTRecord)curcommlist.get(i);


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
	SS_L_MIG_CONV_STATUSDataSet ds = (SS_L_MIG_CONV_STATUSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIG_CONV_STATUSCURCOMMLISTRecord curcommlistRec = (SS_L_MIG_CONV_STATUSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptcd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.start_time%>
<%= curcommlistRec.end_time%>
<%= curcommlistRec.src_tblnm%>
<%= curcommlistRec.trg_tblnm%>
<%= curcommlistRec.status%>
<%= curcommlistRec.src_count%>
<%= curcommlistRec.trg_count%>
<%= curcommlistRec.err_code%>
<%= curcommlistRec.err_msg%>
<%= curcommlistRec.sp_name%>
<%= curcommlistRec.sp_desc%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Feb 14 15:15:40 KST 2004 */