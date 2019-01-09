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


public class AD_RES_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList sectcurlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String preng_clos_yn;
	public String asum_shet_aprv_yn;
	public String tot_side_cnt;
	public String tot_dn_cnt;
	public String advs_ocpy_rate;
	public String unasin_uprc;
	public String tot_advt_fee;
	public String out_tot_advt_fee;
	public String ex_tot_advt_fee;

	public AD_RES_1410_LDataSet(){}
	public AD_RES_1410_LDataSet(String errcode, String errmsg, String preng_clos_yn, String asum_shet_aprv_yn, String tot_side_cnt, String tot_dn_cnt, String advs_ocpy_rate, String unasin_uprc, String tot_advt_fee, String out_tot_advt_fee, String ex_tot_advt_fee){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.preng_clos_yn = preng_clos_yn;
		this.asum_shet_aprv_yn = asum_shet_aprv_yn;
		this.tot_side_cnt = tot_side_cnt;
		this.tot_dn_cnt = tot_dn_cnt;
		this.advs_ocpy_rate = advs_ocpy_rate;
		this.unasin_uprc = unasin_uprc;
		this.tot_advt_fee = tot_advt_fee;
		this.out_tot_advt_fee = out_tot_advt_fee;
		this.ex_tot_advt_fee = ex_tot_advt_fee;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPreng_clos_yn(String preng_clos_yn){
		this.preng_clos_yn = preng_clos_yn;
	}

	public void setAsum_shet_aprv_yn(String asum_shet_aprv_yn){
		this.asum_shet_aprv_yn = asum_shet_aprv_yn;
	}

	public void setTot_side_cnt(String tot_side_cnt){
		this.tot_side_cnt = tot_side_cnt;
	}

	public void setTot_dn_cnt(String tot_dn_cnt){
		this.tot_dn_cnt = tot_dn_cnt;
	}

	public void setAdvs_ocpy_rate(String advs_ocpy_rate){
		this.advs_ocpy_rate = advs_ocpy_rate;
	}

	public void setUnasin_uprc(String unasin_uprc){
		this.unasin_uprc = unasin_uprc;
	}

	public void setTot_advt_fee(String tot_advt_fee){
		this.tot_advt_fee = tot_advt_fee;
	}

	public void setOut_tot_advt_fee(String out_tot_advt_fee){
		this.out_tot_advt_fee = out_tot_advt_fee;
	}

	public void setEx_tot_advt_fee(String ex_tot_advt_fee){
		this.ex_tot_advt_fee = ex_tot_advt_fee;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPreng_clos_yn(){
		return this.preng_clos_yn;
	}

	public String getAsum_shet_aprv_yn(){
		return this.asum_shet_aprv_yn;
	}

	public String getTot_side_cnt(){
		return this.tot_side_cnt;
	}

	public String getTot_dn_cnt(){
		return this.tot_dn_cnt;
	}

	public String getAdvs_ocpy_rate(){
		return this.advs_ocpy_rate;
	}

	public String getUnasin_uprc(){
		return this.unasin_uprc;
	}

	public String getTot_advt_fee(){
		return this.tot_advt_fee;
	}

	public String getOut_tot_advt_fee(){
		return this.out_tot_advt_fee;
	}

	public String getEx_tot_advt_fee(){
		return this.ex_tot_advt_fee;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.preng_clos_yn = Util.checkString(cstmt.getString(6));
		this.asum_shet_aprv_yn = Util.checkString(cstmt.getString(7));
		this.tot_side_cnt = Util.checkString(cstmt.getString(8));
		this.tot_dn_cnt = Util.checkString(cstmt.getString(9));
		this.advs_ocpy_rate = Util.checkString(cstmt.getString(10));
		this.unasin_uprc = Util.checkString(cstmt.getString(11));
		this.tot_advt_fee = Util.checkString(cstmt.getString(12));
		this.out_tot_advt_fee = Util.checkString(cstmt.getString(13));
		this.ex_tot_advt_fee = Util.checkString(cstmt.getString(14));
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			AD_RES_1410_LCURLISTRecord rec = new AD_RES_1410_LCURLISTRecord();
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.issu_side = Util.checkString(rset0.getString("issu_side"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.sect_seq = Util.checkString(rset0.getString("sect_seq"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.chro_clsf = Util.checkString(rset0.getString("chro_clsf"));
			rec.chro_clsf_nm = Util.checkString(rset0.getString("chro_clsf_nm"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.ex_advt_fee = Util.checkString(rset0.getString("ex_advt_fee"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.bw_clr_yn = Util.checkString(rset0.getString("bw_clr_yn"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.pubc_clsf = Util.checkString(rset0.getString("pubc_clsf"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(16);
		while(rset1.next()){
			AD_RES_1410_LSECTCURLISTRecord rec = new AD_RES_1410_LSECTCURLISTRecord();
			rec.sect_clas_cd = Util.checkString(rset1.getString("sect_clas_cd"));
			rec.sect_nm_cd = Util.checkString(rset1.getString("sect_nm_cd"));
			rec.sect_nm = Util.checkString(rset1.getString("sect_nm"));
			rec.sect_cd = Util.checkString(rset1.getString("sect_cd"));
			rec.max_seq = Util.checkString(rset1.getString("max_seq"));
			rec.edt_clsf_nm = Util.checkString(rset1.getString("edt_clsf_nm"));
			this.sectcurlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1410_LDataSet ds = (AD_RES_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1410_LCURLISTRecord curlistRec = (AD_RES_1410_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.sectcurlist.size(); i++){
		AD_RES_1410_LSECTCURLISTRecord sectcurlistRec = (AD_RES_1410_LSECTCURLISTRecord)ds.sectcurlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPreng_clos_yn()%>
<%= ds.getAsum_shet_aprv_yn()%>
<%= ds.getTot_side_cnt()%>
<%= ds.getTot_dn_cnt()%>
<%= ds.getAdvs_ocpy_rate()%>
<%= ds.getUnasin_uprc()%>
<%= ds.getTot_advt_fee()%>
<%= ds.getOut_tot_advt_fee()%>
<%= ds.getEx_tot_advt_fee()%>
<%= ds.getCurlist()%>
<%= ds.getSectcurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.preng_occr_seq%>
<%= curlistRec.sect_nm%>
<%= curlistRec.issu_dt%>
<%= curlistRec.issu_side%>
<%= curlistRec.sect_cd%>
<%= curlistRec.sect_seq%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.chro_clsf%>
<%= curlistRec.chro_clsf_nm%>
<%= curlistRec.advt_cont%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.ex_advt_fee%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.slcrg_pers_nm%>
<%= curlistRec.agn%>
<%= curlistRec.agn_nm%>
<%= curlistRec.bw_clr_yn%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.pubc_clsf%>
<%= curlistRec.dlco_clsf%>
<%= sectcurlistRec.sect_clas_cd%>
<%= sectcurlistRec.sect_nm_cd%>
<%= sectcurlistRec.sect_nm%>
<%= sectcurlistRec.sect_cd%>
<%= sectcurlistRec.max_seq%>
<%= sectcurlistRec.edt_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 03 10:16:30 KST 2017 */