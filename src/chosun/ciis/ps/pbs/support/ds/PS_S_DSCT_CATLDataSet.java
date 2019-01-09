/***************************************************************************************************
* 파일명 : PS_S_DSCT_CATL.java
* 기능   :  불편접수 - 상세정보
* 작성일자 : 2003-12-27
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편접수 - 상세 정보
 *
 */

public class PS_S_DSCT_CATLDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList bocdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String regdt;
	public String regno;
	public String acpndt;
	public String acpnpathcd;
	public String areacd;
	public String deptcd;
	public String bocd;
	public String bonm;
	public String dscttypecd;
	public String dscttypenm;
	public String medicd;
	public String medinm;
	public String termsubsno;
	public String subsfrser_no;
	public String substoser_no;
	public String prn;
	public String rdr_no;
	public String rdrnm;
	public String dlvzip1;
	public String dlvzip2;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String titl;
	public String cont;
	public String rdremail;
	public String boprocyn;
	public String boproccont;
	public String procpers;
	public String procpers_nm;

	public PS_S_DSCT_CATLDataSet(){}
	public PS_S_DSCT_CATLDataSet(String errcode, String errmsg, String regdt, String regno, String acpndt, String acpnpathcd, String areacd, String deptcd, String bocd, String bonm, String dscttypecd, String dscttypenm, String medicd, String medinm, String termsubsno, String subsfrser_no, String substoser_no, String prn, String rdr_no, String rdrnm, String dlvzip1, String dlvzip2, String dlvaddr, String dlvdtlsaddr, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String titl, String cont, String rdremail, String boprocyn, String boproccont, String procpers, String procpers_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.regdt = regdt;
		this.regno = regno;
		this.acpndt = acpndt;
		this.acpnpathcd = acpnpathcd;
		this.areacd = areacd;
		this.deptcd = deptcd;
		this.bocd = bocd;
		this.bonm = bonm;
		this.dscttypecd = dscttypecd;
		this.dscttypenm = dscttypenm;
		this.medicd = medicd;
		this.medinm = medinm;
		this.termsubsno = termsubsno;
		this.subsfrser_no = subsfrser_no;
		this.substoser_no = substoser_no;
		this.prn = prn;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.dlvzip1 = dlvzip1;
		this.dlvzip2 = dlvzip2;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.titl = titl;
		this.cont = cont;
		this.rdremail = rdremail;
		this.boprocyn = boprocyn;
		this.boproccont = boproccont;
		this.procpers = procpers;
		this.procpers_nm = procpers_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setAcpndt(String acpndt){
		this.acpndt = acpndt;
	}

	public void setAcpnpathcd(String acpnpathcd){
		this.acpnpathcd = acpnpathcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setDscttypenm(String dscttypenm){
		this.dscttypenm = dscttypenm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setSubstoser_no(String substoser_no){
		this.substoser_no = substoser_no;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setDlvzip1(String dlvzip1){
		this.dlvzip1 = dlvzip1;
	}

	public void setDlvzip2(String dlvzip2){
		this.dlvzip2 = dlvzip2;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
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

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setBoproccont(String boproccont){
		this.boproccont = boproccont;
	}

	public void setProcpers(String procpers){
		this.procpers = procpers;
	}

	public void setProcpers_nm(String procpers_nm){
		this.procpers_nm = procpers_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getAcpndt(){
		return this.acpndt;
	}

	public String getAcpnpathcd(){
		return this.acpnpathcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getDscttypenm(){
		return this.dscttypenm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getSubstoser_no(){
		return this.substoser_no;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getDlvzip1(){
		return this.dlvzip1;
	}

	public String getDlvzip2(){
		return this.dlvzip2;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
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

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getRdremail(){
		return this.rdremail;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getBoproccont(){
		return this.boproccont;
	}

	public String getProcpers(){
		return this.procpers;
	}

	public String getProcpers_nm(){
		return this.procpers_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.regdt = Util.checkString(cstmt.getString(6));
		this.regno = Util.checkString(cstmt.getString(7));
		this.acpndt = Util.checkString(cstmt.getString(8));
		this.acpnpathcd = Util.checkString(cstmt.getString(9));
		this.areacd = Util.checkString(cstmt.getString(10));
		this.deptcd = Util.checkString(cstmt.getString(11));
		this.bocd = Util.checkString(cstmt.getString(12));
		this.bonm = Util.checkString(cstmt.getString(13));
		this.dscttypecd = Util.checkString(cstmt.getString(14));
		this.dscttypenm = Util.checkString(cstmt.getString(15));
		this.medicd = Util.checkString(cstmt.getString(16));
		this.medinm = Util.checkString(cstmt.getString(17));
		this.termsubsno = Util.checkString(cstmt.getString(18));
		this.subsfrser_no = Util.checkString(cstmt.getString(19));
		this.substoser_no = Util.checkString(cstmt.getString(20));
		this.prn = Util.checkString(cstmt.getString(21));
		this.rdr_no = Util.checkString(cstmt.getString(22));
		this.rdrnm = Util.checkString(cstmt.getString(23));
		this.dlvzip1 = Util.checkString(cstmt.getString(24));
		this.dlvzip2 = Util.checkString(cstmt.getString(25));
		this.dlvaddr = Util.checkString(cstmt.getString(26));
		this.dlvdtlsaddr = Util.checkString(cstmt.getString(27));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(28));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(29));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(30));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(31));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(32));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(33));
		this.titl = Util.checkString(cstmt.getString(34));
		this.cont = Util.checkString(cstmt.getString(35));
		this.rdremail = Util.checkString(cstmt.getString(36));
		this.boprocyn = Util.checkString(cstmt.getString(37));
		this.boproccont = Util.checkString(cstmt.getString(38));
		this.procpers = Util.checkString(cstmt.getString(39));
		this.procpers_nm = Util.checkString(cstmt.getString(40));
		ResultSet rset0 = (ResultSet) cstmt.getObject(41);
		while(rset0.next()){
			PS_S_DSCT_CATLBOCDCURRecord rec = new PS_S_DSCT_CATLBOCDCURRecord();
			rec.cicodeval = Util.checkString(rset0.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset0.getString("cicdnm"));
			this.bocdcur.add(rec);
		}
	}

	public String bocdcurOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_DSCT_CATLBOCDCURRecord rec = (PS_S_DSCT_CATLBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String bocdcurChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_DSCT_CATLBOCDCURRecord rec = (PS_S_DSCT_CATLBOCDCURRecord)bocdcur.get(i);
			
			
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

	public String bocdcurRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = bocdcur.size();
		for(int i=0; i<size; i++){
			PS_S_DSCT_CATLBOCDCURRecord rec = (PS_S_DSCT_CATLBOCDCURRecord)bocdcur.get(i);
			
			
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
	PS_S_DSCT_CATLDataSet ds = (PS_S_DSCT_CATLDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bocdcur.size(); i++){
		PS_S_DSCT_CATLBOCDCURRecord bocdcurRec = (PS_S_DSCT_CATLBOCDCURRecord)ds.bocdcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRegdt()%>
<%= ds.getRegno()%>
<%= ds.getAcpndt()%>
<%= ds.getAcpnpathcd()%>
<%= ds.getAreacd()%>
<%= ds.getDeptcd()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getDscttypecd()%>
<%= ds.getDscttypenm()%>
<%= ds.getMedicd()%>
<%= ds.getMedinm()%>
<%= ds.getTermsubsno()%>
<%= ds.getSubsfrser_no()%>
<%= ds.getSubstoser_no()%>
<%= ds.getPrn()%>
<%= ds.getRdr_no()%>
<%= ds.getRdrnm()%>
<%= ds.getDlvzip1()%>
<%= ds.getDlvzip2()%>
<%= ds.getDlvaddr()%>
<%= ds.getDlvdtlsaddr()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getTitl()%>
<%= ds.getCont()%>
<%= ds.getRdremail()%>
<%= ds.getBoprocyn()%>
<%= ds.getBoproccont()%>
<%= ds.getProcpers()%>
<%= ds.getProcpers_nm()%>
<%= ds.getBocdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bocdcurRec.cicodeval%>
<%= bocdcurRec.cicdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 11 20:49:09 KST 2005 */