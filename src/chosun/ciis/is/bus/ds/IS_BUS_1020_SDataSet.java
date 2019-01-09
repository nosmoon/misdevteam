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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1020_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_b = new ArrayList();
	public ArrayList curlist_a = new ArrayList();
	public ArrayList curlist_c = new ArrayList();
	public String errcode;
	public String errmsg;
	public String make_dt;
	public String make_seq;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String same;
	public String istt_dd;
	public String etc;
	public String thdd_rvord;
	public String nxtdd_plan;
	public String cash_clamt;
	public String note_clamt;
	public String chg_dt_tm;

	public IS_BUS_1020_SDataSet(){}
	public IS_BUS_1020_SDataSet(String errcode, String errmsg, String make_dt, String make_seq, String dept_cd, String sub_dept_cd, String chrg_pers, String same, String istt_dd, String etc, String thdd_rvord, String nxtdd_plan, String cash_clamt, String note_clamt, String chg_dt_tm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.make_dt = make_dt;
		this.make_seq = make_seq;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.same = same;
		this.istt_dd = istt_dd;
		this.etc = etc;
		this.thdd_rvord = thdd_rvord;
		this.nxtdd_plan = nxtdd_plan;
		this.cash_clamt = cash_clamt;
		this.note_clamt = note_clamt;
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setMake_seq(String make_seq){
		this.make_seq = make_seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSame(String same){
		this.same = same;
	}

	public void setIstt_dd(String istt_dd){
		this.istt_dd = istt_dd;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setThdd_rvord(String thdd_rvord){
		this.thdd_rvord = thdd_rvord;
	}

	public void setNxtdd_plan(String nxtdd_plan){
		this.nxtdd_plan = nxtdd_plan;
	}

	public void setCash_clamt(String cash_clamt){
		this.cash_clamt = cash_clamt;
	}

	public void setNote_clamt(String note_clamt){
		this.note_clamt = note_clamt;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getMake_seq(){
		return this.make_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSame(){
		return this.same;
	}

	public String getIstt_dd(){
		return this.istt_dd;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getThdd_rvord(){
		return this.thdd_rvord;
	}

	public String getNxtdd_plan(){
		return this.nxtdd_plan;
	}

	public String getCash_clamt(){
		return this.cash_clamt;
	}

	public String getNote_clamt(){
		return this.note_clamt;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.make_dt = Util.checkString(cstmt.getString(7));
		this.make_seq = Util.checkString(cstmt.getString(8));
		this.dept_cd = Util.checkString(cstmt.getString(9));
		this.sub_dept_cd = Util.checkString(cstmt.getString(10));
		this.chrg_pers = Util.checkString(cstmt.getString(11));
		this.same = Util.checkString(cstmt.getString(12));
		this.istt_dd = Util.checkString(cstmt.getString(13));
		this.etc = Util.checkString(cstmt.getString(14));
		this.thdd_rvord = Util.checkString(cstmt.getString(15));
		this.nxtdd_plan = Util.checkString(cstmt.getString(16));
		this.cash_clamt = Util.checkString(cstmt.getString(17));
		this.note_clamt = Util.checkString(cstmt.getString(18));
		this.chg_dt_tm = Util.checkString(cstmt.getString(19));
		ResultSet rset0 = (ResultSet) cstmt.getObject(20);
		while(rset0.next()){
			IS_BUS_1020_SCURLIST_ARecord rec = new IS_BUS_1020_SCURLIST_ARecord();
			rec.a_decid_pre_seq = Util.checkString(rset0.getString("a_decid_pre_seq"));
			rec.a_decid_pers = Util.checkString(rset0.getString("a_decid_pers"));
			rec.a_decid_pers_nm = Util.checkString(rset0.getString("a_decid_pers_nm"));
			rec.a_decid_pers_dty_cd = Util.checkString(rset0.getString("a_decid_pers_dty_cd"));
			rec.a_decid_pers_dty_cd_nm = Util.checkString(rset0.getString("a_decid_pers_dty_cd_nm"));
			rec.a_decid_yn = Util.checkString(rset0.getString("a_decid_yn"));
			rec.a_proc_dt = Util.checkString(rset0.getString("a_proc_dt"));
			rec.a_ordr_matt = Util.checkString(rset0.getString("a_ordr_matt"));
			this.curlist_a.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(21);
		while(rset1.next()){
			IS_BUS_1020_SCURLIST_BRecord rec = new IS_BUS_1020_SCURLIST_BRecord();
			rec.b_make_dtls_seq = Util.checkString(rset1.getString("b_make_dtls_seq"));
			rec.b_dlco = Util.checkString(rset1.getString("b_dlco"));
			rec.b_cns_tm = Util.checkString(rset1.getString("b_cns_tm"));
			rec.b_chrg_pers = Util.checkString(rset1.getString("b_chrg_pers"));
			rec.b_tel_no = Util.checkString(rset1.getString("b_tel_no"));
			rec.b_clsf = Util.checkString(rset1.getString("b_clsf"));
			rec.b_vist_purp = Util.checkString(rset1.getString("b_vist_purp"));
			rec.b_remk = Util.checkString(rset1.getString("b_remk"));
			this.curlist_b.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(22);
		while(rset2.next()){
			IS_BUS_1020_SCURLIST_CRecord rec = new IS_BUS_1020_SCURLIST_CRecord();
			rec.c_make_dtls_seq = Util.checkString(rset2.getString("c_make_dtls_seq"));
			rec.c_dlco = Util.checkString(rset2.getString("c_dlco"));
			rec.c_cns_tm = Util.checkString(rset2.getString("c_cns_tm"));
			rec.c_chrg_pers = Util.checkString(rset2.getString("c_chrg_pers"));
			rec.c_tel_no = Util.checkString(rset2.getString("c_tel_no"));
			rec.c_clsf = Util.checkString(rset2.getString("c_clsf"));
			rec.c_vist_purp = Util.checkString(rset2.getString("c_vist_purp"));
			rec.c_remk = Util.checkString(rset2.getString("c_remk"));
			this.curlist_c.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BUS_1020_SDataSet ds = (IS_BUS_1020_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_BUS_1020_SCURLIST_ARecord curlist_aRec = (IS_BUS_1020_SCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_b.size(); i++){
		IS_BUS_1020_SCURLIST_BRecord curlist_bRec = (IS_BUS_1020_SCURLIST_BRecord)ds.curlist_b.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_c.size(); i++){
		IS_BUS_1020_SCURLIST_CRecord curlist_cRec = (IS_BUS_1020_SCURLIST_CRecord)ds.curlist_c.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMake_dt()%>
<%= ds.getMake_seq()%>
<%= ds.getDept_cd()%>
<%= ds.getSub_dept_cd()%>
<%= ds.getChrg_pers()%>
<%= ds.getSame()%>
<%= ds.getIstt_dd()%>
<%= ds.getEtc()%>
<%= ds.getThdd_rvord()%>
<%= ds.getNxtdd_plan()%>
<%= ds.getCash_clamt()%>
<%= ds.getNote_clamt()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getCurlist_a()%>
<%= ds.getCurlist_b()%>
<%= ds.getCurlist_c()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.a_decid_pre_seq%>
<%= curlist_aRec.a_decid_pers%>
<%= curlist_aRec.a_decid_pers_nm%>
<%= curlist_aRec.a_decid_pers_dty_cd%>
<%= curlist_aRec.a_decid_pers_dty_cd_nm%>
<%= curlist_aRec.a_decid_yn%>
<%= curlist_aRec.a_proc_dt%>
<%= curlist_aRec.a_ordr_matt%>
<%= curlist_bRec.b_make_dtls_seq%>
<%= curlist_bRec.b_dlco%>
<%= curlist_bRec.b_cns_tm%>
<%= curlist_bRec.b_chrg_pers%>
<%= curlist_bRec.b_tel_no%>
<%= curlist_bRec.b_clsf%>
<%= curlist_bRec.b_vist_purp%>
<%= curlist_bRec.b_remk%>
<%= curlist_cRec.c_make_dtls_seq%>
<%= curlist_cRec.c_dlco%>
<%= curlist_cRec.c_cns_tm%>
<%= curlist_cRec.c_chrg_pers%>
<%= curlist_cRec.c_tel_no%>
<%= curlist_cRec.c_clsf%>
<%= curlist_cRec.c_vist_purp%>
<%= curlist_cRec.c_remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 07 19:41:22 KST 2012 */