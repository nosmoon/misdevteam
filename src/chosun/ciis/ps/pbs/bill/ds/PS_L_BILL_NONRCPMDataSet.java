/***************************************************************************************************
* 파일명 : SP_PS_L_BILL_NONRCPM.java
* 수금-비정상입금 조회화면
* 작성일자 : 2004-03-29
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :    
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/** 
 * 수금-비정상입금 조회화면   
 * 
 */

  

public class PS_L_BILL_NONRCPMDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_BILL_NONRCPMDataSet(){}
	public PS_L_BILL_NONRCPMDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(9);
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			PS_L_BILL_NONRCPMCURCOMMLISTRecord rec = new PS_L_BILL_NONRCPMCURCOMMLISTRecord();
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.acqdt = Util.checkString(rset0.getString("acqdt"));
			rec.acqno = Util.checkString(rset0.getString("acqno"));
			rec.rcpmrfldt = Util.checkString(rset0.getString("rcpmrfldt"));
			rec.custbrwsno = Util.checkString(rset0.getString("custbrwsno"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.tbstprocclsf = Util.checkString(rset0.getString("tbstprocclsf"));
			rec.tbstprocclsfnm = Util.checkString(rset0.getString("tbstprocclsfnm"));
			rec.amt = rset0.getInt("amt");
			rec.recpbrchcd = Util.checkString(rset0.getString("recpbrchcd"));
			rec.recpdt = Util.checkString(rset0.getString("recpdt"));
			rec.rcpmrflyn = Util.checkString(rset0.getString("rcpmrflyn"));
			rec.rcpmrflynnm = Util.checkString(rset0.getString("rcpmrflynnm"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BILL_NONRCPMCURCOMMLISTRecord rec = (PS_L_BILL_NONRCPMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
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
			PS_L_BILL_NONRCPMCURCOMMLISTRecord rec = (PS_L_BILL_NONRCPMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
			PS_L_BILL_NONRCPMCURCOMMLISTRecord rec = (PS_L_BILL_NONRCPMCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.bocd;
			String name = rec.bonm;
			
			sb.append("<input name=\"");
			sb.append("bocd");
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
	PS_L_BILL_NONRCPMDataSet ds = (PS_L_BILL_NONRCPMDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_BILL_NONRCPMCURCOMMLISTRecord curcommlistRec = (PS_L_BILL_NONRCPMCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.bocd%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.seq%>
<%= curcommlistRec.acqdt%>
<%= curcommlistRec.acqno%>
<%= curcommlistRec.rcpmrfldt%>
<%= curcommlistRec.custbrwsno%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.termsubsno%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.tbstprocclsf%>
<%= curcommlistRec.tbstprocclsfnm%>
<%= curcommlistRec.amt%>
<%= curcommlistRec.recpbrchcd%>
<%= curcommlistRec.recpdt%>
<%= curcommlistRec.rcpmrflyn%>
<%= curcommlistRec.rcpmrflynnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 29 17:51:13 KST 2004 */