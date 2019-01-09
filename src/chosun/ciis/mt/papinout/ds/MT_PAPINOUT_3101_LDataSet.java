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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_3101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String pajiyul;
	public String arvyul;

	public MT_PAPINOUT_3101_LDataSet(){}
	public MT_PAPINOUT_3101_LDataSet(String errcode, String errmsg, String pajiyul, String arvyul){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.pajiyul = pajiyul;
		this.arvyul = arvyul;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPajiyul(String pajiyul){
		this.pajiyul = pajiyul;
	}

	public void setArvyul(String arvyul){
		this.arvyul = arvyul;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPajiyul(){
		return this.pajiyul;
	}

	public String getArvyul(){
		return this.arvyul;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PAPINOUT_3101_LCURLISTRecord rec = new MT_PAPINOUT_3101_LCURLISTRecord();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.paper_clsf_cd = Util.checkString(rset0.getString("paper_clsf_cd"));
			rec.grp = Util.checkString(rset0.getString("grp"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_PAPINOUT_3101_LCURLIST1Record rec = new MT_PAPINOUT_3101_LCURLIST1Record();
			rec.title = Util.checkString(rset1.getString("title"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_PAPINOUT_3101_LCURLIST2Record rec = new MT_PAPINOUT_3101_LCURLIST2Record();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset2.getString("fac_clsf"));
			rec.issu_dt = Util.checkString(rset2.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset2.getString("sect_nm"));
			rec.pap_std = Util.checkString(rset2.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset2.getString("issu_pcnt"));
			rec.bw_pcnt = Util.checkString(rset2.getString("bw_pcnt"));
			rec.clr_pcnt = Util.checkString(rset2.getString("clr_pcnt"));
			rec.slip_qty = Util.checkString(rset2.getString("slip_qty"));
			rec.a_wgt = Util.checkString(rset2.getString("a_wgt"));
			rec.b_wgt = Util.checkString(rset2.getString("b_wgt"));
			rec.c_wgt = Util.checkString(rset2.getString("c_wgt"));
			rec.a_roll = Util.checkString(rset2.getString("a_roll"));
			rec.b_roll = Util.checkString(rset2.getString("b_roll"));
			rec.c_roll = Util.checkString(rset2.getString("c_roll"));
			rec.chk_a = Util.checkString(rset2.getString("chk_a"));
			rec.chk_b = Util.checkString(rset2.getString("chk_b"));
			rec.chk_c = Util.checkString(rset2.getString("chk_c"));
			rec.a_rwgt = Util.checkString(rset2.getString("a_rwgt"));
			rec.b_rwgt = Util.checkString(rset2.getString("b_rwgt"));
			rec.c_rwgt = Util.checkString(rset2.getString("c_rwgt"));
			rec.prt_wgt = Util.checkString(rset2.getString("prt_wgt"));
			rec.prt_clsf = Util.checkString(rset2.getString("prt_clsf"));
			rec.coll_yn = Util.checkString(rset2.getString("coll_yn"));
			rec.papcmpy_cd = Util.checkString(rset2.getString("papcmpy_cd"));
			rec.occr_dt = Util.checkString(rset2.getString("occr_dt"));
			rec.seq = Util.checkString(rset2.getString("seq"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			MT_PAPINOUT_3101_LCURLIST3Record rec = new MT_PAPINOUT_3101_LCURLIST3Record();
			rec.matr_cd = Util.checkString(rset3.getString("matr_cd"));
			rec.roll_wgt = Util.checkString(rset3.getString("roll_wgt"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			MT_PAPINOUT_3101_LCURLIST4Record rec = new MT_PAPINOUT_3101_LCURLIST4Record();
			rec.medi_cd = Util.checkString(rset4.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset4.getString("sect_cd"));
			rec.matr_cd = Util.checkString(rset4.getString("matr_cd"));
			rec.use_qunt = Util.checkString(rset4.getString("use_qunt"));
			rec.roll = Util.checkString(rset4.getString("roll"));
			this.curlist4.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			MT_PAPINOUT_3101_LCURLIST5Record rec = new MT_PAPINOUT_3101_LCURLIST5Record();
			rec.cmpy_cd = Util.checkString(rset5.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset5.getString("occr_dt"));
			rec.seq = Util.checkString(rset5.getString("seq"));
			rec.fac_clsf = Util.checkString(rset5.getString("fac_clsf"));
			rec.issu_dt = Util.checkString(rset5.getString("issu_dt"));
			rec.medi_cd = Util.checkString(rset5.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset5.getString("sect_cd"));
			rec.medi_nm = Util.checkString(rset5.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset5.getString("sect_nm"));
			rec.pap_std = Util.checkString(rset5.getString("pap_std"));
			rec.issu_pcnt = Util.checkString(rset5.getString("issu_pcnt"));
			rec.bw_pcnt = Util.checkString(rset5.getString("bw_pcnt"));
			rec.clr_pcnt = Util.checkString(rset5.getString("clr_pcnt"));
			rec.slip_qty = Util.checkString(rset5.getString("slip_qty"));
			rec.a_wgt = Util.checkString(rset5.getString("a_wgt"));
			rec.b_wgt = Util.checkString(rset5.getString("b_wgt"));
			rec.c_wgt = Util.checkString(rset5.getString("c_wgt"));
			rec.chk_a = Util.checkString(rset5.getString("chk_a"));
			rec.chk_b = Util.checkString(rset5.getString("chk_b"));
			rec.chk_c = Util.checkString(rset5.getString("chk_c"));
			rec.prt_wgt = Util.checkString(rset5.getString("prt_wgt"));
			rec.prt_clsf = Util.checkString(rset5.getString("prt_clsf"));
			rec.papcmpy_cd = Util.checkString(rset5.getString("papcmpy_cd"));
			rec.sub_seq = Util.checkString(rset5.getString("sub_seq"));
			this.curlist5.add(rec);
		}
		this.pajiyul = Util.checkString(cstmt.getString(12));
		this.arvyul = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_3101_LDataSet ds = (MT_PAPINOUT_3101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_3101_LCURLISTRecord curlistRec = (MT_PAPINOUT_3101_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPINOUT_3101_LCURLIST1Record curlist1Rec = (MT_PAPINOUT_3101_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPINOUT_3101_LCURLIST2Record curlist2Rec = (MT_PAPINOUT_3101_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_PAPINOUT_3101_LCURLIST3Record curlist3Rec = (MT_PAPINOUT_3101_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		MT_PAPINOUT_3101_LCURLIST4Record curlist4Rec = (MT_PAPINOUT_3101_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		MT_PAPINOUT_3101_LCURLIST5Record curlist5Rec = (MT_PAPINOUT_3101_LCURLIST5Record)ds.curlist5.get(i);%>
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
<%= ds.getPajiyul()%>
<%= ds.getArvyul()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.paper_clsf_cd%>
<%= curlistRec.grp%>
<%= curlist1Rec.title%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.issu_dt%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist2Rec.sect_nm%>
<%= curlist2Rec.pap_std%>
<%= curlist2Rec.issu_pcnt%>
<%= curlist2Rec.bw_pcnt%>
<%= curlist2Rec.clr_pcnt%>
<%= curlist2Rec.slip_qty%>
<%= curlist2Rec.a_wgt%>
<%= curlist2Rec.b_wgt%>
<%= curlist2Rec.c_wgt%>
<%= curlist2Rec.a_roll%>
<%= curlist2Rec.b_roll%>
<%= curlist2Rec.c_roll%>
<%= curlist2Rec.chk_a%>
<%= curlist2Rec.chk_b%>
<%= curlist2Rec.chk_c%>
<%= curlist2Rec.a_rwgt%>
<%= curlist2Rec.b_rwgt%>
<%= curlist2Rec.c_rwgt%>
<%= curlist2Rec.prt_wgt%>
<%= curlist2Rec.prt_clsf%>
<%= curlist2Rec.coll_yn%>
<%= curlist2Rec.papcmpy_cd%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.seq%>
<%= curlist3Rec.matr_cd%>
<%= curlist3Rec.roll_wgt%>
<%= curlist4Rec.medi_cd%>
<%= curlist4Rec.sect_cd%>
<%= curlist4Rec.matr_cd%>
<%= curlist4Rec.use_qunt%>
<%= curlist4Rec.roll%>
<%= curlist5Rec.cmpy_cd%>
<%= curlist5Rec.occr_dt%>
<%= curlist5Rec.seq%>
<%= curlist5Rec.fac_clsf%>
<%= curlist5Rec.issu_dt%>
<%= curlist5Rec.medi_cd%>
<%= curlist5Rec.sect_cd%>
<%= curlist5Rec.medi_nm%>
<%= curlist5Rec.sect_nm%>
<%= curlist5Rec.pap_std%>
<%= curlist5Rec.issu_pcnt%>
<%= curlist5Rec.bw_pcnt%>
<%= curlist5Rec.clr_pcnt%>
<%= curlist5Rec.slip_qty%>
<%= curlist5Rec.a_wgt%>
<%= curlist5Rec.b_wgt%>
<%= curlist5Rec.c_wgt%>
<%= curlist5Rec.chk_a%>
<%= curlist5Rec.chk_b%>
<%= curlist5Rec.chk_c%>
<%= curlist5Rec.prt_wgt%>
<%= curlist5Rec.prt_clsf%>
<%= curlist5Rec.papcmpy_cd%>
<%= curlist5Rec.sub_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 03 00:45:43 KST 2009 */