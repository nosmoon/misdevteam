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


public class MT_SUBMATROUT_1500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_1500_LDataSet(){}
	public MT_SUBMATROUT_1500_LDataSet(String errcode, String errmsg){
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
			MT_SUBMATROUT_1500_LCURLIST1Record rec = new MT_SUBMATROUT_1500_LCURLIST1Record();
			rec.owh_dt = Util.checkString(rset0.getString("owh_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.owh_qunt = Util.checkString(rset0.getString("owh_qunt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_SUBMATROUT_1500_LCURLIST2Record rec = new MT_SUBMATROUT_1500_LCURLIST2Record();
			rec.owh_dt = Util.checkString(rset1.getString("owh_dt"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			rec.owh_num_shet = Util.checkString(rset1.getString("owh_num_shet"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			MT_SUBMATROUT_1500_LCURLIST3Record rec = new MT_SUBMATROUT_1500_LCURLIST3Record();
			rec.owh_dt = Util.checkString(rset2.getString("owh_dt"));
			rec.fac_clsf = Util.checkString(rset2.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset2.getString("fac_clsf_nm"));
			rec.qunt = Util.checkString(rset2.getString("qunt"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_1500_LDataSet ds = (MT_SUBMATROUT_1500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_SUBMATROUT_1500_LCURLIST1Record curlist1Rec = (MT_SUBMATROUT_1500_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_SUBMATROUT_1500_LCURLIST2Record curlist2Rec = (MT_SUBMATROUT_1500_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_SUBMATROUT_1500_LCURLIST3Record curlist3Rec = (MT_SUBMATROUT_1500_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.owh_dt%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.fac_clsf_nm%>
<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.matr_nm%>
<%= curlist1Rec.owh_qunt%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist2Rec.owh_dt%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.fac_clsf_nm%>
<%= curlist2Rec.owh_num_shet%>
<%= curlist3Rec.owh_dt%>
<%= curlist3Rec.fac_clsf%>
<%= curlist3Rec.fac_clsf_nm%>
<%= curlist3Rec.qunt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 06 18:33:37 KST 2009 */