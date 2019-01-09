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


package chosun.ciis.mt.outsdelmt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.outsdelmt.dm.*;
import chosun.ciis.mt.outsdelmt.rec.*;

/**
 * 
 */


public class MT_OUTSDELMT_5000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_OUTSDELMT_5000_LDataSet(){}
	public MT_OUTSDELMT_5000_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_OUTSDELMT_5000_LCURLIST1Record rec = new MT_OUTSDELMT_5000_LCURLIST1Record();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.outsd_elmt_clsf = Util.checkString(rset0.getString("outsd_elmt_clsf"));
			rec.outsd_elmt_clsf_nm = Util.checkString(rset0.getString("outsd_elmt_clsf_nm"));
			rec.outsd_elmt_cd = Util.checkString(rset0.getString("outsd_elmt_cd"));
			rec.outsd_elmt_cd_nm = Util.checkString(rset0.getString("outsd_elmt_cd_nm"));
			rec.outsd_elmt_amt = Util.checkString(rset0.getString("outsd_elmt_amt"));
			rec.cmps_cost = Util.checkString(rset0.getString("cmps_cost"));
			rec.cmps_ratio = Util.checkString(rset0.getString("cmps_ratio"));
			rec.cmps_calc = Util.checkString(rset0.getString("cmps_calc"));
			rec.chg_ratio_yn = Util.checkString(rset0.getString("chg_ratio_yn"));
			rec.chg_cost = Util.checkString(rset0.getString("chg_cost"));
			rec.chg_ratio = Util.checkString(rset0.getString("chg_ratio"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_OUTSDELMT_5000_LCURLIST2Record rec = new MT_OUTSDELMT_5000_LCURLIST2Record();
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.outsd_elmt_aply_clsf = Util.checkString(rset1.getString("outsd_elmt_aply_clsf"));
			rec.outsd_elmt_aply_nm = Util.checkString(rset1.getString("outsd_elmt_aply_nm"));
			rec.aply_dt = Util.checkString(rset1.getString("aply_dt"));
			rec.aply_yymm = Util.checkString(rset1.getString("aply_yymm"));
			rec.matr_uprc = Util.checkString(rset1.getString("matr_uprc"));
			rec.ratio_yn = Util.checkString(rset1.getString("ratio_yn"));
			rec.ratio_nm = Util.checkString(rset1.getString("ratio_nm"));
			rec.fix_val = Util.checkString(rset1.getString("fix_val"));
			rec.fix_item_cost = Util.checkString(rset1.getString("fix_item_cost"));
			rec.fix_item_ratio = Util.checkString(rset1.getString("fix_item_ratio"));
			rec.marjn_val = Util.checkString(rset1.getString("marjn_val"));
			rec.marjn_cost = Util.checkString(rset1.getString("marjn_cost"));
			rec.marjn_ratio = Util.checkString(rset1.getString("marjn_ratio"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_OUTSDELMT_5000_LDataSet ds = (MT_OUTSDELMT_5000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_OUTSDELMT_5000_LCURLIST1Record curlist1Rec = (MT_OUTSDELMT_5000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_OUTSDELMT_5000_LCURLIST2Record curlist2Rec = (MT_OUTSDELMT_5000_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.sub_seq%>
<%= curlist1Rec.outsd_elmt_clsf%>
<%= curlist1Rec.outsd_elmt_clsf_nm%>
<%= curlist1Rec.outsd_elmt_cd%>
<%= curlist1Rec.outsd_elmt_cd_nm%>
<%= curlist1Rec.outsd_elmt_amt%>
<%= curlist1Rec.cmps_cost%>
<%= curlist1Rec.cmps_ratio%>
<%= curlist1Rec.cmps_calc%>
<%= curlist1Rec.chg_ratio_yn%>
<%= curlist1Rec.chg_cost%>
<%= curlist1Rec.chg_ratio%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.matr_cd%>
<%= curlist2Rec.matr_nm%>
<%= curlist2Rec.outsd_elmt_aply_clsf%>
<%= curlist2Rec.outsd_elmt_aply_nm%>
<%= curlist2Rec.aply_dt%>
<%= curlist2Rec.aply_yymm%>
<%= curlist2Rec.matr_uprc%>
<%= curlist2Rec.ratio_yn%>
<%= curlist2Rec.ratio_nm%>
<%= curlist2Rec.fix_val%>
<%= curlist2Rec.fix_item_cost%>
<%= curlist2Rec.fix_item_ratio%>
<%= curlist2Rec.marjn_val%>
<%= curlist2Rec.marjn_cost%>
<%= curlist2Rec.marjn_ratio%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 12:53:10 KST 2009 */