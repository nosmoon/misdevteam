/***************************************************************************************************
* 파일명 : SS_SLS_BRSUP_2920_SDataSet.java
* 기능 : 센터지원-판촉현황-요원관리-요원별실적관리-상세(팝업)
* 작성일자 : 2016-08-11
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *  센터지원-판촉현황-요원관리-요원별실적관리-상세(팝업)
 *
 */


public class SS_SLS_BRSUP_2920_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList staflist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRSUP_2920_SDataSet(){}
	public SS_SLS_BRSUP_2920_SDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SS_SLS_BRSUP_2920_SSTAFLISTRecord rec = new SS_SLS_BRSUP_2920_SSTAFLISTRecord();
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.stafclsfnm = Util.checkString(rset0.getString("stafclsfnm"));
			rec.cntrstatnm = Util.checkString(rset0.getString("cntrstatnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.ernno = Util.checkString(rset0.getString("ernno"));
			rec.delyn = Util.checkString(rset0.getString("delyn"));
			rec.closmm = Util.checkString(rset0.getString("closmm"));
			rec.extn_qty = Util.checkString(rset0.getString("extn_qty"));
			rec.avg_svc = Util.checkString(rset0.getString("avg_svc"));
			rec.bs_qty = Util.checkString(rset0.getString("bs_qty"));
			rec.bs_rate = Util.checkString(rset0.getString("bs_rate"));
			rec.susp_qty = Util.checkString(rset0.getString("susp_qty"));
			rec.susp_rate = Util.checkString(rset0.getString("susp_rate"));
			rec.misu_qty = Util.checkString(rset0.getString("misu_qty"));
			rec.misu_rate = Util.checkString(rset0.getString("misu_rate"));
			rec.clsfdtls = Util.checkString(rset0.getString("clsfdtls"));
			this.staflist.add(rec);
		}
	}

	public String staflistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = staflist.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2920_SSTAFLISTRecord rec = (SS_SLS_BRSUP_2920_SSTAFLISTRecord)staflist.get(i);


			String code = rec.stafno;
			String name = rec.stafnm;

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

	public String staflistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = staflist.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2920_SSTAFLISTRecord rec = (SS_SLS_BRSUP_2920_SSTAFLISTRecord)staflist.get(i);


			String code = rec.stafno;
			String name = rec.stafnm;

			sb.append("<input name=\"");
			sb.append("stafno");
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

	public String staflistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = staflist.size();
		for(int i=0; i<size; i++){
			SS_SLS_BRSUP_2920_SSTAFLISTRecord rec = (SS_SLS_BRSUP_2920_SSTAFLISTRecord)staflist.get(i);


			String code = rec.stafno;
			String name = rec.stafnm;

			sb.append("<input name=\"");
			sb.append("stafno");
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
	SS_SLS_BRSUP_2920_SDataSet ds = (SS_SLS_BRSUP_2920_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.staflist.size(); i++){
		SS_SLS_BRSUP_2920_SSTAFLISTRecord staflistRec = (SS_SLS_BRSUP_2920_SSTAFLISTRecord)ds.staflist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getStaflist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= staflistRec.stafno%>
<%= staflistRec.stafnm%>
<%= staflistRec.stafclsfnm%>
<%= staflistRec.cntrstatnm%>
<%= staflistRec.prn%>
<%= staflistRec.ernno%>
<%= staflistRec.delyn%>
<%= staflistRec.closmm%>
<%= staflistRec.extn_qty%>
<%= staflistRec.avg_svc%>
<%= staflistRec.bs_qty%>
<%= staflistRec.bs_rate%>
<%= staflistRec.susp_qty%>
<%= staflistRec.susp_rate%>
<%= staflistRec.misu_qty%>
<%= staflistRec.misu_rate%>
<%= staflistRec.clsfdtls%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 11 10:44:09 KST 2016 */