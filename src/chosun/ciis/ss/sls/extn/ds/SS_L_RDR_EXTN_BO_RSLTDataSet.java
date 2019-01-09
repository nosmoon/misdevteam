/***************************************************************************************************
* 파일명 : .java
* 기능 : *확장현황-확장용역비용-지국별-목록
* 작성일자 : 2009-06-18
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-확장용역비용-지국별-목록
 */

public class SS_L_RDR_EXTN_BO_RSLTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String frdt;
	public String todt;
	public long totalcnt;
	public long tot_h_qty;
	public long tot_a_qty;
	public long tot_s_qyt;
	public long tot_t_qty;
	public long tot_amt;

	public SS_L_RDR_EXTN_BO_RSLTDataSet(){}
	public SS_L_RDR_EXTN_BO_RSLTDataSet(String errcode, String errmsg, String frdt, String todt, long totalcnt, long tot_h_qty, long tot_a_qty, long tot_s_qyt, long tot_t_qty, long tot_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.frdt = frdt;
		this.todt = todt;
		this.totalcnt = totalcnt;
		this.tot_h_qty = tot_h_qty;
		this.tot_a_qty = tot_a_qty;
		this.tot_s_qyt = tot_s_qyt;
		this.tot_t_qty = tot_t_qty;
		this.tot_amt = tot_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setTot_h_qty(long tot_h_qty){
		this.tot_h_qty = tot_h_qty;
	}

	public void setTot_a_qty(long tot_a_qty){
		this.tot_a_qty = tot_a_qty;
	}

	public void setTot_s_qyt(long tot_s_qyt){
		this.tot_s_qyt = tot_s_qyt;
	}

	public void setTot_t_qty(long tot_t_qty){
		this.tot_t_qty = tot_t_qty;
	}

	public void setTot_amt(long tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getTot_h_qty(){
		return this.tot_h_qty;
	}

	public long getTot_a_qty(){
		return this.tot_a_qty;
	}

	public long getTot_s_qyt(){
		return this.tot_s_qyt;
	}

	public long getTot_t_qty(){
		return this.tot_t_qty;
	}

	public long getTot_amt(){
		return this.tot_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.frdt = Util.checkString(cstmt.getString(12));
		this.todt = Util.checkString(cstmt.getString(13));
		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord();
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.partcd = Util.checkString(rset0.getString("partcd"));
			rec.areacd = Util.checkString(rset0.getString("areacd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.h_qty = rset0.getInt("h_qty");
			rec.a_qty = rset0.getInt("a_qty");
			rec.s_qyt = rset0.getInt("s_qyt");
			rec.t_qty = rset0.getInt("t_qty");
			rec.amt = rset0.getInt("amt");
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(15);
		this.tot_h_qty = cstmt.getLong(16);
		this.tot_a_qty = cstmt.getLong(17);
		this.tot_s_qyt = cstmt.getLong(18);
		this.tot_t_qty = cstmt.getLong(19);
		this.tot_amt = cstmt.getLong(20);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.partcd;
			
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
			SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.partcd;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
			SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord rec = (SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.deptcd;
			String name = rec.partcd;
			
			sb.append("<input name=\"");
			sb.append("deptcd");
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
	SS_L_RDR_EXTN_BO_RSLTDataSet ds = (SS_L_RDR_EXTN_BO_RSLTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFrdt()%>
<%= ds.getTodt()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getTot_h_qty()%>
<%= ds.getTot_a_qty()%>
<%= ds.getTot_s_qyt()%>
<%= ds.getTot_t_qty()%>
<%= ds.getTot_amt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.deptcd%>
<%= curcommlistRec.partcd%>
<%= curcommlistRec.areacd%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.h_qty%>
<%= curcommlistRec.a_qty%>
<%= curcommlistRec.s_qyt%>
<%= curcommlistRec.t_qty%>
<%= curcommlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 19 15:13:37 KST 2009 */