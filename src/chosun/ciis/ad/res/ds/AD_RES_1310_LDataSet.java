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

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.res.rec.AD_RES_1310_LCURLISTRecord;

/**
 * 
 */


public class AD_RES_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1310_LDataSet(){}
	public AD_RES_1310_LDataSet(String errcode, String errmsg){
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
			AD_RES_1310_LCURLISTRecord rec = new AD_RES_1310_LCURLISTRecord();
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.chrg_aprv = Util.checkString(rset0.getString("chrg_aprv"));
			rec.part_chf_aprv = Util.checkString(rset0.getString("part_chf_aprv"));
			rec.team_chf_aprv = Util.checkString(rset0.getString("team_chf_aprv"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.chro_clsf_nm = Util.checkString(rset0.getString("chro_clsf_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.preng_advt_bo = Util.checkString(rset0.getString("preng_advt_bo"));
			rec.mang_mortg_surp_amt = Util.checkString(rset0.getString("mang_mortg_surp_amt"));
			rec.bonddebt_dlco_clsf = Util.checkString(rset0.getString("bonddebt_dlco_clsf"));
			rec.bonddebt_dlco_no = Util.checkString(rset0.getString("bonddebt_dlco_no"));
			rec.bonddebt_dlco_nm = Util.checkString(rset0.getString("bonddebt_dlco_nm"));
			rec.bonddebt_basi_dt = Util.checkString(rset0.getString("bonddebt_basi_dt"));
			rec.dis_agrmnt = Util.checkString(rset0.getString("dis_agrmnt"));
			rec.apr_advt_fee = Util.checkString(rset0.getString("apr_advt_fee"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1310_LDataSet ds = (AD_RES_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1310_LCURLISTRecord curlistRec = (AD_RES_1310_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.chrg_aprv%>
<%= curlistRec.part_chf_aprv%>
<%= curlistRec.team_chf_aprv%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.dn%>
<%= curlistRec.cm%>
<%= curlistRec.chro_clsf_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.slcrg_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.preng_advt_bo%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 11 13:38:28 KST 2009 */