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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_4010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_4010_LDataSet(){}
	public IS_DEP_4010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			IS_DEP_4010_LCURLISTRecord rec = new IS_DEP_4010_LCURLISTRecord();
			rec.card_rcpm_reg_dt = Util.checkString(rset0.getString("card_rcpm_reg_dt"));
			rec.card_rcpm_reg_seq = Util.checkString(rset0.getString("card_rcpm_reg_seq"));
			rec.aprv_dt = Util.checkString(rset0.getString("aprv_dt"));
			rec.tmnl_no = Util.checkString(rset0.getString("tmnl_no"));
			rec.card_no = Util.checkString(rset0.getString("card_no"));
			rec.req_amt = Util.checkString(rset0.getString("req_amt"));
			rec.aprv_no = Util.checkString(rset0.getString("aprv_no"));
			rec.card_cmpy_cd = Util.checkString(rset0.getString("card_cmpy_cd"));
			rec.card_clsf = Util.checkString(rset0.getString("card_clsf"));
			rec.coms = Util.checkString(rset0.getString("coms"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.acct_mang_no = Util.checkString(rset0.getString("acct_mang_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.setoff_suply_amt = Util.checkString(rset0.getString("setoff_suply_amt"));
			rec.setoff_vat_amt = Util.checkString(rset0.getString("setoff_vat_amt"));
			rec.setoff_tot_rvord_amt = Util.checkString(rset0.getString("setoff_tot_rvord_amt"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.card_cmpy_cd_nm = Util.checkString(rset0.getString("card_cmpy_cd_nm"));
			rec.card_clsf_nm = Util.checkString(rset0.getString("card_clsf_nm"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_4010_LDataSet ds = (IS_DEP_4010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_4010_LCURLISTRecord curlistRec = (IS_DEP_4010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.card_rcpm_reg_dt%>
<%= curlistRec.card_rcpm_reg_seq%>
<%= curlistRec.aprv_dt%>
<%= curlistRec.tmnl_no%>
<%= curlistRec.card_no%>
<%= curlistRec.req_amt%>
<%= curlistRec.aprv_no%>
<%= curlistRec.card_cmpy_cd%>
<%= curlistRec.card_clsf%>
<%= curlistRec.coms%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.acct_mang_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.setoff_suply_amt%>
<%= curlistRec.setoff_vat_amt%>
<%= curlistRec.setoff_tot_rvord_amt%>
<%= curlistRec.proc_stat%>
<%= curlistRec.dept_cd%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.card_cmpy_cd_nm%>
<%= curlistRec.card_clsf_nm%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.rcpm_slip_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 09 22:51:35 KST 2012 */