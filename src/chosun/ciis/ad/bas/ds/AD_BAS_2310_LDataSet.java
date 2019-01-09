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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_2310_LCURLIST1Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2310_LCURLIST2Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2310_LCURLIST3Record;

/**
 * 
 */


public class AD_BAS_2310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2310_LDataSet(){}
	public AD_BAS_2310_LDataSet(String errcode, String errmsg){
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
			AD_BAS_2310_LCURLIST1Record rec = new AD_BAS_2310_LCURLIST1Record();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.pubc_seq = Util.checkString(rset0.getString("pubc_seq"));
			rec.sect = Util.checkString(rset0.getString("sect"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.advt_size = Util.checkString(rset0.getString("advt_size"));
			rec.pubc_clsf = Util.checkString(rset0.getString("pubc_clsf"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			AD_BAS_2310_LCURLIST2Record rec = new AD_BAS_2310_LCURLIST2Record();
			rec.pubc_dt = Util.checkString(rset1.getString("pubc_dt"));
			rec.pubc_seq = Util.checkString(rset1.getString("pubc_seq"));
			rec.sect = Util.checkString(rset1.getString("sect"));
			rec.pubc_side = Util.checkString(rset1.getString("pubc_side"));
			rec.advt_cont = Util.checkString(rset1.getString("advt_cont"));
			rec.advt_size = Util.checkString(rset1.getString("advt_size"));
			rec.pubc_clsf = Util.checkString(rset1.getString("pubc_clsf"));
			rec.slcrg_pers = Util.checkString(rset1.getString("slcrg_pers"));
			rec.slcrg_pers_nm = Util.checkString(rset1.getString("slcrg_pers_nm"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(11);
		while(rset2.next()){
			AD_BAS_2310_LCURLIST3Record rec = new AD_BAS_2310_LCURLIST3Record();
			rec.pubc_dt = Util.checkString(rset2.getString("pubc_dt"));
			rec.pubc_seq = Util.checkString(rset2.getString("pubc_seq"));
			rec.sect = Util.checkString(rset2.getString("sect"));
			rec.pubc_side = Util.checkString(rset2.getString("pubc_side"));
			rec.advt_cont = Util.checkString(rset2.getString("advt_cont"));
			rec.advt_size = Util.checkString(rset2.getString("advt_size"));
			rec.pubc_clsf = Util.checkString(rset2.getString("pubc_clsf"));
			rec.slcrg_pers = Util.checkString(rset2.getString("slcrg_pers"));
			rec.slcrg_pers_nm = Util.checkString(rset2.getString("slcrg_pers_nm"));
			rec.remk = Util.checkString(rset2.getString("remk"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2310_LDataSet ds = (AD_BAS_2310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_2310_LCURLIST1Record curlist1Rec = (AD_BAS_2310_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_2310_LCURLIST2Record curlist2Rec = (AD_BAS_2310_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_2310_LCURLIST3Record curlist3Rec = (AD_BAS_2310_LCURLIST3Record)ds.curlist3.get(i);%>
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

<%= curlist1Rec.pubc_dt%>
<%= curlist1Rec.pubc_seq%>
<%= curlist1Rec.sect%>
<%= curlist1Rec.pubc_side%>
<%= curlist1Rec.advt_cont%>
<%= curlist1Rec.advt_size%>
<%= curlist1Rec.pubc_clsf%>
<%= curlist1Rec.slcrg_pers%>
<%= curlist1Rec.slcrg_pers_nm%>
<%= curlist1Rec.remk%>
<%= curlist2Rec.pubc_dt%>
<%= curlist2Rec.pubc_seq%>
<%= curlist2Rec.sect%>
<%= curlist2Rec.pubc_side%>
<%= curlist2Rec.advt_cont%>
<%= curlist2Rec.advt_size%>
<%= curlist2Rec.pubc_clsf%>
<%= curlist2Rec.slcrg_pers%>
<%= curlist2Rec.slcrg_pers_nm%>
<%= curlist2Rec.remk%>
<%= curlist3Rec.pubc_dt%>
<%= curlist3Rec.pubc_seq%>
<%= curlist3Rec.sect%>
<%= curlist3Rec.pubc_side%>
<%= curlist3Rec.advt_cont%>
<%= curlist3Rec.advt_size%>
<%= curlist3Rec.pubc_clsf%>
<%= curlist3Rec.slcrg_pers%>
<%= curlist3Rec.slcrg_pers_nm%>
<%= curlist3Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 13:57:44 KST 2009 */