/***************************************************************************************************
* 파일명 : .java
* 기능 :   고정자산 - 취득자산일괄조회
* 작성일자 : 2015.10.01
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.as.asrd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.asrd.dm.*;
import chosun.ciis.as.asrd.rec.*;

/**
 * 고정자산 - 취득자산일괄조회
 */

public class AS_ASRD_1302_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASRD_1302_LDataSet(){}
	public AS_ASRD_1302_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			AS_ASRD_1302_LCURLISTRecord rec = new AS_ASRD_1302_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.bund_nm = Util.checkString(rset0.getString("bund_nm"));
			rec.acqr_dt = Util.checkString(rset0.getString("acqr_dt"));
			rec.orgin_acqr_amt = Util.checkString(rset0.getString("orgin_acqr_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.cur_acqr_amt = Util.checkString(rset0.getString("cur_acqr_amt"));
			rec.un_redm_amt = Util.checkString(rset0.getString("un_redm_amt"));
			rec.sale_dt = Util.checkString(rset0.getString("sale_dt"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.aset_stat_nm = Util.checkString(rset0.getString("aset_stat_nm"));
			rec.aset_qunt_cnt = Util.checkString(rset0.getString("aset_qunt_cnt"));
			rec.aset_usag = Util.checkString(rset0.getString("aset_usag"));
			rec.aset_size = Util.checkString(rset0.getString("aset_size"));
			rec.aset_loca = Util.checkString(rset0.getString("aset_loca"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(24);
		while(rset1.next()){
			AS_ASRD_1302_LCURLIST1Record rec = new AS_ASRD_1302_LCURLIST1Record();
			rec.aset_no = Util.checkString(rset1.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset1.getString("aset_nm"));
			rec.item_cd = Util.checkString(rset1.getString("item_cd"));
			rec.item_nm = Util.checkString(rset1.getString("item_nm"));
			rec.buy_clsf = Util.checkString(rset1.getString("buy_clsf"));
			rec.buy_clsf_nm = Util.checkString(rset1.getString("buy_clsf_nm"));
			rec.aset_stat = Util.checkString(rset1.getString("aset_stat"));
			rec.aset_stat_nm = Util.checkString(rset1.getString("aset_stat_nm"));
			rec.acqr_dt = Util.checkString(rset1.getString("acqr_dt"));
			rec.orgin_acqr_amt = Util.checkString(rset1.getString("orgin_acqr_amt"));
			rec.cur_acqr_amt = Util.checkString(rset1.getString("cur_acqr_amt"));
			rec.sale_dt = Util.checkString(rset1.getString("sale_dt"));
			rec.sale_amt = Util.checkString(rset1.getString("sale_amt"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.dlco_ern = Util.checkString(rset1.getString("dlco_ern"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.bund_cd = Util.checkString(rset1.getString("bund_cd"));
			rec.bund_cd_nm = Util.checkString(rset1.getString("bund_cd_nm"));
			rec.aset_size = Util.checkString(rset1.getString("aset_size"));
			rec.aset_loca = Util.checkString(rset1.getString("aset_loca"));
			rec.aset_qunt_cnt = Util.checkString(rset1.getString("aset_qunt_cnt"));
			rec.aset_qunt_cnt2 = Util.checkString(rset1.getString("aset_qunt_cnt2"));
			rec.aset_usag = Util.checkString(rset1.getString("aset_usag"));
			rec.unit_cd = Util.checkString(rset1.getString("unit_cd"));
			rec.unit_nm = Util.checkString(rset1.getString("unit_nm"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset1.getString("budg_nm"));
			rec.redm_clsf = Util.checkString(rset1.getString("redm_clsf"));
			rec.redm_clsf_nm = Util.checkString(rset1.getString("redm_clsf_nm"));
			rec.redm_mthd_cd = Util.checkString(rset1.getString("redm_mthd_cd"));
			rec.redm_mthd_cd_nm = Util.checkString(rset1.getString("redm_mthd_cd_nm"));
			rec.svc_yys_cnt = Util.checkString(rset1.getString("svc_yys_cnt"));
			rec.make_natn = Util.checkString(rset1.getString("make_natn"));
			rec.make_cmpy = Util.checkString(rset1.getString("make_cmpy"));
			rec.make_yymm = Util.checkString(rset1.getString("make_yymm"));
			rec.make_no = Util.checkString(rset1.getString("make_no"));
			rec.mang_no = Util.checkString(rset1.getString("mang_no"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.insr_type_cd = Util.checkString(rset1.getString("insr_type_cd"));
			rec.insr_type_nm = Util.checkString(rset1.getString("insr_type_nm"));
			rec.use_emp_no = Util.checkString(rset1.getString("use_emp_no"));
			rec.use_emp_nm = Util.checkString(rset1.getString("use_emp_nm"));
			rec.use_cmpy_nm = Util.checkString(rset1.getString("use_cmpy_nm"));
			rec.use_dept_nm = Util.checkString(rset1.getString("use_dept_nm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASRD_1302_LDataSet ds = (AS_ASRD_1302_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASRD_1302_LCURLISTRecord curlistRec = (AS_ASRD_1302_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_ASRD_1302_LCURLIST1Record curlist1Rec = (AS_ASRD_1302_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.bund_nm%>
<%= curlistRec.acqr_dt%>
<%= curlistRec.orgin_acqr_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.cur_acqr_amt%>
<%= curlistRec.un_redm_amt%>
<%= curlistRec.sale_dt%>
<%= curlistRec.sale_amt%>
<%= curlistRec.aset_stat_nm%>
<%= curlistRec.aset_qunt_cnt%>
<%= curlistRec.aset_usag%>
<%= curlistRec.aset_size%>
<%= curlistRec.aset_loca%>
<%= curlist1Rec.aset_no%>
<%= curlist1Rec.aset_nm%>
<%= curlist1Rec.item_cd%>
<%= curlist1Rec.item_nm%>
<%= curlist1Rec.buy_clsf%>
<%= curlist1Rec.buy_clsf_nm%>
<%= curlist1Rec.aset_stat%>
<%= curlist1Rec.aset_stat_nm%>
<%= curlist1Rec.acqr_dt%>
<%= curlist1Rec.orgin_acqr_amt%>
<%= curlist1Rec.cur_acqr_amt%>
<%= curlist1Rec.sale_dt%>
<%= curlist1Rec.sale_amt%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_nm%>
<%= curlist1Rec.dlco_ern%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.bund_cd%>
<%= curlist1Rec.bund_cd_nm%>
<%= curlist1Rec.aset_size%>
<%= curlist1Rec.aset_loca%>
<%= curlist1Rec.aset_qunt_cnt%>
<%= curlist1Rec.aset_qunt_cnt2%>
<%= curlist1Rec.aset_usag%>
<%= curlist1Rec.unit_cd%>
<%= curlist1Rec.unit_nm%>
<%= curlist1Rec.budg_cd%>
<%= curlist1Rec.budg_nm%>
<%= curlist1Rec.redm_clsf%>
<%= curlist1Rec.redm_clsf_nm%>
<%= curlist1Rec.redm_mthd_cd%>
<%= curlist1Rec.redm_mthd_cd_nm%>
<%= curlist1Rec.svc_yys_cnt%>
<%= curlist1Rec.make_natn%>
<%= curlist1Rec.make_cmpy%>
<%= curlist1Rec.make_yymm%>
<%= curlist1Rec.make_no%>
<%= curlist1Rec.mang_no%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.insr_type_cd%>
<%= curlist1Rec.insr_type_nm%>
<%= curlist1Rec.use_emp_no%>
<%= curlist1Rec.use_emp_nm%>
<%= curlist1Rec.use_cmpy_nm%>
<%= curlist1Rec.use_dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 17 19:08:41 KST 2017 */