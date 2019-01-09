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


package chosun.ciis.pr.prtcnsg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_OTHCNSM_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_OTHCNSM_2310_LDataSet(){}
	public PR_OTHCNSM_2310_LDataSet(String errcode, String errmsg){
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
			PR_OTHCNSM_2310_LCURLIST1Record rec = new PR_OTHCNSM_2310_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			rec.film_make_fee = Util.checkString(rset0.getString("film_make_fee"));
			rec.pack_fee = Util.checkString(rset0.getString("pack_fee"));
			rec.base_leas_fee = Util.checkString(rset0.getString("base_leas_fee"));
			rec.real_leas_fee = Util.checkString(rset0.getString("real_leas_fee"));
			rec.dest_fee = Util.checkString(rset0.getString("dest_fee"));
			rec.etc_matr_fee_bw = Util.checkString(rset0.getString("etc_matr_fee_bw"));
			rec.etc_matr_fee_clr = Util.checkString(rset0.getString("etc_matr_fee_clr"));
			rec.leas_use_fee_bw = Util.checkString(rset0.getString("leas_use_fee_bw"));
			rec.leas_use_fee_clr = Util.checkString(rset0.getString("leas_use_fee_clr"));
			rec.paper_wgt = Util.checkString(rset0.getString("paper_wgt"));
			rec.prt_pj_rate = Util.checkString(rset0.getString("prt_pj_rate"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			PR_OTHCNSM_2310_LCURLIST2Record rec = new PR_OTHCNSM_2310_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			rec.aply_dt = Util.checkString(rset1.getString("aply_dt"));
			rec.film_make_fee = Util.checkString(rset1.getString("film_make_fee"));
			rec.pack_fee = Util.checkString(rset1.getString("pack_fee"));
			rec.base_leas_fee = Util.checkString(rset1.getString("base_leas_fee"));
			rec.real_leas_fee = Util.checkString(rset1.getString("real_leas_fee"));
			rec.dest_fee = Util.checkString(rset1.getString("dest_fee"));
			rec.etc_matr_fee_bw = Util.checkString(rset1.getString("etc_matr_fee_bw"));
			rec.etc_matr_fee_clr = Util.checkString(rset1.getString("etc_matr_fee_clr"));
			rec.leas_use_fee_bw = Util.checkString(rset1.getString("leas_use_fee_bw"));
			rec.leas_use_fee_clr = Util.checkString(rset1.getString("leas_use_fee_clr"));
			rec.paper_wgt = Util.checkString(rset1.getString("paper_wgt"));
			rec.prt_pj_rate = Util.checkString(rset1.getString("prt_pj_rate"));
			rec.incmg_pers = Util.checkString(rset1.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset1.getString("incmg_dt_tm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_OTHCNSM_2310_LDataSet ds = (PR_OTHCNSM_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_OTHCNSM_2310_LCURLIST1Record curlist1Rec = (PR_OTHCNSM_2310_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_OTHCNSM_2310_LCURLIST2Record curlist2Rec = (PR_OTHCNSM_2310_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.fac_clsf_nm%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.sect_nm%>
<%= curlist1Rec.aply_dt%>
<%= curlist1Rec.film_make_fee%>
<%= curlist1Rec.pack_fee%>
<%= curlist1Rec.base_leas_fee%>
<%= curlist1Rec.real_leas_fee%>
<%= curlist1Rec.dest_fee%>
<%= curlist1Rec.etc_matr_fee_bw%>
<%= curlist1Rec.etc_matr_fee_clr%>
<%= curlist1Rec.leas_use_fee_bw%>
<%= curlist1Rec.leas_use_fee_clr%>
<%= curlist1Rec.paper_wgt%>
<%= curlist1Rec.prt_pj_rate%>
<%= curlist1Rec.incmg_pers%>
<%= curlist1Rec.incmg_dt_tm%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.fac_clsf_nm%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.sect_nm%>
<%= curlist2Rec.aply_dt%>
<%= curlist2Rec.film_make_fee%>
<%= curlist2Rec.pack_fee%>
<%= curlist2Rec.base_leas_fee%>
<%= curlist2Rec.real_leas_fee%>
<%= curlist2Rec.dest_fee%>
<%= curlist2Rec.etc_matr_fee_bw%>
<%= curlist2Rec.etc_matr_fee_clr%>
<%= curlist2Rec.leas_use_fee_bw%>
<%= curlist2Rec.leas_use_fee_clr%>
<%= curlist2Rec.paper_wgt%>
<%= curlist2Rec.prt_pj_rate%>
<%= curlist2Rec.incmg_pers%>
<%= curlist2Rec.incmg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 25 16:03:55 KST 2009 */