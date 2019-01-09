/***************************************************************************************************
* 파일명 : SS_L_APLC_NEWDataSet.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-신규신청초기화면 초기화
* 작성일자 : 2004-06-07
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-신청관리-신규신청초기화면 초기화
 *
 */


public class SS_L_APLC_NEWDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cardcur = new ArrayList();
	public ArrayList pymtcur = new ArrayList();
	public ArrayList bankcur = new ArrayList();
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String migryn;

	public SS_L_APLC_NEWDataSet(){}
	public SS_L_APLC_NEWDataSet(String errcode, String errmsg, String migryn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.migryn = migryn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMigryn(String migryn){
		this.migryn = migryn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMigryn(){
		return this.migryn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.migryn = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_L_APLC_NEWRSLTCURRecord rec = new SS_L_APLC_NEWRSLTCURRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.valqty = rset0.getInt("valqty");
			rec.no_valqty = rset0.getInt("no_valqty");
			rec.pre_valqty = rset0.getInt("pre_valqty");
			rec.realsubsamt = rset0.getInt("realsubsamt");
			rec.clamtmthdcd = Util.checkString(rset0.getString("clamtmthdcd"));
			rec.clamtmthdnm = Util.checkString(rset0.getString("clamtmthdnm"));
			this.rsltcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SS_L_APLC_NEWPYMTCURRecord rec = new SS_L_APLC_NEWPYMTCURRecord();
			rec.bankcd = Util.checkString(rset1.getString("bankcd"));
			rec.banknm = Util.checkString(rset1.getString("banknm"));
			rec.acctno = Util.checkString(rset1.getString("acctno"));
			this.pymtcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			SS_L_APLC_NEWBANKCURRecord rec = new SS_L_APLC_NEWBANKCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			this.bankcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			SS_L_APLC_NEWCARDCURRecord rec = new SS_L_APLC_NEWCARDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			this.cardcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWRSLTCURRecord rec = (SS_L_APLC_NEWRSLTCURRecord)rsltcur.get(i);


			String code = rec.medicd;
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

	public String pymtcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = pymtcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWPYMTCURRecord rec = (SS_L_APLC_NEWPYMTCURRecord)pymtcur.get(i);


			String code = rec.bankcd;
			String name = rec.banknm;

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

	public String bankcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWBANKCURRecord rec = (SS_L_APLC_NEWBANKCURRecord)bankcur.get(i);


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

	public String cardcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cardcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWCARDCURRecord rec = (SS_L_APLC_NEWCARDCURRecord)cardcur.get(i);


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

	public String rsltcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWRSLTCURRecord rec = (SS_L_APLC_NEWRSLTCURRecord)rsltcur.get(i);


			String code = rec.medicd;
			String name = rec.medinm;

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

	public String pymtcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = pymtcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWPYMTCURRecord rec = (SS_L_APLC_NEWPYMTCURRecord)pymtcur.get(i);


			String code = rec.bankcd;
			String name = rec.banknm;

			sb.append("<input name=\"");
			sb.append("bankcd");
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

	public String bankcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWBANKCURRecord rec = (SS_L_APLC_NEWBANKCURRecord)bankcur.get(i);


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

	public String cardcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cardcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWCARDCURRecord rec = (SS_L_APLC_NEWCARDCURRecord)cardcur.get(i);


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

	public String rsltcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWRSLTCURRecord rec = (SS_L_APLC_NEWRSLTCURRecord)rsltcur.get(i);


			String code = rec.medicd;
			String name = rec.medinm;

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

	public String pymtcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = pymtcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWPYMTCURRecord rec = (SS_L_APLC_NEWPYMTCURRecord)pymtcur.get(i);


			String code = rec.bankcd;
			String name = rec.banknm;

			sb.append("<input name=\"");
			sb.append("bankcd");
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

	public String bankcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bankcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWBANKCURRecord rec = (SS_L_APLC_NEWBANKCURRecord)bankcur.get(i);


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

	public String cardcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = cardcur.size();
		for(int i=0; i<size; i++){
			SS_L_APLC_NEWCARDCURRecord rec = (SS_L_APLC_NEWCARDCURRecord)cardcur.get(i);


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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_APLC_NEWDataSet ds = (SS_L_APLC_NEWDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_APLC_NEWRSLTCURRecord rsltcurRec = (SS_L_APLC_NEWRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.pymtcur.size(); i++){
		SS_L_APLC_NEWPYMTCURRecord pymtcurRec = (SS_L_APLC_NEWPYMTCURRecord)ds.pymtcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bankcur.size(); i++){
		SS_L_APLC_NEWBANKCURRecord bankcurRec = (SS_L_APLC_NEWBANKCURRecord)ds.bankcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cardcur.size(); i++){
		SS_L_APLC_NEWCARDCURRecord cardcurRec = (SS_L_APLC_NEWCARDCURRecord)ds.cardcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRsltcur()%>
<%= ds.getPymtcur()%>
<%= ds.getBankcur()%>
<%= ds.getCardcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rsltcurRec.medicd%>
<%= rsltcurRec.medinm%>
<%= rsltcurRec.valqty%>
<%= rsltcurRec.no_valqty%>
<%= rsltcurRec.pre_valqty%>
<%= rsltcurRec.realsubsamt%>
<%= rsltcurRec.clamtmthdcd%>
<%= rsltcurRec.clamtmthdnm%>
<%= pymtcurRec.bankcd%>
<%= pymtcurRec.banknm%>
<%= pymtcurRec.acctno%>
<%= bankcurRec.cicodeval%>
<%= bankcurRec.cicdnm%>
<%= cardcurRec.cicodeval%>
<%= cardcurRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 07 21:27:19 KST 2004 */