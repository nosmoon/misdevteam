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


package chosun.ciis.ad.tax.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_TAX_1011_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String dlco_no;
	public String ern;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String corp_clsf;
	public String elec_tax_comp_cd;
	public String email_id;

	public AD_TAX_1011_SDataSet(){}
	public AD_TAX_1011_SDataSet(String errcode, String errmsg, String dlco_no, String ern, String dlco_nm, String dlco_abrv_nm, String presi_nm, String addr, String bizcond, String item, String corp_clsf, String elec_tax_comp_cd, String email_id){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dlco_no = dlco_no;
		this.ern = ern;
		this.dlco_nm = dlco_nm;
		this.dlco_abrv_nm = dlco_abrv_nm;
		this.presi_nm = presi_nm;
		this.addr = addr;
		this.bizcond = bizcond;
		this.item = item;
		this.corp_clsf = corp_clsf;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.email_id = email_id;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setCorp_clsf(String corp_clsf){
		this.corp_clsf = corp_clsf;
	}
	
	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}
	
	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getCorp_clsf(){
		return this.corp_clsf;
	}
	
	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}
	
	public String getEmail_id(){
		return this.email_id;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dlco_no = Util.checkString(cstmt.getString(4));
		this.ern = Util.checkString(cstmt.getString(5));
		this.dlco_nm = Util.checkString(cstmt.getString(6));
		this.dlco_abrv_nm = Util.checkString(cstmt.getString(7));
		this.presi_nm = Util.checkString(cstmt.getString(8));
		this.addr = Util.checkString(cstmt.getString(9));
		this.bizcond = Util.checkString(cstmt.getString(10));
		this.item = Util.checkString(cstmt.getString(11));
		this.corp_clsf = Util.checkString(cstmt.getString(12));
		this.elec_tax_comp_cd = Util.checkString(cstmt.getString(13));
		this.email_id = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_CO_9004_SDataSet ds = (AD_CO_9004_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDlco_no()%>
<%= ds.getErn()%>
<%= ds.getDlco_nm()%>
<%= ds.getDlco_abrv_nm()%>
<%= ds.getPresi_nm()%>
<%= ds.getAddr()%>
<%= ds.getBizcond()%>
<%= ds.getItem()%>
<%= ds.getCorp_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 09 10:34:20 KST 2009 */