/***************************************************************************************************
* 파일명 : SL_S_MOVM_RDRDataSet.java
* 기능 : 독자-이사독자관리-이사인계-상세
* 작성일자 : 2004-03-26
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
 * 독자-이사독자관리-이사인계-상세
 *
 */

public class SL_S_MOVM_RDRDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList nwspsubscur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rdr_no;
	public String rdrnm;
	public Timestamp aplcdt;
	public String aplcpathcd;
	public String aplcpathnm;
	public String trsfbonm;
	public String trfsbo_tel;
	public String acptbocd;
	public String acptbonm;
	public String acptbo_tel;
	public String movmdt;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String resiclsf;
	public String resiclsfnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String movmzip;
	public String movmaddr;
	public String movmdtlsaddr;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String movmtel_no1;
	public String movmtel_no2;
	public String movmtel_no3;
	public String movmresiclsf;
	public String movmresitype;
	public String remk;
	public String dlvhopedt;
	public String trsfbocnfmstat;
	public String acptbocnfmstat;
	public String acptboremk;
	public String trsfboremk;
	public String cns_empid;
	public String cns_empnm;
	public String cns_empremk;
	public String cns_empcnfmyn;
	public Timestamp cns_empcnfmdt;

	public SL_S_MOVM_RDRDataSet(){}
	public SL_S_MOVM_RDRDataSet(String errcode, String errmsg, String rdr_no, String rdrnm, Timestamp aplcdt, String aplcpathcd, String aplcpathnm, String trsfbonm, String trfsbo_tel, String acptbocd, String acptbonm, String acptbo_tel, String movmdt, String zip, String addr, String dtlsaddr, String resiclsf, String resiclsfnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String movmzip, String movmaddr, String movmdtlsaddr, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String movmtel_no1, String movmtel_no2, String movmtel_no3, String movmresiclsf, String movmresitype, String remk, String dlvhopedt, String trsfbocnfmstat, String acptbocnfmstat, String acptboremk, String trsfboremk, String cns_empid, String cns_empnm, String cns_empremk, String cns_empcnfmyn, Timestamp cns_empcnfmdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.aplcdt = aplcdt;
		this.aplcpathcd = aplcpathcd;
		this.aplcpathnm = aplcpathnm;
		this.trsfbonm = trsfbonm;
		this.trfsbo_tel = trfsbo_tel;
		this.acptbocd = acptbocd;
		this.acptbonm = acptbonm;
		this.acptbo_tel = acptbo_tel;
		this.movmdt = movmdt;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.resiclsf = resiclsf;
		this.resiclsfnm = resiclsfnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.movmzip = movmzip;
		this.movmaddr = movmaddr;
		this.movmdtlsaddr = movmdtlsaddr;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.movmtel_no1 = movmtel_no1;
		this.movmtel_no2 = movmtel_no2;
		this.movmtel_no3 = movmtel_no3;
		this.movmresiclsf = movmresiclsf;
		this.movmresitype = movmresitype;
		this.remk = remk;
		this.dlvhopedt = dlvhopedt;
		this.trsfbocnfmstat = trsfbocnfmstat;
		this.acptbocnfmstat = acptbocnfmstat;
		this.acptboremk = acptboremk;
		this.trsfboremk = trsfboremk;
		this.cns_empid = cns_empid;
		this.cns_empnm = cns_empnm;
		this.cns_empremk = cns_empremk;
		this.cns_empcnfmyn = cns_empcnfmyn;
		this.cns_empcnfmdt = cns_empcnfmdt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setAplcdt(Timestamp aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setTrsfbonm(String trsfbonm){
		this.trsfbonm = trsfbonm;
	}

	public void setTrfsbo_tel(String trfsbo_tel){
		this.trfsbo_tel = trfsbo_tel;
	}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
	}

	public void setAcptbonm(String acptbonm){
		this.acptbonm = acptbonm;
	}

	public void setAcptbo_tel(String acptbo_tel){
		this.acptbo_tel = acptbo_tel;
	}

	public void setMovmdt(String movmdt){
		this.movmdt = movmdt;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setResiclsf(String resiclsf){
		this.resiclsf = resiclsf;
	}

	public void setResiclsfnm(String resiclsfnm){
		this.resiclsfnm = resiclsfnm;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setMovmzip(String movmzip){
		this.movmzip = movmzip;
	}

	public void setMovmaddr(String movmaddr){
		this.movmaddr = movmaddr;
	}

	public void setMovmdtlsaddr(String movmdtlsaddr){
		this.movmdtlsaddr = movmdtlsaddr;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setMovmtel_no1(String movmtel_no1){
		this.movmtel_no1 = movmtel_no1;
	}

	public void setMovmtel_no2(String movmtel_no2){
		this.movmtel_no2 = movmtel_no2;
	}

	public void setMovmtel_no3(String movmtel_no3){
		this.movmtel_no3 = movmtel_no3;
	}

	public void setMovmresiclsf(String movmresiclsf){
		this.movmresiclsf = movmresiclsf;
	}

	public void setMovmresitype(String movmresitype){
		this.movmresitype = movmresitype;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setTrsfbocnfmstat(String trsfbocnfmstat){
		this.trsfbocnfmstat = trsfbocnfmstat;
	}

	public void setAcptbocnfmstat(String acptbocnfmstat){
		this.acptbocnfmstat = acptbocnfmstat;
	}

	public void setAcptboremk(String acptboremk){
		this.acptboremk = acptboremk;
	}

	public void setTrsfboremk(String trsfboremk){
		this.trsfboremk = trsfboremk;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setCns_empremk(String cns_empremk){
		this.cns_empremk = cns_empremk;
	}

	public void setCns_empcnfmyn(String cns_empcnfmyn){
		this.cns_empcnfmyn = cns_empcnfmyn;
	}

	public void setCns_empcnfmdt(Timestamp cns_empcnfmdt){
		this.cns_empcnfmdt = cns_empcnfmdt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public Timestamp getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getTrsfbonm(){
		return this.trsfbonm;
	}

	public String getTrfsbo_tel(){
		return this.trfsbo_tel;
	}

	public String getAcptbocd(){
		return this.acptbocd;
	}

	public String getAcptbonm(){
		return this.acptbonm;
	}

	public String getAcptbo_tel(){
		return this.acptbo_tel;
	}

	public String getMovmdt(){
		return this.movmdt;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getResiclsf(){
		return this.resiclsf;
	}

	public String getResiclsfnm(){
		return this.resiclsfnm;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getMovmzip(){
		return this.movmzip;
	}

	public String getMovmaddr(){
		return this.movmaddr;
	}

	public String getMovmdtlsaddr(){
		return this.movmdtlsaddr;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getMovmtel_no1(){
		return this.movmtel_no1;
	}

	public String getMovmtel_no2(){
		return this.movmtel_no2;
	}

	public String getMovmtel_no3(){
		return this.movmtel_no3;
	}

	public String getMovmresiclsf(){
		return this.movmresiclsf;
	}

	public String getMovmresitype(){
		return this.movmresitype;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getTrsfbocnfmstat(){
		return this.trsfbocnfmstat;
	}

	public String getAcptbocnfmstat(){
		return this.acptbocnfmstat;
	}

	public String getAcptboremk(){
		return this.acptboremk;
	}

	public String getTrsfboremk(){
		return this.trsfboremk;
	}

	public String getCns_empid(){
		return this.cns_empid;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getCns_empremk(){
		return this.cns_empremk;
	}

	public String getCns_empcnfmyn(){
		return this.cns_empcnfmyn;
	}

	public Timestamp getCns_empcnfmdt(){
		return this.cns_empcnfmdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdr_no = Util.checkString(cstmt.getString(5));
		this.rdrnm = Util.checkString(cstmt.getString(6));
		this.aplcdt = cstmt.getTimestamp(7);
		this.aplcpathcd = Util.checkString(cstmt.getString(8));
		this.aplcpathnm = Util.checkString(cstmt.getString(9));
		this.trsfbonm = Util.checkString(cstmt.getString(10));
		this.trfsbo_tel = Util.checkString(cstmt.getString(11));
		this.acptbocd = Util.checkString(cstmt.getString(12));
		this.acptbonm = Util.checkString(cstmt.getString(13));
		this.acptbo_tel = Util.checkString(cstmt.getString(14));
		this.movmdt = Util.checkString(cstmt.getString(15));
		this.zip = Util.checkString(cstmt.getString(16));
		this.addr = Util.checkString(cstmt.getString(17));
		this.dtlsaddr = Util.checkString(cstmt.getString(18));
		this.resiclsf = Util.checkString(cstmt.getString(19));
		this.resiclsfnm = Util.checkString(cstmt.getString(20));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(21));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(22));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(23));
		this.movmzip = Util.checkString(cstmt.getString(24));
		this.movmaddr = Util.checkString(cstmt.getString(25));
		this.movmdtlsaddr = Util.checkString(cstmt.getString(26));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(27));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(28));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(29));
		this.movmtel_no1 = Util.checkString(cstmt.getString(30));
		this.movmtel_no2 = Util.checkString(cstmt.getString(31));
		this.movmtel_no3 = Util.checkString(cstmt.getString(32));
		this.movmresiclsf = Util.checkString(cstmt.getString(33));
		this.movmresitype = Util.checkString(cstmt.getString(34));
		this.remk = Util.checkString(cstmt.getString(35));
		this.dlvhopedt = Util.checkString(cstmt.getString(36));
		this.trsfbocnfmstat = Util.checkString(cstmt.getString(37));
		this.acptbocnfmstat = Util.checkString(cstmt.getString(38));
		this.acptboremk = Util.checkString(cstmt.getString(39));
		this.trsfboremk = Util.checkString(cstmt.getString(40));
		this.cns_empid = Util.checkString(cstmt.getString(41));
		this.cns_empnm = Util.checkString(cstmt.getString(42));
		this.cns_empremk = Util.checkString(cstmt.getString(43));
		this.cns_empcnfmyn = Util.checkString(cstmt.getString(44));
		this.cns_empcnfmdt = cstmt.getTimestamp(45);
		ResultSet rset0 = (ResultSet) cstmt.getObject(46);
		while(rset0.next()){
			SL_S_MOVM_RDRNWSPSUBSCURRecord rec = new SL_S_MOVM_RDRNWSPSUBSCURRecord();
			rec.medicd = Util.checkString(rset0.getString("medicd"));
			rec.medinm = Util.checkString(rset0.getString("medinm"));
			rec.freeyn = Util.checkString(rset0.getString("freeyn"));
			rec.freeclsf = Util.checkString(rset0.getString("freeclsf"));
			rec.freeclsfnm = Util.checkString(rset0.getString("freeclsfnm"));
			rec.qty = rset0.getInt("qty");
			rec.valmm = Util.checkString(rset0.getString("valmm"));
			this.nwspsubscur.add(rec);
		}
	}

	public String nwspsubscurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscur.size();
		for(int i=0; i<size; i++){
			SL_S_MOVM_RDRNWSPSUBSCURRecord rec = (SL_S_MOVM_RDRNWSPSUBSCURRecord)nwspsubscur.get(i);
			
			
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

	public String nwspsubscurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscur.size();
		for(int i=0; i<size; i++){
			SL_S_MOVM_RDRNWSPSUBSCURRecord rec = (SL_S_MOVM_RDRNWSPSUBSCURRecord)nwspsubscur.get(i);
			
			
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

	public String nwspsubscurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = nwspsubscur.size();
		for(int i=0; i<size; i++){
			SL_S_MOVM_RDRNWSPSUBSCURRecord rec = (SL_S_MOVM_RDRNWSPSUBSCURRecord)nwspsubscur.get(i);
			
			
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
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_S_MOVM_RDRDataSet ds = (SL_S_MOVM_RDRDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.nwspsubscur.size(); i++){
		SL_S_MOVM_RDRNWSPSUBSCURRecord nwspsubscurRec = (SL_S_MOVM_RDRNWSPSUBSCURRecord)ds.nwspsubscur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_no()%>
<%= ds.getRdrnm()%>
<%= ds.getAplcdt()%>
<%= ds.getAplcpathcd()%>
<%= ds.getAplcpathnm()%>
<%= ds.getTrsfbonm()%>
<%= ds.getTrfsbo_tel()%>
<%= ds.getAcptbocd()%>
<%= ds.getAcptbonm()%>
<%= ds.getAcptbo_tel()%>
<%= ds.getMovmdt()%>
<%= ds.getZip()%>
<%= ds.getAddr()%>
<%= ds.getDtlsaddr()%>
<%= ds.getResiclsf()%>
<%= ds.getResiclsfnm()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getMovmzip()%>
<%= ds.getMovmaddr()%>
<%= ds.getMovmdtlsaddr()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getMovmtel_no1()%>
<%= ds.getMovmtel_no2()%>
<%= ds.getMovmtel_no3()%>
<%= ds.getMovmresiclsf()%>
<%= ds.getMovmresitype()%>
<%= ds.getRemk()%>
<%= ds.getDlvhopedt()%>
<%= ds.getTrsfbocnfmstat()%>
<%= ds.getAcptbocnfmstat()%>
<%= ds.getAcptboremk()%>
<%= ds.getTrsfboremk()%>
<%= ds.getCns_empid()%>
<%= ds.getCns_empnm()%>
<%= ds.getCns_empremk()%>
<%= ds.getCns_empcnfmyn()%>
<%= ds.getCns_empcnfmdt()%>
<%= ds.getNwspsubscur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= nwspsubscurRec.medicd%>
<%= nwspsubscurRec.medinm%>
<%= nwspsubscurRec.freeyn%>
<%= nwspsubscurRec.freeclsf%>
<%= nwspsubscurRec.freeclsfnm%>
<%= nwspsubscurRec.qty%>
<%= nwspsubscurRec.valmm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 26 15:13:47 KST 2004 */