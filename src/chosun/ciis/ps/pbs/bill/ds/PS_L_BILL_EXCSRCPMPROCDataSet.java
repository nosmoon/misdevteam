/***************************************************************************************************
 * 파일명   : PS_L_BILL_EXCSRCPMPROCDataSet.java
 * 기능     : 수금-초과입금처리 검색
 * 작성일자 : 2004-04-06
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 수금-초과입금처리 검색
 */

public class PS_L_BILL_EXCSRCPMPROCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public String bocd;

	public PS_L_BILL_EXCSRCPMPROCDataSet(){}
	public PS_L_BILL_EXCSRCPMPROCDataSet(String errcode, String errmsg, long totalcnt, String bocd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.bocd = bocd;
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

	public void setBocd(String bocd){
		this.bocd = bocd;
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

	public String getBocd(){
		return this.bocd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(10);
		this.bocd = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord rec = new PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.procclsf = Util.checkString(rset0.getString("procclsf"));
			rec.procclsfnm = Util.checkString(rset0.getString("procclsfnm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.procyn = Util.checkString(rset0.getString("procyn"));
			rec.procamt = rset0.getInt("procamt");
			rec.realsellamt = rset0.getInt("realsellamt");
			rec.excsrcpmamt = rset0.getInt("excsrcpmamt");
			rec.procdt = Util.checkString(rset0.getString("procdt"));
			rec.subsfrser_no = Util.checkString(rset0.getString("subsfrser_no"));
			rec.substoser_no = Util.checkString(rset0.getString("substoser_no"));
			rec.exstsubssctn = Util.checkString(rset0.getString("exstsubssctn"));
			rec.chgsubssctn = Util.checkString(rset0.getString("chgsubssctn"));
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord rec = (PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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
			PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord rec = (PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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

	public String curcommlistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord rec = (PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.rdr_no;
			String name = rec.medicd;
			
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
	PS_L_BILL_EXCSRCPMPROCDataSet ds = (PS_L_BILL_EXCSRCPMPROCDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord curcommlistRec = (PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getBocd()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.termsubsno%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.procclsf%>
<%= curcommlistRec.procclsfnm%>
<%= curcommlistRec.seq%>
<%= curcommlistRec.procyn%>
<%= curcommlistRec.procamt%>
<%= curcommlistRec.realsellamt%>
<%= curcommlistRec.excsrcpmamt%>
<%= curcommlistRec.procdt%>
<%= curcommlistRec.subsfrser_no%>
<%= curcommlistRec.substoser_no%>
<%= curcommlistRec.exstsubssctn%>
<%= curcommlistRec.chgsubssctn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 07 16:42:18 KST 2004 */