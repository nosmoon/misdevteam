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


package chosun.ciis.hd.ddemp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_6002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DDEMP_6002_LDataSet(){}
	public HD_DDEMP_6002_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			HD_DDEMP_6002_LCURLISTRecord rec = new HD_DDEMP_6002_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset0.getString("supr_dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.frlc_no = Util.checkString(rset0.getString("frlc_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.chrg_posk_cd = Util.checkString(rset0.getString("chrg_posk_cd"));
			rec.chrg_posk_cd_nm = Util.checkString(rset0.getString("chrg_posk_cd_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.thrw_pgm = Util.checkString(rset0.getString("thrw_pgm"));
			rec.thrw_pgm_nm = Util.checkString(rset0.getString("thrw_pgm_nm"));
			rec.medi_cd2 = Util.checkString(rset0.getString("medi_cd2"));
			rec.thrw_pgm2 = Util.checkString(rset0.getString("thrw_pgm2"));
			rec.thrw_pgm2_nm = Util.checkString(rset0.getString("thrw_pgm2_nm"));
			rec.cntr_dt = Util.checkString(rset0.getString("cntr_dt"));
			rec.cntr_expr_dt = Util.checkString(rset0.getString("cntr_expr_dt"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.work_yn = Util.checkString(rset0.getString("work_yn"));
			rec.servcost = Util.checkString(rset0.getString("servcost"));
			rec.pay_cycl = Util.checkString(rset0.getString("pay_cycl"));
			rec.etc_pay_cond = Util.checkString(rset0.getString("etc_pay_cond"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.draft_no = Util.checkString(rset0.getString("draft_no"));
			rec.draft_dept_cd = Util.checkString(rset0.getString("draft_dept_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.setl_bank = Util.checkString(rset0.getString("setl_bank"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.incm_clsf_cd = Util.checkString(rset0.getString("incm_clsf_cd"));
			rec.incm_clsf_nm = Util.checkString(rset0.getString("incm_clsf_nm"));
			rec.chrg_posk_nm = Util.checkString(rset0.getString("chrg_posk_nm"));
			rec.all_insr_dduc_yn = Util.checkString(rset0.getString("all_insr_dduc_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DDEMP_6002_LDataSet ds = (HD_DDEMP_6002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DDEMP_6002_LCURLISTRecord curlistRec = (HD_DDEMP_6002_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.supr_dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.frlc_no%>
<%= curlistRec.flnm%>
<%= curlistRec.chrg_posk_cd%>
<%= curlistRec.chrg_posk_cd_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.thrw_pgm%>
<%= curlistRec.thrw_pgm_nm%>
<%= curlistRec.medi_cd2%>
<%= curlistRec.thrw_pgm2%>
<%= curlistRec.thrw_pgm2_nm%>
<%= curlistRec.cntr_dt%>
<%= curlistRec.cntr_expr_dt%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.work_yn%>
<%= curlistRec.servcost%>
<%= curlistRec.pay_cycl%>
<%= curlistRec.etc_pay_cond%>
<%= curlistRec.prn%>
<%= curlistRec.tel_no%>
<%= curlistRec.addr%>
<%= curlistRec.draft_no%>
<%= curlistRec.draft_dept_cd%>
<%= curlistRec.mang_no%>
<%= curlistRec.setl_bank%>
<%= curlistRec.acct_no%>
<%= curlistRec.bank_nm%>
<%= curlistRec.incm_clsf_cd%>
<%= curlistRec.incm_clsf_nm%>
<%= curlistRec.chrg_posk_nm%>
<%= curlistRec.all_insr_dduc_yn%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 09 16:44:00 KST 2018 */