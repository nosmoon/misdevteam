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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1520_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String cmpy_cd;
	public String advcs_cd;
	public String advcs_nm;
	public String eps_no;
	public String presi_nm;
	public String tel_no;
	public String fax_no;
	public String sms_ptph_no;
	public String addr;
	public String dtls_addr;
	public String zip_1;
	public String zip_2;
	public String bizcond;
	public String item;
	public String remk;
	public String indt_cd;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public IS_BAS_1520_SDataSet(){}
	public IS_BAS_1520_SDataSet(String errcode, String errmsg, String cmpy_cd, String advcs_cd, String advcs_nm, String eps_no, String presi_nm, String tel_no, String fax_no, String sms_ptph_no, String addr, String dtls_addr, String zip_1, String zip_2, String bizcond, String item, String remk, String indt_cd, String incmg_pers_ip, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cmpy_cd = cmpy_cd;
		this.advcs_cd = advcs_cd;
		this.advcs_nm = advcs_nm;
		this.eps_no = eps_no;
		this.presi_nm = presi_nm;
		this.tel_no = tel_no;
		this.fax_no = fax_no;
		this.sms_ptph_no = sms_ptph_no;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.zip_1 = zip_1;
		this.zip_2 = zip_2;
		this.bizcond = bizcond;
		this.item = item;
		this.remk = remk;
		this.indt_cd = indt_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setSms_ptph_no(String sms_ptph_no){
		this.sms_ptph_no = sms_ptph_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIndt_cd(String indt_cd){
		this.indt_cd = indt_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getSms_ptph_no(){
		return this.sms_ptph_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIndt_cd(){
		return this.indt_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.cmpy_cd = Util.checkString(cstmt.getString(5));
		this.advcs_cd = Util.checkString(cstmt.getString(6));
		this.advcs_nm = Util.checkString(cstmt.getString(7));
		this.eps_no = Util.checkString(cstmt.getString(8));
		this.presi_nm = Util.checkString(cstmt.getString(9));
		this.tel_no = Util.checkString(cstmt.getString(10));
		this.fax_no = Util.checkString(cstmt.getString(11));
		this.sms_ptph_no = Util.checkString(cstmt.getString(12));
		this.addr = Util.checkString(cstmt.getString(13));
		this.dtls_addr = Util.checkString(cstmt.getString(14));
		this.zip_1 = Util.checkString(cstmt.getString(15));
		this.zip_2 = Util.checkString(cstmt.getString(16));
		this.bizcond = Util.checkString(cstmt.getString(17));
		this.item = Util.checkString(cstmt.getString(18));
		this.remk = Util.checkString(cstmt.getString(19));
		this.indt_cd = Util.checkString(cstmt.getString(20));
		this.incmg_pers_ip = Util.checkString(cstmt.getString(21));
		this.incmg_pers = Util.checkString(cstmt.getString(22));
		this.incmg_dt_tm = Util.checkString(cstmt.getString(23));
		this.chg_pers = Util.checkString(cstmt.getString(24));
		this.chg_dt_tm = Util.checkString(cstmt.getString(25));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BAS_1520_SDataSet ds = (IS_BAS_1520_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCmpy_cd()%>
<%= ds.getAdvcs_cd()%>
<%= ds.getAdvcs_nm()%>
<%= ds.getEps_no()%>
<%= ds.getPresi_nm()%>
<%= ds.getTel_no()%>
<%= ds.getFax_no()%>
<%= ds.getSms_ptph_no()%>
<%= ds.getAddr()%>
<%= ds.getDtls_addr()%>
<%= ds.getZip_1()%>
<%= ds.getZip_2()%>
<%= ds.getBizcond()%>
<%= ds.getItem()%>
<%= ds.getRemk()%>
<%= ds.getIndt_cd()%>
<%= ds.getIncmg_pers_ip()%>
<%= ds.getIncmg_pers()%>
<%= ds.getIncmg_dt_tm()%>
<%= ds.getChg_pers()%>
<%= ds.getChg_dt_tm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 25 22:33:43 KST 2012 */