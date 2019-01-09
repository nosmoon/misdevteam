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


public class MT_PAPORD_5006_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_5006_LDataSet(){}
	public MT_PAPORD_5006_LDataSet(String errcode, String errmsg){
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
			MT_PAPORD_5006_LCURLIST1Record rec = new MT_PAPORD_5006_LCURLIST1Record();
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
			rec.bi_roll_wgt_a = Util.checkString(rset0.getString("bi_roll_wgt_a"));
			rec.bi_roll_cnt_b = Util.checkString(rset0.getString("bi_roll_cnt_b"));
			rec.bi_roll_wgt_b = Util.checkString(rset0.getString("bi_roll_wgt_b"));
			rec.bi_roll_cnt_c = Util.checkString(rset0.getString("bi_roll_cnt_c"));
			rec.bi_roll_wgt_c = Util.checkString(rset0.getString("bi_roll_wgt_c"));
			rec.somo_cnt_a = Util.checkString(rset0.getString("somo_cnt_a"));
			rec.somo_wgt_a = Util.checkString(rset0.getString("somo_wgt_a"));
			rec.somo_cnt_b = Util.checkString(rset0.getString("somo_cnt_b"));
			rec.somo_wgt_b = Util.checkString(rset0.getString("somo_wgt_b"));
			rec.somo_cnt_c = Util.checkString(rset0.getString("somo_cnt_c"));
			rec.somo_wgt_c = Util.checkString(rset0.getString("somo_wgt_c"));
			rec.expt_cnt_a = Util.checkString(rset0.getString("expt_cnt_a"));
			rec.expt_wgt_a = Util.checkString(rset0.getString("expt_wgt_a"));
			rec.expt_cnt_b = Util.checkString(rset0.getString("expt_cnt_b"));
			rec.expt_wgt_b = Util.checkString(rset0.getString("expt_wgt_b"));
			rec.expt_cnt_c = Util.checkString(rset0.getString("expt_cnt_c"));
			rec.expt_wgt_c = Util.checkString(rset0.getString("expt_wgt_c"));
			rec.ordr_roll_cnt_a = Util.checkString(rset0.getString("ordr_roll_cnt_a"));
			rec.ordr_wgt_a = Util.checkString(rset0.getString("ordr_wgt_a"));
			rec.ordr_roll_cnt_b = Util.checkString(rset0.getString("ordr_roll_cnt_b"));
			rec.ordr_wgt_b = Util.checkString(rset0.getString("ordr_wgt_b"));
			rec.ordr_roll_cnt_c = Util.checkString(rset0.getString("ordr_roll_cnt_c"));
			rec.ordr_wgt_c = Util.checkString(rset0.getString("ordr_wgt_c"));
			rec.roll_wgt_a = Util.checkString(rset0.getString("roll_wgt_a"));
			rec.roll_wgt_b = Util.checkString(rset0.getString("roll_wgt_b"));
			rec.roll_wgt_c = Util.checkString(rset0.getString("roll_wgt_c"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_PAPORD_5006_LCURLIST2Record rec = new MT_PAPORD_5006_LCURLIST2Record();
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
			rec.mix_roll_a = Util.checkString(rset1.getString("mix_roll_a"));
			rec.mix_roll_b = Util.checkString(rset1.getString("mix_roll_b"));
			rec.mix_roll_c = Util.checkString(rset1.getString("mix_roll_c"));
			rec.mix_wgt_a = Util.checkString(rset1.getString("mix_wgt_a"));
			rec.mix_wgt_b = Util.checkString(rset1.getString("mix_wgt_b"));
			rec.mix_wgt_c = Util.checkString(rset1.getString("mix_wgt_c"));
			rec.roll_car_a = Util.checkString(rset1.getString("roll_car_a"));
			rec.roll_car_b = Util.checkString(rset1.getString("roll_car_b"));
			rec.roll_car_c = Util.checkString(rset1.getString("roll_car_c"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			MT_PAPORD_5006_LCURLIST3Record rec = new MT_PAPORD_5006_LCURLIST3Record();
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			rec.matr_cd = Util.checkString(rset2.getString("matr_cd"));
			rec.papcmpy_cd = Util.checkString(rset2.getString("papcmpy_cd"));
			rec.roll_wgt = Util.checkString(rset2.getString("roll_wgt"));
			rec.somo_roll = Util.checkString(rset2.getString("somo_roll"));
			rec.somo_wgt = Util.checkString(rset2.getString("somo_wgt"));
			rec.ord_roll = Util.checkString(rset2.getString("ord_roll"));
			rec.ord_wgt = Util.checkString(rset2.getString("ord_wgt"));
			rec.car_occr_dt = Util.checkString(rset2.getString("car_occr_dt"));
			rec.car_seq = Util.checkString(rset2.getString("car_seq"));
			rec.car_cnt = Util.checkString(rset2.getString("car_cnt"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			MT_PAPORD_5006_LCURLIST4Record rec = new MT_PAPORD_5006_LCURLIST4Record();
			rec.issu_dt = Util.checkString(rset3.getString("issu_dt"));
			rec.papcmpy_cd = Util.checkString(rset3.getString("papcmpy_cd"));
			rec.matr_cd = Util.checkString(rset3.getString("matr_cd"));
			rec.roll_cnt = Util.checkString(rset3.getString("roll_cnt"));
			rec.wgt = Util.checkString(rset3.getString("wgt"));
			rec.car_occr_dt = Util.checkString(rset3.getString("car_occr_dt"));
			rec.car_seq = Util.checkString(rset3.getString("car_seq"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPORD_5006_LDataSet ds = (MT_PAPORD_5006_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPORD_5006_LCURLIST1Record curlist1Rec = (MT_PAPORD_5006_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPORD_5006_LCURLIST2Record curlist2Rec = (MT_PAPORD_5006_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_PAPORD_5006_LCURLIST3Record curlist3Rec = (MT_PAPORD_5006_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MT_PAPORD_5006_LCURLIST4Record curlist4Rec = (MT_PAPORD_5006_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
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
<%= curlist1Rec.bi_roll_cnt_a%>
<%= curlist1Rec.bi_roll_wgt_a%>
<%= curlist1Rec.bi_roll_cnt_b%>
<%= curlist1Rec.bi_roll_wgt_b%>
<%= curlist1Rec.bi_roll_cnt_c%>
<%= curlist1Rec.bi_roll_wgt_c%>
<%= curlist1Rec.somo_cnt_a%>
<%= curlist1Rec.somo_wgt_a%>
<%= curlist1Rec.somo_cnt_b%>
<%= curlist1Rec.somo_wgt_b%>
<%= curlist1Rec.somo_cnt_c%>
<%= curlist1Rec.somo_wgt_c%>
<%= curlist1Rec.expt_cnt_a%>
<%= curlist1Rec.expt_wgt_a%>
<%= curlist1Rec.expt_cnt_b%>
<%= curlist1Rec.expt_wgt_b%>
<%= curlist1Rec.expt_cnt_c%>
<%= curlist1Rec.expt_wgt_c%>
<%= curlist1Rec.ordr_roll_cnt_a%>
<%= curlist1Rec.ordr_wgt_a%>
<%= curlist1Rec.ordr_roll_cnt_b%>
<%= curlist1Rec.ordr_wgt_b%>
<%= curlist1Rec.ordr_roll_cnt_c%>
<%= curlist1Rec.ordr_wgt_c%>
<%= curlist2Rec.papcmpy_cd%>
<%= curlist2Rec.papcmpy_nm%>
<%= curlist2Rec.p_ratio%>
<%= curlist2Rec.issu_dt%>
<%= curlist2Rec.ord%>
<%= curlist2Rec.roll_wgt_a%>
<%= curlist2Rec.roll_wgt_b%>
<%= curlist2Rec.roll_wgt_c%>
<%= curlist2Rec.matr_cd_a%>
<%= curlist2Rec.matr_cd_b%>
<%= curlist2Rec.matr_cd_c%>
<%= curlist2Rec.wgt_a%>
<%= curlist2Rec.wgt_b%>
<%= curlist2Rec.wgt_c%>
<%= curlist2Rec.roll_a%>
<%= curlist2Rec.roll_b%>
<%= curlist2Rec.roll_c%>
<%= curlist2Rec.car_a%>
<%= curlist2Rec.car_b%>
<%= curlist2Rec.car_c%>
<%= curlist2Rec.mix_roll_a%>
<%= curlist2Rec.mix_roll_b%>
<%= curlist2Rec.mix_roll_c%>
<%= curlist2Rec.mix_wgt_a%>
<%= curlist2Rec.mix_wgt_b%>
<%= curlist2Rec.mix_wgt_c%>
<%= curlist3Rec.issu_dt%>
<%= curlist3Rec.matr_cd%>
<%= curlist3Rec.papcmpy_cd%>
<%= curlist3Rec.roll_wgt%>
<%= curlist3Rec.somo_roll%>
<%= curlist3Rec.somo_wgt%>
<%= curlist3Rec.ord_roll%>
<%= curlist3Rec.ord_wgt%>
<%= curlist3Rec.car_occr_dt%>
<%= curlist3Rec.car_seq%>
<%= curlist3Rec.car_cnt%>
<%= curlist4Rec.issu_dt%>
<%= curlist4Rec.papcmpy_cd%>
<%= curlist4Rec.matr_cd%>
<%= curlist4Rec.roll_cnt%>
<%= curlist4Rec.wgt%>
<%= curlist4Rec.car_occr_dt%>
<%= curlist4Rec.car_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 23 18:51:23 KST 2009 */