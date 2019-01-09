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


package chosun.ciis.mt.close.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_2000_LDataSet(){}
	public MT_CLOSE_2000_LDataSet(String errcode, String errmsg){
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
			MT_CLOSE_2000_LCURLISTRecord rec = new MT_CLOSE_2000_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.owh_qunt = Util.checkString(rset0.getString("owh_qunt"));
			rec.owh_amt = Util.checkString(rset0.getString("owh_amt"));
			rec.avg_owh_amt = Util.checkString(rset0.getString("avg_owh_amt"));
			rec.all_qunt = Util.checkString(rset0.getString("all_qunt"));
			rec.shet_qunt = Util.checkString(rset0.getString("shet_qunt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_CLOSE_2000_LCURLIST1Record rec = new MT_CLOSE_2000_LCURLIST1Record();
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			rec.o_bi = Util.checkString(rset1.getString("o_bi"));
			rec.o_qunt = Util.checkString(rset1.getString("o_qunt"));
			rec.o_amt = Util.checkString(rset1.getString("o_amt"));
			rec.s_bi = Util.checkString(rset1.getString("s_bi"));
			rec.s_qunt = Util.checkString(rset1.getString("s_qunt"));
			rec.s_amt = Util.checkString(rset1.getString("s_amt"));
			rec.b_bi = Util.checkString(rset1.getString("b_bi"));
			rec.b_qunt = Util.checkString(rset1.getString("b_qunt"));
			rec.b_amt = Util.checkString(rset1.getString("b_amt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_2000_LDataSet ds = (MT_CLOSE_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_CLOSE_2000_LCURLISTRecord curlistRec = (MT_CLOSE_2000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_CLOSE_2000_LCURLIST1Record curlist1Rec = (MT_CLOSE_2000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.occr_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.owh_qunt%>
<%= curlistRec.owh_amt%>
<%= curlistRec.avg_owh_amt%>
<%= curlistRec.all_qunt%>
<%= curlistRec.shet_qunt%>
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.matr_nm%>
<%= curlist1Rec.fac_clsf_nm%>
<%= curlist1Rec.o_bi%>
<%= curlist1Rec.o_qunt%>
<%= curlist1Rec.o_amt%>
<%= curlist1Rec.s_bi%>
<%= curlist1Rec.s_qunt%>
<%= curlist1Rec.s_amt%>
<%= curlist1Rec.b_bi%>
<%= curlist1Rec.b_qunt%>
<%= curlist1Rec.b_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 03 21:09:16 KST 2009 */