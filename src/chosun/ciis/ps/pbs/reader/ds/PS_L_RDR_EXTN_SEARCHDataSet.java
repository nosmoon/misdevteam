/***************************************************************************************************
 * 파일명   : PS_L_RDR_EXTN_SEARCH.java
 * 기능     : 독자-확장독자내역 조회
 * 작성일자 : 2007-05-28
 * 작성자   : 전현표
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
 *   독자-확장독자내역 조회
 *
 **/

public class PS_L_RDR_EXTN_SEARCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList aplcpathcdcur = new ArrayList();
	public ArrayList rdr_extncur = new ArrayList();
	public ArrayList medicdcur = new ArrayList();
	public ArrayList rdr_extntyecdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public PS_L_RDR_EXTN_SEARCHDataSet(){}
	public PS_L_RDR_EXTN_SEARCHDataSet(String errcode, String errmsg, long totalcnt){
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
		this.totalcnt = cstmt.getLong(22);
		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			PS_L_RDR_EXTN_SEARCHMEDICDCURRecord rec = new PS_L_RDR_EXTN_SEARCHMEDICDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset0.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset0.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset0.getString("cicdgb"));
			this.medicdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(24);
		while(rset1.next()){
			PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord rec = new PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset1.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset1.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset1.getString("cicdgb"));
			this.aplcpathcdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(25);
		while(rset2.next()){
			PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord rec = new PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord();
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
			rec.asinbocd = Util.checkString(rset2.getString("asinbocd"));
			rec.asinbonm = Util.checkString(rset2.getString("asinbonm"));
			rec.bouseyn = Util.checkString(rset2.getString("bouseyn"));
			rec.deliproccd = Util.checkString(rset2.getString("deliproccd"));
			rec.prcmsg = Util.checkString(rset2.getString("prcmsg"));
			rec.rnum = Util.checkString(rset2.getString("rnum"));
			rec.rdr_extn_info = Util.checkString(rset2.getString("rdr_extn_info"));
			rec.rdr_extnclsfnm = Util.checkString(rset2.getString("rdr_extnclsfnm"));
			rec.prvsubsmedinm = Util.checkString(rset2.getString("prvsubsmedinm"));
			this.rdr_extncur.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(26);
		while(rset3.next()){
			PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord rec = new PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord();
			rec.cicodeval = Util.checkString(rset3.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset3.getString("cicdnm"));
			rec.cicdynm = Util.checkString(rset3.getString("cicdynm"));
			rec.ciymgbcd = Util.checkString(rset3.getString("ciymgbcd"));
			rec.cicdgb = Util.checkString(rset3.getString("cicdgb"));
			this.rdr_extntyecdcur.add(rec);
		}
	}

	public String medicdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHMEDICDCURRecord rec = (PS_L_RDR_EXTN_SEARCHMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String aplcpathcdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcdcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord rec = (PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord)aplcpathcdcur.get(i);
			
			
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

	public String rdr_extncurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extncur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord rec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord)rdr_extncur.get(i);
			
			
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

	public String rdr_extntyecdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntyecdcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord rec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord)rdr_extntyecdcur.get(i);
			
			
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

	public String medicdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHMEDICDCURRecord rec = (PS_L_RDR_EXTN_SEARCHMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String aplcpathcdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcdcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord rec = (PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord)aplcpathcdcur.get(i);
			
			
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

	public String rdr_extncurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extncur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord rec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord)rdr_extncur.get(i);
			
			
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

	public String rdr_extntyecdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntyecdcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord rec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord)rdr_extntyecdcur.get(i);
			
			
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

	public String medicdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = medicdcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHMEDICDCURRecord rec = (PS_L_RDR_EXTN_SEARCHMEDICDCURRecord)medicdcur.get(i);
			
			
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

	public String aplcpathcdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = aplcpathcdcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord rec = (PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord)aplcpathcdcur.get(i);
			
			
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

	public String rdr_extncurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extncur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord rec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord)rdr_extncur.get(i);
			
			
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

	public String rdr_extntyecdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = rdr_extntyecdcur.size();
		for(int i=0; i<size; i++){
			PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord rec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord)rdr_extntyecdcur.get(i);
			
			
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
	PS_L_RDR_EXTN_SEARCHDataSet ds = (PS_L_RDR_EXTN_SEARCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.medicdcur.size(); i++){
		PS_L_RDR_EXTN_SEARCHMEDICDCURRecord medicdcurRec = (PS_L_RDR_EXTN_SEARCHMEDICDCURRecord)ds.medicdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.aplcpathcdcur.size(); i++){
		PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord aplcpathcdcurRec = (PS_L_RDR_EXTN_SEARCHAPLCPATHCDCURRecord)ds.aplcpathcdcur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_extncur.size(); i++){
		PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord rdr_extncurRec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNCURRecord)ds.rdr_extncur.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rdr_extntyecdcur.size(); i++){
		PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord rdr_extntyecdcurRec = (PS_L_RDR_EXTN_SEARCHRDR_EXTNTYECDCURRecord)ds.rdr_extntyecdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getMedicdcur()%>
<%= ds.getAplcpathcdcur()%>
<%= ds.getRdr_extncur()%>
<%= ds.getRdr_extntyecdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= medicdcurRec.cicodeval%>
<%= medicdcurRec.cicdnm%>
<%= medicdcurRec.cicdynm%>
<%= medicdcurRec.ciymgbcd%>
<%= medicdcurRec.cicdgb%>
<%= aplcpathcdcurRec.cicodeval%>
<%= aplcpathcdcurRec.cicdnm%>
<%= aplcpathcdcurRec.cicdynm%>
<%= aplcpathcdcurRec.ciymgbcd%>
<%= aplcpathcdcurRec.cicdgb%>
<%= rdr_extncurRec.rdr_extndt%>
<%= rdr_extncurRec.rdr_extnno%>
<%= rdr_extncurRec.medicd%>
<%= rdr_extncurRec.medinm%>
<%= rdr_extncurRec.aplcdt%>
<%= rdr_extncurRec.qty%>
<%= rdr_extncurRec.aplcpathcd%>
<%= rdr_extncurRec.aplcpathnm%>
<%= rdr_extncurRec.rdr_extntypecd%>
<%= rdr_extncurRec.rdr_extntypenm%>
<%= rdr_extncurRec.extnblngcd%>
<%= rdr_extncurRec.empdeptcd%>
<%= rdr_extncurRec.empdeptnm%>
<%= rdr_extncurRec.empseq%>
<%= rdr_extncurRec.extnid%>
<%= rdr_extncurRec.extnflnm%>
<%= rdr_extncurRec.extntel1%>
<%= rdr_extncurRec.extntel2%>
<%= rdr_extncurRec.extntel3%>
<%= rdr_extncurRec.extnptph_no1%>
<%= rdr_extncurRec.extnptph_no2%>
<%= rdr_extncurRec.extnptph_no3%>
<%= rdr_extncurRec.extnprn%>
<%= rdr_extncurRec.aplcpersnm%>
<%= rdr_extncurRec.aplcperstel_no1%>
<%= rdr_extncurRec.aplcperstel_no2%>
<%= rdr_extncurRec.aplcperstel_no3%>
<%= rdr_extncurRec.aplcpersptph_no1%>
<%= rdr_extncurRec.aplcpersptph_no2%>
<%= rdr_extncurRec.aplcpersptph_no3%>
<%= rdr_extncurRec.rdrnm%>
<%= rdr_extncurRec.phone%>
<%= rdr_extncurRec.rdrtel_no1%>
<%= rdr_extncurRec.rdrtel_no2%>
<%= rdr_extncurRec.rdrtel_no3%>
<%= rdr_extncurRec.rdrptph_no1%>
<%= rdr_extncurRec.rdrptph_no2%>
<%= rdr_extncurRec.rdrptph_no3%>
<%= rdr_extncurRec.rdrprn%>
<%= rdr_extncurRec.rdremail%>
<%= rdr_extncurRec.rdrmembseq%>
<%= rdr_extncurRec.rdroffitel_no1%>
<%= rdr_extncurRec.rdroffitel_no2%>
<%= rdr_extncurRec.rdroffitel_no3%>
<%= rdr_extncurRec.dlvzip%>
<%= rdr_extncurRec.dlvaddr%>
<%= rdr_extncurRec.dlvdtlsaddr%>
<%= rdr_extncurRec.acqclsf%>
<%= rdr_extncurRec.pymtflnm%>
<%= rdr_extncurRec.pymttel_no1%>
<%= rdr_extncurRec.pymttel_no2%>
<%= rdr_extncurRec.pymttel_no3%>
<%= rdr_extncurRec.pymtptph_no1%>
<%= rdr_extncurRec.pymtptph_no2%>
<%= rdr_extncurRec.pymtptph_no3%>
<%= rdr_extncurRec.pymtzip%>
<%= rdr_extncurRec.pymtaddr%>
<%= rdr_extncurRec.pymtdtlsaddr%>
<%= rdr_extncurRec.rcpmmthd%>
<%= rdr_extncurRec.asinbocd%>
<%= rdr_extncurRec.asinbonm%>
<%= rdr_extncurRec.bouseyn%>
<%= rdr_extncurRec.deliproccd%>
<%= rdr_extncurRec.prcmsg%>
<%= rdr_extncurRec.rnum%>
<%= rdr_extncurRec.rdr_extn_info%>
<%= rdr_extncurRec.rdr_extnclsfnm%>
<%= rdr_extncurRec.prvsubsmedinm%>
<%= rdr_extntyecdcurRec.cicodeval%>
<%= rdr_extntyecdcurRec.cicdnm%>
<%= rdr_extntyecdcurRec.cicdynm%>
<%= rdr_extntyecdcurRec.ciymgbcd%>
<%= rdr_extntyecdcurRec.cicdgb%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 28 11:38:49 KST 2007 */