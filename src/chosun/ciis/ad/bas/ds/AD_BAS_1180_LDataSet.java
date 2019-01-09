/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_1180_LCURLIST1Record;
import chosun.ciis.ad.bas.rec.AD_BAS_1180_LCURLIST2Record;

/**
 * 
 */


public class AD_BAS_1180_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_1180_LDataSet(){}
	public AD_BAS_1180_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_BAS_1180_LCURLIST1Record rec = new AD_BAS_1180_LCURLIST1Record();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.mortg_clsf = Util.checkString(rset0.getString("mortg_clsf"));
			rec.mortg_cont = Util.checkString(rset0.getString("mortg_cont"));
			rec.mortg_amt = Util.checkString(rset0.getString("mortg_amt"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.gurt_frdt = Util.checkString(rset0.getString("gurt_frdt"));
			rec.gurt_todt = Util.checkString(rset0.getString("gurt_todt"));
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.setup_pers = Util.checkString(rset0.getString("setup_pers"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_BAS_1180_LCURLIST2Record rec = new AD_BAS_1180_LCURLIST2Record();
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.mortg_clsf = Util.checkString(rset1.getString("mortg_clsf"));
			rec.mortg_cont = Util.checkString(rset1.getString("mortg_cont"));
			rec.mortg_amt = Util.checkString(rset1.getString("mortg_amt"));
			rec.acct_no = Util.checkString(rset1.getString("acct_no"));
			rec.gurt_frdt = Util.checkString(rset1.getString("gurt_frdt"));
			rec.gurt_todt = Util.checkString(rset1.getString("gurt_todt"));
			rec.ewh_dt = Util.checkString(rset1.getString("ewh_dt"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.setup_pers = Util.checkString(rset1.getString("setup_pers"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1180_LDataSet ds = (AD_BAS_1180_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_1180_LCURLIST1Record curlist1Rec = (AD_BAS_1180_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_1180_LCURLIST2Record curlist2Rec = (AD_BAS_1180_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.seq%>
<%= curlist1Rec.mortg_clsf%>
<%= curlist1Rec.mortg_cont%>
<%= curlist1Rec.mortg_amt%>
<%= curlist1Rec.acct_no%>
<%= curlist1Rec.gurt_frdt%>
<%= curlist1Rec.gurt_todt%>
<%= curlist1Rec.ewh_dt%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.setup_pers%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.mortg_clsf%>
<%= curlist2Rec.mortg_cont%>
<%= curlist2Rec.mortg_amt%>
<%= curlist2Rec.acct_no%>
<%= curlist2Rec.gurt_frdt%>
<%= curlist2Rec.gurt_todt%>
<%= curlist2Rec.ewh_dt%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.setup_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 18:03:23 KST 2009 */