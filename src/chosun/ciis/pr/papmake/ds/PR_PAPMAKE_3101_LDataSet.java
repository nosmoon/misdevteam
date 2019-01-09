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


package chosun.ciis.pr.papmake.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_3101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PAPMAKE_3101_LDataSet(){}
	public PR_PAPMAKE_3101_LDataSet(String errcode, String errmsg){
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
			PR_PAPMAKE_3101_LCURLISTRecord rec = new PR_PAPMAKE_3101_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			rec.prt_basi_qty = Util.checkString(rset0.getString("prt_basi_qty"));
			rec.prt_uprc_bw_1 = Util.checkString(rset0.getString("prt_uprc_bw_1"));
			rec.prt_uprc_clr_1 = Util.checkString(rset0.getString("prt_uprc_clr_1"));
			rec.prt_uprc_bw_2 = Util.checkString(rset0.getString("prt_uprc_bw_2"));
			rec.prt_uprc_clr_2 = Util.checkString(rset0.getString("prt_uprc_clr_2"));
			rec.pj_basi_qty = Util.checkString(rset0.getString("pj_basi_qty"));
			rec.prt_pj_rate_bw_1 = Util.checkString(rset0.getString("prt_pj_rate_bw_1"));
			rec.prt_pj_rate_clr_1 = Util.checkString(rset0.getString("prt_pj_rate_clr_1"));
			rec.prt_pj_rate_bw_2 = Util.checkString(rset0.getString("prt_pj_rate_bw_2"));
			rec.prt_pj_rate_clr_2 = Util.checkString(rset0.getString("prt_pj_rate_clr_2"));
			rec.film_make_fee = Util.checkString(rset0.getString("film_make_fee"));
			rec.pack_fee = Util.checkString(rset0.getString("pack_fee"));
			rec.paper_wgt = Util.checkString(rset0.getString("paper_wgt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.eps_no = Util.checkString(rset0.getString("eps_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PAPMAKE_3101_LDataSet ds = (PR_PAPMAKE_3101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PAPMAKE_3101_LCURLISTRecord curlistRec = (PR_PAPMAKE_3101_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.fac_clsf%>
<%= curlistRec.aply_dt%>
<%= curlistRec.prt_basi_qty%>
<%= curlistRec.prt_uprc_bw_1%>
<%= curlistRec.prt_uprc_clr_1%>
<%= curlistRec.prt_uprc_bw_2%>
<%= curlistRec.prt_uprc_clr_2%>
<%= curlistRec.pj_basi_qty%>
<%= curlistRec.prt_pj_rate_bw_1%>
<%= curlistRec.prt_pj_rate_clr_1%>
<%= curlistRec.prt_pj_rate_bw_2%>
<%= curlistRec.prt_pj_rate_clr_2%>
<%= curlistRec.film_make_fee%>
<%= curlistRec.pack_fee%>
<%= curlistRec.paper_wgt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.eps_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 03 18:07:41 KST 2016 */