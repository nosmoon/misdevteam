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


package chosun.ciis.as.base.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.base.dm.*;
import chosun.ciis.as.base.rec.*;

/**
 * 
 */


public class AS_BASE_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_BASE_1102_LDataSet(){}
	public AS_BASE_1102_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AS_BASE_1102_LCURLISTRecord rec = new AS_BASE_1102_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.bund_cd = Util.checkString(rset0.getString("bund_cd"));
			rec.bund_nm = Util.checkString(rset0.getString("bund_nm"));
			rec.item_cnt = Util.checkString(rset0.getString("item_cnt"));
			rec.mang_dt = Util.checkString(rset0.getString("mang_dt"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.supv_dept_cd = Util.checkString(rset0.getString("supv_dept_cd"));
			rec.supv_dept_nm = Util.checkString(rset0.getString("supv_dept_nm"));
			rec.dlvs_plac = Util.checkString(rset0.getString("dlvs_plac"));
			rec.tot_amt = rset0.getInt("tot_amt");
			rec.mony_unit_cd = Util.checkString(rset0.getString("mony_unit_cd"));
			rec.mony_unit_nm = Util.checkString(rset0.getString("mony_unit_nm"));
			rec.ltrm_adpay_cost = Util.checkString(rset0.getString("ltrm_adpay_cost"));
			rec.leas_cmpy = Util.checkString(rset0.getString("leas_cmpy"));
			rec.leas_no = Util.checkString(rset0.getString("leas_no"));
			rec.leas_frdt = Util.checkString(rset0.getString("leas_frdt"));
			rec.leas_todt = Util.checkString(rset0.getString("leas_todt"));
			rec.re_leas_frdt = Util.checkString(rset0.getString("re_leas_frdt"));
			rec.re_leas_todt = Util.checkString(rset0.getString("re_leas_todt"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.incmg_pers_nm = Util.checkString(rset0.getString("incmg_pers_nm"));
			rec.incmg_dt_tm_1 = Util.checkString(rset0.getString("incmg_dt_tm_1"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_BASE_1102_LDataSet ds = (AS_BASE_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_BASE_1102_LCURLISTRecord curlistRec = (AS_BASE_1102_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.bund_cd%>
<%= curlistRec.bund_nm%>
<%= curlistRec.item_cnt%>
<%= curlistRec.mang_dt%>
<%= curlistRec.usag%>
<%= curlistRec.supv_dept_cd%>
<%= curlistRec.supv_dept_nm%>
<%= curlistRec.dlvs_plac%>
<%= curlistRec.tot_amt%>
<%= curlistRec.mony_unit_cd%>
<%= curlistRec.mony_unit_nm%>
<%= curlistRec.ltrm_adpay_cost%>
<%= curlistRec.leas_cmpy%>
<%= curlistRec.leas_no%>
<%= curlistRec.leas_frdt%>
<%= curlistRec.leas_todt%>
<%= curlistRec.re_leas_frdt%>
<%= curlistRec.re_leas_todt%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.incmg_pers_nm%>
<%= curlistRec.incmg_dt_tm_1%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 24 19:50:40 KST 2009 */