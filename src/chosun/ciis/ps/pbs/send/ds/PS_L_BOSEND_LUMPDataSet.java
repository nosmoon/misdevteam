/***************************************************************************************************
* 파일명 : PS_L_BOSEND_LUMP.java
* 기능   : 발송 - 지국별상세 리스트
* 작성일자 : 2007-04-13
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송 - 지국별상세 리스트
 */

public class PS_L_BOSEND_LUMPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_BOSEND_LUMPDataSet(){}
	public PS_L_BOSEND_LUMPDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(8);
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			PS_L_BOSEND_LUMPCURCOMMLISTRecord rec = new PS_L_BOSEND_LUMPCURCOMMLISTRecord();
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.rdr_nonm = Util.checkString(rset0.getString("rdr_nonm"));
			rec.acqnm = Util.checkString(rset0.getString("acqnm"));
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.sendseq = Util.checkString(rset0.getString("sendseq"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.bocdnm = Util.checkString(rset0.getString("bocdnm"));
			rec.senddt = Util.checkString(rset0.getString("senddt"));
			rec.sendtype = Util.checkString(rset0.getString("sendtype"));
			rec.sendtypenm = Util.checkString(rset0.getString("sendtypenm"));
			rec.mediser_no = Util.checkString(rset0.getString("mediser_no"));
			rec.sendmthdcd = Util.checkString(rset0.getString("sendmthdcd"));
			rec.sendkindcd = Util.checkString(rset0.getString("sendkindcd"));
			rec.acq_bocd = Util.checkString(rset0.getString("acq_bocd"));
			rec.dstccd = Util.checkString(rset0.getString("dstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.rnum = rset0.getInt("rnum");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_L_BOSEND_LUMPCURCOMMLISTRecord rec = (PS_L_BOSEND_LUMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			PS_L_BOSEND_LUMPCURCOMMLISTRecord rec = (PS_L_BOSEND_LUMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
			PS_L_BOSEND_LUMPCURCOMMLISTRecord rec = (PS_L_BOSEND_LUMPCURCOMMLISTRecord)curcommlist.get(i);
			
			
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
	PS_L_BOSEND_LUMPDataSet ds = (PS_L_BOSEND_LUMPDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_BOSEND_LUMPCURCOMMLISTRecord curcommlistRec = (PS_L_BOSEND_LUMPCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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

<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.termsubsno%>
<%= curcommlistRec.rdr_nonm%>
<%= curcommlistRec.acqnm%>
<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.telno%>
<%= curcommlistRec.addr%>
<%= curcommlistRec.sendseq%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.bocdnm%>
<%= curcommlistRec.senddt%>
<%= curcommlistRec.sendtype%>
<%= curcommlistRec.sendtypenm%>
<%= curcommlistRec.mediser_no%>
<%= curcommlistRec.sendmthdcd%>
<%= curcommlistRec.sendkindcd%>
<%= curcommlistRec.acq_bocd%>
<%= curcommlistRec.dstccd%>
<%= curcommlistRec.dlvno%>
<%= curcommlistRec.memo%>
<%= curcommlistRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 16 20:25:08 KST 2007 */