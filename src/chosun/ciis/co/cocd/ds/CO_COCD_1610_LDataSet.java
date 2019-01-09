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


package chosun.ciis.co.cocd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_COCD_1610_LDataSet(){}
	public CO_COCD_1610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			CO_COCD_1610_LCOMMCDCUR1Record rec = new CO_COCD_1610_LCOMMCDCUR1Record();
			rec.pgm_id = Util.checkString(rset0.getString("pgm_id"));
			rec.pgm_nm = Util.checkString(rset0.getString("pgm_nm"));
			rec.pgm_onm = Util.checkString(rset0.getString("pgm_onm"));
			rec.pgm_clf2 = Util.checkString(rset0.getString("pgm_clf2"));
			rec.pgm_clf2_nm = Util.checkString(rset0.getString("pgm_clf2_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.prd_co_cd = Util.checkString(rset0.getString("prd_co_cd"));
			rec.prd_co_nm = Util.checkString(rset0.getString("prd_co_nm"));
			rec.prd_ym = Util.checkString(rset0.getString("prd_ym"));
			rec.rmsg_dt_tm = Util.checkString(rset0.getString("rmsg_dt_tm"));
			rec.mod_dt = Util.checkString(rset0.getString("mod_dt"));
			this.commcdcur1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_COCD_1610_LDataSet ds = (CO_COCD_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		CO_COCD_1610_LCOMMCDCUR1Record commcdcur1Rec = (CO_COCD_1610_LCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCommcdcur1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= commcdcur1Rec.pgm_id%>
<%= commcdcur1Rec.pgm_nm%>
<%= commcdcur1Rec.pgm_onm%>
<%= commcdcur1Rec.pgm_clf2%>
<%= commcdcur1Rec.pgm_clf2_nm%>
<%= commcdcur1Rec.medi_cd%>
<%= commcdcur1Rec.use_yn%>
<%= commcdcur1Rec.prd_co_cd%>
<%= commcdcur1Rec.prd_co_nm%>
<%= commcdcur1Rec.prd_ym%>
<%= commcdcur1Rec.rmsg_dt_tm%>
<%= commcdcur1Rec.mod_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 16 18:51:58 KST 2012 */