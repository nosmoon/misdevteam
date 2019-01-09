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


public class AD_RES_1202_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList sumcurlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1202_LDataSet(){}
	public AD_RES_1202_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			AD_RES_1202_LCURLISTRecord rec = new AD_RES_1202_LCURLISTRecord();
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.chrg_aprv = Util.checkString(rset0.getString("chrg_aprv"));
			rec.part_chf_aprv = Util.checkString(rset0.getString("part_chf_aprv"));
			rec.team_chf_aprv = Util.checkString(rset0.getString("team_chf_aprv"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.chro_clsf_nm = Util.checkString(rset0.getString("chro_clsf_nm"));
			rec.hndl_clsf_nm = Util.checkString(rset0.getString("hndl_clsf_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.pubc_slip_no = Util.checkString(rset0.getString("pubc_slip_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.apr_advt_fee = Util.checkString(rset0.getString("apr_advt_fee"));
			rec.mang_mortg_surp_amt = Util.checkString(rset0.getString("mang_mortg_surp_amt"));
			rec.bonddebt_dlco_clsf = Util.checkString(rset0.getString("bonddebt_dlco_clsf"));
			rec.bonddebt_dlco_no = Util.checkString(rset0.getString("bonddebt_dlco_no"));
			rec.bonddebt_dlco_nm = Util.checkString(rset0.getString("bonddebt_dlco_nm"));
			rec.bonddebt_basi_dt = Util.checkString(rset0.getString("bonddebt_basi_dt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			AD_RES_1202_LSUMCURLISTRecord rec = new AD_RES_1202_LSUMCURLISTRecord();
			rec.lbl = Util.checkString(rset1.getString("lbl"));
			rec.cnt = Util.checkString(rset1.getString("cnt"));
			rec.advt_fee = Util.checkString(rset1.getString("advt_fee"));
			this.sumcurlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1202_LDataSet ds = (AD_RES_1202_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1202_LCURLISTRecord curlistRec = (AD_RES_1202_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sumcurlist.size(); i++){
		AD_RES_1202_LSUMCURLISTRecord sumcurlistRec = (AD_RES_1202_LSUMCURLISTRecord)ds.sumcurlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getSumcurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.medi_nm%>
<%= curlistRec.preng_occr_dt%>
<%= curlistRec.preng_occr_seq%>
<%= curlistRec.chrg_aprv%>
<%= curlistRec.part_chf_aprv%>
<%= curlistRec.team_chf_aprv%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.chro_clsf_nm%>
<%= curlistRec.hndl_clsf_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.agn_nm%>
<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.slcrg_pers_nm%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.advt_cont%>
<%= curlistRec.pubc_slip_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.apr_advt_fee%>
<%= curlistRec.mang_mortg_surp_amt%>
<%= curlistRec.bonddebt_dlco_clsf%>
<%= curlistRec.bonddebt_dlco_no%>
<%= curlistRec.bonddebt_dlco_nm%>
<%= curlistRec.bonddebt_basi_dt%>
<%= sumcurlistRec.lbl%>
<%= sumcurlistRec.cnt%>
<%= sumcurlistRec.advt_fee%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 26 20:11:44 KST 2017 */