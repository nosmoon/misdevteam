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
import chosun.ciis.ad.bas.rec.AD_BAS_2630_LTRGTRecord;

/**
 * 
 */


public class AD_BAS_2630_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList trgt = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_2630_LDataSet(){}
	public AD_BAS_2630_LDataSet(String errcode, String errmsg){
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
			AD_BAS_2630_LTRGTRecord rec = new AD_BAS_2630_LTRGTRecord();
			rec.team_nm = Util.checkString(rset0.getString("team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
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
			rec.team_cd = Util.checkString(rset0.getString("team_cd"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			this.trgt.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_2630_LDataSet ds = (AD_BAS_2630_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.trgt.size(); i++){
		AD_BAS_2630_LTRGTRecord trgtRec = (AD_BAS_2630_LTRGTRecord)ds.trgt.get(i);%>
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

<%= trgtRec.team_nm%>
<%= trgtRec.part_nm%>
<%= trgtRec.slcrg_pers_nm%>
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
<%= trgtRec.team_cd%>
<%= trgtRec.part_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 23 20:50:13 KST 2009 */