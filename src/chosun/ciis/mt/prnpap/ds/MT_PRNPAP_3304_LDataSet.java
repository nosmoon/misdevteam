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


package chosun.ciis.mt.prnpap.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3304_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PRNPAP_3304_LDataSet(){}
	public MT_PRNPAP_3304_LDataSet(String errcode, String errmsg){
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
			MT_PRNPAP_3304_LCURLISTRecord rec = new MT_PRNPAP_3304_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.pap_cmpy = Util.checkString(rset0.getString("pap_cmpy"));
			rec.paper_clsf_cd = Util.checkString(rset0.getString("paper_clsf_cd"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.fr_roll = Util.checkString(rset0.getString("fr_roll"));
			rec.fr_wt = Util.checkString(rset0.getString("fr_wt"));
			rec.rem_qunt_cnt = Util.checkString(rset0.getString("rem_qunt_cnt"));
			rec.rem_qunt_wgt = Util.checkString(rset0.getString("rem_qunt_wgt"));
			rec.somo_roll = Util.checkString(rset0.getString("somo_roll"));
			rec.somo_wgt = Util.checkString(rset0.getString("somo_wgt"));
			rec.ewh_roll_cnt = Util.checkString(rset0.getString("ewh_roll_cnt"));
			rec.ewh_wgt = Util.checkString(rset0.getString("ewh_wgt"));
			rec.ewh_roll_cnt_to = Util.checkString(rset0.getString("ewh_roll_cnt_to"));
			rec.ewh_wgt_to = Util.checkString(rset0.getString("ewh_wgt_to"));
			rec.cnsm_qunt = Util.checkString(rset0.getString("cnsm_qunt"));
			rec.wht_pj_retngod_wgt = Util.checkString(rset0.getString("wht_pj_retngod_wgt"));
			rec.sum_wht_pj_retngod_wgt = Util.checkString(rset0.getString("sum_wht_pj_retngod_wgt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.roll_wgt = Util.checkString(rset0.getString("roll_wgt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_PRNPAP_3304_LCURLIST1Record rec = new MT_PRNPAP_3304_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.papcmpy_cd = Util.checkString(rset1.getString("papcmpy_cd"));
			rec.rot_mach_no = Util.checkString(rset1.getString("rot_mach_no"));
			rec.sett_no = Util.checkString(rset1.getString("sett_no"));
			rec.sett_seq = Util.checkString(rset1.getString("sett_seq"));
			rec.a_cmcnt_val_cnt = Util.checkString(rset1.getString("a_cmcnt_val_cnt"));
			rec.a_wgt = Util.checkString(rset1.getString("a_wgt"));
			rec.a_un_use_yn = Util.checkString(rset1.getString("a_un_use_yn"));
			rec.b_cmcnt_val_cnt = Util.checkString(rset1.getString("b_cmcnt_val_cnt"));
			rec.b_wgt = Util.checkString(rset1.getString("b_wgt"));
			rec.b_un_use_yn = Util.checkString(rset1.getString("b_un_use_yn"));
			rec.c_cmcnt_val_cnt = Util.checkString(rset1.getString("c_cmcnt_val_cnt"));
			rec.c_wgt = Util.checkString(rset1.getString("c_wgt"));
			rec.c_un_use_yn = Util.checkString(rset1.getString("c_un_use_yn"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3304_LDataSet ds = (MT_PRNPAP_3304_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_3304_LCURLISTRecord curlistRec = (MT_PRNPAP_3304_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PRNPAP_3304_LCURLIST1Record curlist1Rec = (MT_PRNPAP_3304_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.pap_cmpy%>
<%= curlistRec.paper_clsf_cd%>
<%= curlistRec.matr_cd%>
<%= curlistRec.fr_roll%>
<%= curlistRec.fr_wt%>
<%= curlistRec.rem_qunt_cnt%>
<%= curlistRec.rem_qunt_wgt%>
<%= curlistRec.somo_roll%>
<%= curlistRec.somo_wgt%>
<%= curlistRec.ewh_roll_cnt%>
<%= curlistRec.ewh_wgt%>
<%= curlistRec.ewh_roll_cnt_to%>
<%= curlistRec.ewh_wgt_to%>
<%= curlistRec.cnsm_qunt%>
<%= curlistRec.wht_pj_retngod_wgt%>
<%= curlistRec.sum_wht_pj_retngod_wgt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.roll_wgt%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.papcmpy_cd%>
<%= curlist1Rec.rot_mach_no%>
<%= curlist1Rec.sett_no%>
<%= curlist1Rec.sett_seq%>
<%= curlist1Rec.a_cmcnt_val_cnt%>
<%= curlist1Rec.a_wgt%>
<%= curlist1Rec.a_un_use_yn%>
<%= curlist1Rec.b_cmcnt_val_cnt%>
<%= curlist1Rec.b_wgt%>
<%= curlist1Rec.b_un_use_yn%>
<%= curlist1Rec.c_cmcnt_val_cnt%>
<%= curlist1Rec.c_wgt%>
<%= curlist1Rec.c_un_use_yn%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.issu_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 08 17:53:16 KST 2017 */