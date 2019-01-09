/***************************************************************************************************
* 파일명 : SL_L_SUBS_CNTR_STOP_HISTDataSet.java
* 기능 : 독자정보관리(중지내역팝업)(목록조회)
* 작성일자 : 2004-04-01
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
 * 독자정보관리(중지내역팝업)(목록조회)
 *
 */

public class SL_L_SUBS_CNTR_STOP_HISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList stopcntrcur = new ArrayList();
	public ArrayList medicur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SL_L_SUBS_CNTR_STOP_HISTDataSet(){}
	public SL_L_SUBS_CNTR_STOP_HISTDataSet(String errcode, String errmsg){
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
			SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord rec = new SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.abrv = Util.checkString(rset0.getString("abrv"));
			rec.dlvqty = rset0.getInt("dlvqty");
			this.medicur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord rec = new SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord();
			rec.rdr_no = Util.checkString(rset1.getString("rdr_no"));
			rec.medicd = Util.checkString(rset1.getString("medicd"));
			rec.cntrno = Util.checkString(rset1.getString("cntrno"));
			rec.mangno = Util.checkString(rset1.getString("mangno"));
			rec.medinm = Util.checkString(rset1.getString("medinm"));
			rec.suspdt = Util.checkString(rset1.getString("suspdt"));
			rec.suspresncd = Util.checkString(rset1.getString("suspresncd"));
			rec.suspresn = Util.checkString(rset1.getString("suspresn"));
			rec.rdr_extndt = Util.checkString(rset1.getString("rdr_extndt"));
			rec.valmm = Util.checkString(rset1.getString("valmm"));
			rec.rdr_extnno = Util.checkString(rset1.getString("rdr_extnno"));
			rec.rdr_extntypecd = Util.checkString(rset1.getString("rdr_extntypecd"));
			rec.rdr_extntype = Util.checkString(rset1.getString("rdr_extntype"));
			rec.extnnm = Util.checkString(rset1.getString("extnnm"));
			rec.subsuprc = rset1.getInt("subsuprc");
			rec.subsqty = rset1.getInt("subsqty");
			rec.dscnamt = rset1.getInt("dscnamt");
			rec.rdr_extncost = rset1.getInt("rdr_extncost");
			rec.freeyn = Util.checkString(rset1.getString("freeyn"));
			rec.freeclsf = Util.checkString(rset1.getString("freeclsf"));
			rec.bns_itemnm = Util.checkString(rset1.getString("bns_itemnm"));
			rec.cancposbyn = Util.checkString(rset1.getString("cancposbyn"));
			this.stopcntrcur.add(rec);
		}
	}

	public String medicurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord rec = (SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.abrv;
			
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

	public String stopcntrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = stopcntrcur.size();
		for(int i=0; i<size; i++){
			SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord rec = (SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord)stopcntrcur.get(i);
			
			
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

	public String medicurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord rec = (SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.abrv;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String stopcntrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = stopcntrcur.size();
		for(int i=0; i<size; i++){
			SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord rec = (SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord)stopcntrcur.get(i);
			
			
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

	public String medicurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicur.size();
		for(int i=0; i<size; i++){
			SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord rec = (SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord)medicur.get(i);
			
			
			String code = rec.medicd;
			String name = rec.abrv;
			
			sb.append("<input name=\"");
			sb.append("medicd");
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

	public String stopcntrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = stopcntrcur.size();
		for(int i=0; i<size; i++){
			SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord rec = (SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord)stopcntrcur.get(i);
			
			
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
	SL_L_SUBS_CNTR_STOP_HISTDataSet ds = (SL_L_SUBS_CNTR_STOP_HISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicur.size(); i++){
		SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord medicurRec = (SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord)ds.medicur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.stopcntrcur.size(); i++){
		SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord stopcntrcurRec = (SL_L_SUBS_CNTR_STOP_HISTSTOPCNTRCURRecord)ds.stopcntrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedicur()%>
<%= ds.getStopcntrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicurRec.medicd%>
<%= medicurRec.abrv%>
<%= medicurRec.dlvqty%>
<%= stopcntrcurRec.rdr_no%>
<%= stopcntrcurRec.medicd%>
<%= stopcntrcurRec.cntrno%>
<%= stopcntrcurRec.mangno%>
<%= stopcntrcurRec.medinm%>
<%= stopcntrcurRec.suspdt%>
<%= stopcntrcurRec.suspresncd%>
<%= stopcntrcurRec.suspresn%>
<%= stopcntrcurRec.rdr_extndt%>
<%= stopcntrcurRec.valmm%>
<%= stopcntrcurRec.rdr_extnno%>
<%= stopcntrcurRec.rdr_extntypecd%>
<%= stopcntrcurRec.rdr_extntype%>
<%= stopcntrcurRec.extnnm%>
<%= stopcntrcurRec.subsuprc%>
<%= stopcntrcurRec.subsqty%>
<%= stopcntrcurRec.dscnamt%>
<%= stopcntrcurRec.rdr_extncost%>
<%= stopcntrcurRec.freeyn%>
<%= stopcntrcurRec.freeclsf%>
<%= stopcntrcurRec.bns_itemnm%>
<%= stopcntrcurRec.cancposbyn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 03 21:58:52 KST 2004 */