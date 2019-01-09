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


public class HD_AFFR_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_2310_LDataSet(){}
	public HD_AFFR_2310_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_2310_LCURLISTRecord rec = new HD_AFFR_2310_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.ofcr_clsf = Util.checkString(rset0.getString("ofcr_clsf"));
			rec.pay_plac_clsf = Util.checkString(rset0.getString("pay_plac_clsf"));
			rec.congr_condl_dt = Util.checkString(rset0.getString("congr_condl_dt"));
			rec.congr_condl_cd = Util.checkString(rset0.getString("congr_condl_cd"));
			rec.congr_condl_fee = Util.checkString(rset0.getString("congr_condl_fee"));
			rec.art_flower = Util.checkString(rset0.getString("art_flower"));
			rec.ofcr_congr_condl_fee = Util.checkString(rset0.getString("ofcr_congr_condl_fee"));
			rec.ofcr_art_flower = Util.checkString(rset0.getString("ofcr_art_flower"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.congr_condl_nm = Util.checkString(rset0.getString("congr_condl_nm"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.slip_proc_seq = Util.checkString(rset0.getString("slip_proc_seq"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.actu_slip_no = Util.checkString(rset0.getString("actu_slip_no"));
			rec.cmpy_welf_fund_clsf = Util.checkString(rset0.getString("cmpy_welf_fund_clsf"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(15);
		while(rset1.next()){
			HD_AFFR_2310_LCURLIST1Record rec = new HD_AFFR_2310_LCURLIST1Record();
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
			rec.slip_proc_mang_dt = Util.checkString(rset1.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset1.getString("slip_proc_mang_seq"));
			rec.cmpy_welf_fund_clsf = Util.checkString(rset1.getString("cmpy_welf_fund_clsf"));
			rec.titl2 = Util.checkString(rset1.getString("titl2"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_2310_LDataSet ds = (HD_AFFR_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_2310_LCURLISTRecord curlistRec = (HD_AFFR_2310_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_AFFR_2310_LCURLIST1Record curlist1Rec = (HD_AFFR_2310_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.ofcr_clsf%>
<%= curlistRec.pay_plac_clsf%>
<%= curlistRec.congr_condl_dt%>
<%= curlistRec.congr_condl_cd%>
<%= curlistRec.congr_condl_fee%>
<%= curlistRec.art_flower%>
<%= curlistRec.ofcr_congr_condl_fee%>
<%= curlistRec.ofcr_art_flower%>
<%= curlistRec.remk%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.congr_condl_nm%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.slip_proc_seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.cmpy_welf_fund_clsf%>
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
<%= curlist1Rec.slip_proc_mang_dt%>
<%= curlist1Rec.slip_proc_mang_seq%>
<%= curlist1Rec.cmpy_welf_fund_clsf%>
<%= curlist1Rec.titl2%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 18 14:52:06 KST 2013 */