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


package chosun.ciis.mt.submatrstok.ds;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrstok.dm.*;
import chosun.ciis.mt.submatrstok.rec.*;

/**
 * 
 */


public class MT_SUBMATRSTOK_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String remk;
	public String clos_yn;
	public String clos_nm;
	
	public MT_SUBMATRSTOK_1010_LDataSet(){}
	public MT_SUBMATRSTOK_1010_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}
	
	public void setRemk(String remk){
		this.remk = remk;
	}
	
	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}
	
	public void setClos_nm(String clos_nm){
		this.clos_nm = clos_nm;
	}
	
	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	public String getRemk(){
		return this.remk;
	}
	
	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_nm(){
		return this.clos_nm;
	}
	
	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_SUBMATRSTOK_1010_LCURLIST1Record rec = new MT_SUBMATRSTOK_1010_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.clr_pcnt = Util.checkString(rset0.getString("clr_pcnt"));
			rec.bw_pcnt = Util.checkString(rset0.getString("bw_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.prt_bgn_tm = Util.checkString(rset0.getString("prt_bgn_tm"));
			rec.prt_end_tm = Util.checkString(rset0.getString("prt_end_tm"));
			rec.real_prt_qty = Util.checkString(rset0.getString("real_prt_qty"));
			rec.err_tms = Util.checkString(rset0.getString("err_tms"));
			        
		
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_SUBMATRSTOK_1010_LCURLIST2Record rec = new MT_SUBMATRSTOK_1010_LCURLIST2Record();
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.unit = Util.checkString(rset1.getString("unit"));
			rec.befor_wgt = Util.checkString(rset1.getString("befor_wgt"));
			rec.ewh_wgt = Util.checkString(rset1.getString("ewh_wgt"));
			rec.use_qunt = Util.checkString(rset1.getString("use_qunt"));
			rec.jego_wgt = Util.checkString(rset1.getString("jego_wgt"));
			rec.mm_ewh_wgt = Util.checkString(rset1.getString("mm_ewh_wgt"));
			rec.mm_req_wgt = Util.checkString(rset1.getString("mm_req_wgt"));
			rec.req_wgt = Util.checkString(rset1.getString("req_wgt"));
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.req_remk = Util.checkString(rset1.getString("req_remk"));
			
			this.curlist2.add(rec);
		}
		this.remk = Util.checkString(cstmt.getString(8));
		this.clos_yn = Util.checkString(cstmt.getString(9));
		this.clos_nm = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBSMATRSTOK_1010_LDataSet ds = (MT_SUBSMATRSTOK_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_SUBSMATRSTOK_1010_LCURLIST1Record curlist1Rec = (MT_SUBSMATRSTOK_1010_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
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
<%= curlist1Rec.gnr_qty%>
<%= curlist1Rec.spsl_qty%>
<%= curlist1Rec.gnr_add_qty%>
<%= curlist1Rec.spsl_add_qty%>
<%= curlist1Rec.chg_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 03 15:52:38 KST 2013 */