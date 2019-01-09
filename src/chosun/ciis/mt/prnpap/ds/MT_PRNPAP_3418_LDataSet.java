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


public class MT_PRNPAP_3418_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String wgt_clsf;
	public String stat_flag;

	public MT_PRNPAP_3418_LDataSet(){}
	public MT_PRNPAP_3418_LDataSet(String errcode, String errmsg, String wgt_clsf, String stat_flag){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.wgt_clsf = wgt_clsf;
		this.stat_flag = stat_flag;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setWgt_clsf(String wgt_clsf){
		this.wgt_clsf = wgt_clsf;
	}

	public void setStat_flag(String stat_flag){
		this.stat_flag = stat_flag;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getWgt_clsf(){
		return this.wgt_clsf;
	}

	public String getStat_flag(){
		return this.stat_flag;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PRNPAP_3418_LCURLISTRecord rec = new MT_PRNPAP_3418_LCURLISTRecord();
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
			MT_PRNPAP_3418_LCURLIST1Record rec = new MT_PRNPAP_3418_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.hdqt_paper_clsf = Util.checkString(rset1.getString("hdqt_paper_clsf"));
			rec.prt_dt = Util.checkString(rset1.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.pap_std = Util.checkString(rset1.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset1.getString("issu_pcnt"));
			rec.slip_qty = Util.checkString(rset1.getString("slip_qty"));
			rec.papcmpy_cd = Util.checkString(rset1.getString("papcmpy_cd"));
			rec.matr_cd_a = Util.checkString(rset1.getString("matr_cd_a"));
			rec.use_qunt_a = Util.checkString(rset1.getString("use_qunt_a"));
			rec.matr_cd_b = Util.checkString(rset1.getString("matr_cd_b"));
			rec.use_qunt_b = Util.checkString(rset1.getString("use_qunt_b"));
			rec.matr_cd_c = Util.checkString(rset1.getString("matr_cd_c"));
			rec.use_qunt_c = Util.checkString(rset1.getString("use_qunt_c"));
			rec.use_qunt_tot = Util.checkString(rset1.getString("use_qunt_tot"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_PRNPAP_3418_LCURLIST2Record rec = new MT_PRNPAP_3418_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset2.getString("occr_dt"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.hdqt_paper_clsf = Util.checkString(rset2.getString("hdqt_paper_clsf"));
			rec.prt_dt = Util.checkString(rset2.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.pap_std = Util.checkString(rset2.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset2.getString("issu_pcnt"));
			rec.slip_qty = Util.checkString(rset2.getString("slip_qty"));
			rec.papcmpy_cd = Util.checkString(rset2.getString("papcmpy_cd"));
			rec.bw_pj_wgt = Util.checkString(rset2.getString("bw_pj_wgt"));
			rec.matr_cd_a = Util.checkString(rset2.getString("matr_cd_a"));
			rec.use_qunt_a = Util.checkString(rset2.getString("use_qunt_a"));
			rec.matr_cd_b = Util.checkString(rset2.getString("matr_cd_b"));
			rec.use_qunt_b = Util.checkString(rset2.getString("use_qunt_b"));
			rec.matr_cd_c = Util.checkString(rset2.getString("matr_cd_c"));
			rec.use_qunt_c = Util.checkString(rset2.getString("use_qunt_c"));
			rec.use_qunt_tot = Util.checkString(rset2.getString("use_qunt_tot"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			MT_PRNPAP_3418_LCURLIST3Record rec = new MT_PRNPAP_3418_LCURLIST3Record();
			rec.title = Util.checkString(rset3.getString("title"));
			rec.medi_cd_nm = Util.checkString(rset3.getString("medi_cd_nm"));
			rec.sect_cd_nm = Util.checkString(rset3.getString("sect_cd_nm"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset3.getString("mang_cd_1"));
			rec.tmpdata = Util.checkString(rset3.getString("tmpdata"));
			rec.cnt = Util.checkString(rset3.getString("cnt"));
			rec.wgt = Util.checkString(rset3.getString("wgt"));
			rec.hdqt_paper_clsf = Util.checkString(rset3.getString("hdqt_paper_clsf"));
			rec.medi_cd = Util.checkString(rset3.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset3.getString("sect_cd"));
			rec.pre_prt_clsf = Util.checkString(rset3.getString("pre_prt_clsf"));
			rec.issu_dt = Util.checkString(rset3.getString("issu_dt"));
			rec.prt_dt = Util.checkString(rset3.getString("prt_dt"));
			this.curlist3.add(rec);
		}
		this.wgt_clsf = Util.checkString(cstmt.getString(10));
		this.stat_flag = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3418_LDataSet ds = (MT_PRNPAP_3418_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_3418_LCURLISTRecord curlistRec = (MT_PRNPAP_3418_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PRNPAP_3418_LCURLIST1Record curlist1Rec = (MT_PRNPAP_3418_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PRNPAP_3418_LCURLIST2Record curlist2Rec = (MT_PRNPAP_3418_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_PRNPAP_3418_LCURLIST3Record curlist3Rec = (MT_PRNPAP_3418_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getWgt_clsf()%>
<%= ds.getStat_flag()%>
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
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.hdqt_paper_clsf%>
<%= curlist1Rec.prt_dt%>
<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.pap_std%>
<%= curlist1Rec.issu_pcnt%>
<%= curlist1Rec.slip_qty%>
<%= curlist1Rec.papcmpy_cd%>
<%= curlist1Rec.matr_cd_a%>
<%= curlist1Rec.use_qunt_a%>
<%= curlist1Rec.matr_cd_b%>
<%= curlist1Rec.use_qunt_b%>
<%= curlist1Rec.matr_cd_c%>
<%= curlist1Rec.use_qunt_c%>
<%= curlist1Rec.use_qunt_tot%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.hdqt_paper_clsf%>
<%= curlist2Rec.prt_dt%>
<%= curlist2Rec.issu_dt%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.pap_std%>
<%= curlist2Rec.issu_pcnt%>
<%= curlist2Rec.slip_qty%>
<%= curlist2Rec.papcmpy_cd%>
<%= curlist2Rec.bw_pj_wgt%>
<%= curlist2Rec.matr_cd_a%>
<%= curlist2Rec.use_qunt_a%>
<%= curlist2Rec.matr_cd_b%>
<%= curlist2Rec.use_qunt_b%>
<%= curlist2Rec.matr_cd_c%>
<%= curlist2Rec.use_qunt_c%>
<%= curlist2Rec.use_qunt_tot%>
<%= curlist3Rec.title%>
<%= curlist3Rec.medi_cd_nm%>
<%= curlist3Rec.sect_cd_nm%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.mang_cd_1%>
<%= curlist3Rec.tmpdata%>
<%= curlist3Rec.cnt%>
<%= curlist3Rec.wgt%>
<%= curlist3Rec.hdqt_paper_clsf%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.sect_cd%>
<%= curlist3Rec.pre_prt_clsf%>
<%= curlist3Rec.issu_dt%>
<%= curlist3Rec.prt_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 27 14:47:53 KST 2017 */