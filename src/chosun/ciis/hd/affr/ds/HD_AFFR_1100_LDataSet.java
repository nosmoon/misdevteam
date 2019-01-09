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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1100_LDataSet(){}
	public HD_AFFR_1100_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			HD_AFFR_1100_LCURLISTRecord rec = new HD_AFFR_1100_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.use_frdt = Util.checkString(rset0.getString("use_frdt"));
			rec.use_todt = Util.checkString(rset0.getString("use_todt"));
			rec.use_dds = Util.checkString(rset0.getString("use_dds"));
			rec.preng_condo_area_cd_1 = Util.checkString(rset0.getString("preng_condo_area_cd_1"));
			rec.preng_condo_cd_1 = Util.checkString(rset0.getString("preng_condo_cd_1"));
			rec.preng_condo_nm_1 = Util.checkString(rset0.getString("preng_condo_nm_1"));
			rec.preng_condo_area_cd_2 = Util.checkString(rset0.getString("preng_condo_area_cd_2"));
			rec.preng_condo_cd_2 = Util.checkString(rset0.getString("preng_condo_cd_2"));
			rec.preng_condo_nm_2 = Util.checkString(rset0.getString("preng_condo_nm_2"));
			rec.real_preng_condo_area_cd = Util.checkString(rset0.getString("real_preng_condo_area_cd"));
			rec.real_preng_condo_cd = Util.checkString(rset0.getString("real_preng_condo_cd"));
			rec.real_preng_condo_nm = Util.checkString(rset0.getString("real_preng_condo_nm"));
			rec.preng_no = Util.checkString(rset0.getString("preng_no"));
			rec.cmpy_sply_use_yn = Util.checkString(rset0.getString("cmpy_sply_use_yn"));
			rec.cmpy_sply_use_yn_nm = Util.checkString(rset0.getString("cmpy_sply_use_yn_nm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.email_addr = Util.checkString(rset0.getString("email_addr"));
			rec.use_pay_amt = Util.checkString(rset0.getString("use_pay_amt"));
			rec.slf_burd_amt = Util.checkString(rset0.getString("slf_burd_amt"));
			rec.cmpy_sply_amt = Util.checkString(rset0.getString("cmpy_sply_amt"));
			rec.slf_drbk_amt = Util.checkString(rset0.getString("slf_drbk_amt"));
			rec.guest_room_fee_tot_amt = Util.checkString(rset0.getString("guest_room_fee_tot_amt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.noti_yn = Util.checkString(rset0.getString("noti_yn"));
			rec.noti_yn_nm = Util.checkString(rset0.getString("noti_yn_nm"));
			rec.drbk_obj_yn = Util.checkString(rset0.getString("drbk_obj_yn"));
			rec.drbk_obj_yn_nm = Util.checkString(rset0.getString("drbk_obj_yn_nm"));
			rec.preng_canc_yn = Util.checkString(rset0.getString("preng_canc_yn"));
			rec.preng_canc_yn_nm = Util.checkString(rset0.getString("preng_canc_yn_nm"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.aplc_seq = Util.checkString(rset0.getString("aplc_seq"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.guest_room_cnt = Util.checkString(rset0.getString("guest_room_cnt"));
			rec.dds_send_do_it_day = Util.checkString(rset0.getString("dds_send_do_it_day"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.remk_adm = Util.checkString(rset0.getString("remk_adm"));
			rec.aplc_amt = Util.checkString(rset0.getString("aplc_amt"));
			rec.rcpt_clsf = Util.checkString(rset0.getString("rcpt_clsf"));
			rec.rcpt_nm = Util.checkString(rset0.getString("rcpt_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(15);
		while(rset1.next()){
			HD_AFFR_1100_LCURLIST1Record rec = new HD_AFFR_1100_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.flnm = Util.checkString(rset1.getString("flnm"));
			rec.tmp_dr_amt = Util.checkString(rset1.getString("tmp_dr_amt"));
			rec.tmp_crdt_amt = Util.checkString(rset1.getString("tmp_crdt_amt"));
			rec.titl = Util.checkString(rset1.getString("titl"));
			rec.actu_slip_no = Util.checkString(rset1.getString("actu_slip_no"));
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_clsf_cd = Util.checkString(rset1.getString("slip_clsf_cd"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.incmg_pers = Util.checkString(rset1.getString("incmg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset1.getString("incmg_pers_ipadd"));
			rec.proc_stat = Util.checkString(rset1.getString("proc_stat"));
			rec.titl2 = Util.checkString(rset1.getString("titl2"));
			rec.slip_proc_mang_dt = Util.checkString(rset1.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset1.getString("slip_proc_mang_seq"));
			rec.cmpy_welf_fund_clsf = Util.checkString(rset1.getString("cmpy_welf_fund_clsf"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.rcpt_clsf = Util.checkString(rset1.getString("rcpt_clsf"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_1100_LDataSet ds = (HD_AFFR_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_1100_LCURLISTRecord curlistRec = (HD_AFFR_1100_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_AFFR_1100_LCURLIST1Record curlist1Rec = (HD_AFFR_1100_LCURLIST1Record)ds.curlist1.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.use_frdt%>
<%= curlistRec.use_todt%>
<%= curlistRec.use_dds%>
<%= curlistRec.preng_condo_area_cd_1%>
<%= curlistRec.preng_condo_cd_1%>
<%= curlistRec.preng_condo_nm_1%>
<%= curlistRec.preng_condo_area_cd_2%>
<%= curlistRec.preng_condo_cd_2%>
<%= curlistRec.preng_condo_nm_2%>
<%= curlistRec.real_preng_condo_area_cd%>
<%= curlistRec.real_preng_condo_cd%>
<%= curlistRec.real_preng_condo_nm%>
<%= curlistRec.preng_no%>
<%= curlistRec.cmpy_sply_use_yn%>
<%= curlistRec.cmpy_sply_use_yn_nm%>
<%= curlistRec.tel_no%>
<%= curlistRec.ptph_no%>
<%= curlistRec.email_addr%>
<%= curlistRec.use_pay_amt%>
<%= curlistRec.slf_burd_amt%>
<%= curlistRec.cmpy_sply_amt%>
<%= curlistRec.slf_drbk_amt%>
<%= curlistRec.guest_room_fee_tot_amt%>
<%= curlistRec.remk%>
<%= curlistRec.noti_yn%>
<%= curlistRec.noti_yn_nm%>
<%= curlistRec.drbk_obj_yn%>
<%= curlistRec.drbk_obj_yn_nm%>
<%= curlistRec.preng_canc_yn%>
<%= curlistRec.preng_canc_yn_nm%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.aplc_dt%>
<%= curlistRec.aplc_seq%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.guest_room_cnt%>
<%= curlistRec.dds_send_do_it_day%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.emp_clsf%>
<%= curlistRec.remk_adm%>
<%= curlistRec.aplc_amt%>
<%= curlistRec.rcpt_clsf%>
<%= curlistRec.rcpt_nm%>
<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.flnm%>
<%= curlist1Rec.tmp_dr_amt%>
<%= curlist1Rec.tmp_crdt_amt%>
<%= curlist1Rec.titl%>
<%= curlist1Rec.actu_slip_no%>
<%= curlist1Rec.slip_occr_dt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.slip_seq%>
<%= curlist1Rec.incmg_pers%>
<%= curlist1Rec.incmg_pers_ipadd%>
<%= curlist1Rec.proc_stat%>
<%= curlist1Rec.titl2%>
<%= curlist1Rec.slip_proc_mang_dt%>
<%= curlist1Rec.slip_proc_mang_seq%>
<%= curlist1Rec.cmpy_welf_fund_clsf%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.rcpt_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 08 17:20:18 KST 2013 */