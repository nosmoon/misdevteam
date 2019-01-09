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


package chosun.ciis.mt.submatrin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1103_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String clos_yn;

	public MT_SUBMATRIN_1103_LDataSet(){}
	public MT_SUBMATRIN_1103_LDataSet(String errcode, String errmsg, String clos_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.clos_yn = clos_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_SUBMATRIN_1103_LCURLISTRecord rec = new MT_SUBMATRIN_1103_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.purc_clsf = Util.checkString(rset0.getString("purc_clsf"));
			rec.prof_type_cd = Util.checkString(rset0.getString("prof_type_cd"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.purc_stmt_no = Util.checkString(rset0.getString("purc_stmt_no"));
			rec.rcpt_prof_clsf = Util.checkString(rset0.getString("rcpt_prof_clsf"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.impt_yy = Util.checkString(rset0.getString("impt_yy"));
			rec.impt_seq = Util.checkString(rset0.getString("impt_seq"));
			rec.leas_clsf = Util.checkString(rset0.getString("leas_clsf"));
			rec.incmg_slip_dt = Util.checkString(rset0.getString("incmg_slip_dt"));
			rec.elec_tax_bill_yn = Util.checkString(rset0.getString("elec_tax_bill_yn"));
			rec.semuro_no = Util.checkString(rset0.getString("semuro_no"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_SUBMATRIN_1103_LCURLIST1Record rec = new MT_SUBMATRIN_1103_LCURLIST1Record();
			rec.sub_seq = Util.checkString(rset1.getString("sub_seq"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.owh_budg_cd = Util.checkString(rset1.getString("owh_budg_cd"));
			rec.ewh_unit = Util.checkString(rset1.getString("ewh_unit"));
			rec.ewh_uprc = Util.checkString(rset1.getString("ewh_uprc"));
			rec.ewh_qunt = Util.checkString(rset1.getString("ewh_qunt"));
			rec.ewh_amt = Util.checkString(rset1.getString("ewh_amt"));
			rec.ewh_vat = Util.checkString(rset1.getString("ewh_vat"));
			rec.ewh_budg_cd = Util.checkString(rset1.getString("ewh_budg_cd"));
			rec.bo_item_yn = Util.checkString(rset1.getString("bo_item_yn"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset1.getString("medi_ser_no"));
			rec.usedeptcd = Util.checkString(rset1.getString("usedeptcd"));
			rec.usedeptnm = Util.checkString(rset1.getString("usedeptnm"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.owh_dt = Util.checkString(rset1.getString("owh_dt"));
			rec.owh_seq = Util.checkString(rset1.getString("owh_seq"));
			rec.owh_sub_seq = Util.checkString(rset1.getString("owh_sub_seq"));
			rec.chg_pers = Util.checkString(rset1.getString("chg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset1.getString("incmg_dt_tm"));
			rec.dstb_rat_cd = Util.checkString(rset1.getString("dstb_rat_cd"));
			rec.mc_flag = Util.checkString(rset1.getString("mc_flag"));
			rec.clam_yn = Util.checkString(rset1.getString("clam_yn"));
			this.curlist1.add(rec);
		}
		this.clos_yn = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRIN_1103_LDataSet ds = (MT_SUBMATRIN_1103_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRIN_1103_LCURLISTRecord curlistRec = (MT_SUBMATRIN_1103_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_SUBMATRIN_1103_LCURLIST1Record curlist1Rec = (MT_SUBMATRIN_1103_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getClos_yn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.fac_clsf%>
<%= curlistRec.ewh_dt%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.addr%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.vat_amt%>
<%= curlistRec.suply_amt%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.purc_clsf%>
<%= curlistRec.prof_type_cd%>
<%= curlistRec.make_dt%>
<%= curlistRec.purc_stmt_no%>
<%= curlistRec.rcpt_prof_clsf%>
<%= curlistRec.slip_no%>
<%= curlistRec.impt_yy%>
<%= curlistRec.impt_seq%>
<%= curlistRec.leas_clsf%>
<%= curlistRec.incmg_slip_dt%>
<%= curlist1Rec.sub_seq%>
<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.matr_nm%>
<%= curlist1Rec.owh_budg_cd%>
<%= curlist1Rec.ewh_unit%>
<%= curlist1Rec.ewh_uprc%>
<%= curlist1Rec.ewh_qunt%>
<%= curlist1Rec.ewh_amt%>
<%= curlist1Rec.ewh_vat%>
<%= curlist1Rec.ewh_budg_cd%>
<%= curlist1Rec.bo_item_yn%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.medi_ser_no%>
<%= curlist1Rec.usedeptcd%>
<%= curlist1Rec.usedeptnm%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.owh_dt%>
<%= curlist1Rec.owh_seq%>
<%= curlist1Rec.owh_sub_seq%>
<%= curlist1Rec.chg_pers%>
<%= curlist1Rec.incmg_dt_tm%>
<%= curlist1Rec.dstb_rat_cd%>
<%= curlist1Rec.mc_flag%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 10:57:51 KST 2009 */