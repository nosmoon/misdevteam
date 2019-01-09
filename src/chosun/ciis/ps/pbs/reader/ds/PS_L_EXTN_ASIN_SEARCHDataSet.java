/***************************************************************************************************
 * 파일명   : PS_L_EXTN_ASIN_SEARCHDataSet.java
 * 기능     : 독자-확장독자 지사배정처리 검색
 * 작성일자 : 2004-08-17
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.reader.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-확장독자 지사배정처리 검색
 */

public class PS_L_EXTN_ASIN_SEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList asinbocdcur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList extnasincur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_EXTN_ASIN_SEARCHDataSet(){}
	public PS_L_EXTN_ASIN_SEARCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(12);
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord rec = new PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord();
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(14);
		while(rset1.next()){
			PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord rec = new PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord();
			rec.bocd = Util.checkString(rset1.getString("bocd"));
			rec.bonm = Util.checkString(rset1.getString("bonm"));
			rec.deptcd = Util.checkString(rset1.getString("deptcd"));
			rec.sellnetclsf = Util.checkString(rset1.getString("sellnetclsf"));
			this.asinbocdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(15);
		while(rset2.next()){
			PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord rec = new PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord();
			rec.rdr_extndt = Util.checkString(rset2.getString("rdr_extndt"));
			rec.rdr_extnno = Util.checkString(rset2.getString("rdr_extnno"));
			rec.medicd = Util.checkString(rset2.getString("medicd"));
			rec.medinm = Util.checkString(rset2.getString("medinm"));
			rec.aplcdt = Util.checkString(rset2.getString("aplcdt"));
			rec.qty = rset2.getInt("qty");
			rec.aplcpathcd = Util.checkString(rset2.getString("aplcpathcd"));
			rec.aplcpathnm = Util.checkString(rset2.getString("aplcpathnm"));
			rec.rdr_extntypecd = Util.checkString(rset2.getString("rdr_extntypecd"));
			rec.rdr_extntypenm = Util.checkString(rset2.getString("rdr_extntypenm"));
			rec.extnblngcd = Util.checkString(rset2.getString("extnblngcd"));
			rec.empdeptcd = Util.checkString(rset2.getString("empdeptcd"));
			rec.empdeptnm = Util.checkString(rset2.getString("empdeptnm"));
			rec.empseq = Util.checkString(rset2.getString("empseq"));
			rec.extnid = Util.checkString(rset2.getString("extnid"));
			rec.extnflnm = Util.checkString(rset2.getString("extnflnm"));
			rec.extntel1 = Util.checkString(rset2.getString("extntel1"));
			rec.extntel2 = Util.checkString(rset2.getString("extntel2"));
			rec.extntel3 = Util.checkString(rset2.getString("extntel3"));
			rec.extnptph_no1 = Util.checkString(rset2.getString("extnptph_no1"));
			rec.extnptph_no2 = Util.checkString(rset2.getString("extnptph_no2"));
			rec.extnptph_no3 = Util.checkString(rset2.getString("extnptph_no3"));
			rec.extnprn = Util.checkString(rset2.getString("extnprn"));
			rec.aplcpersnm = Util.checkString(rset2.getString("aplcpersnm"));
			rec.aplcperstel_no1 = Util.checkString(rset2.getString("aplcperstel_no1"));
			rec.aplcperstel_no2 = Util.checkString(rset2.getString("aplcperstel_no2"));
			rec.aplcperstel_no3 = Util.checkString(rset2.getString("aplcperstel_no3"));
			rec.aplcpersptph_no1 = Util.checkString(rset2.getString("aplcpersptph_no1"));
			rec.aplcpersptph_no2 = Util.checkString(rset2.getString("aplcpersptph_no2"));
			rec.aplcpersptph_no3 = Util.checkString(rset2.getString("aplcpersptph_no3"));
			rec.rdrnm = Util.checkString(rset2.getString("rdrnm"));
			rec.phone = Util.checkString(rset2.getString("phone"));
			rec.rdrtel_no1 = Util.checkString(rset2.getString("rdrtel_no1"));
			rec.rdrtel_no2 = Util.checkString(rset2.getString("rdrtel_no2"));
			rec.rdrtel_no3 = Util.checkString(rset2.getString("rdrtel_no3"));
			rec.rdrptph_no1 = Util.checkString(rset2.getString("rdrptph_no1"));
			rec.rdrptph_no2 = Util.checkString(rset2.getString("rdrptph_no2"));
			rec.rdrptph_no3 = Util.checkString(rset2.getString("rdrptph_no3"));
			rec.rdrprn = Util.checkString(rset2.getString("rdrprn"));
			rec.rdremail = Util.checkString(rset2.getString("rdremail"));
			rec.rdrmembseq = Util.checkString(rset2.getString("rdrmembseq"));
			rec.rdroffitel_no1 = Util.checkString(rset2.getString("rdroffitel_no1"));
			rec.rdroffitel_no2 = Util.checkString(rset2.getString("rdroffitel_no2"));
			rec.rdroffitel_no3 = Util.checkString(rset2.getString("rdroffitel_no3"));
			rec.dlvzip = Util.checkString(rset2.getString("dlvzip"));
			rec.dlvaddr = Util.checkString(rset2.getString("dlvaddr"));
			rec.dlvdtlsaddr = Util.checkString(rset2.getString("dlvdtlsaddr"));
			rec.acqclsf = Util.checkString(rset2.getString("acqclsf"));
			rec.pymtflnm = Util.checkString(rset2.getString("pymtflnm"));
			rec.pymttel_no1 = Util.checkString(rset2.getString("pymttel_no1"));
			rec.pymttel_no2 = Util.checkString(rset2.getString("pymttel_no2"));
			rec.pymttel_no3 = Util.checkString(rset2.getString("pymttel_no3"));
			rec.pymtptph_no1 = Util.checkString(rset2.getString("pymtptph_no1"));
			rec.pymtptph_no2 = Util.checkString(rset2.getString("pymtptph_no2"));
			rec.pymtptph_no3 = Util.checkString(rset2.getString("pymtptph_no3"));
			rec.pymtzip = Util.checkString(rset2.getString("pymtzip"));
			rec.pymtaddr = Util.checkString(rset2.getString("pymtaddr"));
			rec.pymtdtlsaddr = Util.checkString(rset2.getString("pymtdtlsaddr"));
			rec.rcpmmthd = Util.checkString(rset2.getString("rcpmmthd"));
			rec.asindt = Util.checkString(rset2.getString("asindt"));
			rec.asinbocd = Util.checkString(rset2.getString("asinbocd"));
			rec.bouseyn = Util.checkString(rset2.getString("bouseyn"));
			rec.deliproccd = Util.checkString(rset2.getString("deliproccd"));
			rec.prcmsg = Util.checkString(rset2.getString("prcmsg"));
			rec.aplcpersremk = Util.checkString(rset2.getString("aplcpersremk"));
			rec.rnum = rset2.getInt("rnum");
			this.extnasincur.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord rec = (PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord)medicdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
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
			PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord rec = (PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String extnasincurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extnasincur.size();
		for(int i=0; i<size; i++){
			PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord rec = (PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord)extnasincur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_extnno;
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord rec = (PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord)medicdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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
			PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord rec = (PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String extnasincurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extnasincur.size();
		for(int i=0; i<size; i++){
			PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord rec = (PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord)extnasincur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_extnno;
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord rec = (PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord)medicdcur.get(i);
			
			
			String code = rec.ciymgbcd;
			String name = rec.cicdgb;
			
			sb.append("<input name=\"");
			sb.append("ciymgbcd");
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
			PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord rec = (PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord)asinbocdcur.get(i);
			
			
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

	public String extnasincurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = extnasincur.size();
		for(int i=0; i<size; i++){
			PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord rec = (PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord)extnasincur.get(i);
			
			
			String code = rec.rdr_extndt;
			String name = rec.rdr_extnno;
			
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
	PS_L_EXTN_ASIN_SEARCHDataSet ds = (PS_L_EXTN_ASIN_SEARCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord medicdcurRec = (PS_L_EXTN_ASIN_SEARCHMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.asinbocdcur.size(); i++){
		PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord asinbocdcurRec = (PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord)ds.asinbocdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.extnasincur.size(); i++){
		PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord extnasincurRec = (PS_L_EXTN_ASIN_SEARCHEXTNASINCURRecord)ds.extnasincur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getMedicdcur()%>
<%= ds.getAsinbocdcur()%>
<%= ds.getExtnasincur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= asinbocdcurRec.bocd%>
<%= asinbocdcurRec.bonm%>
<%= asinbocdcurRec.deptcd%>
<%= asinbocdcurRec.sellnetclsf%>
<%= extnasincurRec.rdr_extndt%>
<%= extnasincurRec.rdr_extnno%>
<%= extnasincurRec.medicd%>
<%= extnasincurRec.medinm%>
<%= extnasincurRec.aplcdt%>
<%= extnasincurRec.qty%>
<%= extnasincurRec.aplcpathcd%>
<%= extnasincurRec.aplcpathnm%>
<%= extnasincurRec.rdr_extntypecd%>
<%= extnasincurRec.rdr_extntypenm%>
<%= extnasincurRec.extnblngcd%>
<%= extnasincurRec.empdeptcd%>
<%= extnasincurRec.empdeptnm%>
<%= extnasincurRec.empseq%>
<%= extnasincurRec.extnid%>
<%= extnasincurRec.extnflnm%>
<%= extnasincurRec.extntel1%>
<%= extnasincurRec.extntel2%>
<%= extnasincurRec.extntel3%>
<%= extnasincurRec.extnptph_no1%>
<%= extnasincurRec.extnptph_no2%>
<%= extnasincurRec.extnptph_no3%>
<%= extnasincurRec.extnprn%>
<%= extnasincurRec.aplcpersnm%>
<%= extnasincurRec.aplcperstel_no1%>
<%= extnasincurRec.aplcperstel_no2%>
<%= extnasincurRec.aplcperstel_no3%>
<%= extnasincurRec.aplcpersptph_no1%>
<%= extnasincurRec.aplcpersptph_no2%>
<%= extnasincurRec.aplcpersptph_no3%>
<%= extnasincurRec.rdrnm%>
<%= extnasincurRec.phone%>
<%= extnasincurRec.rdrtel_no1%>
<%= extnasincurRec.rdrtel_no2%>
<%= extnasincurRec.rdrtel_no3%>
<%= extnasincurRec.rdrptph_no1%>
<%= extnasincurRec.rdrptph_no2%>
<%= extnasincurRec.rdrptph_no3%>
<%= extnasincurRec.rdrprn%>
<%= extnasincurRec.rdremail%>
<%= extnasincurRec.rdrmembseq%>
<%= extnasincurRec.rdroffitel_no1%>
<%= extnasincurRec.rdroffitel_no2%>
<%= extnasincurRec.rdroffitel_no3%>
<%= extnasincurRec.dlvzip%>
<%= extnasincurRec.dlvaddr%>
<%= extnasincurRec.dlvdtlsaddr%>
<%= extnasincurRec.acqclsf%>
<%= extnasincurRec.pymtflnm%>
<%= extnasincurRec.pymttel_no1%>
<%= extnasincurRec.pymttel_no2%>
<%= extnasincurRec.pymttel_no3%>
<%= extnasincurRec.pymtptph_no1%>
<%= extnasincurRec.pymtptph_no2%>
<%= extnasincurRec.pymtptph_no3%>
<%= extnasincurRec.pymtzip%>
<%= extnasincurRec.pymtaddr%>
<%= extnasincurRec.pymtdtlsaddr%>
<%= extnasincurRec.rcpmmthd%>
<%= extnasincurRec.asindt%>
<%= extnasincurRec.asinbocd%>
<%= extnasincurRec.bouseyn%>
<%= extnasincurRec.deliproccd%>
<%= extnasincurRec.prcmsg%>
<%= extnasincurRec.aplcpersremk%>
<%= extnasincurRec.rnum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 25 16:06:24 KST 2005 */