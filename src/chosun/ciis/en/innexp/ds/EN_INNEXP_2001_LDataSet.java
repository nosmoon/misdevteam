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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_2001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_2001_LDataSet(){}
	public EN_INNEXP_2001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			EN_INNEXP_2001_LCURLIST1Record rec = new EN_INNEXP_2001_LCURLIST1Record();
			rec.reven_amt_1 = Util.checkString(rset0.getString("reven_amt_1"));
			rec.expn_amt_1 = Util.checkString(rset0.getString("expn_amt_1"));
			rec.bal_amt_1 = Util.checkString(rset0.getString("bal_amt_1"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			EN_INNEXP_2001_LCURLIST2Record rec = new EN_INNEXP_2001_LCURLIST2Record();
			rec.reven_amt_2 = Util.checkString(rset1.getString("reven_amt_2"));
			rec.expn_amt_2 = Util.checkString(rset1.getString("expn_amt_2"));
			rec.bal_amt_2 = Util.checkString(rset1.getString("bal_amt_2"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			EN_INNEXP_2001_LCURLIST3Record rec = new EN_INNEXP_2001_LCURLIST3Record();
			rec.reven_amt_3 = Util.checkString(rset2.getString("reven_amt_3"));
			rec.expn_amt_3 = Util.checkString(rset2.getString("expn_amt_3"));
			rec.bal_amt_3 = Util.checkString(rset2.getString("bal_amt_3"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_INNEXP_2001_LDataSet ds = (EN_INNEXP_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		EN_INNEXP_2001_LCURLIST1Record curlist1Rec = (EN_INNEXP_2001_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		EN_INNEXP_2001_LCURLIST2Record curlist2Rec = (EN_INNEXP_2001_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		EN_INNEXP_2001_LCURLIST3Record curlist3Rec = (EN_INNEXP_2001_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.reven_amt_1%>
<%= curlist1Rec.expn_amt_1%>
<%= curlist1Rec.bal_amt_1%>
<%= curlist2Rec.reven_amt_2%>
<%= curlist2Rec.expn_amt_2%>
<%= curlist2Rec.bal_amt_2%>
<%= curlist3Rec.reven_amt_3%>
<%= curlist3Rec.expn_amt_3%>
<%= curlist3Rec.bal_amt_3%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 14:49:12 KST 2009 */