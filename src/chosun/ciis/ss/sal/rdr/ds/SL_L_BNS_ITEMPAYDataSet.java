/***************************************************************************************************
* 파일명 : SL_L_BNS_ITEMPAYDataSet.java
* 기능 : 독자정보관리(판촉물내역팝업-목록조회)
* 작성일자 : 2004-06-03
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(판촉물내역팝업-목록조회)
 *
 */

public class SL_L_BNS_ITEMPAYDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bnsitempaycur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_L_BNS_ITEMPAYDataSet(){}
	public SL_L_BNS_ITEMPAYDataSet(String errcode, String errmsg, long totalcnt){
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
			SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord rec = new SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.payno = Util.checkString(rset0.getString("payno"));
			rec.paydt = Util.checkString(rset0.getString("paydt"));
			rec.bns_itemcd = Util.checkString(rset0.getString("bns_itemcd"));
			rec.bns_itemnm = Util.checkString(rset0.getString("bns_itemnm"));
			rec.qunt = rset0.getInt("qunt");
			rec.amt = rset0.getInt("amt");
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			this.bnsitempaycur.add(rec);
		}
	}

	public String bnsitempaycurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsitempaycur.size();
		for(int i=0; i<size; i++){
			SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord rec = (SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord)bnsitempaycur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.payno;
			
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

	public String bnsitempaycurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsitempaycur.size();
		for(int i=0; i<size; i++){
			SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord rec = (SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord)bnsitempaycur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.payno;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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

	public String bnsitempaycurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsitempaycur.size();
		for(int i=0; i<size; i++){
			SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord rec = (SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord)bnsitempaycur.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.payno;
			
			sb.append("<input name=\"");
			sb.append("rdr_no");
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
	SL_L_BNS_ITEMPAYDataSet ds = (SL_L_BNS_ITEMPAYDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bnsitempaycur.size(); i++){
		SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord bnsitempaycurRec = (SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord)ds.bnsitempaycur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getBnsitempaycur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bnsitempaycurRec.rdr_no%>
<%= bnsitempaycurRec.payno%>
<%= bnsitempaycurRec.paydt%>
<%= bnsitempaycurRec.bns_itemcd%>
<%= bnsitempaycurRec.bns_itemnm%>
<%= bnsitempaycurRec.qunt%>
<%= bnsitempaycurRec.amt%>
<%= bnsitempaycurRec.bocd%>
<%= bnsitempaycurRec.bonm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 04 11:40:03 KST 2004 */