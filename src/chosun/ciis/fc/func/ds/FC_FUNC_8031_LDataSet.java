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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_8031_LDataSet(){}
	public FC_FUNC_8031_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_FUNC_8031_LCURLIST1Record rec = new FC_FUNC_8031_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.cntr_clsf_cd = Util.checkString(rset0.getString("cntr_clsf_cd"));
			rec.leas_clsf_cd = Util.checkString(rset0.getString("leas_clsf_cd"));
			rec.leas_no = Util.checkString(rset0.getString("leas_no"));
			rec.leas_nm = Util.checkString(rset0.getString("leas_nm"));
			rec.frcr_amt = Util.checkString(rset0.getString("frcr_amt"));
			rec.pay_plan_tms = Util.checkString(rset0.getString("pay_plan_tms"));
			rec.leas_stat_cd = Util.checkString(rset0.getString("leas_stat_cd"));
			rec.leas_stat_cdnm = Util.checkString(rset0.getString("leas_stat_cdnm"));
			rec.pymt_cnt = Util.checkString(rset0.getString("pymt_cnt"));
			rec.leas_hire_clsf_cd = Util.checkString(rset0.getString("leas_hire_clsf_cd"));
			rec.leas_hire_clsf_cdnm = Util.checkString(rset0.getString("leas_hire_clsf_cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			FC_FUNC_8031_LCURLIST2Record rec = new FC_FUNC_8031_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.leas_clsf_cd = Util.checkString(rset1.getString("leas_clsf_cd"));
			rec.leas_no = Util.checkString(rset1.getString("leas_no"));
			rec.pay_cost_clsf = Util.checkString(rset1.getString("pay_cost_clsf"));
			rec.pay_cost_clsf_cdnm = Util.checkString(rset1.getString("pay_cost_clsf_cdnm"));
			rec.hsty_seq = Util.checkString(rset1.getString("hsty_seq"));
			rec.pymt_plan_dt = Util.checkString(rset1.getString("pymt_plan_dt"));
			rec.prv_pymt_plan_prcp = Util.checkString(rset1.getString("prv_pymt_plan_prcp"));
			rec.pymt_plan_prcp = Util.checkString(rset1.getString("pymt_plan_prcp"));
			rec.pymt_plan_int = Util.checkString(rset1.getString("pymt_plan_int"));
			rec.bal = Util.checkString(rset1.getString("bal"));
			rec.slip_no = Util.checkString(rset1.getString("slip_no"));
			rec.pymt_yn = Util.checkString(rset1.getString("pymt_yn"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_8031_LDataSet ds = (FC_FUNC_8031_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8031_LCURLIST1Record curlist1Rec = (FC_FUNC_8031_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_FUNC_8031_LCURLIST2Record curlist2Rec = (FC_FUNC_8031_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.cntr_clsf_cd%>
<%= curlist1Rec.leas_clsf_cd%>
<%= curlist1Rec.leas_no%>
<%= curlist1Rec.leas_nm%>
<%= curlist1Rec.frcr_amt%>
<%= curlist1Rec.pay_plan_tms%>
<%= curlist1Rec.leas_stat_cd%>
<%= curlist1Rec.leas_stat_cdnm%>
<%= curlist1Rec.pymt_cnt%>
<%= curlist1Rec.leas_hire_clsf_cd%>
<%= curlist1Rec.leas_hire_clsf_cdnm%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.leas_clsf_cd%>
<%= curlist2Rec.leas_no%>
<%= curlist2Rec.pay_cost_clsf%>
<%= curlist2Rec.pay_cost_clsf_cdnm%>
<%= curlist2Rec.hsty_seq%>
<%= curlist2Rec.pymt_plan_dt%>
<%= curlist2Rec.prv_pymt_plan_prcp%>
<%= curlist2Rec.pymt_plan_prcp%>
<%= curlist2Rec.pymt_plan_int%>
<%= curlist2Rec.bal%>
<%= curlist2Rec.slip_no%>
<%= curlist2Rec.pymt_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 11:24:24 KST 2009 */