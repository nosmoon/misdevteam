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


public class MT_PRNPAP_3006_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String wgt_clsf;
	public String stat_flag;

	public MT_PRNPAP_3006_LDataSet(){}
	public MT_PRNPAP_3006_LDataSet(String errcode, String errmsg, String wgt_clsf, String stat_flag){
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
			MT_PRNPAP_3006_LCURLISTRecord rec = new MT_PRNPAP_3006_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.paper_cmpy = Util.checkString(rset0.getString("paper_cmpy"));
			rec.paper_cmpy_nm = Util.checkString(rset0.getString("paper_cmpy_nm"));
			rec.paper_clsf_cd = Util.checkString(rset0.getString("paper_clsf_cd"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.roll_cnt = Util.checkString(rset0.getString("roll_cnt"));
			rec.wgt = Util.checkString(rset0.getString("wgt"));
			rec.roll_wgt = Util.checkString(rset0.getString("roll_wgt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_PRNPAP_3006_LCURLIST1Record rec = new MT_PRNPAP_3006_LCURLIST1Record();
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.paper_loca_clsf = Util.checkString(rset1.getString("paper_loca_clsf"));
			rec.papcmpy_cd = Util.checkString(rset1.getString("papcmpy_cd"));
			rec.a_rem_qunt_cnt = Util.checkString(rset1.getString("a_rem_qunt_cnt"));
			rec.a_rem_qunt_wgt = Util.checkString(rset1.getString("a_rem_qunt_wgt"));
			rec.a_un_use_roll_cnt = Util.checkString(rset1.getString("a_un_use_roll_cnt"));
			rec.a_roll_wgt = Util.checkString(rset1.getString("a_roll_wgt"));
			rec.b_rem_qunt_cnt = Util.checkString(rset1.getString("b_rem_qunt_cnt"));
			rec.b_rem_qunt_wgt = Util.checkString(rset1.getString("b_rem_qunt_wgt"));
			rec.b_un_use_roll_cnt = Util.checkString(rset1.getString("b_un_use_roll_cnt"));
			rec.b_roll_wgt = Util.checkString(rset1.getString("b_roll_wgt"));
			rec.c_rem_qunt_cnt = Util.checkString(rset1.getString("c_rem_qunt_cnt"));
			rec.c_rem_qunt_wgt = Util.checkString(rset1.getString("c_rem_qunt_wgt"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.issu_dt = Util.checkString(rset1.getString("issu_dt"));
			rec.c_un_use_roll_cnt = Util.checkString(rset1.getString("c_un_use_roll_cnt"));
			rec.c_roll_wgt = Util.checkString(rset1.getString("c_roll_wgt"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_PRNPAP_3006_LCURLIST2Record rec = new MT_PRNPAP_3006_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset2.getString("fac_clsf"));
			rec.papcmpy_cd = Util.checkString(rset2.getString("papcmpy_cd"));
			rec.rot_mach_no = Util.checkString(rset2.getString("rot_mach_no"));
			rec.sett_no = Util.checkString(rset2.getString("sett_no"));
			rec.sett_seq = Util.checkString(rset2.getString("sett_seq"));
			rec.a_cmcnt_val_cnt = Util.checkString(rset2.getString("a_cmcnt_val_cnt"));
			rec.a_wgt = Util.checkString(rset2.getString("a_wgt"));
			rec.a_un_use_yn = Util.checkString(rset2.getString("a_un_use_yn"));
			rec.b_cmcnt_val_cnt = Util.checkString(rset2.getString("b_cmcnt_val_cnt"));
			rec.b_wgt = Util.checkString(rset2.getString("b_wgt"));
			rec.b_un_use_yn = Util.checkString(rset2.getString("b_un_use_yn"));
			rec.c_cmcnt_val_cnt = Util.checkString(rset2.getString("c_cmcnt_val_cnt"));
			rec.c_wgt = Util.checkString(rset2.getString("c_wgt"));
			rec.c_un_use_yn = Util.checkString(rset2.getString("c_un_use_yn"));
			rec.occr_dt = Util.checkString(rset2.getString("occr_dt"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			MT_PRNPAP_3006_LCURLIST3Record rec = new MT_PRNPAP_3006_LCURLIST3Record();
			rec.paper_clsf_cd = Util.checkString(rset3.getString("paper_clsf_cd"));
			rec.matr_cd = Util.checkString(rset3.getString("matr_cd"));
			rec.roll_wgt = Util.checkString(rset3.getString("roll_wgt"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			MT_PRNPAP_3006_LCURLIST4Record rec = new MT_PRNPAP_3006_LCURLIST4Record();
			rec.cmpy_cd = Util.checkString(rset4.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset4.getString("occr_dt"));
			rec.seq = Util.checkString(rset4.getString("seq"));
			rec.hdqt_paper_clsf = Util.checkString(rset4.getString("hdqt_paper_clsf"));
			rec.prt_dt = Util.checkString(rset4.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset4.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset4.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset4.getString("sect_cd"));
			rec.pap_std = Util.checkString(rset4.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset4.getString("issu_pcnt"));
			rec.slip_qty = Util.checkString(rset4.getString("slip_qty"));
			rec.papcmpy_cd = Util.checkString(rset4.getString("papcmpy_cd"));
			rec.matr_cd_a = Util.checkString(rset4.getString("matr_cd_a"));
			rec.use_qunt_a = Util.checkString(rset4.getString("use_qunt_a"));
			rec.matr_cd_b = Util.checkString(rset4.getString("matr_cd_b"));
			rec.use_qunt_b = Util.checkString(rset4.getString("use_qunt_b"));
			rec.matr_cd_c = Util.checkString(rset4.getString("matr_cd_c"));
			rec.use_qunt_c = Util.checkString(rset4.getString("use_qunt_c"));
			rec.use_qunt_tot = Util.checkString(rset4.getString("use_qunt_tot"));
			this.curlist4.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			MT_PRNPAP_3006_LCURLIST5Record rec = new MT_PRNPAP_3006_LCURLIST5Record();
			rec.cmpy_cd = Util.checkString(rset5.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset5.getString("occr_dt"));
			rec.seq = Util.checkString(rset5.getString("seq"));
			rec.hdqt_paper_clsf = Util.checkString(rset5.getString("hdqt_paper_clsf"));
			rec.prt_dt = Util.checkString(rset5.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset5.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset5.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset5.getString("sect_cd"));
			rec.pap_std = Util.checkString(rset5.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset5.getString("issu_pcnt"));
			rec.slip_qty = Util.checkString(rset5.getString("slip_qty"));
			rec.papcmpy_cd = Util.checkString(rset5.getString("papcmpy_cd"));
			rec.bw_pj_wgt = Util.checkString(rset5.getString("bw_pj_wgt"));
			rec.matr_cd_a = Util.checkString(rset5.getString("matr_cd_a"));
			rec.use_qunt_a = Util.checkString(rset5.getString("use_qunt_a"));
			rec.matr_cd_b = Util.checkString(rset5.getString("matr_cd_b"));
			rec.use_qunt_b = Util.checkString(rset5.getString("use_qunt_b"));
			rec.matr_cd_c = Util.checkString(rset5.getString("matr_cd_c"));
			rec.use_qunt_c = Util.checkString(rset5.getString("use_qunt_c"));
			rec.use_qunt_tot = Util.checkString(rset5.getString("use_qunt_tot"));
			this.curlist5.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(12);
		while(rset6.next()){
			MT_PRNPAP_3006_LCURLIST6Record rec = new MT_PRNPAP_3006_LCURLIST6Record();
			rec.title = Util.checkString(rset6.getString("title"));
			rec.medi_cd_nm = Util.checkString(rset6.getString("medi_cd_nm"));
			rec.sect_cd_nm = Util.checkString(rset6.getString("sect_cd_nm"));
			rec.cd = Util.checkString(rset6.getString("cd"));
			rec.cdnm = Util.checkString(rset6.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset6.getString("mang_cd_1"));
			rec.tmpdata = Util.checkString(rset6.getString("tmpdata"));
			rec.cnt = Util.checkString(rset6.getString("cnt"));
			rec.wgt = Util.checkString(rset6.getString("wgt"));
			rec.hdqt_paper_clsf = Util.checkString(rset6.getString("hdqt_paper_clsf"));
			rec.medi_cd = Util.checkString(rset6.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset6.getString("sect_cd"));
			rec.pre_prt_clsf = Util.checkString(rset6.getString("pre_prt_clsf"));
			rec.issu_dt = Util.checkString(rset6.getString("issu_dt"));
			rec.prt_dt = Util.checkString(rset6.getString("prt_dt"));
			this.curlist6.add(rec);
		}
		this.wgt_clsf = Util.checkString(cstmt.getString(13));
		this.stat_flag = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3006_LDataSet ds = (MT_PRNPAP_3006_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_3006_LCURLISTRecord curlistRec = (MT_PRNPAP_3006_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PRNPAP_3006_LCURLIST1Record curlist1Rec = (MT_PRNPAP_3006_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PRNPAP_3006_LCURLIST2Record curlist2Rec = (MT_PRNPAP_3006_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_PRNPAP_3006_LCURLIST3Record curlist3Rec = (MT_PRNPAP_3006_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MT_PRNPAP_3006_LCURLIST4Record curlist4Rec = (MT_PRNPAP_3006_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		MT_PRNPAP_3006_LCURLIST5Record curlist5Rec = (MT_PRNPAP_3006_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		MT_PRNPAP_3006_LCURLIST6Record curlist6Rec = (MT_PRNPAP_3006_LCURLIST6Record)ds.curlist6.get(i);%>
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
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
<%= ds.getWgt_clsf()%>
<%= ds.getStat_flag()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.issu_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.paper_cmpy%>
<%= curlistRec.paper_cmpy_nm%>
<%= curlistRec.paper_clsf_cd%>
<%= curlistRec.matr_cd%>
<%= curlistRec.roll_cnt%>
<%= curlistRec.wgt%>
<%= curlistRec.roll_wgt%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.paper_loca_clsf%>
<%= curlist1Rec.papcmpy_cd%>
<%= curlist1Rec.a_rem_qunt_cnt%>
<%= curlist1Rec.a_rem_qunt_wgt%>
<%= curlist1Rec.a_un_use_roll_cnt%>
<%= curlist1Rec.a_roll_wgt%>
<%= curlist1Rec.b_rem_qunt_cnt%>
<%= curlist1Rec.b_rem_qunt_wgt%>
<%= curlist1Rec.b_un_use_roll_cnt%>
<%= curlist1Rec.b_roll_wgt%>
<%= curlist1Rec.c_rem_qunt_cnt%>
<%= curlist1Rec.c_rem_qunt_wgt%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.issu_dt%>
<%= curlist1Rec.c_un_use_roll_cnt%>
<%= curlist1Rec.c_roll_wgt%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.papcmpy_cd%>
<%= curlist2Rec.rot_mach_no%>
<%= curlist2Rec.sett_no%>
<%= curlist2Rec.sett_seq%>
<%= curlist2Rec.a_cmcnt_val_cnt%>
<%= curlist2Rec.a_wgt%>
<%= curlist2Rec.a_un_use_yn%>
<%= curlist2Rec.b_cmcnt_val_cnt%>
<%= curlist2Rec.b_wgt%>
<%= curlist2Rec.b_un_use_yn%>
<%= curlist2Rec.c_cmcnt_val_cnt%>
<%= curlist2Rec.c_wgt%>
<%= curlist2Rec.c_un_use_yn%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.issu_dt%>
<%= curlist3Rec.paper_clsf_cd%>
<%= curlist3Rec.matr_cd%>
<%= curlist3Rec.roll_wgt%>
<%= curlist4Rec.cmpy_cd%>
<%= curlist4Rec.occr_dt%>
<%= curlist4Rec.seq%>
<%= curlist4Rec.hdqt_paper_clsf%>
<%= curlist4Rec.prt_dt%>
<%= curlist4Rec.issu_dt%>
<%= curlist4Rec.medi_cd%>
<%= curlist4Rec.sect_cd%>
<%= curlist4Rec.pap_std%>
<%= curlist4Rec.issu_pcnt%>
<%= curlist4Rec.slip_qty%>
<%= curlist4Rec.papcmpy_cd%>
<%= curlist4Rec.matr_cd_a%>
<%= curlist4Rec.use_qunt_a%>
<%= curlist4Rec.matr_cd_b%>
<%= curlist4Rec.use_qunt_b%>
<%= curlist4Rec.matr_cd_c%>
<%= curlist4Rec.use_qunt_c%>
<%= curlist4Rec.use_qunt_tot%>
<%= curlist5Rec.cmpy_cd%>
<%= curlist5Rec.occr_dt%>
<%= curlist5Rec.seq%>
<%= curlist5Rec.hdqt_paper_clsf%>
<%= curlist5Rec.prt_dt%>
<%= curlist5Rec.issu_dt%>
<%= curlist5Rec.medi_cd%>
<%= curlist5Rec.sect_cd%>
<%= curlist5Rec.pap_std%>
<%= curlist5Rec.issu_pcnt%>
<%= curlist5Rec.slip_qty%>
<%= curlist5Rec.papcmpy_cd%>
<%= curlist5Rec.bw_pj_wgt%>
<%= curlist5Rec.matr_cd_a%>
<%= curlist5Rec.use_qunt_a%>
<%= curlist5Rec.matr_cd_b%>
<%= curlist5Rec.use_qunt_b%>
<%= curlist5Rec.matr_cd_c%>
<%= curlist5Rec.use_qunt_c%>
<%= curlist5Rec.use_qunt_tot%>
<%= curlist6Rec.title%>
<%= curlist6Rec.medi_cd_nm%>
<%= curlist6Rec.sect_cd_nm%>
<%= curlist6Rec.cd%>
<%= curlist6Rec.cdnm%>
<%= curlist6Rec.mang_cd_1%>
<%= curlist6Rec.tmpdata%>
<%= curlist6Rec.cnt%>
<%= curlist6Rec.wgt%>
<%= curlist6Rec.hdqt_paper_clsf%>
<%= curlist6Rec.medi_cd%>
<%= curlist6Rec.sect_cd%>
<%= curlist6Rec.pre_prt_clsf%>
<%= curlist6Rec.issu_dt%>
<%= curlist6Rec.prt_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Aug 29 21:52:45 KST 2009 */