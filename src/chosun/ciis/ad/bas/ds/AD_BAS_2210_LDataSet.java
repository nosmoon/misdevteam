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
import chosun.ciis.ad.bas.rec.AD_BAS_2210_LCURLIST1Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2210_LCURLIST2Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2210_LCURLIST3Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2210_LCURLIST4Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2210_LCURLIST5Record;
import chosun.ciis.ad.bas.rec.AD_BAS_2210_LCURLIST6Record;

/**
 * 
 */


public class AD_BAS_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2210_LDataSet(){}
	public AD_BAS_2210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_BAS_2210_LCURLIST1Record rec = new AD_BAS_2210_LCURLIST1Record();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			AD_BAS_2210_LCURLIST2Record rec = new AD_BAS_2210_LCURLIST2Record();
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.advt_fee = Util.checkString(rset1.getString("advt_fee"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			AD_BAS_2210_LCURLIST3Record rec = new AD_BAS_2210_LCURLIST3Record();
			rec.agn_nm = Util.checkString(rset2.getString("agn_nm"));
			rec.advt_fee = Util.checkString(rset2.getString("advt_fee"));
			this.curlist3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(10);
		while(rset3.next()){
			AD_BAS_2210_LCURLIST4Record rec = new AD_BAS_2210_LCURLIST4Record();
			rec.rept_clsf = Util.checkString(rset3.getString("rept_clsf"));
			rec.make_dt = Util.checkString(rset3.getString("make_dt"));
			rec.medi_clsf = Util.checkString(rset3.getString("medi_clsf"));
			rec.advcs_clsf = Util.checkString(rset3.getString("advcs_clsf"));
			rec.rept_no = Util.checkString(rset3.getString("rept_no"));
			rec.dlco_no = Util.checkString(rset3.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset3.getString("dlco_nm"));
			rec.titl = Util.checkString(rset3.getString("titl"));
			this.curlist4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(11);
		while(rset4.next()){
			AD_BAS_2210_LCURLIST5Record rec = new AD_BAS_2210_LCURLIST5Record();
			rec.medi_nm = Util.checkString(rset4.getString("medi_nm"));
			rec.pubc_dt = Util.checkString(rset4.getString("pubc_dt"));
			rec.advt_cont = Util.checkString(rset4.getString("advt_cont"));
			rec.advt_size = Util.checkString(rset4.getString("advt_size"));
			rec.remk = Util.checkString(rset4.getString("remk"));
			rec.pubc_clsf = Util.checkString(rset4.getString("pubc_clsf"));
			this.curlist5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(12);
		while(rset5.next()){
			AD_BAS_2210_LCURLIST6Record rec = new AD_BAS_2210_LCURLIST6Record();
			rec.enty_dt = Util.checkString(rset5.getString("enty_dt"));
			rec.dlco_nm = Util.checkString(rset5.getString("dlco_nm"));
			rec.dhon_amt = Util.checkString(rset5.getString("dhon_amt"));
			this.curlist6.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2210_LDataSet ds = (AD_BAS_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_2210_LCURLIST1Record curlist1Rec = (AD_BAS_2210_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_2210_LCURLIST2Record curlist2Rec = (AD_BAS_2210_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_2210_LCURLIST3Record curlist3Rec = (AD_BAS_2210_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_2210_LCURLIST4Record curlist4Rec = (AD_BAS_2210_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		AD_BAS_2210_LCURLIST5Record curlist5Rec = (AD_BAS_2210_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		AD_BAS_2210_LCURLIST6Record curlist6Rec = (AD_BAS_2210_LCURLIST6Record)ds.curlist6.get(i);%>
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
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.pubc_dt%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.advt_fee%>
<%= curlist2Rec.dlco_nm%>
<%= curlist2Rec.advt_fee%>
<%= curlist3Rec.agn_nm%>
<%= curlist3Rec.advt_fee%>
<%= curlist4Rec.rept_clsf%>
<%= curlist4Rec.make_dt%>
<%= curlist4Rec.medi_clsf%>
<%= curlist4Rec.advcs_clsf%>
<%= curlist4Rec.rept_no%>
<%= curlist4Rec.dlco_no%>
<%= curlist4Rec.dlco_nm%>
<%= curlist4Rec.titl%>
<%= curlist5Rec.medi_nm%>
<%= curlist5Rec.pubc_dt%>
<%= curlist5Rec.advt_cont%>
<%= curlist5Rec.advt_size%>
<%= curlist5Rec.remk%>
<%= curlist5Rec.pubc_clsf%>
<%= curlist6Rec.enty_dt%>
<%= curlist6Rec.dlco_nm%>
<%= curlist6Rec.dhon_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 16:17:31 KST 2009 */