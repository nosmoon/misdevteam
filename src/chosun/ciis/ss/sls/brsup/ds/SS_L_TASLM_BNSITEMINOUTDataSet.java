/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-조회화면
* 작성일자 : 2009-05-06
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
 * 통합정보지원시스템-판촉물재고현황-조회화면
 */

public class SS_L_TASLM_BNSITEMINOUTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bnsiteminout = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_TASLM_BNSITEMINOUTDataSet(){}
	public SS_L_TASLM_BNSITEMINOUTDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord rec = new SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord();
			rec.itemclsf = Util.checkString(rset0.getString("itemclsf"));
			rec.itemcd = Util.checkString(rset0.getString("itemcd"));
			rec.itemnm = Util.checkString(rset0.getString("itemnm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.mainware = Util.checkString(rset0.getString("mainware"));
			rec.pyungware = Util.checkString(rset0.getString("pyungware"));
			rec.sungware = Util.checkString(rset0.getString("sungware"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.incmgdt = rset0.getTimestamp("incmgdt");
			rec.bns_itemcd = Util.checkString(rset0.getString("bns_itemcd"));
			rec.stokqunt = rset0.getInt("stokqunt");
			rec.whcd = Util.checkString(rset0.getString("whcd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.bnsiteminout.add(rec);
		}
	}

	public String bnsiteminoutOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsiteminout.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord rec = (SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord)bnsiteminout.get(i);
			
			
			String code = rec.itemclsf;
			String name = rec.itemcd;
			
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

	public String bnsiteminoutChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsiteminout.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord rec = (SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord)bnsiteminout.get(i);
			
			
			String code = rec.itemclsf;
			String name = rec.itemcd;
			
			sb.append("<input name=\"");
			sb.append("itemclsf");
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

	public String bnsiteminoutRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsiteminout.size();
		for(int i=0; i<size; i++){
			SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord rec = (SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord)bnsiteminout.get(i);
			
			
			String code = rec.itemclsf;
			String name = rec.itemcd;
			
			sb.append("<input name=\"");
			sb.append("itemclsf");
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
	SS_L_TASLM_BNSITEMINOUTDataSet ds = (SS_L_TASLM_BNSITEMINOUTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bnsiteminout.size(); i++){
		SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord bnsiteminoutRec = (SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord)ds.bnsiteminout.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBnsiteminout()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bnsiteminoutRec.itemclsf%>
<%= bnsiteminoutRec.itemcd%>
<%= bnsiteminoutRec.itemnm%>
<%= bnsiteminoutRec.unit%>
<%= bnsiteminoutRec.mainware%>
<%= bnsiteminoutRec.pyungware%>
<%= bnsiteminoutRec.sungware%>
<%= bnsiteminoutRec.remk%>
<%= bnsiteminoutRec.incmgdt%>
<%= bnsiteminoutRec.bns_itemcd%>
<%= bnsiteminoutRec.stokqunt%>
<%= bnsiteminoutRec.whcd%>
<%= bnsiteminoutRec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 16:46:30 PDT 2009 */