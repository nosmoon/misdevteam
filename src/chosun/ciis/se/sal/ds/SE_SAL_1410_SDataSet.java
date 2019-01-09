/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1410_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList jidaelist = new ArrayList();
	public ArrayList bolist = new ArrayList();
	public ArrayList rcpmlist = new ArrayList();
	public ArrayList qtylist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_1410_SDataSet(){}
	public SE_SAL_1410_SDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_SAL_1410_SBOLISTRecord rec = new SE_SAL_1410_SBOLISTRecord();
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset0.getString("bo_seq"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.area_nm = Util.checkString(rset0.getString("area_nm"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.cntr_stat_nm = Util.checkString(rset0.getString("cntr_stat_nm"));
			rec.bo_cntr_dt = Util.checkString(rset0.getString("bo_cntr_dt"));
			rec.jd_sell_net_nm = Util.checkString(rset0.getString("jd_sell_net_nm"));
			rec.jd_sell_net_clsf = Util.checkString(rset0.getString("jd_sell_net_clsf"));
			this.bolist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			SE_SAL_1410_SJIDAELISTRecord rec = new SE_SAL_1410_SJIDAELISTRecord();
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.bo_cd = Util.checkString(rset1.getString("bo_cd"));
			rec.bo_seq = Util.checkString(rset1.getString("bo_seq"));
			rec.yymm = Util.checkString(rset1.getString("yymm"));
			rec.area_cd = Util.checkString(rset1.getString("area_cd"));
			rec.val_qty_110 = Util.checkString(rset1.getString("val_qty_110"));
			rec.icdc_calc_qty_110 = Util.checkString(rset1.getString("icdc_calc_qty_110"));
			rec.spsl_qty_110 = Util.checkString(rset1.getString("spsl_qty_110"));
			rec.cntr_qty_110 = Util.checkString(rset1.getString("cntr_qty_110"));
			rec.basi_uprc_110 = Util.checkString(rset1.getString("basi_uprc_110"));
			rec.rdff_rdu_uprc_110 = Util.checkString(rset1.getString("rdff_rdu_uprc_110"));
			rec.cntr_uprc_110 = Util.checkString(rset1.getString("cntr_uprc_110"));
			rec.dnt_qty_110 = Util.checkString(rset1.getString("dnt_qty_110"));
			rec.regu_subs_uprc_110 = Util.checkString(rset1.getString("regu_subs_uprc_110"));
			rec.dnt_amt_110 = Util.checkString(rset1.getString("dnt_amt_110"));
			rec.stetsell_qty_110 = Util.checkString(rset1.getString("stetsell_qty_110"));
			rec.stetsell_uprc_110 = Util.checkString(rset1.getString("stetsell_uprc_110"));
			rec.stetsell_amt_110 = Util.checkString(rset1.getString("stetsell_amt_110"));
			rec.incmp_sale_qty_110 = Util.checkString(rset1.getString("incmp_sale_qty_110"));
			rec.incmp_sale_amt_110 = Util.checkString(rset1.getString("incmp_sale_amt_110"));
			rec.prvmm_val_qty_110 = Util.checkString(rset1.getString("prvmm_val_qty_110"));
			rec.fpymt_encur_amt_110 = Util.checkString(rset1.getString("fpymt_encur_amt_110"));
			rec.smt_amt_110 = Util.checkString(rset1.getString("smt_amt_110"));
			rec.sale_amt_110 = Util.checkString(rset1.getString("sale_amt_110"));
			rec.dscn_amt_110 = Util.checkString(rset1.getString("dscn_amt_110"));
			rec.net_sale_amt_110 = Util.checkString(rset1.getString("net_sale_amt_110"));
			rec.net_sale_amt_all = Util.checkString(rset1.getString("net_sale_amt_all"));
			rec.val_qty_130 = Util.checkString(rset1.getString("val_qty_130"));
			rec.icdc_calc_qty_130 = Util.checkString(rset1.getString("icdc_calc_qty_130"));
			rec.spsl_qty_130 = Util.checkString(rset1.getString("spsl_qty_130"));
			rec.cntr_qty_130 = Util.checkString(rset1.getString("cntr_qty_130"));
			rec.basi_uprc_130 = Util.checkString(rset1.getString("basi_uprc_130"));
			rec.rdff_rdu_uprc_130 = Util.checkString(rset1.getString("rdff_rdu_uprc_130"));
			rec.cntr_uprc_130 = Util.checkString(rset1.getString("cntr_uprc_130"));
			rec.dnt_qty_130 = Util.checkString(rset1.getString("dnt_qty_130"));
			rec.regu_subs_uprc_130 = Util.checkString(rset1.getString("regu_subs_uprc_130"));
			rec.dnt_amt_130 = Util.checkString(rset1.getString("dnt_amt_130"));
			rec.stetsell_qty_130 = Util.checkString(rset1.getString("stetsell_qty_130"));
			rec.stetsell_uprc_130 = Util.checkString(rset1.getString("stetsell_uprc_130"));
			rec.stetsell_amt_130 = Util.checkString(rset1.getString("stetsell_amt_130"));
			rec.incmp_sale_qty_130 = Util.checkString(rset1.getString("incmp_sale_qty_130"));
			rec.incmp_sale_amt_130 = Util.checkString(rset1.getString("incmp_sale_amt_130"));
			rec.prvmm_val_qty_130 = Util.checkString(rset1.getString("prvmm_val_qty_130"));
			rec.fpymt_encur_amt_130 = Util.checkString(rset1.getString("fpymt_encur_amt_130"));
			rec.smt_amt_130 = Util.checkString(rset1.getString("smt_amt_130"));
			rec.sale_amt_130 = Util.checkString(rset1.getString("sale_amt_130"));
			rec.dscn_amt_130 = Util.checkString(rset1.getString("dscn_amt_130"));
			rec.net_sale_amt_130 = Util.checkString(rset1.getString("net_sale_amt_130"));
			this.jidaelist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			SE_SAL_1410_SRCPMLISTRecord rec = new SE_SAL_1410_SRCPMLISTRecord();
			rec.fpymt_dt = Util.checkString(rset2.getString("fpymt_dt"));
			rec.ratio = Util.checkString(rset2.getString("ratio"));
			rec.cyov_bal = Util.checkString(rset2.getString("cyov_bal"));
			rec.prvmm_net_sale_amt = Util.checkString(rset2.getString("prvmm_net_sale_amt"));
			rec.smt_amt = Util.checkString(rset2.getString("smt_amt"));
			rec.rcpm_amt = Util.checkString(rset2.getString("rcpm_amt"));
			rec.rcpm_bal = Util.checkString(rset2.getString("rcpm_bal"));
			rec.label = Util.checkString(rset2.getString("label"));
			rec.bo_cyov = Util.checkString(rset2.getString("bo_cyov"));
			rec.adjm_cyov = Util.checkString(rset2.getString("adjm_cyov"));
			rec.bal = Util.checkString(rset2.getString("bal"));
			rec.net_sale_amt = Util.checkString(rset2.getString("net_sale_amt"));
			rec.smt_amt2 = Util.checkString(rset2.getString("smt_amt2"));
			this.rcpmlist.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			SE_SAL_1410_SQTYLISTRecord rec = new SE_SAL_1410_SQTYLISTRecord();
			rec.qty_110_1 = Util.checkString(rset3.getString("qty_110_1"));
			rec.qty_110_2 = Util.checkString(rset3.getString("qty_110_2"));
			rec.qty_110_3 = Util.checkString(rset3.getString("qty_110_3"));
			rec.qty_130_1 = Util.checkString(rset3.getString("qty_130_1"));
			rec.qty_130_2 = Util.checkString(rset3.getString("qty_130_2"));
			rec.qty_130_3 = Util.checkString(rset3.getString("qty_130_3"));
			rec.qty_130_4 = Util.checkString(rset3.getString("qty_130_4"));
			this.qtylist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_1410_SDataSet ds = (SE_SAL_1410_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.bolist.size(); i++){
		SE_SAL_1410_SBOLISTRecord bolistRec = (SE_SAL_1410_SBOLISTRecord)ds.bolist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.jidaelist.size(); i++){
		SE_SAL_1410_SJIDAELISTRecord jidaelistRec = (SE_SAL_1410_SJIDAELISTRecord)ds.jidaelist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcpmlist.size(); i++){
		SE_SAL_1410_SRCPMLISTRecord rcpmlistRec = (SE_SAL_1410_SRCPMLISTRecord)ds.rcpmlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.qtylist.size(); i++){
		SE_SAL_1410_SQTYLISTRecord qtylistRec = (SE_SAL_1410_SQTYLISTRecord)ds.qtylist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBolist()%>
<%= ds.getJidaelist()%>
<%= ds.getRcpmlist()%>
<%= ds.getQtylist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= bolistRec.bo_cd%>
<%= bolistRec.bo_seq%>
<%= bolistRec.bo_head_nm%>
<%= bolistRec.dept_nm%>
<%= bolistRec.part_nm%>
<%= bolistRec.area_nm%>
<%= bolistRec.flnm%>
<%= bolistRec.cntr_stat_nm%>
<%= bolistRec.bo_cntr_dt%>
<%= bolistRec.jd_sell_net_nm%>
<%= bolistRec.jd_sell_net_clsf%>
<%= jidaelistRec.cmpy_cd%>
<%= jidaelistRec.bo_cd%>
<%= jidaelistRec.bo_seq%>
<%= jidaelistRec.yymm%>
<%= jidaelistRec.area_cd%>
<%= jidaelistRec.val_qty_110%>
<%= jidaelistRec.icdc_calc_qty_110%>
<%= jidaelistRec.spsl_qty_110%>
<%= jidaelistRec.cntr_qty_110%>
<%= jidaelistRec.basi_uprc_110%>
<%= jidaelistRec.rdff_rdu_uprc_110%>
<%= jidaelistRec.cntr_uprc_110%>
<%= jidaelistRec.dnt_qty_110%>
<%= jidaelistRec.regu_subs_uprc_110%>
<%= jidaelistRec.dnt_amt_110%>
<%= jidaelistRec.stetsell_qty_110%>
<%= jidaelistRec.stetsell_uprc_110%>
<%= jidaelistRec.stetsell_amt_110%>
<%= jidaelistRec.incmp_sale_qty_110%>
<%= jidaelistRec.incmp_sale_amt_110%>
<%= jidaelistRec.prvmm_val_qty_110%>
<%= jidaelistRec.fpymt_encur_amt_110%>
<%= jidaelistRec.smt_amt_110%>
<%= jidaelistRec.sale_amt_110%>
<%= jidaelistRec.dscn_amt_110%>
<%= jidaelistRec.net_sale_amt_110%>
<%= jidaelistRec.net_sale_amt_all%>
<%= jidaelistRec.val_qty_130%>
<%= jidaelistRec.icdc_calc_qty_130%>
<%= jidaelistRec.spsl_qty_130%>
<%= jidaelistRec.cntr_qty_130%>
<%= jidaelistRec.basi_uprc_130%>
<%= jidaelistRec.rdff_rdu_uprc_130%>
<%= jidaelistRec.cntr_uprc_130%>
<%= jidaelistRec.dnt_qty_130%>
<%= jidaelistRec.regu_subs_uprc_130%>
<%= jidaelistRec.dnt_amt_130%>
<%= jidaelistRec.stetsell_qty_130%>
<%= jidaelistRec.stetsell_uprc_130%>
<%= jidaelistRec.stetsell_amt_130%>
<%= jidaelistRec.incmp_sale_qty_130%>
<%= jidaelistRec.incmp_sale_amt_130%>
<%= jidaelistRec.prvmm_val_qty_130%>
<%= jidaelistRec.fpymt_encur_amt_130%>
<%= jidaelistRec.smt_amt_130%>
<%= jidaelistRec.sale_amt_130%>
<%= jidaelistRec.dscn_amt_130%>
<%= jidaelistRec.net_sale_amt_130%>
<%= rcpmlistRec.fpymt_dt%>
<%= rcpmlistRec.ratio%>
<%= rcpmlistRec.cyov_bal%>
<%= rcpmlistRec.prvmm_net_sale_amt%>
<%= rcpmlistRec.smt_amt%>
<%= rcpmlistRec.rcpm_amt%>
<%= rcpmlistRec.rcpm_bal%>
<%= rcpmlistRec.label%>
<%= rcpmlistRec.bo_cyov%>
<%= rcpmlistRec.adjm_cyov%>
<%= rcpmlistRec.bal%>
<%= rcpmlistRec.net_sale_amt%>
<%= rcpmlistRec.smt_amt2%>
<%= qtylistRec.qty_110_1%>
<%= qtylistRec.qty_110_2%>
<%= qtylistRec.qty_110_3%>
<%= qtylistRec.qty_130_1%>
<%= qtylistRec.qty_130_2%>
<%= qtylistRec.qty_130_3%>
<%= qtylistRec.qty_130_4%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 02 14:58:23 KST 2009 */