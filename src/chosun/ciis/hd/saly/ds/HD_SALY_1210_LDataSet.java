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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_1210_LDataSet(){}
	public HD_SALY_1210_LDataSet(String errcode, String errmsg){
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
			HD_SALY_1210_LCURLISTRecord rec = new HD_SALY_1210_LCURLISTRecord();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.week_hody_base_alon_dds = Util.checkString(rset0.getString("week_hody_base_alon_dds"));
			rec.week_hody_base_alon = Util.checkString(rset0.getString("week_hody_base_alon"));
			rec.week_hody_cmpn_alon_dds = Util.checkString(rset0.getString("week_hody_cmpn_alon_dds"));
			rec.week_hody_cmpn_alon = Util.checkString(rset0.getString("week_hody_cmpn_alon"));
			rec.lgl_hody_base_alon_dds = Util.checkString(rset0.getString("lgl_hody_base_alon_dds"));
			rec.lgl_hody_base_alon = Util.checkString(rset0.getString("lgl_hody_base_alon"));
			rec.lgl_hody_cmpn_alon_dds = Util.checkString(rset0.getString("lgl_hody_cmpn_alon_dds"));
			rec.lgl_hody_cmpn_alon = Util.checkString(rset0.getString("lgl_hody_cmpn_alon"));
			rec.nissu_dd_alon_dds = Util.checkString(rset0.getString("nissu_dd_alon_dds"));
			rec.nissu_dd_alon = Util.checkString(rset0.getString("nissu_dd_alon"));
			rec.nissu_dd_base_alon_dds = Util.checkString(rset0.getString("nissu_dd_base_alon_dds"));
			rec.nissu_dd_base_alon = Util.checkString(rset0.getString("nissu_dd_base_alon"));
			rec.prvmm_mstk_alon = Util.checkString(rset0.getString("prvmm_mstk_alon"));
			rec.alvc_use_rat = Util.checkString(rset0.getString("alvc_use_rat"));
			rec.alon_tot = Util.checkString(rset0.getString("alon_tot"));
			rec.p_alon_tot = Util.checkString(rset0.getString("p_alon_tot"));
			rec.pp_alon_tot = Util.checkString(rset0.getString("pp_alon_tot"));
			rec.vgl_fee_dds = Util.checkString(rset0.getString("vgl_fee_dds"));
			rec.vgl_fee = Util.checkString(rset0.getString("vgl_fee"));
			rec.erl_prsnt_alon_dds = Util.checkString(rset0.getString("erl_prsnt_alon_dds"));
			rec.erl_prsnt_alon = Util.checkString(rset0.getString("erl_prsnt_alon"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_1210_LDataSet ds = (HD_SALY_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_1210_LCURLISTRecord curlistRec = (HD_SALY_1210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_nm%>
<%= curlistRec.week_hody_base_alon_dds%>
<%= curlistRec.week_hody_base_alon%>
<%= curlistRec.week_hody_cmpn_alon_dds%>
<%= curlistRec.week_hody_cmpn_alon%>
<%= curlistRec.lgl_hody_base_alon_dds%>
<%= curlistRec.lgl_hody_base_alon%>
<%= curlistRec.lgl_hody_cmpn_alon_dds%>
<%= curlistRec.lgl_hody_cmpn_alon%>
<%= curlistRec.nissu_dd_alon_dds%>
<%= curlistRec.nissu_dd_alon%>
<%= curlistRec.prvmm_mstk_alon%>
<%= curlistRec.alvc_use_rat%>
<%= curlistRec.alon_tot%>
<%= curlistRec.p_alon_tot%>
<%= curlistRec.pp_alon_tot%>
<%= curlistRec.vgl_fee_dds%>
<%= curlistRec.vgl_fee%>
<%= curlistRec.erl_prsnt_alon_dds%>
<%= curlistRec.erl_prsnt_alon%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 18:06:54 KST 2009 */