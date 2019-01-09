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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.tax.rec.AD_TAX_1710_LCURLISTRecord;

/**
 * 
 */


public class AD_TAX_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String basi_dt;

	public AD_TAX_1710_LDataSet(){}
	public AD_TAX_1710_LDataSet(String errcode, String errmsg, String basi_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.basi_dt = basi_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.basi_dt = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			AD_TAX_1710_LCURLISTRecord rec = new AD_TAX_1710_LCURLISTRecord();
			rec.pay_clsf = Util.checkString(rset0.getString("pay_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.fee_pay_stat = Util.checkString(rset0.getString("fee_pay_stat"));
			rec.unrcp_amt = Util.checkString(rset0.getString("unrcp_amt"));
			rec.max_mtry_dt = Util.checkString(rset0.getString("max_mtry_dt"));
			rec.rcpm_clsf = Util.checkString(rset0.getString("rcpm_clsf"));
			rec.temp_mtry_dt = Util.checkString(rset0.getString("temp_mtry_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_TAX_1710_LDataSet ds = (AD_TAX_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_1710_LCURLISTRecord curlistRec = (AD_TAX_1710_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBasi_dt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.pay_clsf%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.prof_type_cd%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.make_dt%>
<%= curlistRec.suply_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.pay_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.medi_nm%>
<%= curlistRec.fee_pay_stat%>
<%= curlistRec.unrcp_amt%>
<%= curlistRec.max_mtry_dt%>
<%= curlistRec.rcpm_clsf%>
<%= curlistRec.temp_mtry_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 16 20:50:27 KST 2009 */