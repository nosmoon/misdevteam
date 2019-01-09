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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7202_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_7202_LDataSet(){}
	public HD_INFO_7202_LDataSet(String errcode, String errmsg){
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
			HD_INFO_7202_LCURLISTRecord rec = new HD_INFO_7202_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.frlc_no = Util.checkString(rset0.getString("frlc_no"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.chrg_posk_cd = Util.checkString(rset0.getString("chrg_posk_cd"));
			rec.chrg_posk_nm = Util.checkString(rset0.getString("chrg_posk_nm"));
			rec.thrw_pgm_nm = Util.checkString(rset0.getString("thrw_pgm_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.thrw_pgm = Util.checkString(rset0.getString("thrw_pgm"));
			rec.duty_dds = Util.checkString(rset0.getString("duty_dds"));
			rec.cntr_dt = Util.checkString(rset0.getString("cntr_dt"));
			rec.cntr_expr_dt = Util.checkString(rset0.getString("cntr_expr_dt"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.pay_cycl = Util.checkString(rset0.getString("pay_cycl"));
			rec.pay_cycl_nm = Util.checkString(rset0.getString("pay_cycl_nm"));
			rec.servcost = Util.checkString(rset0.getString("servcost"));
			rec.base_amt = Util.checkString(rset0.getString("base_amt"));
			rec.incm_clsf_cd = Util.checkString(rset0.getString("incm_clsf_cd"));
			rec.incm_clsf_nm = Util.checkString(rset0.getString("incm_clsf_nm"));
			rec.draft_no = Util.checkString(rset0.getString("draft_no"));
			rec.draft_dept_cd = Util.checkString(rset0.getString("draft_dept_cd"));
			rec.pay_mm = Util.checkString(rset0.getString("pay_mm"));
			rec.setl_bank = Util.checkString(rset0.getString("setl_bank"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_7202_LDataSet ds = (HD_INFO_7202_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_7202_LCURLISTRecord curlistRec = (HD_INFO_7202_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.frlc_no%>
<%= curlistRec.mang_no%>
<%= curlistRec.flnm%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.chrg_posk_cd%>
<%= curlistRec.chrg_posk_nm%>
<%= curlistRec.thrw_pgm_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.thrw_pgm%>
<%= curlistRec.duty_dds%>
<%= curlistRec.cntr_dt%>
<%= curlistRec.cntr_expr_dt%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.pay_cycl%>
<%= curlistRec.pay_cycl_nm%>
<%= curlistRec.servcost%>
<%= curlistRec.base_amt%>
<%= curlistRec.incm_clsf_cd%>
<%= curlistRec.incm_clsf_nm%>
<%= curlistRec.draft_no%>
<%= curlistRec.draft_dept_cd%>
<%= curlistRec.pay_mm%>
<%= curlistRec.setl_bank%>
<%= curlistRec.acct_no%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 13 14:52:36 KST 2018 */