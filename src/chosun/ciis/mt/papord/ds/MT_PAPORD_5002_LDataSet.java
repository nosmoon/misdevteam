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


public class MT_PAPORD_5002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_5002_LDataSet(){}
	public MT_PAPORD_5002_LDataSet(String errcode, String errmsg){
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
			MT_PAPORD_5002_LCURLIST1Record rec = new MT_PAPORD_5002_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.jg_roll_cnt_a = Util.checkString(rset0.getString("jg_roll_cnt_a"));
			rec.jg_wgt_a = Util.checkString(rset0.getString("jg_wgt_a"));
			rec.jg_roll_cnt_b = Util.checkString(rset0.getString("jg_roll_cnt_b"));
			rec.jg_wgt_b = Util.checkString(rset0.getString("jg_wgt_b"));
			rec.jg_roll_cnt_c = Util.checkString(rset0.getString("jg_roll_cnt_c"));
			rec.jg_wgt_c = Util.checkString(rset0.getString("jg_wgt_c"));
			rec.bi_roll_cnt_a = Util.checkString(rset0.getString("bi_roll_cnt_a"));
			rec.bi_wgt_a = Util.checkString(rset0.getString("bi_wgt_a"));
			rec.bi_roll_cnt_b = Util.checkString(rset0.getString("bi_roll_cnt_b"));
			rec.bi_wgt_b = Util.checkString(rset0.getString("bi_wgt_b"));
			rec.bi_roll_cnt_c = Util.checkString(rset0.getString("bi_roll_cnt_c"));
			rec.bi_wgt_c = Util.checkString(rset0.getString("bi_wgt_c"));
			rec.somo_cnt_a = Util.checkString(rset0.getString("somo_cnt_a"));
			rec.somo_wgt_a = Util.checkString(rset0.getString("somo_wgt_a"));
			rec.somo_cnt_b = Util.checkString(rset0.getString("somo_cnt_b"));
			rec.somo_wgt_b = Util.checkString(rset0.getString("somo_wgt_b"));
			rec.somo_cnt_c = Util.checkString(rset0.getString("somo_cnt_c"));
			rec.somo_wgt_c = Util.checkString(rset0.getString("somo_wgt_c"));
			rec.ordr_roll_cnt_a = Util.checkString(rset0.getString("ordr_roll_cnt_a"));
			rec.ordr_wgt_a = Util.checkString(rset0.getString("ordr_wgt_a"));
			rec.ordr_roll_cnt_b = Util.checkString(rset0.getString("ordr_roll_cnt_b"));
			rec.ordr_wgt_b = Util.checkString(rset0.getString("ordr_wgt_b"));
			rec.ordr_roll_cnt_c = Util.checkString(rset0.getString("ordr_roll_cnt_c"));
			rec.ordr_wgt_c = Util.checkString(rset0.getString("ordr_wgt_c"));
			rec.roll_wgt_a = Util.checkString(rset0.getString("roll_wgt_a"));
			rec.roll_wgt_b = Util.checkString(rset0.getString("roll_wgt_b"));
			rec.roll_wgt_c = Util.checkString(rset0.getString("roll_wgt_c"));
			rec.matr_a = Util.checkString(rset0.getString("matr_a"));
			rec.matr_b = Util.checkString(rset0.getString("matr_b"));
			rec.matr_c = Util.checkString(rset0.getString("matr_c"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_PAPORD_5002_LCURLIST2Record rec = new MT_PAPORD_5002_LCURLIST2Record();
			rec.papcmpy_cd = Util.checkString(rset1.getString("papcmpy_cd"));
			rec.papcmpy_nm = Util.checkString(rset1.getString("papcmpy_nm"));
			rec.p_ratio = Util.checkString(rset1.getString("p_ratio"));
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.ord = Util.checkString(rset1.getString("ord"));
			rec.roll_wgt_a = Util.checkString(rset1.getString("roll_wgt_a"));
			rec.roll_wgt_b = Util.checkString(rset1.getString("roll_wgt_b"));
			rec.roll_wgt_c = Util.checkString(rset1.getString("roll_wgt_c"));
			rec.matr_cd_a = Util.checkString(rset1.getString("matr_cd_a"));
			rec.matr_cd_b = Util.checkString(rset1.getString("matr_cd_b"));
			rec.matr_cd_c = Util.checkString(rset1.getString("matr_cd_c"));
			rec.wgt_a = Util.checkString(rset1.getString("wgt_a"));
			rec.wgt_b = Util.checkString(rset1.getString("wgt_b"));
			rec.wgt_c = Util.checkString(rset1.getString("wgt_c"));
			rec.roll_a = Util.checkString(rset1.getString("roll_a"));
			rec.roll_b = Util.checkString(rset1.getString("roll_b"));
			rec.roll_c = Util.checkString(rset1.getString("roll_c"));
			rec.car_a = Util.checkString(rset1.getString("car_a"));
			rec.car_b = Util.checkString(rset1.getString("car_b"));
			rec.car_c = Util.checkString(rset1.getString("car_c"));
			rec.roll_car_a = Util.checkString(rset1.getString("roll_car_a"));
			rec.roll_car_b = Util.checkString(rset1.getString("roll_car_b"));
			rec.roll_car_c = Util.checkString(rset1.getString("roll_car_c"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPORD_5002_LDataSet ds = (MT_PAPORD_5002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPORD_5002_LCURLIST1Record curlist1Rec = (MT_PAPORD_5002_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPORD_5002_LCURLIST2Record curlist2Rec = (MT_PAPORD_5002_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.fac_clsf_nm%>
<%= curlist1Rec.jg_roll_cnt_a%>
<%= curlist1Rec.jg_wgt_a%>
<%= curlist1Rec.jg_roll_cnt_b%>
<%= curlist1Rec.jg_wgt_b%>
<%= curlist1Rec.jg_roll_cnt_c%>
<%= curlist1Rec.jg_wgt_c%>
<%= curlist1Rec.somo_cnt_a%>
<%= curlist1Rec.somo_wgt_a%>
<%= curlist1Rec.somo_cnt_b%>
<%= curlist1Rec.somo_wgt_b%>
<%= curlist1Rec.somo_cnt_c%>
<%= curlist1Rec.somo_wgt_c%>
<%= curlist1Rec.ordr_roll_cnt_a%>
<%= curlist1Rec.ordr_wgt_a%>
<%= curlist1Rec.ordr_roll_cnt_b%>
<%= curlist1Rec.ordr_wgt_b%>
<%= curlist1Rec.ordr_roll_cnt_c%>
<%= curlist1Rec.ordr_wgt_c%>
<%= curlist1Rec.roll_wgt_a%>
<%= curlist1Rec.roll_wgt_b%>
<%= curlist1Rec.roll_wgt_c%>
<%= curlist1Rec.matr_a%>
<%= curlist1Rec.matr_b%>
<%= curlist1Rec.matr_c%>
<%= curlist2Rec.papcmpy_cd%>
<%= curlist2Rec.papcmpy_nm%>
<%= curlist2Rec.p_ratio%>
<%= curlist2Rec.issu_dt%>
<%= curlist2Rec.ord%>
<%= curlist2Rec.roll_wgt_a%>
<%= curlist2Rec.roll_wgt_b%>
<%= curlist2Rec.roll_wgt_c%>
<%= curlist2Rec.wgt_a%>
<%= curlist2Rec.wgt_b%>
<%= curlist2Rec.wgt_c%>
<%= curlist2Rec.roll_a%>
<%= curlist2Rec.roll_b%>
<%= curlist2Rec.roll_c%>
<%= curlist2Rec.car_a%>
<%= curlist2Rec.car_b%>
<%= curlist2Rec.car_c%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Nov 14 02:19:12 KST 2009 */