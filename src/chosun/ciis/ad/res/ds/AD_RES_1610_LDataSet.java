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


public class AD_RES_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String tot_pn;
	public String tot_dn;
	public String tot_rt;
	public String ysdanga;
	public String pgdanga;
	public String ysgjamt;
	public String res_rt;

	public AD_RES_1610_LDataSet(){}
	public AD_RES_1610_LDataSet(String errcode, String errmsg, String tot_pn, String tot_dn, String tot_rt, String ysdanga, String pgdanga, String ysgjamt, String res_rt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_pn = tot_pn;
		this.tot_dn = tot_dn;
		this.tot_rt = tot_rt;
		this.ysdanga = ysdanga;
		this.pgdanga = pgdanga;
		this.ysgjamt = ysgjamt;
		this.res_rt = res_rt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_pn(String tot_pn){
		this.tot_pn = tot_pn;
	}

	public void setTot_dn(String tot_dn){
		this.tot_dn = tot_dn;
	}

	public void setTot_rt(String tot_rt){
		this.tot_rt = tot_rt;
	}

	public void setYsdanga(String ysdanga){
		this.ysdanga = ysdanga;
	}

	public void setPgdanga(String pgdanga){
		this.pgdanga = pgdanga;
	}

	public void setYsgjamt(String ysgjamt){
		this.ysgjamt = ysgjamt;
	}

	public void setRes_rt(String res_rt){
		this.res_rt = res_rt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTot_pn(){
		return this.tot_pn;
	}

	public String getTot_dn(){
		return this.tot_dn;
	}

	public String getTot_rt(){
		return this.tot_rt;
	}

	public String getYsdanga(){
		return this.ysdanga;
	}

	public String getPgdanga(){
		return this.pgdanga;
	}

	public String getYsgjamt(){
		return this.ysgjamt;
	}

	public String getRes_rt(){
		return this.res_rt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tot_pn = Util.checkString(cstmt.getString(14));
		this.tot_dn = Util.checkString(cstmt.getString(15));
		this.tot_rt = Util.checkString(cstmt.getString(16));
		this.ysdanga = Util.checkString(cstmt.getString(17));
		this.pgdanga = Util.checkString(cstmt.getString(18));
		this.ysgjamt = Util.checkString(cstmt.getString(19));
		this.res_rt = Util.checkString(cstmt.getString(20));
		ResultSet rset0 = (ResultSet) cstmt.getObject(21);
		while(rset0.next()){
			AD_RES_1610_LCURLISTRecord rec = new AD_RES_1610_LCURLISTRecord();
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.chro_clsf_nm = Util.checkString(rset0.getString("chro_clsf_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.pubc_clsf_nm = Util.checkString(rset0.getString("pubc_clsf_nm"));
			rec.hndl_clsf_nm = Util.checkString(rset0.getString("hndl_clsf_nm"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			rec.hndl_plac_nm = Util.checkString(rset0.getString("hndl_plac_nm"));
			rec.indt_clsf_nm = Util.checkString(rset0.getString("indt_clsf_nm"));
			rec.grp_cmpy_nm = Util.checkString(rset0.getString("grp_cmpy_nm"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.chrg_aprv = Util.checkString(rset0.getString("chrg_aprv"));
			rec.team_chf_aprv = Util.checkString(rset0.getString("team_chf_aprv"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1610_LDataSet ds = (AD_RES_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1610_LCURLISTRecord curlistRec = (AD_RES_1610_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTot_pn()%>
<%= ds.getTot_dn()%>
<%= ds.getTot_rt()%>
<%= ds.getYsdanga()%>
<%= ds.getPgdanga()%>
<%= ds.getYsgjamt()%>
<%= ds.getRes_rt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.preng_occr_dt%>
<%= curlistRec.preng_occr_seq%>
<%= curlistRec.pubc_side%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.chro_clsf_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advt_cont%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.pubc_clsf_nm%>
<%= curlistRec.hndl_clsf_nm%>
<%= curlistRec.slcrg_nm%>
<%= curlistRec.hndl_plac_nm%>
<%= curlistRec.indt_clsf_nm%>
<%= curlistRec.grp_cmpy_nm%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.chrg_aprv%>
<%= curlistRec.team_chf_aprv%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 14 14:28:11 KST 2017 */