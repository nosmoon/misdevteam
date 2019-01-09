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


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_1210_LDataSet(){}
	public HD_YADJM_1210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_YADJM_1210_LCURLISTRecord rec = new HD_YADJM_1210_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.adjm_rvrs_yy = Util.checkString(rset0.getString("adjm_rvrs_yy"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.offic_nm = Util.checkString(rset0.getString("offic_nm"));
			rec.cmpy_nm = Util.checkString(rset0.getString("cmpy_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.impt_saly = Util.checkString(rset0.getString("impt_saly"));
			rec.non_tax_prod = Util.checkString(rset0.getString("non_tax_prod"));
			rec.non_tax_frnc = Util.checkString(rset0.getString("non_tax_frnc"));
			rec.deci_incm_tax = Util.checkString(rset0.getString("deci_incm_tax"));
			rec.deci_res_tax = Util.checkString(rset0.getString("deci_res_tax"));
			rec.impt_bns = Util.checkString(rset0.getString("impt_bns"));
			rec.bns_incm_tax_tot_amt = Util.checkString(rset0.getString("bns_incm_tax_tot_amt"));
			rec.bns_res_tax_tot_amt = Util.checkString(rset0.getString("bns_res_tax_tot_amt"));
			rec.bns_deci_farm_spc_tax = Util.checkString(rset0.getString("bns_deci_farm_spc_tax"));
			rec.aprv_bns_tot_amt = Util.checkString(rset0.getString("aprv_bns_tot_amt"));
			rec.stok_num_shet_prft_amt = Util.checkString(rset0.getString("stok_num_shet_prft_amt"));
			rec.np_pymt_amt = Util.checkString(rset0.getString("np_pymt_amt"));
			rec.hosp_insr_fee = Util.checkString(rset0.getString("hosp_insr_fee"));
			rec.emp_insr_fee = Util.checkString(rset0.getString("emp_insr_fee"));
			rec.etc_insr_fee = Util.checkString(rset0.getString("etc_insr_fee"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_1210_LDataSet ds = (HD_YADJM_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_1210_LCURLISTRecord curlistRec = (HD_YADJM_1210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.adjm_rvrs_yy%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.seq%>
<%= curlistRec.offic_nm%>
<%= curlistRec.cmpy_nm%>
<%= curlistRec.ern%>
<%= curlistRec.impt_saly%>
<%= curlistRec.non_tax_prod%>
<%= curlistRec.non_tax_frnc%>
<%= curlistRec.deci_incm_tax%>
<%= curlistRec.deci_res_tax%>
<%= curlistRec.impt_bns%>
<%= curlistRec.bns_incm_tax_tot_amt%>
<%= curlistRec.bns_res_tax_tot_amt%>
<%= curlistRec.bns_deci_farm_spc_tax%>
<%= curlistRec.aprv_bns_tot_amt%>
<%= curlistRec.stok_num_shet_prft_amt%>
<%= curlistRec.np_pymt_amt%>
<%= curlistRec.hosp_insr_fee%>
<%= curlistRec.emp_insr_fee%>
<%= curlistRec.etc_insr_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 22:25:50 KST 2009 */