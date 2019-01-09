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


package chosun.ciis.ad.res.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_1620_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1620_LDataSet(){}
	public AD_RES_1620_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AD_RES_1620_LCURLISTRecord rec = new AD_RES_1620_LCURLISTRecord();
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.chro_clsf_nm = Util.checkString(rset0.getString("chro_clsf_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.hndl_clsf_nm = Util.checkString(rset0.getString("hndl_clsf_nm"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.indt_clsf_nm = Util.checkString(rset0.getString("indt_clsf_nm"));
			rec.grp_cmpy_nm = Util.checkString(rset0.getString("grp_cmpy_nm"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.chrg_aprv = Util.checkString(rset0.getString("chrg_aprv"));
			rec.team_chf_aprv = Util.checkString(rset0.getString("team_chf_aprv"));
			rec.tax_clsf = Util.checkString(rset0.getString("tax_clsf"));
			rec.patr_chrg_info = Util.checkString(rset0.getString("patr_chrg_info"));
			rec.tax_email = Util.checkString(rset0.getString("tax_email"));
			rec.advt_clsf = Util.checkString(rset0.getString("advt_clsf"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1620_LDataSet ds = (AD_RES_1620_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1620_LCURLISTRecord curlistRec = (AD_RES_1620_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.preng_occr_dt%>
<%= curlistRec.preng_occr_seq%>
<%= curlistRec.pubc_side%>
<%= curlistRec.chro_clsf_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_cont%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.hndl_clsf_nm%>
<%= curlistRec.fee%>
<%= curlistRec.slcrg_nm%>
<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.indt_clsf_nm%>
<%= curlistRec.grp_cmpy_nm%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.chrg_aprv%>
<%= curlistRec.team_chf_aprv%>
<%= curlistRec.tax_clsf%>
<%= curlistRec.patr_chrg_info%>
<%= curlistRec.tax_email%>
<%= curlistRec.advt_clsf%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 02 17:09:41 KST 2014 */