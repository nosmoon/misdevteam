/***************************************************************************************************
* 파일명 : PS_S_SEND_BNSBK.java
* 기능 :   발송-보너스북발송 초기
* 작성일자 : 2004-02-26
* 작성자 : 장수환
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
 * 발송-보너스북발송 초기
 *
 */

public class PS_S_SEND_BNSBKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asinbocdcur = new ArrayList();
	public ArrayList sendmthdcur = new ArrayList();
	public ArrayList bnsbksenddtcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String sysdate;

	public PS_S_SEND_BNSBKDataSet(){}
	public PS_S_SEND_BNSBKDataSet(String errcode, String errmsg, String sysdate){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sysdate = sysdate;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSysdate(String sysdate){
		this.sysdate = sysdate;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSysdate(){
		return this.sysdate;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.sysdate = Util.checkString(cstmt.getString(6));
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			PS_S_SEND_BNSBKSENDMTHDCURRecord rec = new PS_S_SEND_BNSBKSENDMTHDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.sendmthdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			PS_S_SEND_BNSBKASINBOCDCURRecord rec = new PS_S_SEND_BNSBKASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset1.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			PS_S_SEND_BNSBKBNSBKSENDDTCURRecord rec = new PS_S_SEND_BNSBKBNSBKSENDDTCURRecord();
			rec.brch_offisend_dt = Util.checkString(rset2.getString("brch_offisend_dt"));
			rec.brch_offisend_dt_view = Util.checkString(rset2.getString("brch_offisend_dt_view"));
			this.bnsbksenddtcur.add(rec);
		}
	}

	public String sendmthdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendmthdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_BNSBKSENDMTHDCURRecord rec = (PS_S_SEND_BNSBKSENDMTHDCURRecord)sendmthdcur.get(i);
			
			
			String code = rec.cicodeval;
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

	public String asinbocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_BNSBKASINBOCDCURRecord rec = (PS_S_SEND_BNSBKASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String bnsbksenddtcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsbksenddtcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_BNSBKBNSBKSENDDTCURRecord rec = (PS_S_SEND_BNSBKBNSBKSENDDTCURRecord)bnsbksenddtcur.get(i);
			
			
			String code = rec.brch_offisend_dt;
			String name = rec.brch_offisend_dt_view;
			
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

	public String sendmthdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendmthdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_BNSBKSENDMTHDCURRecord rec = (PS_S_SEND_BNSBKSENDMTHDCURRecord)sendmthdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String asinbocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_BNSBKASINBOCDCURRecord rec = (PS_S_SEND_BNSBKASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String bnsbksenddtcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsbksenddtcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_BNSBKBNSBKSENDDTCURRecord rec = (PS_S_SEND_BNSBKBNSBKSENDDTCURRecord)bnsbksenddtcur.get(i);
			
			
			String code = rec.brch_offisend_dt;
			String name = rec.brch_offisend_dt_view;
			
			sb.append("<input name=\"");
			sb.append("brch_offisend_dt");
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

	public String sendmthdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = sendmthdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_BNSBKSENDMTHDCURRecord rec = (PS_S_SEND_BNSBKSENDMTHDCURRecord)sendmthdcur.get(i);
			
			
			String code = rec.cicodeval;
			String name = rec.cicdnm;
			
			sb.append("<input name=\"");
			sb.append("cicodeval");
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

	public String asinbocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = asinbocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_BNSBKASINBOCDCURRecord rec = (PS_S_SEND_BNSBKASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String bnsbksenddtcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bnsbksenddtcur.size();
		for(int i=0; i<size; i++){
			PS_S_SEND_BNSBKBNSBKSENDDTCURRecord rec = (PS_S_SEND_BNSBKBNSBKSENDDTCURRecord)bnsbksenddtcur.get(i);
			
			
			String code = rec.brch_offisend_dt;
			String name = rec.brch_offisend_dt_view;
			
			sb.append("<input name=\"");
			sb.append("brch_offisend_dt");
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
	PS_S_SEND_BNSBKDataSet ds = (PS_S_SEND_BNSBKDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.sendmthdcur.size(); i++){
		PS_S_SEND_BNSBKSENDMTHDCURRecord sendmthdcurRec = (PS_S_SEND_BNSBKSENDMTHDCURRecord)ds.sendmthdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		PS_S_SEND_BNSBKASINBOCDCURRecord asinbocdcurRec = (PS_S_SEND_BNSBKASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bnsbksenddtcur.size(); i++){
		PS_S_SEND_BNSBKBNSBKSENDDTCURRecord bnsbksenddtcurRec = (PS_S_SEND_BNSBKBNSBKSENDDTCURRecord)ds.bnsbksenddtcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSysdate()%>
<%= ds.getSendmthdcur()%>
<%= ds.getAsinbocdcur()%>
<%= ds.getBnsbksenddtcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= sendmthdcurRec.cicodeval%>
<%= sendmthdcurRec.cicdnm%>
<%= sendmthdcurRec.cicdynm%>
<%= sendmthdcurRec.ciymgbcd%>
<%= sendmthdcurRec.cicdgb%>
<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
<%= bnsbksenddtcurRec.brch_offisend_dt%>
<%= bnsbksenddtcurRec.brch_offisend_dt_view%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 29 20:12:17 KST 2005 */