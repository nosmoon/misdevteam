/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_BRMGR_2510_LDataSet(){}
	public SS_SLS_BRMGR_2510_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			SS_SLS_BRMGR_2510_LCURCOMMLISTRecord rec = new SS_SLS_BRMGR_2510_LCURCOMMLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.partnm = Util.checkString(rset0.getString("partnm"));
			rec.areanm = Util.checkString(rset0.getString("areanm"));
			rec.bonm = Util.checkString(rset0.getString("bonm"));
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.boclsf = Util.checkString(rset0.getString("boclsf"));
			rec.rdr_qty = Util.checkString(rset0.getString("rdr_qty"));
			rec.gap_qty = Util.checkString(rset0.getString("gap_qty"));
			rec.v_rdr_qty = Util.checkString(rset0.getString("v_rdr_qty"));
			rec.v_rdr_rate = Util.checkString(rset0.getString("v_rdr_rate"));
			rec.j_rdr_qty = Util.checkString(rset0.getString("j_rdr_qty"));
			rec.j_rdr_rate = Util.checkString(rset0.getString("j_rdr_rate"));
			rec.extn_qty = Util.checkString(rset0.getString("extn_qty"));
			rec.extn_rate = Util.checkString(rset0.getString("extn_rate"));
			rec.sw_extn_qty = Util.checkString(rset0.getString("sw_extn_qty"));
			rec.extn_qty2 = Util.checkString(rset0.getString("extn_qty2"));
			rec.extn_rate2 = Util.checkString(rset0.getString("extn_rate2"));
			rec.jm_qty = Util.checkString(rset0.getString("jm_qty"));
			rec.susp_qty = Util.checkString(rset0.getString("susp_qty"));
			rec.susp_rate = Util.checkString(rset0.getString("susp_rate"));
			rec.sw_susp_qty = Util.checkString(rset0.getString("sw_susp_qty"));
			rec.susp_qty2 = Util.checkString(rset0.getString("susp_qty2"));
			rec.susp_rate2 = Util.checkString(rset0.getString("susp_rate2"));
			rec.grow_qty = Util.checkString(rset0.getString("grow_qty"));
			rec.grow_rate = Util.checkString(rset0.getString("grow_rate"));
			rec.grow_qty2 = Util.checkString(rset0.getString("grow_qty2"));
			rec.grow_rate2 = Util.checkString(rset0.getString("grow_rate2"));
			rec.medaqty = Util.checkString(rset0.getString("medaqty"));
			rec.meda_amt = Util.checkString(rset0.getString("meda_amt"));
			rec.repm_amt = Util.checkString(rset0.getString("repm_amt"));
			rec.repm_rate = Util.checkString(rset0.getString("repm_rate"));
			rec.issu_qty = Util.checkString(rset0.getString("issu_qty"));
			rec.net_sale_amt2 = Util.checkString(rset0.getString("net_sale_amt2"));
			rec.jd_rate = Util.checkString(rset0.getString("jd_rate"));
			rec.sale_dscn_amt = Util.checkString(rset0.getString("sale_dscn_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.rcpm_rate = Util.checkString(rset0.getString("rcpm_rate"));
			rec.curr_bal = Util.checkString(rset0.getString("curr_bal"));
			rec.bal = Util.checkString(rset0.getString("bal"));
			rec.leaf_purc = Util.checkString(rset0.getString("leaf_purc"));
			rec.extn_bs = Util.checkString(rset0.getString("extn_bs"));
			rec.longmisu = Util.checkString(rset0.getString("longmisu"));
			rec.longmisu_rate = Util.checkString(rset0.getString("longmisu_rate"));
			rec.extn_alon = Util.checkString(rset0.getString("extn_alon"));
			rec.dn_alon = Util.checkString(rset0.getString("dn_alon"));
			rec.d_point = Util.checkString(rset0.getString("d_point"));
			rec.d_stat = Util.checkString(rset0.getString("d_stat"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRMGR_2510_LDataSet ds = (SS_SLS_BRMGR_2510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_BRMGR_2510_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_BRMGR_2510_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.yymm%>
<%= curcommlistRec.deptnm%>
<%= curcommlistRec.partnm%>
<%= curcommlistRec.areanm%>
<%= curcommlistRec.bonm%>
<%= curcommlistRec.bo_cd%>
<%= curcommlistRec.bo_head_nm%>
<%= curcommlistRec.boclsf%>
<%= curcommlistRec.rdr_qty%>
<%= curcommlistRec.gap_qty%>
<%= curcommlistRec.v_rdr_qty%>
<%= curcommlistRec.v_rdr_rate%>
<%= curcommlistRec.j_rdr_qty%>
<%= curcommlistRec.j_rdr_rate%>
<%= curcommlistRec.extn_qty%>
<%= curcommlistRec.extn_rate%>
<%= curcommlistRec.sw_extn_qty%>
<%= curcommlistRec.extn_qty2%>
<%= curcommlistRec.extn_rate2%>
<%= curcommlistRec.jm_qty%>
<%= curcommlistRec.susp_qty%>
<%= curcommlistRec.susp_rate%>
<%= curcommlistRec.sw_susp_qty%>
<%= curcommlistRec.susp_qty2%>
<%= curcommlistRec.susp_rate2%>
<%= curcommlistRec.grow_qty%>
<%= curcommlistRec.grow_rate%>
<%= curcommlistRec.grow_qty2%>
<%= curcommlistRec.grow_rate2%>
<%= curcommlistRec.medaqty%>
<%= curcommlistRec.meda_amt%>
<%= curcommlistRec.repm_amt%>
<%= curcommlistRec.repm_rate%>
<%= curcommlistRec.issu_qty%>
<%= curcommlistRec.net_sale_amt2%>
<%= curcommlistRec.jd_rate%>
<%= curcommlistRec.sale_dscn_amt%>
<%= curcommlistRec.rcpm_amt%>
<%= curcommlistRec.rcpm_rate%>
<%= curcommlistRec.curr_bal%>
<%= curcommlistRec.bal%>
<%= curcommlistRec.leaf_purc%>
<%= curcommlistRec.extn_bs%>
<%= curcommlistRec.longmisu%>
<%= curcommlistRec.longmisu_rate%>
<%= curcommlistRec.extn_alon%>
<%= curcommlistRec.dn_alon%>
<%= curcommlistRec.d_point%>
<%= curcommlistRec.d_stat%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 05 15:45:18 KST 2016 */