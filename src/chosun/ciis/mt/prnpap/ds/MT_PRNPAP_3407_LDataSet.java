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


public class MT_PRNPAP_3407_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String wgt_clsf;
	public String stat_flag;

	public MT_PRNPAP_3407_LDataSet(){}
	public MT_PRNPAP_3407_LDataSet(String errcode, String errmsg, String wgt_clsf, String stat_flag){
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
			MT_PRNPAP_3407_LCURLISTRecord rec = new MT_PRNPAP_3407_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.hdqt_paper_clsf = Util.checkString(rset0.getString("hdqt_paper_clsf"));
			rec.prt_dt = Util.checkString(rset0.getString("prt_dt"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.pap_std = Util.checkString(rset0.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset0.getString("issu_pcnt"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.papcmpy_cd = Util.checkString(rset0.getString("papcmpy_cd"));
			rec.matr_cd_a = Util.checkString(rset0.getString("matr_cd_a"));
			rec.use_qunt_a = Util.checkString(rset0.getString("use_qunt_a"));
			rec.matr_cd_b = Util.checkString(rset0.getString("matr_cd_b"));
			rec.use_qunt_b = Util.checkString(rset0.getString("use_qunt_b"));
			rec.matr_cd_c = Util.checkString(rset0.getString("matr_cd_c"));
			rec.use_qunt_c = Util.checkString(rset0.getString("use_qunt_c"));
			rec.use_qunt_tot = Util.checkString(rset0.getString("use_qunt_tot"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_PRNPAP_3407_LCURLIST1Record rec = new MT_PRNPAP_3407_LCURLIST1Record();
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
			rec.bw_pj_wgt = Util.checkString(rset1.getString("bw_pj_wgt"));
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
			MT_PRNPAP_3407_LCURLIST2Record rec = new MT_PRNPAP_3407_LCURLIST2Record();
			rec.title = Util.checkString(rset2.getString("title"));
			rec.medi_cd_nm = Util.checkString(rset2.getString("medi_cd_nm"));
			rec.sect_cd_nm = Util.checkString(rset2.getString("sect_cd_nm"));
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset2.getString("mang_cd_1"));
			rec.tmpdata = Util.checkString(rset2.getString("tmpdata"));
			rec.cnt = Util.checkString(rset2.getString("cnt"));
			rec.wgt = Util.checkString(rset2.getString("wgt"));
			rec.hdqt_paper_clsf = Util.checkString(rset2.getString("hdqt_paper_clsf"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.pre_prt_clsf = Util.checkString(rset2.getString("pre_prt_clsf"));
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			rec.prt_dt = Util.checkString(rset2.getString("prt_dt"));
			this.curlist2.add(rec);
		}
		this.wgt_clsf = Util.checkString(cstmt.getString(9));
		this.stat_flag = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3407_LDataSet ds = (MT_PRNPAP_3407_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_3407_LCURLISTRecord curlistRec = (MT_PRNPAP_3407_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PRNPAP_3407_LCURLIST1Record curlist1Rec = (MT_PRNPAP_3407_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PRNPAP_3407_LCURLIST2Record curlist2Rec = (MT_PRNPAP_3407_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= ds.getWgt_clsf()%>
<%= ds.getStat_flag()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.hdqt_paper_clsf%>
<%= curlistRec.prt_dt%>
<%= curlistRec.issu_dt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.pap_std%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.slip_qty%>
<%= curlistRec.papcmpy_cd%>
<%= curlistRec.matr_cd_a%>
<%= curlistRec.use_qunt_a%>
<%= curlistRec.matr_cd_b%>
<%= curlistRec.use_qunt_b%>
<%= curlistRec.matr_cd_c%>
<%= curlistRec.use_qunt_c%>
<%= curlistRec.use_qunt_tot%>
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
<%= curlist1Rec.bw_pj_wgt%>
<%= curlist1Rec.matr_cd_a%>
<%= curlist1Rec.use_qunt_a%>
<%= curlist1Rec.matr_cd_b%>
<%= curlist1Rec.use_qunt_b%>
<%= curlist1Rec.matr_cd_c%>
<%= curlist1Rec.use_qunt_c%>
<%= curlist1Rec.use_qunt_tot%>
<%= curlist2Rec.title%>
<%= curlist2Rec.medi_cd_nm%>
<%= curlist2Rec.sect_cd_nm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.mang_cd_1%>
<%= curlist2Rec.tmpdata%>
<%= curlist2Rec.cnt%>
<%= curlist2Rec.wgt%>
<%= curlist2Rec.hdqt_paper_clsf%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.pre_prt_clsf%>
<%= curlist2Rec.issu_dt%>
<%= curlist2Rec.prt_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 23:57:37 KST 2009 */