/***************************************************************************************************
* 파일명 : PS_S_CASHRCPT.java
* 기능   : 불편관리 - 현금영수증 상세
* 작성일자 : 2005-12-19
* 작성자 : 전현표
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
 * 불편관리 - 현금영수증 상세
 *
 */

public class PS_S_CASHRCPTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String rdr_no;
	public String selpubclsf;
	public String aplcpers;
	public String prn;
	public String ptphno1;
	public String ptphno2;
	public String ptphno3;
	public String incmgpers;
	public String incmgdt;
	public String acqnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String bonm;
	public String medinm;
	public String medicd;
	public String termsubsno;
	public String subsfrser_no;
	public String substoser_no;
	public String addr;
	public String rcptclsf;
	public String aplcpath;

	public PS_S_CASHRCPTDataSet(){}
	public PS_S_CASHRCPTDataSet(String errcode, String errmsg, String rdr_no, String selpubclsf, String aplcpers, String prn, String ptphno1, String ptphno2, String ptphno3, String incmgpers, String incmgdt, String acqnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String bonm, String medinm, String medicd, String termsubsno, String subsfrser_no, String substoser_no, String addr, String rcptclsf, String aplcpath){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_no = rdr_no;
		this.selpubclsf = selpubclsf;
		this.aplcpers = aplcpers;
		this.prn = prn;
		this.ptphno1 = ptphno1;
		this.ptphno2 = ptphno2;
		this.ptphno3 = ptphno3;
		this.incmgpers = incmgpers;
		this.incmgdt = incmgdt;
		this.acqnm = acqnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.bonm = bonm;
		this.medinm = medinm;
		this.medicd = medicd;
		this.termsubsno = termsubsno;
		this.subsfrser_no = subsfrser_no;
		this.substoser_no = substoser_no;
		this.addr = addr;
		this.rcptclsf = rcptclsf;
		this.aplcpath = aplcpath;
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

	public void setSelpubclsf(String selpubclsf){
		this.selpubclsf = selpubclsf;
	}

	public void setAplcpers(String aplcpers){
		this.aplcpers = aplcpers;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPtphno1(String ptphno1){
		this.ptphno1 = ptphno1;
	}

	public void setPtphno2(String ptphno2){
		this.ptphno2 = ptphno2;
	}

	public void setPtphno3(String ptphno3){
		this.ptphno3 = ptphno3;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
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

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
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

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setRcptclsf(String rcptclsf){
		this.rcptclsf = rcptclsf;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
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

	public String getSelpubclsf(){
		return this.selpubclsf;
	}

	public String getAplcpers(){
		return this.aplcpers;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPtphno1(){
		return this.ptphno1;
	}

	public String getPtphno2(){
		return this.ptphno2;
	}

	public String getPtphno3(){
		return this.ptphno3;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getAcqnm(){
		return this.acqnm;
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

	public String getBonm(){
		return this.bonm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getMedicd(){
		return this.medicd;
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

	public String getAddr(){
		return this.addr;
	}

	public String getRcptclsf(){
		return this.rcptclsf;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdr_no = Util.checkString(cstmt.getString(6));
		this.selpubclsf = Util.checkString(cstmt.getString(7));
		this.aplcpers = Util.checkString(cstmt.getString(8));
		this.prn = Util.checkString(cstmt.getString(9));
		this.ptphno1 = Util.checkString(cstmt.getString(10));
		this.ptphno2 = Util.checkString(cstmt.getString(11));
		this.ptphno3 = Util.checkString(cstmt.getString(12));
		this.incmgpers = Util.checkString(cstmt.getString(13));
		this.incmgdt = Util.checkString(cstmt.getString(14));
		this.acqnm = Util.checkString(cstmt.getString(15));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(16));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(17));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(18));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(19));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(20));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(21));
		this.bonm = Util.checkString(cstmt.getString(22));
		this.medinm = Util.checkString(cstmt.getString(23));
		this.medicd = Util.checkString(cstmt.getString(24));
		this.termsubsno = Util.checkString(cstmt.getString(25));
		this.subsfrser_no = Util.checkString(cstmt.getString(26));
		this.substoser_no = Util.checkString(cstmt.getString(27));
		this.addr = Util.checkString(cstmt.getString(28));
		this.rcptclsf = Util.checkString(cstmt.getString(29));
		this.aplcpath = Util.checkString(cstmt.getString(30));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PS_S_CASHRCPTDataSet ds = (PS_S_CASHRCPTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_no()%>
<%= ds.getSelpubclsf()%>
<%= ds.getAplcpers()%>
<%= ds.getPrn()%>
<%= ds.getPtphno1()%>
<%= ds.getPtphno2()%>
<%= ds.getPtphno3()%>
<%= ds.getIncmgpers()%>
<%= ds.getIncmgdt()%>
<%= ds.getAcqnm()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getBonm()%>
<%= ds.getMedinm()%>
<%= ds.getMedicd()%>
<%= ds.getTermsubsno()%>
<%= ds.getSubsfrser_no()%>
<%= ds.getSubstoser_no()%>
<%= ds.getAddr()%>
<%= ds.getRcptclsf()%>
<%= ds.getAplcpath()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 23 15:37:28 KST 2005 */