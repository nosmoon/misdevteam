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


package chosun.ciis.pr.prtexec.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_5000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String clos_clsf;
	public String clos_clsf_nm;

	public PR_PRTEXEC_5000_LDataSet(){}
	public PR_PRTEXEC_5000_LDataSet(String errcode, String errmsg, String clos_clsf, String clos_clsf_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.clos_clsf = clos_clsf;
		this.clos_clsf_nm = clos_clsf_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setClos_clsf_nm(String clos_clsf_nm){
		this.clos_clsf_nm = clos_clsf_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getClos_clsf_nm(){
		return this.clos_clsf_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			PR_PRTEXEC_5000_LCURLIST1Record rec = new PR_PRTEXEC_5000_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.prt_clsf = Util.checkString(rset0.getString("prt_clsf"));
			rec.pap_std = Util.checkString(rset0.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.is_cnt_ex_yn = Util.checkString(rset0.getString("is_cnt_ex_yn"));
			rec.is_qty_inc_yn = Util.checkString(rset0.getString("is_qty_inc_yn"));
			rec.add_prt_seq = Util.checkString(rset0.getString("add_prt_seq"));
			rec.dual_out_clsf = Util.checkString(rset0.getString("dual_out_clsf"));
			rec.dual_out_nm = Util.checkString(rset0.getString("dual_out_nm"));
			rec.duty_ovt_prt_yn = Util.checkString(rset0.getString("duty_ovt_prt_yn"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.clos_clsf = Util.checkString(rset0.getString("clos_clsf"));
			rec.chg_yn = Util.checkString(rset0.getString("chg_yn"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			PR_PRTEXEC_5000_LCURLIST2Record rec = new PR_PRTEXEC_5000_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.hdqt_paper_clsf = Util.checkString(rset1.getString("hdqt_paper_clsf"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.prt_dt = Util.checkString(rset1.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			rec.prt_clsf = Util.checkString(rset1.getString("prt_clsf"));
			rec.pap_std = Util.checkString(rset1.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset1.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset1.getString("clr_pcnt"));
			rec.bw_pcnt = Util.checkString(rset1.getString("bw_pcnt"));
			rec.slip_qty = Util.checkString(rset1.getString("slip_qty"));
			rec.is_cnt_ex_yn = Util.checkString(rset1.getString("is_cnt_ex_yn"));
			rec.is_qty_inc_yn = Util.checkString(rset1.getString("is_qty_inc_yn"));
			rec.add_prt_seq = Util.checkString(rset1.getString("add_prt_seq"));
			rec.dual_out_clsf = Util.checkString(rset1.getString("dual_out_clsf"));
			rec.dual_out_nm = Util.checkString(rset1.getString("dual_out_nm"));
			rec.duty_ovt_prt_yn = Util.checkString(rset1.getString("duty_ovt_prt_yn"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.clos_clsf = Util.checkString(rset1.getString("clos_clsf"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			PR_PRTEXEC_5000_LCURLIST3Record rec = new PR_PRTEXEC_5000_LCURLIST3Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset2.getString("occr_dt"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.prt_dt = Util.checkString(rset2.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset2.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset2.getString("sect_nm"));
			rec.prt_clsf = Util.checkString(rset2.getString("prt_clsf"));
			rec.pap_std = Util.checkString(rset2.getString("pap_std"));
			rec.papcmpy_cd = Util.checkString(rset2.getString("papcmpy_cd"));
			rec.issu_pcnt = Util.checkString(rset2.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset2.getString("clr_pcnt"));
			rec.bw_pcnt = Util.checkString(rset2.getString("bw_pcnt"));
			rec.slip_qty = Util.checkString(rset2.getString("slip_qty"));
			rec.is_cnt_ex_yn = Util.checkString(rset2.getString("is_cnt_ex_yn"));
			rec.is_qty_inc_yn = Util.checkString(rset2.getString("is_qty_inc_yn"));
			rec.add_prt_seq = Util.checkString(rset2.getString("add_prt_seq"));
			rec.dual_out_clsf = Util.checkString(rset2.getString("dual_out_clsf"));
			rec.dual_out_nm = Util.checkString(rset2.getString("dual_out_nm"));
			rec.duty_ovt_prt_yn = Util.checkString(rset2.getString("duty_ovt_prt_yn"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			rec.clos_clsf = Util.checkString(rset2.getString("clos_clsf"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(12);
		while(rset3.next()){
			PR_PRTEXEC_5000_LCURLIST4Record rec = new PR_PRTEXEC_5000_LCURLIST4Record();
			rec.prt_dt = Util.checkString(rset3.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset3.getString("issu_dt"));
			rec.slip_qty = Util.checkString(rset3.getString("slip_qty"));
			rec.medi_cd = Util.checkString(rset3.getString("medi_cd"));
			this.curlist4.add(rec);
		}
		this.clos_clsf = Util.checkString(cstmt.getString(13));
		this.clos_clsf_nm = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_5000_LDataSet ds = (PR_PRTEXEC_5000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		PR_PRTEXEC_5000_LCURLIST1Record curlist1Rec = (PR_PRTEXEC_5000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		PR_PRTEXEC_5000_LCURLIST2Record curlist2Rec = (PR_PRTEXEC_5000_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		PR_PRTEXEC_5000_LCURLIST3Record curlist3Rec = (PR_PRTEXEC_5000_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		PR_PRTEXEC_5000_LCURLIST4Record curlist4Rec = (PR_PRTEXEC_5000_LCURLIST4Record)ds.curlist4.get(i);%>
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
<%= ds.getClos_clsf()%>
<%= ds.getClos_clsf_nm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.prt_dt%>
<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.sect_nm%>
<%= curlist1Rec.prt_clsf%>
<%= curlist1Rec.pap_std%>
<%= curlist1Rec.issu_pcnt%>
<%= curlist1Rec.clr_pcnt%>
<%= curlist1Rec.bw_pcnt%>
<%= curlist1Rec.slip_qty%>
<%= curlist1Rec.is_cnt_ex_yn%>
<%= curlist1Rec.is_qty_inc_yn%>
<%= curlist1Rec.add_prt_seq%>
<%= curlist1Rec.dual_out_clsf%>
<%= curlist1Rec.dual_out_nm%>
<%= curlist1Rec.duty_ovt_prt_yn%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.clos_clsf%>
<%= curlist1Rec.chg_yn%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.hdqt_paper_clsf%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.prt_dt%>
<%= curlist2Rec.issu_dt%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.sect_nm%>
<%= curlist2Rec.prt_clsf%>
<%= curlist2Rec.pap_std%>
<%= curlist2Rec.issu_pcnt%>
<%= curlist2Rec.clr_pcnt%>
<%= curlist2Rec.bw_pcnt%>
<%= curlist2Rec.slip_qty%>
<%= curlist2Rec.is_cnt_ex_yn%>
<%= curlist2Rec.is_qty_inc_yn%>
<%= curlist2Rec.add_prt_seq%>
<%= curlist2Rec.dual_out_clsf%>
<%= curlist2Rec.dual_out_nm%>
<%= curlist2Rec.duty_ovt_prt_yn%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.clos_clsf%>
<%= curlist3Rec.cmpy_cd%>
<%= curlist3Rec.occr_dt%>
<%= curlist3Rec.seq%>
<%= curlist3Rec.prt_dt%>
<%= curlist3Rec.issu_dt%>
<%= curlist3Rec.fac_clsf%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.sect_cd%>
<%= curlist3Rec.sect_nm%>
<%= curlist3Rec.prt_clsf%>
<%= curlist3Rec.pap_std%>
<%= curlist3Rec.papcmpy_cd%>
<%= curlist3Rec.issu_pcnt%>
<%= curlist3Rec.clr_pcnt%>
<%= curlist3Rec.bw_pcnt%>
<%= curlist3Rec.slip_qty%>
<%= curlist3Rec.is_cnt_ex_yn%>
<%= curlist3Rec.is_qty_inc_yn%>
<%= curlist3Rec.add_prt_seq%>
<%= curlist3Rec.dual_out_clsf%>
<%= curlist3Rec.dual_out_nm%>
<%= curlist3Rec.duty_ovt_prt_yn%>
<%= curlist3Rec.remk%>
<%= curlist3Rec.clos_clsf%>
<%= curlist4Rec.prt_dt%>
<%= curlist4Rec.issu_dt%>
<%= curlist4Rec.slip_qty%>
<%= curlist4Rec.medi_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 09 00:29:08 KST 2009 */