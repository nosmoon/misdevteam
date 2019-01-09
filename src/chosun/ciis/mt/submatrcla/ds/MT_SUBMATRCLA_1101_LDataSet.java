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


package chosun.ciis.mt.submatrcla.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRCLA_1101_LDataSet(){}
	public MT_SUBMATRCLA_1101_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_SUBMATRCLA_1101_LCURLIST1Record rec = new MT_SUBMATRCLA_1101_LCURLIST1Record();
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.clam_qunt = Util.checkString(rset0.getString("clam_qunt"));
			rec.fix_qunt = Util.checkString(rset0.getString("fix_qunt"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_SUBMATRCLA_1101_LCURLIST2Record rec = new MT_SUBMATRCLA_1101_LCURLIST2Record();
			rec.tot_amt = Util.checkString(rset1.getString("tot_amt"));
			rec.month_tot_amt = Util.checkString(rset1.getString("month_tot_amt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_SUBMATRCLA_1101_LCURLIST3Record rec = new MT_SUBMATRCLA_1101_LCURLIST3Record();
			rec.doc_date = Util.checkString(rset2.getString("doc_date"));
			rec.doc_time = Util.checkString(rset2.getString("doc_time"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRCLA_1101_LDataSet ds = (MT_SUBMATRCLA_1101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_SUBMATRCLA_1101_LCURLIST1Record curlist1Rec = (MT_SUBMATRCLA_1101_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_SUBMATRCLA_1101_LCURLIST2Record curlist2Rec = (MT_SUBMATRCLA_1101_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_SUBMATRCLA_1101_LCURLIST3Record curlist3Rec = (MT_SUBMATRCLA_1101_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.item_nm%>
<%= curlist1Rec.std%>
<%= curlist1Rec.uprc%>
<%= curlist1Rec.clam_qunt%>
<%= curlist1Rec.fix_qunt%>
<%= curlist1Rec.unit%>
<%= curlist1Rec.amt%>
<%= curlist1Rec.usag%>
<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist2Rec.tot_amt%>
<%= curlist2Rec.month_tot_amt%>
<%= curlist3Rec.doc_date%>
<%= curlist3Rec.doc_time%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 19:49:02 KST 2009 */