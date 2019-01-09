/***************************************************************************************************
* 파일명 : SL_L_APLC_NEWDataSet.java
* 기능 : 독자정보관리(이체신청팝업-신규신청 초기화)
* 작성일자 : 2004-07-29
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
 * 독자정보관리(이체신청팝업-신규신청 초기화)
 *
 */

public class SL_L_APLC_NEWDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cardcur = new ArrayList();
	public ArrayList pymtcur = new ArrayList();
	public ArrayList bankcur = new ArrayList();
	public ArrayList rsltcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String migryn;

	public SL_L_APLC_NEWDataSet(){}
	public SL_L_APLC_NEWDataSet(String errcode, String errmsg, String migryn){
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
			SL_L_APLC_NEWRSLTCURRecord rec = new SL_L_APLC_NEWRSLTCURRecord();
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
			SL_L_APLC_NEWPYMTCURRecord rec = new SL_L_APLC_NEWPYMTCURRecord();
			rec.aplcdt = Util.checkString(rset1.getString("aplcdt"));
			rec.aplcno = Util.checkString(rset1.getString("aplcno"));
			rec.shftclsf = Util.checkString(rset1.getString("shftclsf"));
			rec.bankcd = Util.checkString(rset1.getString("bankcd"));
			rec.banknm = Util.checkString(rset1.getString("banknm"));
			rec.pymtnm = Util.checkString(rset1.getString("pymtnm"));
			rec.acctno = Util.checkString(rset1.getString("acctno"));
			rec.cardcmpycd = Util.checkString(rset1.getString("cardcmpycd"));
			rec.cardno = Util.checkString(rset1.getString("cardno"));
			rec.vdtyprd = Util.checkString(rset1.getString("vdtyprd"));
			rec.prn = Util.checkString(rset1.getString("prn"));
			rec.pymttel1 = Util.checkString(rset1.getString("pymttel1"));
			rec.pymttel2 = Util.checkString(rset1.getString("pymttel2"));
			rec.pymttel3 = Util.checkString(rset1.getString("pymttel3"));
			rec.aplyyymm = Util.checkString(rset1.getString("aplyyymm"));
			rec.email = Util.checkString(rset1.getString("email"));
			this.pymtcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			SL_L_APLC_NEWBANKCURRecord rec = new SL_L_APLC_NEWBANKCURRecord();
			rec.cicodeval = Util.checkString(rset2.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset2.getString("cicdnm"));
			this.bankcur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			SL_L_APLC_NEWCARDCURRecord rec = new SL_L_APLC_NEWCARDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			this.cardcur.add(rec);
		}
	}

	public String rsltcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rsltcur.size();
		for(int i=0; i<size; i++){
			SL_L_APLC_NEWRSLTCURRecord rec = (SL_L_APLC_NEWRSLTCURRecord)rsltcur.get(i);
			
			
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
			SL_L_APLC_NEWPYMTCURRecord rec = (SL_L_APLC_NEWPYMTCURRecord)pymtcur.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.aplcno;
			
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
			SL_L_APLC_NEWBANKCURRecord rec = (SL_L_APLC_NEWBANKCURRecord)bankcur.get(i);
			
			
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
			SL_L_APLC_NEWCARDCURRecord rec = (SL_L_APLC_NEWCARDCURRecord)cardcur.get(i);
			
			
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
			SL_L_APLC_NEWRSLTCURRecord rec = (SL_L_APLC_NEWRSLTCURRecord)rsltcur.get(i);
			
			
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
			SL_L_APLC_NEWPYMTCURRecord rec = (SL_L_APLC_NEWPYMTCURRecord)pymtcur.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.aplcno;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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
			SL_L_APLC_NEWBANKCURRecord rec = (SL_L_APLC_NEWBANKCURRecord)bankcur.get(i);
			
			
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
			SL_L_APLC_NEWCARDCURRecord rec = (SL_L_APLC_NEWCARDCURRecord)cardcur.get(i);
			
			
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
			SL_L_APLC_NEWRSLTCURRecord rec = (SL_L_APLC_NEWRSLTCURRecord)rsltcur.get(i);
			
			
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
			SL_L_APLC_NEWPYMTCURRecord rec = (SL_L_APLC_NEWPYMTCURRecord)pymtcur.get(i);
			
			
			String code = rec.aplcdt;
			String name = rec.aplcno;
			
			sb.append("<input name=\"");
			sb.append("aplcdt");
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
			SL_L_APLC_NEWBANKCURRecord rec = (SL_L_APLC_NEWBANKCURRecord)bankcur.get(i);
			
			
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
			SL_L_APLC_NEWCARDCURRecord rec = (SL_L_APLC_NEWCARDCURRecord)cardcur.get(i);
			
			
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
	SL_L_APLC_NEWDataSet ds = (SL_L_APLC_NEWDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SL_L_APLC_NEWRSLTCURRecord rsltcurRec = (SL_L_APLC_NEWRSLTCURRecord)ds.rsltcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.pymtcur.size(); i++){
		SL_L_APLC_NEWPYMTCURRecord pymtcurRec = (SL_L_APLC_NEWPYMTCURRecord)ds.pymtcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.bankcur.size(); i++){
		SL_L_APLC_NEWBANKCURRecord bankcurRec = (SL_L_APLC_NEWBANKCURRecord)ds.bankcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.cardcur.size(); i++){
		SL_L_APLC_NEWCARDCURRecord cardcurRec = (SL_L_APLC_NEWCARDCURRecord)ds.cardcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMigryn()%>
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
<%= pymtcurRec.aplcdt%>
<%= pymtcurRec.aplcno%>
<%= pymtcurRec.shftclsf%>
<%= pymtcurRec.bankcd%>
<%= pymtcurRec.banknm%>
<%= pymtcurRec.pymtnm%>
<%= pymtcurRec.acctno%>
<%= pymtcurRec.cardcmpycd%>
<%= pymtcurRec.cardno%>
<%= pymtcurRec.vdtyprd%>
<%= pymtcurRec.prn%>
<%= pymtcurRec.pymttel1%>
<%= pymtcurRec.pymttel2%>
<%= pymtcurRec.pymttel3%>
<%= pymtcurRec.aplyyymm%>
<%= pymtcurRec.email%>
<%= bankcurRec.cicodeval%>
<%= bankcurRec.cicdnm%>
<%= cardcurRec.cicodeval%>
<%= cardcurRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 06 20:41:47 KST 2004 */