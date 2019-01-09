/***************************************************************************************************
* 파일명 :SL_MO_L_NWSPSUBSCNTRPTCRDataSet.java_모바일용
* 기능 : 판매-독자관리-독자정보검색-독자정보조회-구독내역팝업-구독리스트
* 작성일자 : 2017-02-06
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ss.sal.rdr.rec.SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord;

/**
 *
 */


public class SL_MO_L_NWSPSUBSCNTRPTCRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList nwspsubscntrcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public SL_MO_L_NWSPSUBSCNTRPTCRDataSet(){}
	public SL_MO_L_NWSPSUBSCNTRPTCRDataSet(String errcode, String errmsg, long totalcnt){
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
			SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = new SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord();
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.rdr_extntypenm = Util.checkString(rset0.getString("rdr_extntypenm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.subsuprc = rset0.getInt("subsuprc");
			rec.subsqty = rset0.getInt("subsqty");
			rec.dscnamt = rset0.getInt("dscnamt");
			rec.post_dlvfee = rset0.getInt("post_dlvfee");
			rec.rdr_extncost = rset0.getInt("rdr_extncost");
			rec.freeyn = Util.checkString(rset0.getString("freeyn"));
			rec.freeclsf = Util.checkString(rset0.getString("freeclsf"));
			rec.suspresncd = Util.checkString(rset0.getString("suspresncd"));
			this.nwspsubscntrcur.add(rec);
		}
	}

	public String nwspsubscntrcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);


			String code = rec.rdr_extndt;
			String name = rec.medinm;

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

	public String nwspsubscntrcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);


			String code = rec.rdr_extndt;
			String name = rec.medinm;

			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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

	public String nwspsubscntrcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscntrcur.size();
		for(int i=0; i<size; i++){
			SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord rec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)nwspsubscntrcur.get(i);


			String code = rec.rdr_extndt;
			String name = rec.medinm;

			sb.append("<input name=\"");
			sb.append("rdr_extndt");
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
	SL_MO_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_MO_L_NWSPSUBSCNTRPTCRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++){
		SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = (SL_MO_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getNwspsubscntrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= nwspsubscntrcurRec.rdr_extndt%>
<%= nwspsubscntrcurRec.medinm%>
<%= nwspsubscntrcurRec.suspdt%>
<%= nwspsubscntrcurRec.bonm%>
<%= nwspsubscntrcurRec.rdr_extntypenm%>
<%= nwspsubscntrcurRec.remk%>
<%= nwspsubscntrcurRec.extnnm%>
<%= nwspsubscntrcurRec.subsuprc%>
<%= nwspsubscntrcurRec.subsqty%>
<%= nwspsubscntrcurRec.dscnamt%>
<%= nwspsubscntrcurRec.post_dlvfee%>
<%= nwspsubscntrcurRec.rdr_extncost%>
<%= nwspsubscntrcurRec.freeyn%>
<%= nwspsubscntrcurRec.freeclsf%>
<%= nwspsubscntrcurRec.suspresncd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 06 10:54:22 KST 2017 */