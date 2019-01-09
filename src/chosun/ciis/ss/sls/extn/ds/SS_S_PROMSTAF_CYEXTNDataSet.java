/***************************************************************************************************
* 파일명 : SS_S_PROMSTAF_CYEXTNDataSet.java
* 기능 : 확장현황-사이버확장-요원관리-상세를 위한 DataSet
* 작성일자 : 2004-07-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-사이버확장-요원관리-상세를 위한 DataSet
 */


public class SS_S_PROMSTAF_CYEXTNDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String stafclsfcd;
	public String stafno;
	public String prn;
	public String ernno;
	public String stafnm;
	public String in_cmpydt;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String email;
	public String acctno;
	public String acctbank;
	public String acctdeps_pers;
	public String remk;
	public String cnvsstafnm;
	public String cnvsin_cmpydt;
	public String cnvsprn;
	public String cnvstelno1;
	public String cnvstelno2;
	public String cnvstelno3;
	public String cnvsptph_no1;
	public String cnvsptph_no2;
	public String cnvsptph_no3;
	public String cnvsemail;

	public SS_S_PROMSTAF_CYEXTNDataSet(){}
	public SS_S_PROMSTAF_CYEXTNDataSet(String errcode, String errmsg, String stafclsfcd, String stafno, String prn, String ernno, String stafnm, String in_cmpydt, String zip, String addr, String dtlsaddr, String tel_no1, String tel_no2, String tel_no3, String ptph_no1, String ptph_no2, String ptph_no3, String email, String acctno, String acctbank, String acctdeps_pers, String remk, String cnvsstafnm, String cnvsin_cmpydt, String cnvsprn, String cnvstelno1, String cnvstelno2, String cnvstelno3, String cnvsptph_no1, String cnvsptph_no2, String cnvsptph_no3, String cnvsemail){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.stafclsfcd = stafclsfcd;
		this.stafno = stafno;
		this.prn = prn;
		this.ernno = ernno;
		this.stafnm = stafnm;
		this.in_cmpydt = in_cmpydt;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.tel_no1 = tel_no1;
		this.tel_no2 = tel_no2;
		this.tel_no3 = tel_no3;
		this.ptph_no1 = ptph_no1;
		this.ptph_no2 = ptph_no2;
		this.ptph_no3 = ptph_no3;
		this.email = email;
		this.acctno = acctno;
		this.acctbank = acctbank;
		this.acctdeps_pers = acctdeps_pers;
		this.remk = remk;
		this.cnvsstafnm = cnvsstafnm;
		this.cnvsin_cmpydt = cnvsin_cmpydt;
		this.cnvsprn = cnvsprn;
		this.cnvstelno1 = cnvstelno1;
		this.cnvstelno2 = cnvstelno2;
		this.cnvstelno3 = cnvstelno3;
		this.cnvsptph_no1 = cnvsptph_no1;
		this.cnvsptph_no2 = cnvsptph_no2;
		this.cnvsptph_no3 = cnvsptph_no3;
		this.cnvsemail = cnvsemail;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setIn_cmpydt(String in_cmpydt){
		this.in_cmpydt = in_cmpydt;
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

	public void setTel_no1(String tel_no1){
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2){
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3){
		this.tel_no3 = tel_no3;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setAcctbank(String acctbank){
		this.acctbank = acctbank;
	}

	public void setAcctdeps_pers(String acctdeps_pers){
		this.acctdeps_pers = acctdeps_pers;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCnvsstafnm(String cnvsstafnm){
		this.cnvsstafnm = cnvsstafnm;
	}

	public void setCnvsin_cmpydt(String cnvsin_cmpydt){
		this.cnvsin_cmpydt = cnvsin_cmpydt;
	}

	public void setCnvsprn(String cnvsprn){
		this.cnvsprn = cnvsprn;
	}

	public void setCnvstelno1(String cnvstelno1){
		this.cnvstelno1 = cnvstelno1;
	}

	public void setCnvstelno2(String cnvstelno2){
		this.cnvstelno2 = cnvstelno2;
	}

	public void setCnvstelno3(String cnvstelno3){
		this.cnvstelno3 = cnvstelno3;
	}

	public void setCnvsptph_no1(String cnvsptph_no1){
		this.cnvsptph_no1 = cnvsptph_no1;
	}

	public void setCnvsptph_no2(String cnvsptph_no2){
		this.cnvsptph_no2 = cnvsptph_no2;
	}

	public void setCnvsptph_no3(String cnvsptph_no3){
		this.cnvsptph_no3 = cnvsptph_no3;
	}

	public void setCnvsemail(String cnvsemail){
		this.cnvsemail = cnvsemail;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getIn_cmpydt(){
		return this.in_cmpydt;
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

	public String getTel_no1(){
		return this.tel_no1;
	}

	public String getTel_no2(){
		return this.tel_no2;
	}

	public String getTel_no3(){
		return this.tel_no3;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}

	public String getEmail(){
		return this.email;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getAcctbank(){
		return this.acctbank;
	}

	public String getAcctdeps_pers(){
		return this.acctdeps_pers;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCnvsstafnm(){
		return this.cnvsstafnm;
	}

	public String getCnvsin_cmpydt(){
		return this.cnvsin_cmpydt;
	}

	public String getCnvsprn(){
		return this.cnvsprn;
	}

	public String getCnvstelno1(){
		return this.cnvstelno1;
	}

	public String getCnvstelno2(){
		return this.cnvstelno2;
	}

	public String getCnvstelno3(){
		return this.cnvstelno3;
	}

	public String getCnvsptph_no1(){
		return this.cnvsptph_no1;
	}

	public String getCnvsptph_no2(){
		return this.cnvsptph_no2;
	}

	public String getCnvsptph_no3(){
		return this.cnvsptph_no3;
	}

	public String getCnvsemail(){
		return this.cnvsemail;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.stafclsfcd = Util.checkString(cstmt.getString(5));
		this.stafno = Util.checkString(cstmt.getString(6));
		this.prn = Util.checkString(cstmt.getString(7));
		this.ernno = Util.checkString(cstmt.getString(8));
		this.stafnm = Util.checkString(cstmt.getString(9));
		this.in_cmpydt = Util.checkString(cstmt.getString(10));
		this.zip = Util.checkString(cstmt.getString(11));
		this.addr = Util.checkString(cstmt.getString(12));
		this.dtlsaddr = Util.checkString(cstmt.getString(13));
		this.tel_no1 = Util.checkString(cstmt.getString(14));
		this.tel_no2 = Util.checkString(cstmt.getString(15));
		this.tel_no3 = Util.checkString(cstmt.getString(16));
		this.ptph_no1 = Util.checkString(cstmt.getString(17));
		this.ptph_no2 = Util.checkString(cstmt.getString(18));
		this.ptph_no3 = Util.checkString(cstmt.getString(19));
		this.email = Util.checkString(cstmt.getString(20));
		this.acctno = Util.checkString(cstmt.getString(21));
		this.acctbank = Util.checkString(cstmt.getString(22));
		this.acctdeps_pers = Util.checkString(cstmt.getString(23));
		this.remk = Util.checkString(cstmt.getString(24));
		this.cnvsstafnm = Util.checkString(cstmt.getString(25));
		this.cnvsin_cmpydt = Util.checkString(cstmt.getString(26));
		this.cnvsprn = Util.checkString(cstmt.getString(27));
		this.cnvstelno1 = Util.checkString(cstmt.getString(28));
		this.cnvstelno2 = Util.checkString(cstmt.getString(29));
		this.cnvstelno3 = Util.checkString(cstmt.getString(30));
		this.cnvsptph_no1 = Util.checkString(cstmt.getString(31));
		this.cnvsptph_no2 = Util.checkString(cstmt.getString(32));
		this.cnvsptph_no3 = Util.checkString(cstmt.getString(33));
		this.cnvsemail = Util.checkString(cstmt.getString(34));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_PROMSTAF_CYEXTNDataSet ds = (SS_S_PROMSTAF_CYEXTNDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getStafclsfcd()%>
<%= ds.getStafno()%>
<%= ds.getPrn()%>
<%= ds.getErnno()%>
<%= ds.getStafnm()%>
<%= ds.getIn_cmpydt()%>
<%= ds.getZip()%>
<%= ds.getAddr()%>
<%= ds.getDtlsaddr()%>
<%= ds.getTel_no1()%>
<%= ds.getTel_no2()%>
<%= ds.getTel_no3()%>
<%= ds.getPtph_no1()%>
<%= ds.getPtph_no2()%>
<%= ds.getPtph_no3()%>
<%= ds.getEmail()%>
<%= ds.getAcctno()%>
<%= ds.getAcctbank()%>
<%= ds.getAcctdeps_pers()%>
<%= ds.getRemk()%>
<%= ds.getCnvsstafnm()%>
<%= ds.getCnvsin_cmpydt()%>
<%= ds.getCnvsprn()%>
<%= ds.getCnvstelno1()%>
<%= ds.getCnvstelno2()%>
<%= ds.getCnvstelno3()%>
<%= ds.getCnvsptph_no1()%>
<%= ds.getCnvsptph_no2()%>
<%= ds.getCnvsptph_no3()%>
<%= ds.getCnvsemail()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 05 18:50:51 KST 2004 */