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


package chosun.ciis.mt.papord.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_8002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_8002_LDataSet(){}
	public MT_PAPORD_8002_LDataSet(String errcode, String errmsg){
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
			MT_PAPORD_8002_LCURLISTRecord rec = new MT_PAPORD_8002_LCURLISTRecord();
			rec.issu_dt_day = Util.checkString(rset0.getString("issu_dt_day"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.pcnt = Util.checkString(rset0.getString("pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.prt_tm = Util.checkString(rset0.getString("prt_tm"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.dual_out_nm = Util.checkString(rset0.getString("dual_out_nm"));
			rec.tm_in_yn = Util.checkString(rset0.getString("tm_in_yn"));
			rec.add_prt_seq = Util.checkString(rset0.getString("add_prt_seq"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.use_a = Util.checkString(rset0.getString("use_a"));
			rec.use_b = Util.checkString(rset0.getString("use_b"));
			rec.use_c = Util.checkString(rset0.getString("use_c"));
			rec.bf_dt = Util.checkString(rset0.getString("bf_dt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.bal_wgt_a = Util.checkString(rset0.getString("bal_wgt_a"));
			rec.bal_wgt_c = Util.checkString(rset0.getString("bal_wgt_c"));
			rec.bal_wgt_b = Util.checkString(rset0.getString("bal_wgt_b"));
			rec.bal_roll_a = Util.checkString(rset0.getString("bal_roll_a"));
			rec.bal_roll_c = Util.checkString(rset0.getString("bal_roll_c"));
			rec.bal_roll_b = Util.checkString(rset0.getString("bal_roll_b"));
			rec.bal_wgt_tot = Util.checkString(rset0.getString("bal_wgt_tot"));
			rec.roll_wgt_a = Util.checkString(rset0.getString("roll_wgt_a"));
			rec.roll_wgt_b = Util.checkString(rset0.getString("roll_wgt_b"));
			rec.roll_wgt_c = Util.checkString(rset0.getString("roll_wgt_c"));
			rec.roll_cnt_a = Util.checkString(rset0.getString("roll_cnt_a"));
			rec.roll_cnt_b = Util.checkString(rset0.getString("roll_cnt_b"));
			rec.roll_cnt_c = Util.checkString(rset0.getString("roll_cnt_c"));
			rec.bf_bal_wgt_a = Util.checkString(rset0.getString("bf_bal_wgt_a"));
			rec.bf_bal_wgt_c = Util.checkString(rset0.getString("bf_bal_wgt_c"));
			rec.bf_bal_wgt_b = Util.checkString(rset0.getString("bf_bal_wgt_b"));
			rec.row_num = Util.checkString(rset0.getString("row_num"));
			rec.wgt_a = Util.checkString(rset0.getString("wgt_a"));
			rec.wgt_c = Util.checkString(rset0.getString("wgt_c"));
			rec.wgt_b = Util.checkString(rset0.getString("wgt_b"));
			rec.roll_a = Util.checkString(rset0.getString("roll_a"));
			rec.roll_c = Util.checkString(rset0.getString("roll_c"));
			rec.roll_b = Util.checkString(rset0.getString("roll_b"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			rec.dual_out_clsf = Util.checkString(rset0.getString("dual_out_clsf"));
			rec.papcmpy_cd = Util.checkString(rset0.getString("papcmpy_cd"));
			rec.car_cnt = Util.checkString(rset0.getString("car_cnt"));
			rec.car_c = Util.checkString(rset0.getString("car_c"));
			rec.car_b = Util.checkString(rset0.getString("car_b"));
			rec.ewh_roll_cnt_a = Util.checkString(rset0.getString("ewh_roll_cnt_a"));
			rec.ewh_roll_cnt_b = Util.checkString(rset0.getString("ewh_roll_cnt_b"));
			rec.ewh_roll_cnt_c = Util.checkString(rset0.getString("ewh_roll_cnt_c"));
			rec.ewh_wgt_a = Util.checkString(rset0.getString("ewh_wgt_a"));
			rec.ewh_wgt_c = Util.checkString(rset0.getString("ewh_wgt_c"));
			rec.ewh_wgt_b = Util.checkString(rset0.getString("ewh_wgt_b"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_4002_LDataSet ds = (PR_PRTEXEC_4002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_2.size(); i++){
		PR_PRTEXEC_4002_LCURLIST_2Record curlist_2Rec = (PR_PRTEXEC_4002_LCURLIST_2Record)ds.curlist_2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_2Rec.issu_dt%>
<%= curlist_2Rec.medi_nm%>
<%= curlist_2Rec.sect_nm%>
<%= curlist_2Rec.pcnt%>
<%= curlist_2Rec.clr_pcnt%>
<%= curlist_2Rec.prt_dt%>
<%= curlist_2Rec.prt_tm%>
<%= curlist_2Rec.std%>
<%= curlist_2Rec.dual_out_nm%>
<%= curlist_2Rec.tm_in_yn%>
<%= curlist_2Rec.add_prt_seq%>
<%= curlist_2Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 30 19:41:59 KST 2009 */