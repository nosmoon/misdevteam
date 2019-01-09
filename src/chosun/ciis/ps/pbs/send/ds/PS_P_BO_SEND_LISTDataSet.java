/***************************************************************************************************
 * 파일명 :PS_P_BO_SEND_LIST.java
 * 기능 : 지국별발송독자 목록
 * 작성일자 : 2007-06-21
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
 * 발송-지국별발송독자 목록
 */

public class PS_P_BO_SEND_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String bonm;
	public String medinm;

	public PS_P_BO_SEND_LISTDataSet(){}
	public PS_P_BO_SEND_LISTDataSet(String errcode, String errmsg, String bonm, String medinm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bonm = bonm;
		this.medinm = medinm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.bonm = Util.checkString(cstmt.getString(11));
		this.medinm = Util.checkString(cstmt.getString(12));
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			PS_P_BO_SEND_LISTCURCOMMLISTRecord rec = new PS_P_BO_SEND_LISTCURCOMMLISTRecord();
			rec.hbisc = Util.checkString(rset0.getString("hbisc"));
			rec.hbiscnm = Util.checkString(rset0.getString("hbiscnm"));
			rec.bhnscd = Util.checkString(rset0.getString("bhnscd"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.termsubsno = Util.checkString(rset0.getString("termsubsno"));
			rec.rdr_no_all = Util.checkString(rset0.getString("rdr_no_all"));
			rec.rdr_nonm = Util.checkString(rset0.getString("rdr_nonm"));
			rec.acqnm = Util.checkString(rset0.getString("acqnm"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.telno = Util.checkString(rset0.getString("telno"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.offnm = Util.checkString(rset0.getString("offnm"));
			rec.offposi = Util.checkString(rset0.getString("offposi"));
			rec.sendseq = Util.checkString(rset0.getString("sendseq"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.acq_bonm = Util.checkString(rset0.getString("acq_bonm"));
			rec.senddt = Util.checkString(rset0.getString("senddt"));
			rec.sendtype = Util.checkString(rset0.getString("sendtype"));
			rec.sendtypenm = Util.checkString(rset0.getString("sendtypenm"));
			rec.mediser_no = Util.checkString(rset0.getString("mediser_no"));
			rec.sendmthdcd = Util.checkString(rset0.getString("sendmthdcd"));
			rec.sendkindcd = Util.checkString(rset0.getString("sendkindcd"));
			rec.acq_bocd = Util.checkString(rset0.getString("acq_bocd"));
			rec.dstccd = Util.checkString(rset0.getString("dstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			rec.subsno = Util.checkString(rset0.getString("subsno"));
			rec.memo = Util.checkString(rset0.getString("memo"));
			rec.rnum = rset0.getInt("rnum");
			this.curcommlist.add(rec);
		}
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			PS_P_BO_SEND_LISTCURCOMMLISTRecord rec = (PS_P_BO_SEND_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.hbisc;
			String name = rec.hbiscnm;
			
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
			PS_P_BO_SEND_LISTCURCOMMLISTRecord rec = (PS_P_BO_SEND_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.hbisc;
			String name = rec.hbiscnm;
			
			sb.append("<input name=\"");
			sb.append("hbisc");
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
			PS_P_BO_SEND_LISTCURCOMMLISTRecord rec = (PS_P_BO_SEND_LISTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.hbisc;
			String name = rec.hbiscnm;
			
			sb.append("<input name=\"");
			sb.append("hbisc");
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
	PS_P_BO_SEND_LISTDataSet ds = (PS_P_BO_SEND_LISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_P_BO_SEND_LISTCURCOMMLISTRecord curcommlistRec = (PS_P_BO_SEND_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBonm()%>
<%= ds.getMedinm()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.hbisc%>
<%= curcommlistRec.hbiscnm%>
<%= curcommlistRec.bhnscd%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.termsubsno%>
<%= curcommlistRec.rdr_no_all%>
<%= curcommlistRec.rdr_nonm%>
<%= curcommlistRec.acqnm%>
<%= curcommlistRec.medinm%>
<%= curcommlistRec.telno%>
<%= curcommlistRec.zip%>
<%= curcommlistRec.dlvaddr%>
<%= curcommlistRec.dlvdtlsaddr%>
<%= curcommlistRec.offnm%>
<%= curcommlistRec.offposi%>
<%= curcommlistRec.sendseq%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.acq_bonm%>
<%= curcommlistRec.senddt%>
<%= curcommlistRec.sendtype%>
<%= curcommlistRec.sendtypenm%>
<%= curcommlistRec.mediser_no%>
<%= curcommlistRec.sendmthdcd%>
<%= curcommlistRec.sendkindcd%>
<%= curcommlistRec.acq_bocd%>
<%= curcommlistRec.dstccd%>
<%= curcommlistRec.dlvno%>
<%= curcommlistRec.subsno%>
<%= curcommlistRec.memo%>
<%= curcommlistRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 21 20:46:29 KST 2007 */