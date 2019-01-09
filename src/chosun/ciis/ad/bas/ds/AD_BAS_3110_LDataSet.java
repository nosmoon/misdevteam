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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_3110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3110_LDataSet(){}
	public AD_BAS_3110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_BAS_3110_LCURLIST1Record rec = new AD_BAS_3110_LCURLIST1Record();
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.wkdy = Util.checkString(rset0.getString("wkdy"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.advt_cnt = Util.checkString(rset0.getString("advt_cnt"));
			rec.spon_advt_fee = Util.checkString(rset0.getString("spon_advt_fee"));
			rec.spon_advt_cnt = Util.checkString(rset0.getString("spon_advt_cnt"));
			rec.tot_side = Util.checkString(rset0.getString("tot_side"));
			rec.tot_dn = Util.checkString(rset0.getString("tot_dn"));
			rec.clr_dn = Util.checkString(rset0.getString("clr_dn"));
			rec.advt_ocpy_rate = Util.checkString(rset0.getString("advt_ocpy_rate"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			AD_BAS_3110_LCURLIST2Record rec = new AD_BAS_3110_LCURLIST2Record();
			rec.lbl = Util.checkString(rset1.getString("lbl"));
			rec.tot_date = Util.checkString(rset1.getString("tot_date"));
			rec.tot_side = Util.checkString(rset1.getString("tot_side"));
			rec.tot_dn = Util.checkString(rset1.getString("tot_dn"));
			rec.tot_advt_fee = Util.checkString(rset1.getString("tot_advt_fee"));
			rec.avg_daily_fee = Util.checkString(rset1.getString("avg_daily_fee"));
			rec.avg_side_fee = Util.checkString(rset1.getString("avg_side_fee"));
			rec.avg_dn = Util.checkString(rset1.getString("avg_dn"));
			rec.avg_advt_ocpy_rate = Util.checkString(rset1.getString("avg_advt_ocpy_rate"));
			rec.tot_spon_advt_fee = Util.checkString(rset1.getString("tot_spon_advt_fee"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3110_LDataSet ds = (AD_BAS_3110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_3110_LCURLIST1Record curlist1Rec = (AD_BAS_3110_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_3110_LCURLIST2Record curlist2Rec = (AD_BAS_3110_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.advt_fee%>
<%= curlist1Rec.advt_cnt%>
<%= curlist1Rec.spon_advt_fee%>
<%= curlist1Rec.spon_advt_cnt%>
<%= curlist1Rec.tot_side%>
<%= curlist1Rec.tot_dn%>
<%= curlist1Rec.clr_dn%>
<%= curlist1Rec.advt_ocpy_rate%>
<%= curlist2Rec.lbl%>
<%= curlist2Rec.tot_date%>
<%= curlist2Rec.tot_side%>
<%= curlist2Rec.tot_dn%>
<%= curlist2Rec.tot_advt_fee%>
<%= curlist2Rec.avg_daily_fee%>
<%= curlist2Rec.avg_side_fee%>
<%= curlist2Rec.avg_dn%>
<%= curlist2Rec.avg_advt_ocpy_rate%>
<%= curlist2Rec.tot_spon_advt_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 06 15:50:44 KST 2013 */