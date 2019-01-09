/***************************************************************************************************
* 파일명 : .java
* 기능 : *확장현황-확장제한-목록
* 작성일자 : 2009-04-06
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
 * 확장현황-확장제한-목록
 */

public class CO_L_EXTN_RESDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long chrg_cnfm_cnt;
	public long cns_empcnfm;
	public long totalcnt;

	public CO_L_EXTN_RESDataSet(){}
	public CO_L_EXTN_RESDataSet(String errcode, String errmsg, long chrg_cnfm_cnt, long cns_empcnfm, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.chrg_cnfm_cnt = chrg_cnfm_cnt;
		this.cns_empcnfm = cns_empcnfm;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setChrg_cnfm_cnt(long chrg_cnfm_cnt){
		this.chrg_cnfm_cnt = chrg_cnfm_cnt;
	}

	public void setCns_empcnfm(long cns_empcnfm){
		this.cns_empcnfm = cns_empcnfm;
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

	public long getChrg_cnfm_cnt(){
		return this.chrg_cnfm_cnt;
	}

	public long getCns_empcnfm(){
		return this.cns_empcnfm;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			CO_L_EXTN_RESCURCOMMLISTRecord rec = new CO_L_EXTN_RESCURCOMMLISTRecord();
			rec.regdt = Util.checkString(rset0.getString("regdt"));
			rec.regno = Util.checkString(rset0.getString("regno"));
			rec.rdr_no = Util.checkString(rset0.getString("rdr_no"));
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.cntrno_susp = Util.checkString(rset0.getString("cntrno_susp"));
			rec.mangno_susp = Util.checkString(rset0.getString("mangno_susp"));
			rec.cntrno_acpt = Util.checkString(rset0.getString("cntrno_acpt"));
			rec.rdr_extndt = Util.checkString(rset0.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset0.getString("rdr_extnno"));
			rec.aplcpathcd = Util.checkString(rset0.getString("aplcpathcd"));
			rec.rdr_extntypecd = Util.checkString(rset0.getString("rdr_extntypecd"));
			rec.extnblngcd = Util.checkString(rset0.getString("extnblngcd"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			rec.boemp_no = Util.checkString(rset0.getString("boemp_no"));
			rec.rdr_extnbocd = Util.checkString(rset0.getString("rdr_extnbocd"));
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.rdr_extncost = rset0.getInt("rdr_extncost");
			rec.subsfr_dt = Util.checkString(rset0.getString("subsfr_dt"));
			rec.freeyn = Util.checkString(rset0.getString("freeyn"));
			rec.freeclsf = Util.checkString(rset0.getString("freeclsf"));
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			rec.subsuprc = rset0.getInt("subsuprc");
			rec.subsqty = rset0.getInt("subsqty");
			rec.dscnamt = rset0.getInt("dscnamt");
			rec.post_dlvfee = rset0.getInt("post_dlvfee");
			rec.suspdt = Util.checkString(rset0.getString("suspdt"));
			rec.suspresncd = Util.checkString(rset0.getString("suspresncd"));
			rec.bns_itemcd = Util.checkString(rset0.getString("bns_itemcd"));
			rec.resitypecd = Util.checkString(rset0.getString("resitypecd"));
			rec.resiclsfcd = Util.checkString(rset0.getString("resiclsfcd"));
			rec.rdrnm = Util.checkString(rset0.getString("rdrnm"));
			rec.rdrtel_no1 = Util.checkString(rset0.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset0.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset0.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset0.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset0.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset0.getString("rdrptph_no3"));
			rec.dlvzip = Util.checkString(rset0.getString("dlvzip"));
			rec.dlvcd = Util.checkString(rset0.getString("dlvcd"));
			rec.dlvpyong = rset0.getInt("dlvpyong");
			rec.dlvaddr = Util.checkString(rset0.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset0.getString("dlvdtlsaddr"));
			rec.dlvdong = Util.checkString(rset0.getString("dlvdong"));
			rec.dlvser_no = Util.checkString(rset0.getString("dlvser_no"));
			rec.dlvbnji = Util.checkString(rset0.getString("dlvbnji"));
			rec.dlvteamcd = Util.checkString(rset0.getString("dlvteamcd"));
			rec.dlvdstccd = Util.checkString(rset0.getString("dlvdstccd"));
			rec.dlvno = Util.checkString(rset0.getString("dlvno"));
			rec.dlvintvno = Util.checkString(rset0.getString("dlvintvno"));
			rec.dlvmthdcd = Util.checkString(rset0.getString("dlvmthdcd"));
			rec.thrw_plac = Util.checkString(rset0.getString("thrw_plac"));
			rec.clamtmthdcd = Util.checkString(rset0.getString("clamtmthdcd"));
			rec.clamtcyclcd = Util.checkString(rset0.getString("clamtcyclcd"));
			rec.bocd = Util.checkString(rset0.getString("bocd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.cns_empcnfmstatcd = Util.checkString(rset0.getString("cns_empcnfmstatcd"));
			rec.cns_empcnfmocomcd = Util.checkString(rset0.getString("cns_empcnfmocomcd"));
			rec.cns_empid = Util.checkString(rset0.getString("cns_empid"));
			rec.cns_remk = Util.checkString(rset0.getString("cns_remk"));
			rec.cns_cnfmdt = Util.checkString(rset0.getString("cns_cnfmdt"));
			rec.chrg_cnfmstatcd = Util.checkString(rset0.getString("chrg_cnfmstatcd"));
			rec.chrg_cnfmocomcd = Util.checkString(rset0.getString("chrg_cnfmocomcd"));
			rec.chrg_id = Util.checkString(rset0.getString("chrg_id"));
			rec.chrg_cnfmdt = Util.checkString(rset0.getString("chrg_cnfmdt"));
			rec.chrg_remk = Util.checkString(rset0.getString("chrg_remk"));
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.extnbonm = Util.checkString(rset0.getString("extnbonm"));
			rec.extnareanm = Util.checkString(rset0.getString("extnareanm"));
			rec.cns_empcnfmstatnm = Util.checkString(rset0.getString("cns_empcnfmstatnm"));
			rec.cns_empcnfmocomnm = Util.checkString(rset0.getString("cns_empcnfmocomnm"));
			rec.chrg_cnfmstatnm = Util.checkString(rset0.getString("chrg_cnfmstatnm"));
			rec.chrg_cnfmocomnm = Util.checkString(rset0.getString("chrg_cnfmocomnm"));
			this.curcommlist.add(rec);
		}
		this.chrg_cnfm_cnt = cstmt.getLong(17);
		this.cns_empcnfm = cstmt.getLong(18);
		this.totalcnt = cstmt.getLong(19);
	}

	public String curcommlistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = curcommlist.size();
		for(int i=0; i<size; i++){
			CO_L_EXTN_RESCURCOMMLISTRecord rec = (CO_L_EXTN_RESCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
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
			CO_L_EXTN_RESCURCOMMLISTRecord rec = (CO_L_EXTN_RESCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
			CO_L_EXTN_RESCURCOMMLISTRecord rec = (CO_L_EXTN_RESCURCOMMLISTRecord)curcommlist.get(i);
			
			
			String code = rec.regdt;
			String name = rec.regno;
			
			sb.append("<input name=\"");
			sb.append("regdt");
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
	CO_L_EXTN_RESDataSet ds = (CO_L_EXTN_RESDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		CO_L_EXTN_RESCURCOMMLISTRecord curcommlistRec = (CO_L_EXTN_RESCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getChrg_cnfm_cnt()%>
<%= ds.getCns_empcnfm()%>
<%= ds.getTotalcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.regdt%>
<%= curcommlistRec.regno%>
<%= curcommlistRec.rdr_no%>
<%= curcommlistRec.medicd%>
<%= curcommlistRec.cntrno_susp%>
<%= curcommlistRec.mangno_susp%>
<%= curcommlistRec.cntrno_acpt%>
<%= curcommlistRec.rdr_extndt%>
<%= curcommlistRec.rdr_extnno%>
<%= curcommlistRec.aplcpathcd%>
<%= curcommlistRec.rdr_extntypecd%>
<%= curcommlistRec.extnblngcd%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.empseq%>
<%= curcommlistRec.boemp_no%>
<%= curcommlistRec.rdr_extnbocd%>
<%= curcommlistRec.extnnm%>
<%= curcommlistRec.rdr_extncost%>
<%= curcommlistRec.subsfr_dt%>
<%= curcommlistRec.freeyn%>
<%= curcommlistRec.freeclsf%>
<%= curcommlistRec.valmm%>
<%= curcommlistRec.subsuprc%>
<%= curcommlistRec.subsqty%>
<%= curcommlistRec.dscnamt%>
<%= curcommlistRec.post_dlvfee%>
<%= curcommlistRec.suspdt%>
<%= curcommlistRec.suspresncd%>
<%= curcommlistRec.bns_itemcd%>
<%= curcommlistRec.resitypecd%>
<%= curcommlistRec.resiclsfcd%>
<%= curcommlistRec.rdrnm%>
<%= curcommlistRec.rdrtel_no1%>
<%= curcommlistRec.rdrtel_no2%>
<%= curcommlistRec.rdrtel_no3%>
<%= curcommlistRec.rdrptph_no1%>
<%= curcommlistRec.rdrptph_no2%>
<%= curcommlistRec.rdrptph_no3%>
<%= curcommlistRec.dlvzip%>
<%= curcommlistRec.dlvcd%>
<%= curcommlistRec.dlvpyong%>
<%= curcommlistRec.dlvaddr%>
<%= curcommlistRec.dlvdtlsaddr%>
<%= curcommlistRec.dlvdong%>
<%= curcommlistRec.dlvser_no%>
<%= curcommlistRec.dlvbnji%>
<%= curcommlistRec.dlvteamcd%>
<%= curcommlistRec.dlvdstccd%>
<%= curcommlistRec.dlvno%>
<%= curcommlistRec.dlvintvno%>
<%= curcommlistRec.dlvmthdcd%>
<%= curcommlistRec.thrw_plac%>
<%= curcommlistRec.clamtmthdcd%>
<%= curcommlistRec.clamtcyclcd%>
<%= curcommlistRec.bocd%>
<%= curcommlistRec.remk%>
<%= curcommlistRec.cns_empcnfmstatcd%>
<%= curcommlistRec.cns_empcnfmocomcd%>
<%= curcommlistRec.cns_empid%>
<%= curcommlistRec.cns_remk%>
<%= curcommlistRec.cns_cnfmdt%>
<%= curcommlistRec.chrg_cnfmstatcd%>
<%= curcommlistRec.chrg_cnfmocomcd%>
<%= curcommlistRec.chrg_id%>
<%= curcommlistRec.chrg_cnfmdt%>
<%= curcommlistRec.chrg_remk%>
<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.extnbonm%>
<%= curcommlistRec.extnareanm%>
<%= curcommlistRec.cns_empcnfmstatnm%>
<%= curcommlistRec.cns_empcnfmocomnm%>
<%= curcommlistRec.chrg_cnfmstatnm%>
<%= curcommlistRec.chrg_cnfmocomnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 06 21:27:51 KST 2009 */