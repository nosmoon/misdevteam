/***************************************************************************************************
* 파일명 : .java
* 기능 : 위수탁세금계산서 업로드
* 작성일자 : 2011.02.07
* 작성자 : KBS
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
import chosun.ciis.ad.tax.rec.AD_TAX_2751_LCURLISTRecord;

/**
 * 
 */


public class AD_TAX_2751_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_TAX_2751_LDataSet(){}
	public AD_TAX_2751_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_TAX_2751_LCURLISTRecord rec = new AD_TAX_2751_LCURLISTRecord();
			rec.issu_yn 			= Util.checkString(rset0.getString("issu_yn"));
			rec.elec_tax_comp_cd	= Util.checkString(rset0.getString("elec_tax_comp_cd"));
			rec.elec_tax_comp_nm 	= Util.checkString(rset0.getString("elec_tax_comp_nm"));
			rec.make_dt 			= Util.checkString(rset0.getString("make_dt"));
			rec.byr_dlco_no 		= Util.checkString(rset0.getString("byr_dlco_no"));
			rec.byr_dlco_nm 		= Util.checkString(rset0.getString("byr_dlco_nm"));
			rec.byr_ern 			= Util.checkString(rset0.getString("byr_ern"));
			rec.broker_dlco_no		= Util.checkString(rset0.getString("broker_dlco_no"));
			rec.broker_dlco_nm 		= Util.checkString(rset0.getString("broker_dlco_nm"));
			rec.broker_ern 			= Util.checkString(rset0.getString("broker_ern"));
			rec.suply_amt 			= Util.checkString(rset0.getString("suply_amt"));
			rec.vat_amt 			= Util.checkString(rset0.getString("vat_amt"));
			rec.tot_amt 			= Util.checkString(rset0.getString("tot_amt"));
			rec.approve_id			= Util.checkString(rset0.getString("approve_id"));
			rec.byr_email			= Util.checkString(rset0.getString("byr_email"));
			rec.remk				= Util.checkString(rset0.getString("remk"));
			rec.occr_dt				= Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq			= Util.checkString(rset0.getString("occr_seq"));
			rec.incmg_pers			= Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_pers_nm		= Util.checkString(rset0.getString("incmg_pers_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_TAX_1610_LDataSet ds = (AD_TAX_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_TAX_1610_LCURLISTRecord curlistRec = (AD_TAX_1610_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.medi_nm%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_fee%>
<%= curlistRec.agn_nm%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.notaxrate_clsf%>
<%= curlistRec.notaxrate_dt%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.clos_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 13:48:46 KST 2009 */