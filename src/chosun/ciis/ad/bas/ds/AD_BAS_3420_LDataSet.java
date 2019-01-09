/***************************************************************************************************
* 파일명   : SP_AD_BAS_3420_L.java
* 기능     : 목표관리(출판) 조회(담당별)
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_3420_LTRGTRecord;

/**
 * 기초자료관리-목표관리(출판) 조회(담당별)
 */


public class AD_BAS_3420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList trgt = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3420_LDataSet(){}
	public AD_BAS_3420_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_BAS_3420_LTRGTRecord rec = new AD_BAS_3420_LTRGTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.trgt_clsf = Util.checkString(rset0.getString("trgt_clsf"));
			rec.trgt_obj = Util.checkString(rset0.getString("trgt_obj"));
			rec.trgt_yymm = Util.checkString(rset0.getString("trgt_yymm"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.trgt_amt_pre = Util.checkString(rset0.getString("trgt_amt_pre"));
			rec.pubc_tot_amt_pre = Util.checkString(rset0.getString("pubc_tot_amt_pre"));
			rec.achi_rate_pre = Util.checkString(rset0.getString("achi_rate_pre"));
			rec.trgt_amt = Util.checkString(rset0.getString("trgt_amt"));
			rec.pubc_tot_amt = Util.checkString(rset0.getString("pubc_tot_amt"));
			rec.achi_rate = Util.checkString(rset0.getString("achi_rate"));
			rec.trgt_amt_sum = Util.checkString(rset0.getString("trgt_amt_sum"));
			rec.pubc_tot_amt_sum = Util.checkString(rset0.getString("pubc_tot_amt_sum"));
			rec.achi_rate_sum = Util.checkString(rset0.getString("achi_rate_sum"));
			this.trgt.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3420_LDataSet ds = (AD_BAS_3420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.trgt.size(); i++){
		AD_BAS_3420_LTRGTRecord trgtRec = (AD_BAS_3420_LTRGTRecord)ds.trgt.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTrgt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= trgtRec.cmpy_cd%>
<%= trgtRec.trgt_clsf%>
<%= trgtRec.trgt_obj%>
<%= trgtRec.trgt_yymm%>
<%= trgtRec.slcrg_pers_nm%>
<%= trgtRec.trgt_amt_pre%>
<%= trgtRec.pubc_tot_amt_pre%>
<%= trgtRec.achi_rate_pre%>
<%= trgtRec.trgt_amt%>
<%= trgtRec.pubc_tot_amt%>
<%= trgtRec.achi_rate%>
<%= trgtRec.trgt_amt_sum%>
<%= trgtRec.pubc_tot_amt_sum%>
<%= trgtRec.achi_rate_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 25 14:37:36 KST 2009 */