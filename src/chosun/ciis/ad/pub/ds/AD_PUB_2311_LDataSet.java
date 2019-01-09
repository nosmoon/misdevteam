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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_2311_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tot_adv_amt;
	public String tot_fee_amt;
	public String tot_vat_amt;
	public String tot_misu_amt;
	public String tot_pubc;
	public String tot_adv_amt2;
	public String tot_fee_amt2;
	public String tot_vat_amt2;
	public String tot_misu_amt2;
	public String tot_pubc2;

	public AD_PUB_2311_LDataSet(){}
	public AD_PUB_2311_LDataSet(String errcode, String errmsg, String tot_adv_amt, String tot_fee_amt, String tot_vat_amt, String tot_misu_amt, String tot_pubc, String tot_adv_amt2, String tot_fee_amt2, String tot_vat_amt2, String tot_misu_amt2, String tot_pubc2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_adv_amt = tot_adv_amt;
		this.tot_fee_amt = tot_fee_amt;
		this.tot_vat_amt = tot_vat_amt;
		this.tot_misu_amt = tot_misu_amt;
		this.tot_pubc = tot_pubc;
		this.tot_adv_amt2 = tot_adv_amt2;
		this.tot_fee_amt2 = tot_fee_amt2;
		this.tot_vat_amt2 = tot_vat_amt2;
		this.tot_misu_amt2 = tot_misu_amt2;
		this.tot_pubc2 = tot_pubc2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_adv_amt(String tot_adv_amt){
		this.tot_adv_amt = tot_adv_amt;
	}

	public void setTot_fee_amt(String tot_fee_amt){
		this.tot_fee_amt = tot_fee_amt;
	}

	public void setTot_vat_amt(String tot_vat_amt){
		this.tot_vat_amt = tot_vat_amt;
	}

	public void setTot_misu_amt(String tot_misu_amt){
		this.tot_misu_amt = tot_misu_amt;
	}

	public void setTot_pubc(String tot_pubc){
		this.tot_pubc = tot_pubc;
	}

	public void setTot_adv_amt2(String tot_adv_amt2){
		this.tot_adv_amt2 = tot_adv_amt2;
	}

	public void setTot_fee_amt2(String tot_fee_amt2){
		this.tot_fee_amt2 = tot_fee_amt2;
	}

	public void setTot_vat_amt2(String tot_vat_amt2){
		this.tot_vat_amt2 = tot_vat_amt2;
	}

	public void setTot_misu_amt2(String tot_misu_amt2){
		this.tot_misu_amt2 = tot_misu_amt2;
	}

	public void setTot_pubc2(String tot_pubc2){
		this.tot_pubc2 = tot_pubc2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTot_adv_amt(){
		return this.tot_adv_amt;
	}

	public String getTot_fee_amt(){
		return this.tot_fee_amt;
	}

	public String getTot_vat_amt(){
		return this.tot_vat_amt;
	}

	public String getTot_misu_amt(){
		return this.tot_misu_amt;
	}

	public String getTot_pubc(){
		return this.tot_pubc;
	}

	public String getTot_adv_amt2(){
		return this.tot_adv_amt2;
	}

	public String getTot_fee_amt2(){
		return this.tot_fee_amt2;
	}

	public String getTot_vat_amt2(){
		return this.tot_vat_amt2;
	}

	public String getTot_misu_amt2(){
		return this.tot_misu_amt2;
	}

	public String getTot_pubc2(){
		return this.tot_pubc2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tot_adv_amt = Util.checkString(cstmt.getString(27));
		this.tot_fee_amt = Util.checkString(cstmt.getString(28));
		this.tot_vat_amt = Util.checkString(cstmt.getString(29));
		this.tot_misu_amt = Util.checkString(cstmt.getString(30));
		this.tot_pubc = Util.checkString(cstmt.getString(31));
		this.tot_adv_amt2 = Util.checkString(cstmt.getString(32));
		this.tot_fee_amt2 = Util.checkString(cstmt.getString(33));
		this.tot_vat_amt2 = Util.checkString(cstmt.getString(34));
		this.tot_misu_amt2 = Util.checkString(cstmt.getString(35));
		this.tot_pubc2 = Util.checkString(cstmt.getString(36));
		ResultSet rset0 = (ResultSet) cstmt.getObject(37);
		while(rset0.next()){
			AD_PUB_2311_LCURLISTRecord rec = new AD_PUB_2311_LCURLISTRecord();
			rec.sale_stmt_issu_yn = Util.checkString(rset0.getString("sale_stmt_issu_yn"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.advt_clsf = Util.checkString(rset0.getString("advt_clsf"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.publ_std = Util.checkString(rset0.getString("publ_std"));
			rec.issu_ser_no = Util.checkString(rset0.getString("issu_ser_no"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			rec.mchrg_nm = Util.checkString(rset0.getString("mchrg_nm"));
			rec.patr_chrg_info = Util.checkString(rset0.getString("patr_chrg_info"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.tot_rcpm_amt = Util.checkString(rset0.getString("tot_rcpm_amt"));
			rec.misu_tot_amt = Util.checkString(rset0.getString("misu_tot_amt"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.tax_email = Util.checkString(rset0.getString("tax_email"));
			rec.tax_clsf = Util.checkString(rset0.getString("tax_clsf"));
			rec.notaxrate_data_get_dt = Util.checkString(rset0.getString("notaxrate_data_get_dt"));
			rec.exrate = Util.checkString(rset0.getString("exrate"));
			rec.mony_kind = Util.checkString(rset0.getString("mony_kind"));
			rec.frex_cntr_amt = Util.checkString(rset0.getString("frex_cntr_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_2311_LDataSet ds = (AD_PUB_2311_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2311_LCURLISTRecord curlistRec = (AD_PUB_2311_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTot_adv_amt()%>
<%= ds.getTot_fee_amt()%>
<%= ds.getTot_vat_amt()%>
<%= ds.getTot_misu_amt()%>
<%= ds.getTot_pubc()%>
<%= ds.getTot_adv_amt2()%>
<%= ds.getTot_fee_amt2()%>
<%= ds.getTot_vat_amt2()%>
<%= ds.getTot_misu_amt2()%>
<%= ds.getTot_pubc2()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.sale_stmt_issu_yn%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.medi_nm%>
<%= curlistRec.advt_clsf%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.publ_std%>
<%= curlistRec.issu_ser_no%>
<%= curlistRec.slcrg_nm%>
<%= curlistRec.mchrg_nm%>
<%= curlistRec.patr_chrg_info%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn%>
<%= curlistRec.advt_fee%>
<%= curlistRec.vat%>
<%= curlistRec.tot_rcpm_amt%>
<%= curlistRec.misu_tot_amt%>
<%= curlistRec.fee%>
<%= curlistRec.tax_email%>
<%= curlistRec.tax_clsf%>
<%= curlistRec.notaxrate_data_get_dt%>
<%= curlistRec.exrate%>
<%= curlistRec.mony_kind%>
<%= curlistRec.frex_cntr_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 01 14:12:59 KST 2014 */