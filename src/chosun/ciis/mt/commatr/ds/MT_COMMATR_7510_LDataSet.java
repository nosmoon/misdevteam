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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_7510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String ly_wgt;
	public String ly_avg;
	public String lm_wgt;
	public String lm_avg;

	public MT_COMMATR_7510_LDataSet(){}
	public MT_COMMATR_7510_LDataSet(String errcode, String errmsg, String ly_wgt, String ly_avg, String lm_wgt, String lm_avg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.ly_wgt = ly_wgt;
		this.ly_avg = ly_avg;
		this.lm_wgt = lm_wgt;
		this.lm_avg = lm_avg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setLy_wgt(String ly_wgt){
		this.ly_wgt = ly_wgt;
	}

	public void setLy_avg(String ly_avg){
		this.ly_avg = ly_avg;
	}

	public void setLm_wgt(String lm_wgt){
		this.lm_wgt = lm_wgt;
	}

	public void setLm_avg(String lm_avg){
		this.lm_avg = lm_avg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getLy_wgt(){
		return this.ly_wgt;
	}

	public String getLy_avg(){
		return this.ly_avg;
	}

	public String getLm_wgt(){
		return this.lm_wgt;
	}

	public String getLm_avg(){
		return this.lm_avg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.ly_wgt = Util.checkString(cstmt.getString(6));
		this.ly_avg = Util.checkString(cstmt.getString(7));
		this.lm_wgt = Util.checkString(cstmt.getString(8));
		this.lm_avg = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			MT_COMMATR_7510_LCURLIST1Record rec = new MT_COMMATR_7510_LCURLIST1Record();
			rec.jejisa = Util.checkString(rset0.getString("jejisa"));
			rec.paper_cmpy = Util.checkString(rset0.getString("paper_cmpy"));
			rec.wgt_tot = Util.checkString(rset0.getString("wgt_tot"));
			rec.per_tot = Util.checkString(rset0.getString("per_tot"));
			rec.std_rate = Util.checkString(rset0.getString("std_rate"));
			rec.diff_rate = Util.checkString(rset0.getString("diff_rate"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			MT_COMMATR_7510_LCURLIST2Record rec = new MT_COMMATR_7510_LCURLIST2Record();
			rec.fact_nm = Util.checkString(rset1.getString("fact_nm"));
			rec.wgt = Util.checkString(rset1.getString("wgt"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			rec.vat = Util.checkString(rset1.getString("vat"));
			rec.tot = Util.checkString(rset1.getString("tot"));
			rec.per2 = Util.checkString(rset1.getString("per2"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_7510_LDataSet ds = (MT_COMMATR_7510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_COMMATR_7510_LCURLIST1Record curlist1Rec = (MT_COMMATR_7510_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_COMMATR_7510_LCURLIST2Record curlist2Rec = (MT_COMMATR_7510_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getLy_wgt()%>
<%= ds.getLy_avg()%>
<%= ds.getLm_wgt()%>
<%= ds.getLm_avg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.jejisa%>
<%= curlist1Rec.paper_cmpy%>
<%= curlist1Rec.wgt_tot%>
<%= curlist1Rec.per_tot%>
<%= curlist1Rec.std_rate%>
<%= curlist1Rec.diff_rate%>
<%= curlist1Rec.amt%>
<%= curlist2Rec.fact_nm%>
<%= curlist2Rec.wgt%>
<%= curlist2Rec.amt%>
<%= curlist2Rec.vat%>
<%= curlist2Rec.tot%>
<%= curlist2Rec.per2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 04 14:52:34 KST 2015 */