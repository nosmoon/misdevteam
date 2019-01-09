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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_2010_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2010_LDataSet(){}
	public AD_BAS_2010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_BAS_2010_LCURLISTRecord rec = new AD_BAS_2010_LCURLISTRecord();
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.mang_mortg_surp_amt = Util.checkString(rset0.getString("mang_mortg_surp_amt"));
			rec.busn_mortg_surp_amt = Util.checkString(rset0.getString("busn_mortg_surp_amt"));
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.unrcp_tot_amt = Util.checkString(rset0.getString("unrcp_tot_amt"));
			rec.un_repay_dhon_bal = Util.checkString(rset0.getString("un_repay_dhon_bal"));
			rec.mang_expt_ufth_bond_amt = Util.checkString(rset0.getString("mang_expt_ufth_bond_amt"));
			rec.busn_expt_ufth_bond_amt = Util.checkString(rset0.getString("busn_expt_ufth_bond_amt"));
			rec.mortg_amt = Util.checkString(rset0.getString("mortg_amt"));
			rec.un_pay_fee = Util.checkString(rset0.getString("un_pay_fee"));
			rec.precpt_amt = Util.checkString(rset0.getString("precpt_amt"));
			rec.acml_amt = Util.checkString(rset0.getString("acml_amt"));
			rec.etc_mortg_amt = Util.checkString(rset0.getString("etc_mortg_amt"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2010_LDataSet ds = (AD_BAS_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_2010_LCURLISTRecord curlistRec = (AD_BAS_2010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_nm%>
<%= curlistRec.mang_mortg_surp_amt%>
<%= curlistRec.busn_mortg_surp_amt%>
<%= curlistRec.basi_dt%>
<%= curlistRec.unrcp_tot_amt%>
<%= curlistRec.un_repay_dhon_bal%>
<%= curlistRec.mang_expt_ufth_bond_amt%>
<%= curlistRec.busn_expt_ufth_bond_amt%>
<%= curlistRec.mortg_amt%>
<%= curlistRec.un_pay_fee%>
<%= curlistRec.precpt_amt%>
<%= curlistRec.acml_amt%>
<%= curlistRec.etc_mortg_amt%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.mchrg_pers%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 10:58:49 KST 2009 */