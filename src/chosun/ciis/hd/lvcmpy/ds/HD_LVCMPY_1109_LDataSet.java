/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1109_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_1109_LDataSet(){}
	public HD_LVCMPY_1109_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_1109_LCURLISTRecord rec = new HD_LVCMPY_1109_LCURLISTRecord();
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.rvrs_prd_frdt = Util.checkString(rset0.getString("rvrs_prd_frdt"));
			rec.rvrs_prd_todt = Util.checkString(rset0.getString("rvrs_prd_todt"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.last_midl_adjm_dt = Util.checkString(rset0.getString("last_midl_adjm_dt"));
			rec.real_lvcmpy_dt = Util.checkString(rset0.getString("real_lvcmpy_dt"));
			rec.cont_svc_yys = Util.checkString(rset0.getString("cont_svc_yys"));
			rec.cont_svc_yy = Util.checkString(rset0.getString("cont_svc_yy"));
			rec.cont_svc_dd = Util.checkString(rset0.getString("cont_svc_dd"));
			rec.last_mm_saly_1 = Util.checkString(rset0.getString("last_mm_saly_1"));
			rec.last_mm_saly_2 = Util.checkString(rset0.getString("last_mm_saly_2"));
			rec.last_mm_saly_3 = Util.checkString(rset0.getString("last_mm_saly_3"));
			rec.last_mm_saly_4 = Util.checkString(rset0.getString("last_mm_saly_4"));
			rec.last_mm_saly_add = Util.checkString(rset0.getString("last_mm_saly_add"));
			rec.last_mm_alon_1 = Util.checkString(rset0.getString("last_mm_alon_1"));
			rec.last_mm_alon_2 = Util.checkString(rset0.getString("last_mm_alon_2"));
			rec.last_mm_alon_3 = Util.checkString(rset0.getString("last_mm_alon_3"));
			rec.last_mm_alon_4 = Util.checkString(rset0.getString("last_mm_alon_4"));
			rec.last_mm_alon_add = Util.checkString(rset0.getString("last_mm_alon_add"));
			rec.year_alon_pay_yymm = Util.checkString(rset0.getString("year_alon_pay_yymm"));
			rec.year_alon_pay_amt = Util.checkString(rset0.getString("year_alon_pay_amt"));
			rec.mm_avg_charg_amt = Util.checkString(rset0.getString("mm_avg_charg_amt"));
			rec.lvcmpy_amt = Util.checkString(rset0.getString("lvcmpy_amt"));
			rec.lvcmpy_mm_saly = Util.checkString(rset0.getString("lvcmpy_mm_saly"));
			rec.yymm_alon_1 = Util.checkString(rset0.getString("yymm_alon_1"));
			rec.year_cnt_1 = Util.checkString(rset0.getString("year_cnt_1"));
			rec.duty_cnt_1 = Util.checkString(rset0.getString("duty_cnt_1"));
			rec.em_cnt_1 = Util.checkString(rset0.getString("em_cnt_1"));
			rec.yy_alon_use_stot_1 = Util.checkString(rset0.getString("yy_alon_use_stot_1"));
			rec.yy_alon_2 = Util.checkString(rset0.getString("yy_alon_2"));
			rec.year_cnt_2 = Util.checkString(rset0.getString("year_cnt_2"));
			rec.duty_cnt_2 = Util.checkString(rset0.getString("duty_cnt_2"));
			rec.em_cnt_2 = Util.checkString(rset0.getString("em_cnt_2"));
			rec.yy_alon_use_stot_2 = Util.checkString(rset0.getString("yy_alon_use_stot_2"));
			rec.un_pay_alon = Util.checkString(rset0.getString("un_pay_alon"));
			rec.lvcmpy_add_amt = Util.checkString(rset0.getString("lvcmpy_add_amt"));
			rec.nm_lvcmpy_add_amt = Util.checkString(rset0.getString("nm_lvcmpy_add_amt"));
			rec.cont_svc_yys_2012 = Util.checkString(rset0.getString("cont_svc_yys_2012"));
			rec.cont_svc_yys_2013 = Util.checkString(rset0.getString("cont_svc_yys_2013"));
			rec.avg_wag_dt = Util.checkString(rset0.getString("avg_wag_dt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_LVCMPY_1109_LCURLIST2Record rec = new HD_LVCMPY_1109_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.lvcmpy_dt = Util.checkString(rset1.getString("lvcmpy_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.lvcmpy_clsf = Util.checkString(rset1.getString("lvcmpy_clsf"));
			rec.saly_pay_mm = Util.checkString(rset1.getString("saly_pay_mm"));
			rec.saly_fr_dt = Util.checkString(rset1.getString("saly_fr_dt"));
			rec.saly_to_dt = Util.checkString(rset1.getString("saly_to_dt"));
			rec.saly_cnt = Util.checkString(rset1.getString("saly_cnt"));
			rec.pay_saly1 = Util.checkString(rset1.getString("pay_saly1"));
			rec.pay_saly2 = Util.checkString(rset1.getString("pay_saly2"));
			rec.hody_alon1 = Util.checkString(rset1.getString("hody_alon1"));
			rec.hody_alon2 = Util.checkString(rset1.getString("hody_alon2"));
			rec.yymm_alon1 = Util.checkString(rset1.getString("yymm_alon1"));
			rec.yymm_alon2 = Util.checkString(rset1.getString("yymm_alon2"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_1109_LDataSet ds = (HD_LVCMPY_1109_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_1109_LCURLISTRecord curlistRec = (HD_LVCMPY_1109_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_LVCMPY_1109_LCURLIST2Record curlist2Rec = (HD_LVCMPY_1109_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.rvrs_prd_frdt%>
<%= curlistRec.rvrs_prd_todt%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.last_midl_adjm_dt%>
<%= curlistRec.real_lvcmpy_dt%>
<%= curlistRec.cont_svc_yys%>
<%= curlistRec.cont_svc_yy%>
<%= curlistRec.cont_svc_dd%>
<%= curlistRec.last_mm_saly_1%>
<%= curlistRec.last_mm_saly_2%>
<%= curlistRec.last_mm_saly_3%>
<%= curlistRec.last_mm_saly_4%>
<%= curlistRec.last_mm_saly_add%>
<%= curlistRec.last_mm_alon_1%>
<%= curlistRec.last_mm_alon_2%>
<%= curlistRec.last_mm_alon_3%>
<%= curlistRec.last_mm_alon_4%>
<%= curlistRec.last_mm_alon_add%>
<%= curlistRec.year_alon_pay_yymm%>
<%= curlistRec.year_alon_pay_amt%>
<%= curlistRec.mm_avg_charg_amt%>
<%= curlistRec.lvcmpy_amt%>
<%= curlistRec.lvcmpy_mm_saly%>
<%= curlistRec.yymm_alon_1%>
<%= curlistRec.year_cnt_1%>
<%= curlistRec.duty_cnt_1%>
<%= curlistRec.em_cnt_1%>
<%= curlistRec.yy_alon_use_stot_1%>
<%= curlistRec.yy_alon_2%>
<%= curlistRec.year_cnt_2%>
<%= curlistRec.duty_cnt_2%>
<%= curlistRec.em_cnt_2%>
<%= curlistRec.yy_alon_use_stot_2%>
<%= curlistRec.un_pay_alon%>
<%= curlistRec.lvcmpy_add_amt%>
<%= curlistRec.nm_lvcmpy_add_amt%>
<%= curlistRec.cont_svc_yys_2012%>
<%= curlistRec.cont_svc_yys_2013%>
<%= curlistRec.avg_wag_dt%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.emp_no%>
<%= curlist2Rec.lvcmpy_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.lvcmpy_clsf%>
<%= curlist2Rec.saly_pay_mm%>
<%= curlist2Rec.saly_fr_dt%>
<%= curlist2Rec.saly_to_dt%>
<%= curlist2Rec.saly_cnt%>
<%= curlist2Rec.pay_saly1%>
<%= curlist2Rec.pay_saly2%>
<%= curlist2Rec.hody_alon1%>
<%= curlist2Rec.hody_alon2%>
<%= curlist2Rec.yymm_alon1%>
<%= curlist2Rec.yymm_alon2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 23 11:10:11 KST 2016 */