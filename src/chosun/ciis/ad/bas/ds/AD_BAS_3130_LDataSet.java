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
import chosun.ciis.ad.bas.rec.AD_BAS_3130_LCURLIST1Record;
import chosun.ciis.ad.bas.rec.AD_BAS_3130_LCURLIST2Record;

/**
 * 
 */


public class AD_BAS_3130_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3130_LDataSet(){}
	public AD_BAS_3130_LDataSet(String errcode, String errmsg){
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
			AD_BAS_3130_LCURLIST1Record rec = new AD_BAS_3130_LCURLIST1Record();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.wkdy = Util.checkString(rset0.getString("wkdy"));
			rec.tot_pcnt = Util.checkString(rset0.getString("tot_pcnt"));
			rec.tot_clas = Util.checkString(rset0.getString("tot_clas"));
			rec.clr_clas = Util.checkString(rset0.getString("clr_clas"));
			rec.asum_pubc_amt = Util.checkString(rset0.getString("asum_pubc_amt"));
			rec.advt_ocpy_rate = Util.checkString(rset0.getString("advt_ocpy_rate"));
			rec.diff_amt = Util.checkString(rset0.getString("diff_amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			AD_BAS_3130_LCURLIST2Record rec = new AD_BAS_3130_LCURLIST2Record();
			rec.lbl = Util.checkString(rset1.getString("lbl"));
			rec.tot_date = Util.checkString(rset1.getString("tot_date"));
			rec.tot_side = Util.checkString(rset1.getString("tot_side"));
			rec.tot_dn = Util.checkString(rset1.getString("tot_dn"));
			rec.tot_advt_fee = Util.checkString(rset1.getString("tot_advt_fee"));
			rec.avg_daily_fee = Util.checkString(rset1.getString("avg_daily_fee"));
			rec.avg_side_fee = Util.checkString(rset1.getString("avg_side_fee"));
			rec.avg_advt_ocpy_rate = Util.checkString(rset1.getString("avg_advt_ocpy_rate"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3130_LDataSet ds = (AD_BAS_3130_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_3130_LCURLIST1Record curlist1Rec = (AD_BAS_3130_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_3130_LCURLIST2Record curlist2Rec = (AD_BAS_3130_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.pubc_dt%>
<%= curlist1Rec.wkdy%>
<%= curlist1Rec.tot_pcnt%>
<%= curlist1Rec.tot_clas%>
<%= curlist1Rec.clr_clas%>
<%= curlist1Rec.asum_pubc_amt%>
<%= curlist1Rec.advt_ocpy_rate%>
<%= curlist1Rec.diff_amt%>
<%= curlist2Rec.lbl%>
<%= curlist2Rec.tot_date%>
<%= curlist2Rec.tot_side%>
<%= curlist2Rec.tot_dn%>
<%= curlist2Rec.tot_advt_fee%>
<%= curlist2Rec.avg_daily_fee%>
<%= curlist2Rec.avg_side_fee%>
<%= curlist2Rec.avg_advt_ocpy_rate%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 16:52:19 KST 2009 */