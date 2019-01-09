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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1101_LDataSet(){}
	public EN_INNEXP_1101_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			EN_INNEXP_1101_LCURLISTRecord rec = new EN_INNEXP_1101_LCURLISTRecord();
			rec.slip_occr_no = Util.checkString(rset0.getString("slip_occr_no"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.tax_stmt_aprv_yn = Util.checkString(rset0.getString("tax_stmt_aprv_yn"));
			rec.tax_suply_amt = Util.checkString(rset0.getString("tax_suply_amt"));
			rec.tax_vat_amt = Util.checkString(rset0.getString("tax_vat_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.slip_clsf_cd = Util.checkString(rset0.getString("slip_clsf_cd"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			rec.deal_clsf = Util.checkString(rset0.getString("deal_clsf"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.canc_dt = Util.checkString(rset0.getString("canc_dt"));
			rec.vexc_cmpy_cd = Util.checkString(rset0.getString("vexc_cmpy_cd"));
			rec.issu_pers_emp_no = Util.checkString(rset0.getString("issu_pers_emp_no"));
			rec.issu_pers_emp_nm = Util.checkString(rset0.getString("issu_pers_emp_nm"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.ask_emp_no = Util.checkString(rset0.getString("ask_emp_no"));
			rec.ask_dept_cd = Util.checkString(rset0.getString("ask_dept_cd"));
			rec.re_issu_resn_cd = Util.checkString(rset0.getString("re_issu_resn_cd"));
			rec.issu_tms = Util.checkString(rset0.getString("issu_tms"));
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_pers_nm = Util.checkString(rset0.getString("chg_pers_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_INNEXP_1101_LDataSet ds = (EN_INNEXP_1101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_1101_LCURLISTRecord curlistRec = (EN_INNEXP_1101_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_occr_no%>
<%= curlistRec.make_dt%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.presi_nm%>
<%= curlistRec.tax_stmt_aprv_yn%>
<%= curlistRec.tax_suply_amt%>
<%= curlistRec.tax_vat_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.slip_clsf_cd%>
<%= curlistRec.prof_type_cd%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.erplace_cd%>
<%= curlistRec.deal_clsf%>
<%= curlistRec.addr%>
<%= curlistRec.bizcond%>
<%= curlistRec.item%>
<%= curlistRec.titl%>
<%= curlistRec.canc_dt%>
<%= curlistRec.vexc_cmpy_cd%>
<%= curlistRec.issu_pers_emp_no%>
<%= curlistRec.issu_pers_emp_nm%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.remk%>
<%= curlistRec.ask_emp_no%>
<%= curlistRec.ask_dept_cd%>
<%= curlistRec.re_issu_resn_cd%>
<%= curlistRec.issu_tms%>
<%= curlistRec.chg_dt%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_pers_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 16:21:54 KST 2009 */