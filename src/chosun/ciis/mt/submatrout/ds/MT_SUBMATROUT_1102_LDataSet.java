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


package chosun.ciis.mt.submatrout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1102_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_1102_LDataSet(){}
	public MT_SUBMATROUT_1102_LDataSet(String errcode, String errmsg){
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
			MT_SUBMATROUT_1102_LCURLIST1Record rec = new MT_SUBMATROUT_1102_LCURLIST1Record();
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.maeipdan = Util.checkString(rset0.getString("maeipdan"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.hjg_cnt = Util.checkString(rset0.getString("hjg_cnt"));
			rec.hjg_amt = Util.checkString(rset0.getString("hjg_amt"));
			rec.igacctcdnm = Util.checkString(rset0.getString("igacctcdnm"));
			rec.cgacctcdnm = Util.checkString(rset0.getString("cgacctcdnm"));
			rec.dstb_rat_cd = Util.checkString(rset0.getString("dstb_rat_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.owh_type = Util.checkString(rset0.getString("owh_type"));
			rec.prv_cnt = Util.checkString(rset0.getString("prv_cnt"));
			rec.curdd_ewh_qunt = Util.checkString(rset0.getString("curdd_ewh_qunt"));
			rec.plan_dt = Util.checkString(rset0.getString("plan_dt"));
			rec.mm_qunt = Util.checkString(rset0.getString("mm_qunt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_SUBMATROUT_1102_LCURLIST2Record rec = new MT_SUBMATROUT_1102_LCURLIST2Record();
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			MT_SUBMATROUT_1102_LCURLIST3Record rec = new MT_SUBMATROUT_1102_LCURLIST3Record();
			rec.matr_cd = Util.checkString(rset2.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset2.getString("matr_nm"));
			rec.medi_cd = Util.checkString(rset2.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset2.getString("medi_nm"));
			rec.sect_cd = Util.checkString(rset2.getString("sect_cd"));
			rec.sect_nm = Util.checkString(rset2.getString("sect_nm"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_1102_LDataSet ds = (MT_SUBMATROUT_1102_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_SUBMATROUT_1102_LCURLIST1Record curlist1Rec = (MT_SUBMATROUT_1102_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_SUBMATROUT_1102_LCURLIST2Record curlist2Rec = (MT_SUBMATROUT_1102_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_SUBMATROUT_1102_LCURLIST3Record curlist3Rec = (MT_SUBMATROUT_1102_LCURLIST3Record)ds.curlist3.get(i);%>
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.matr_nm%>
<%= curlist1Rec.unit%>
<%= curlist1Rec.maeipdan%>
<%= curlist1Rec.ewh_budg_cd%>
<%= curlist1Rec.owh_budg_cd%>
<%= curlist1Rec.std_modl%>
<%= curlist1Rec.hjg_cnt%>
<%= curlist1Rec.hjg_amt%>
<%= curlist1Rec.igacctcdnm%>
<%= curlist1Rec.cgacctcdnm%>
<%= curlist1Rec.dstb_rat_cd%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.owh_type%>
<%= curlist1Rec.prv_cnt%>
<%= curlist1Rec.curdd_ewh_qunt%>
<%= curlist1Rec.plan_dt%>
<%= curlist1Rec.mm_qunt%>
<%= curlist2Rec.matr_cd%>
<%= curlist2Rec.matr_nm%>
<%= curlist2Rec.medi_cd%>
<%= curlist2Rec.sect_cd%>
<%= curlist3Rec.matr_cd%>
<%= curlist3Rec.matr_nm%>
<%= curlist3Rec.medi_cd%>
<%= curlist3Rec.medi_nm%>
<%= curlist3Rec.sect_cd%>
<%= curlist3Rec.sect_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 29 10:34:40 KST 2009 */