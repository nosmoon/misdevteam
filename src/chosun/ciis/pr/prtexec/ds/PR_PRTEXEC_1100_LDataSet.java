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


public class PR_PRTEXEC_1100_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTEXEC_1100_LDataSet(){}
	public PR_PRTEXEC_1100_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			PR_PRTEXEC_1100_LCURLISTRecord rec = new PR_PRTEXEC_1100_LCURLISTRecord();
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.ecnt = Util.checkString(rset0.getString("ecnt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.new_yn = Util.checkString(rset0.getString("new_yn"));
			rec.clr_off_plat_tm = Util.checkString(rset0.getString("clr_off_plat_tm"));
			rec.trsm_end_tm = Util.checkString(rset0.getString("trsm_end_tm"));
			rec.off_plat_end_tm = Util.checkString(rset0.getString("off_plat_end_tm"));
			rec.prt_bgn_tm = Util.checkString(rset0.getString("prt_bgn_tm"));
			rec.prt_end_tm = Util.checkString(rset0.getString("prt_end_tm"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.real_prt_qty = Util.checkString(rset0.getString("real_prt_qty"));
			rec.bad_nwsp_qty = Util.checkString(rset0.getString("bad_nwsp_qty"));
			rec.card_qty = Util.checkString(rset0.getString("card_qty"));
			rec.dqty = Util.checkString(rset0.getString("dqty"));
			rec.dt_tm_stop_tms = Util.checkString(rset0.getString("dt_tm_stop_tms"));
			rec.fail_tms = Util.checkString(rset0.getString("fail_tms"));
			rec.apcut_err_tms = Util.checkString(rset0.getString("apcut_err_tms"));
			rec.driv_susp_prgr_tms = Util.checkString(rset0.getString("driv_susp_prgr_tms"));
			rec.basi_clr_off_plat_tm = Util.checkString(rset0.getString("basi_clr_off_plat_tm"));
			rec.basi_off_plat_tm = Util.checkString(rset0.getString("basi_off_plat_tm"));
			rec.basi_trsm_end_tm = Util.checkString(rset0.getString("basi_trsm_end_tm"));
			rec.basi_prt_bgn_tm = Util.checkString(rset0.getString("basi_prt_bgn_tm"));
			rec.basi_prt_end_tm = Util.checkString(rset0.getString("basi_prt_end_tm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.prt_ex_qunt = Util.checkString(rset0.getString("prt_ex_qunt"));
			rec.out_gate = Util.checkString(rset0.getString("out_gate"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTEXEC_1100_LDataSet ds = (PR_PRTEXEC_1100_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTEXEC_1100_LCURLISTRecord curlistRec = (PR_PRTEXEC_1100_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.prt_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.ecnt%>
<%= curlistRec.seq%>
<%= curlistRec.new_yn%>
<%= curlistRec.clr_off_plat_tm%>
<%= curlistRec.trsm_end_tm%>
<%= curlistRec.off_plat_end_tm%>
<%= curlistRec.prt_bgn_tm%>
<%= curlistRec.prt_end_tm%>
<%= curlistRec.slip_qty%>
<%= curlistRec.real_prt_qty%>
<%= curlistRec.bad_nwsp_qty%>
<%= curlistRec.card_qty%>
<%= curlistRec.dqty%>
<%= curlistRec.dt_tm_stop_tms%>
<%= curlistRec.fail_tms%>
<%= curlistRec.apcut_err_tms%>
<%= curlistRec.driv_susp_prgr_tms%>
<%= curlistRec.basi_clr_off_plat_tm%>
<%= curlistRec.basi_off_plat_tm%>
<%= curlistRec.basi_trsm_end_tm%>
<%= curlistRec.basi_prt_bgn_tm%>
<%= curlistRec.basi_prt_end_tm%>
<%= curlistRec.remk%>
<%= curlistRec.prt_ex_qunt%>
<%= curlistRec.out_gate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 28 19:34:34 KST 2009 */