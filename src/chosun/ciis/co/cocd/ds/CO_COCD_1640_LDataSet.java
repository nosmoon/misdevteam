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


package chosun.ciis.co.cocd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1640_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_COCD_1640_LDataSet(){}
	public CO_COCD_1640_LDataSet(String errcode, String errmsg){
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
			CO_COCD_1640_LCOMMCDCUR1Record rec = new CO_COCD_1640_LCOMMCDCUR1Record();
			rec.pgm_id = Util.checkString(rset0.getString("pgm_id"));
			rec.pgm_nm = Util.checkString(rset0.getString("pgm_nm"));
			rec.pgm_onm = Util.checkString(rset0.getString("pgm_onm"));
			rec.pgm_typ = Util.checkString(rset0.getString("pgm_typ"));
			rec.brd_run = Util.checkString(rset0.getString("brd_run"));
			rec.tot_cnt = Util.checkString(rset0.getString("tot_cnt"));
			rec.pgm_clf1 = Util.checkString(rset0.getString("pgm_clf1"));
			rec.pgm_clf2 = Util.checkString(rset0.getString("pgm_clf2"));
			rec.jenr_clf = Util.checkString(rset0.getString("jenr_clf"));
			rec.target = Util.checkString(rset0.getString("target"));
			rec.delib_grd = Util.checkString(rset0.getString("delib_grd"));
			rec.info_grd = Util.checkString(rset0.getString("info_grd"));
			rec.frgn_clf = Util.checkString(rset0.getString("frgn_clf"));
			rec.game_clf = Util.checkString(rset0.getString("game_clf"));
			rec.main_role = Util.checkString(rset0.getString("main_role"));
			rec.supp_role = Util.checkString(rset0.getString("supp_role"));
			rec.director = Util.checkString(rset0.getString("director"));
			rec.mc_nm = Util.checkString(rset0.getString("mc_nm"));
			rec.award_info = Util.checkString(rset0.getString("award_info"));
			rec.prd_cntry1 = Util.checkString(rset0.getString("prd_cntry1"));
			rec.prd_cntry2 = Util.checkString(rset0.getString("prd_cntry2"));
			rec.prd_co_cd = Util.checkString(rset0.getString("prd_co_cd"));
			rec.prd_co_nm = Util.checkString(rset0.getString("prd_co_nm"));
			rec.prd_ym = Util.checkString(rset0.getString("prd_ym"));
			rec.flash_yn = Util.checkString(rset0.getString("flash_yn"));
			rec.emerg_yn = Util.checkString(rset0.getString("emerg_yn"));
			rec.news_yn = Util.checkString(rset0.getString("news_yn"));
			rec.pilot_yn = Util.checkString(rset0.getString("pilot_yn"));
			rec.pgm_info = Util.checkString(rset0.getString("pgm_info"));
			rec.pgm_icon = Util.checkString(rset0.getString("pgm_icon"));
			rec.regr = Util.checkString(rset0.getString("regr"));
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.modr = Util.checkString(rset0.getString("modr"));
			rec.mod_dt = Util.checkString(rset0.getString("mod_dt"));
			rec.del_yn = Util.checkString(rset0.getString("del_yn"));
			rec.delr = Util.checkString(rset0.getString("delr"));
			rec.del_dt = Util.checkString(rset0.getString("del_dt"));
			rec.dvs_yn = Util.checkString(rset0.getString("dvs_yn"));
			rec.news_group = Util.checkString(rset0.getString("news_group"));
			rec.online_service_yn = Util.checkString(rset0.getString("online_service_yn"));
			this.commcdcur1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_COCD_1640_LDataSet ds = (CO_COCD_1640_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		CO_COCD_1640_LCOMMCDCUR1Record commcdcur1Rec = (CO_COCD_1640_LCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCommcdcur1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= commcdcur1Rec.pgm_id%>
<%= commcdcur1Rec.pgm_nm%>
<%= commcdcur1Rec.pgm_onm%>
<%= commcdcur1Rec.pgm_typ%>
<%= commcdcur1Rec.brd_run%>
<%= commcdcur1Rec.tot_cnt%>
<%= commcdcur1Rec.pgm_clf1%>
<%= commcdcur1Rec.pgm_clf2%>
<%= commcdcur1Rec.jenr_clf%>
<%= commcdcur1Rec.target%>
<%= commcdcur1Rec.delib_grd%>
<%= commcdcur1Rec.info_grd%>
<%= commcdcur1Rec.frgn_clf%>
<%= commcdcur1Rec.game_clf%>
<%= commcdcur1Rec.main_role%>
<%= commcdcur1Rec.supp_role%>
<%= commcdcur1Rec.director%>
<%= commcdcur1Rec.mc_nm%>
<%= commcdcur1Rec.award_info%>
<%= commcdcur1Rec.prd_cntry1%>
<%= commcdcur1Rec.prd_cntry2%>
<%= commcdcur1Rec.prd_co_cd%>
<%= commcdcur1Rec.prd_co_nm%>
<%= commcdcur1Rec.prd_ym%>
<%= commcdcur1Rec.flash_yn%>
<%= commcdcur1Rec.emerg_yn%>
<%= commcdcur1Rec.news_yn%>
<%= commcdcur1Rec.pilot_yn%>
<%= commcdcur1Rec.pgm_info%>
<%= commcdcur1Rec.pgm_icon%>
<%= commcdcur1Rec.regr%>
<%= commcdcur1Rec.reg_dt%>
<%= commcdcur1Rec.modr%>
<%= commcdcur1Rec.mod_dt%>
<%= commcdcur1Rec.del_yn%>
<%= commcdcur1Rec.delr%>
<%= commcdcur1Rec.del_dt%>
<%= commcdcur1Rec.dvs_yn%>
<%= commcdcur1Rec.news_group%>
<%= commcdcur1Rec.online_service_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 17 11:16:06 KST 2012 */