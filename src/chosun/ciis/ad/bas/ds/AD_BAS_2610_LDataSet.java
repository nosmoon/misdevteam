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
import chosun.ciis.ad.bas.rec.AD_BAS_2610_LTRGTRecord;

/**
 * 
 */


public class AD_BAS_2610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList trgt = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2610_LDataSet(){}
	public AD_BAS_2610_LDataSet(String errcode, String errmsg){
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
			AD_BAS_2610_LTRGTRecord rec = new AD_BAS_2610_LTRGTRecord();
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.pre_trgt_amt = Util.checkString(rset0.getString("pre_trgt_amt"));
			rec.pre_pubc_amt = Util.checkString(rset0.getString("pre_pubc_amt"));
			rec.pre_achi_rate = Util.checkString(rset0.getString("pre_achi_rate"));
			rec.cur_trgt_amt = Util.checkString(rset0.getString("cur_trgt_amt"));
			rec.cur_pubc_amt = Util.checkString(rset0.getString("cur_pubc_amt"));
			rec.cur_achi_rate = Util.checkString(rset0.getString("cur_achi_rate"));
			rec.yy_trgt_amt = Util.checkString(rset0.getString("yy_trgt_amt"));
			rec.yy_pubc_amt = Util.checkString(rset0.getString("yy_pubc_amt"));
			rec.yy_achi_rate = Util.checkString(rset0.getString("yy_achi_rate"));
			rec.trgt_clsf = Util.checkString(rset0.getString("trgt_clsf"));
			rec.trgt_obj = Util.checkString(rset0.getString("trgt_obj"));
			rec.trgt_yymm = Util.checkString(rset0.getString("trgt_yymm"));
			this.trgt.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2610_LDataSet ds = (AD_BAS_2610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.trgt.size(); i++){
		AD_BAS_2610_LTRGTRecord trgtRec = (AD_BAS_2610_LTRGTRecord)ds.trgt.get(i);%>
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

<%= trgtRec.medi_nm%>
<%= trgtRec.pre_trgt_amt%>
<%= trgtRec.pre_pubc_amt%>
<%= trgtRec.pre_achi_rate%>
<%= trgtRec.cur_trgt_amt%>
<%= trgtRec.cur_pubc_amt%>
<%= trgtRec.cur_achi_rate%>
<%= trgtRec.yy_trgt_amt%>
<%= trgtRec.yy_pubc_amt%>
<%= trgtRec.yy_achi_rate%>
<%= trgtRec.trgt_clsf%>
<%= trgtRec.trgt_obj%>
<%= trgtRec.trgt_yymm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 09 19:26:20 KST 2009 */