/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.com.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_COM_1520_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String yyyy;
	public String seq;
	public String make_dt;
	public String rcv_plac;
	public String zip1;
	public String zip2;
	public String addr;
	public String dtls_addr;
	public String tel_no;
	public String fax_no;
	public String send_plac;
	public String titl;
	public String cont;

	public AD_COM_1520_SDataSet(){}
	public AD_COM_1520_SDataSet(String errcode, String errmsg, String yyyy, String seq, String make_dt, String rcv_plac, String zip1, String zip2, String addr, String dtls_addr, String tel_no, String fax_no, String send_plac, String titl, String cont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.yyyy = yyyy;
		this.seq = seq;
		this.make_dt = make_dt;
		this.rcv_plac = rcv_plac;
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.tel_no = tel_no;
		this.fax_no = fax_no;
		this.send_plac = send_plac;
		this.titl = titl;
		this.cont = cont;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setRcv_plac(String rcv_plac){
		this.rcv_plac = rcv_plac;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setSend_plac(String send_plac){
		this.send_plac = send_plac;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getRcv_plac(){
		return this.rcv_plac;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getSend_plac(){
		return this.send_plac;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.yyyy = Util.checkString(cstmt.getString(4));
		this.seq = Util.checkString(cstmt.getString(5));
		this.make_dt = Util.checkString(cstmt.getString(6));
		this.rcv_plac = Util.checkString(cstmt.getString(7));
		this.zip1 = Util.checkString(cstmt.getString(8));
		this.zip2 = Util.checkString(cstmt.getString(9));
		this.addr = Util.checkString(cstmt.getString(10));
		this.dtls_addr = Util.checkString(cstmt.getString(11));
		this.tel_no = Util.checkString(cstmt.getString(12));
		this.fax_no = Util.checkString(cstmt.getString(13));
		this.send_plac = Util.checkString(cstmt.getString(14));
		this.titl = Util.checkString(cstmt.getString(15));
		this.cont = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_COM_1520_SDataSet ds = (AD_COM_1520_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getYyyy()%>
<%= ds.getSeq()%>
<%= ds.getMake_dt()%>
<%= ds.getRcv_plac()%>
<%= ds.getZip1()%>
<%= ds.getZip2()%>
<%= ds.getAddr()%>
<%= ds.getDtls_addr()%>
<%= ds.getTel_no()%>
<%= ds.getFax_no()%>
<%= ds.getSend_plac()%>
<%= ds.getTitl()%>
<%= ds.getCont()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 14:35:19 KST 2009 */