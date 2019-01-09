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


package chosun.ciis.mt.etcpc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_2000_LDataSet(){}
	public MT_ETCPC_2000_LDataSet(String errcode, String errmsg){
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
			MT_ETCPC_2000_LCURLIST1Record rec = new MT_ETCPC_2000_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.mchn_mang_no = Util.checkString(rset0.getString("mchn_mang_no"));
			rec.modl_mang_no = Util.checkString(rset0.getString("modl_mang_no"));
			rec.modl_nm = Util.checkString(rset0.getString("modl_nm"));
			rec.serl_no = Util.checkString(rset0.getString("serl_no"));
			rec.buy_dt = Util.checkString(rset0.getString("buy_dt"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.use_pers = Util.checkString(rset0.getString("use_pers"));
			rec.use_pers_flnm = Util.checkString(rset0.getString("use_pers_flnm"));
			rec.use_deptcd = Util.checkString(rset0.getString("use_deptcd"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.use_usag = Util.checkString(rset0.getString("use_usag"));
			rec.pay_kind = Util.checkString(rset0.getString("pay_kind"));
			rec.pay_kind_nm = Util.checkString(rset0.getString("pay_kind_nm"));
			rec.pay_dt = Util.checkString(rset0.getString("pay_dt"));
			rec.mchn_stat = Util.checkString(rset0.getString("mchn_stat"));
			rec.mchn_stat_nm = Util.checkString(rset0.getString("mchn_stat_nm"));
			rec.kep_plac = Util.checkString(rset0.getString("kep_plac"));
			rec.kep_plac_nm = Util.checkString(rset0.getString("kep_plac_nm"));
			rec.rsrt_dt = Util.checkString(rset0.getString("rsrt_dt"));
			rec.wste_dd_pers = Util.checkString(rset0.getString("wste_dd_pers"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.acpt_dt = Util.checkString(rset0.getString("acpt_dt"));
			rec.monitor_mang_no = Util.checkString(rset0.getString("monitor_mang_no"));
			rec.repa_item_yn = Util.checkString(rset0.getString("repa_item_yn"));
			rec.wste_obj_item_yn = Util.checkString(rset0.getString("wste_obj_item_yn"));
			rec.lend_item_rsrt_plan_dt = Util.checkString(rset0.getString("lend_item_rsrt_plan_dt"));
			rec.lend_item_yn = Util.checkString(rset0.getString("lend_item_yn"));
			rec.ipaddr = Util.checkString(rset0.getString("ipaddr"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCPC_2000_LDataSet ds = (MT_ETCPC_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_2000_LCURLIST1Record curlist1Rec = (MT_ETCPC_2000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.mchn_mang_no%>
<%= curlist1Rec.modl_mang_no%>
<%= curlist1Rec.modl_nm%>
<%= curlist1Rec.serl_no%>
<%= curlist1Rec.buy_dt%>
<%= curlist1Rec.aset_no%>
<%= curlist1Rec.use_pers%>
<%= curlist1Rec.use_pers_flnm%>
<%= curlist1Rec.use_deptcd%>
<%= curlist1Rec.use_dept_nm%>
<%= curlist1Rec.use_usag%>
<%= curlist1Rec.pay_kind%>
<%= curlist1Rec.pay_kind_nm%>
<%= curlist1Rec.pay_dt%>
<%= curlist1Rec.mchn_stat%>
<%= curlist1Rec.mchn_stat_nm%>
<%= curlist1Rec.kep_plac%>
<%= curlist1Rec.kep_plac_nm%>
<%= curlist1Rec.rsrt_dt%>
<%= curlist1Rec.wste_dd_pers%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.acpt_dt%>
<%= curlist1Rec.monitor_mang_no%>
<%= curlist1Rec.repa_item_yn%>
<%= curlist1Rec.wste_obj_item_yn%>
<%= curlist1Rec.lend_item_rsrt_plan_dt%>
<%= curlist1Rec.lend_item_yn%>
<%= curlist1Rec.ipaddr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 20:19:46 KST 2009 */