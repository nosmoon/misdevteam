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


public class MT_CLOSE_8000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_8000_LDataSet(){}
	public MT_CLOSE_8000_LDataSet(String errcode, String errmsg){
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
			MT_CLOSE_8000_LCURLIST1Record rec = new MT_CLOSE_8000_LCURLIST1Record();
			rec.irow = Util.checkString(rset0.getString("irow"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.irow2 = Util.checkString(rset0.getString("irow2"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_CLOSE_8000_LCURLIST2Record rec = new MT_CLOSE_8000_LCURLIST2Record();
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			rec.owh_budg_cd = Util.checkString(rset1.getString("owh_budg_cd"));
			rec.budg_cdnm = Util.checkString(rset1.getString("budg_cdnm"));
			rec.be_amt = Util.checkString(rset1.getString("be_amt"));
			rec.be_qunt = Util.checkString(rset1.getString("be_qunt"));
			rec.amt1 = Util.checkString(rset1.getString("amt1"));
			rec.amt2 = Util.checkString(rset1.getString("amt2"));
			rec.amt3 = Util.checkString(rset1.getString("amt3"));
			rec.amt4 = Util.checkString(rset1.getString("amt4"));
			rec.amt5 = Util.checkString(rset1.getString("amt5"));
			rec.amt6 = Util.checkString(rset1.getString("amt6"));
			rec.amt7 = Util.checkString(rset1.getString("amt7"));
			rec.amt8 = Util.checkString(rset1.getString("amt8"));
			rec.amt9 = Util.checkString(rset1.getString("amt9"));
			rec.amt10 = Util.checkString(rset1.getString("amt10"));
			rec.amt11 = Util.checkString(rset1.getString("amt11"));
			rec.amt12 = Util.checkString(rset1.getString("amt12"));
			rec.amt13 = Util.checkString(rset1.getString("amt13"));
			rec.amt14 = Util.checkString(rset1.getString("amt14"));
			rec.amt15 = Util.checkString(rset1.getString("amt15"));
			rec.amt16 = Util.checkString(rset1.getString("amt16"));
			rec.amt17 = Util.checkString(rset1.getString("amt17"));
			rec.amt18 = Util.checkString(rset1.getString("amt18"));
			rec.amt19 = Util.checkString(rset1.getString("amt19"));
			rec.amt20 = Util.checkString(rset1.getString("amt20"));
			rec.amt21 = Util.checkString(rset1.getString("amt21"));
			rec.amt22 = Util.checkString(rset1.getString("amt22"));
			rec.amt23 = Util.checkString(rset1.getString("amt23"));
			rec.amt24 = Util.checkString(rset1.getString("amt24"));
			rec.amt25 = Util.checkString(rset1.getString("amt25"));
			rec.amt26 = Util.checkString(rset1.getString("amt26"));
			rec.amt27 = Util.checkString(rset1.getString("amt27"));
			rec.amt28 = Util.checkString(rset1.getString("amt28"));
			rec.amt29 = Util.checkString(rset1.getString("amt29"));
			rec.amt30 = Util.checkString(rset1.getString("amt30"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_8000_LDataSet ds = (MT_CLOSE_8000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_CLOSE_8000_LCURLIST1Record curlist1Rec = (MT_CLOSE_8000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_CLOSE_8000_LCURLIST2Record curlist2Rec = (MT_CLOSE_8000_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.irow%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.sect_nm%>
<%= curlist1Rec.irow2%>
<%= curlist2Rec.fac_clsf%>
<%= curlist2Rec.fac_clsf_nm%>
<%= curlist2Rec.owh_budg_cd%>
<%= curlist2Rec.budg_cdnm%>
<%= curlist2Rec.be_amt%>
<%= curlist2Rec.be_qunt%>
<%= curlist2Rec.amt1%>
<%= curlist2Rec.amt2%>
<%= curlist2Rec.amt3%>
<%= curlist2Rec.amt4%>
<%= curlist2Rec.amt5%>
<%= curlist2Rec.amt6%>
<%= curlist2Rec.amt7%>
<%= curlist2Rec.amt8%>
<%= curlist2Rec.amt9%>
<%= curlist2Rec.amt10%>
<%= curlist2Rec.amt11%>
<%= curlist2Rec.amt12%>
<%= curlist2Rec.amt13%>
<%= curlist2Rec.amt14%>
<%= curlist2Rec.amt15%>
<%= curlist2Rec.amt16%>
<%= curlist2Rec.amt17%>
<%= curlist2Rec.amt18%>
<%= curlist2Rec.amt19%>
<%= curlist2Rec.amt20%>
<%= curlist2Rec.amt21%>
<%= curlist2Rec.amt22%>
<%= curlist2Rec.amt23%>
<%= curlist2Rec.amt24%>
<%= curlist2Rec.amt25%>
<%= curlist2Rec.amt26%>
<%= curlist2Rec.amt27%>
<%= curlist2Rec.amt28%>
<%= curlist2Rec.amt29%>
<%= curlist2Rec.amt30%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 16 10:39:13 KST 2009 */