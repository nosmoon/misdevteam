/***************************************************************************************************
* 파일명 : .java
* 기능 :  세션정보가져오기
* 작성일자 : 2014.03.31
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.co.mng.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.mng.dm.*;
import chosun.ciis.co.mng.rec.*;

/**
 * 세션정보가져오기
 */

public class CO_MNG_1050_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_MNG_1050_LDataSet(){}
	public CO_MNG_1050_LDataSet(String errcode, String errmsg){
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
			CO_MNG_1050_LCURCOMMLISTRecord rec = new CO_MNG_1050_LCURCOMMLISTRecord();
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.empno = Util.checkString(rset0.getString("empno"));
			rec.nm = Util.checkString(rset0.getString("nm"));
			rec.acct_passwd = Util.checkString(rset0.getString("acct_passwd"));
			rec.emp_clsf_cd = Util.checkString(rset0.getString("emp_clsf_cd"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.inpre_no = Util.checkString(rset0.getString("inpre_no"));
			rec.ptph = Util.checkString(rset0.getString("ptph"));
			rec.email_id = Util.checkString(rset0.getString("email_id"));
			rec.blng_cmpy_cd = Util.checkString(rset0.getString("blng_cmpy_cd"));
			rec.blng_cmpy_nm = Util.checkString(rset0.getString("blng_cmpy_nm"));
			rec.duty_cmpy_cd = Util.checkString(rset0.getString("duty_cmpy_cd"));
			rec.duty_cmpy_nm = Util.checkString(rset0.getString("duty_cmpy_nm"));
			rec.offi_real_hdqtboks_cd = Util.checkString(rset0.getString("offi_real_hdqtboks_cd"));
			rec.offi_real_hdqtboks_nm = Util.checkString(rset0.getString("offi_real_hdqtboks_nm"));
			rec.boks_team_cd = Util.checkString(rset0.getString("boks_team_cd"));
			rec.boks_team_nm = Util.checkString(rset0.getString("boks_team_nm"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.class_cd = Util.checkString(rset0.getString("class_cd"));
			rec.class_nm = Util.checkString(rset0.getString("class_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.job_clsf_use_vdty_dd = Util.checkString(rset0.getString("job_clsf_use_vdty_dd"));
			rec.job_clsf_cd = Util.checkString(rset0.getString("job_clsf_cd"));
			rec.job_clsf_nm = Util.checkString(rset0.getString("job_clsf_nm"));
			rec.crm_usepers_type = Util.checkString(rset0.getString("crm_usepers_type"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.crm_deal_bank_cd = Util.checkString(rset0.getString("crm_deal_bank_cd"));
			rec.crm_deal_bank_nm = Util.checkString(rset0.getString("crm_deal_bank_nm"));
			rec.crm_acct_no = Util.checkString(rset0.getString("crm_acct_no"));
			rec.crm_mang_area_cd = Util.checkString(rset0.getString("crm_mang_area_cd"));
			rec.crm_mang_area_nm = Util.checkString(rset0.getString("crm_mang_area_nm"));
			rec.crm_sell_dept_cd = Util.checkString(rset0.getString("crm_sell_dept_cd"));
			rec.crm_sell_dept_nm = Util.checkString(rset0.getString("crm_sell_dept_nm"));
			rec.crm_bof_cd = Util.checkString(rset0.getString("crm_bof_cd"));
			rec.crm_sell_part_nm = Util.checkString(rset0.getString("crm_sell_part_nm"));
			rec.crm_bof_nm = Util.checkString(rset0.getString("crm_bof_nm"));
			rec.crm_area_cd = Util.checkString(rset0.getString("crm_area_cd"));
			rec.crm_area_nm = Util.checkString(rset0.getString("crm_area_nm"));
			rec.crm_hd_dept_cd = Util.checkString(rset0.getString("crm_hd_dept_cd"));
			rec.crm_hd_dept_nm = Util.checkString(rset0.getString("crm_hd_dept_nm"));
			rec.crm_bof_clsf = Util.checkString(rset0.getString("crm_bof_clsf"));
			rec.crm_bof_clsf_nm = Util.checkString(rset0.getString("crm_bof_clsf_nm"));
			rec.crm_bill_grp_id = Util.checkString(rset0.getString("crm_bill_grp_id"));
			rec.crm_bill_grp_type = Util.checkString(rset0.getString("crm_bill_grp_type"));
			rec.crm_bill_blng_cd = Util.checkString(rset0.getString("crm_bill_blng_cd"));
			rec.crm_sell_part_cd = Util.checkString(rset0.getString("crm_sell_part_cd"));
			rec.crm_mang_dept_cd = Util.checkString(rset0.getString("crm_mang_dept_cd"));
			rec.crm_mang_dept_nm = Util.checkString(rset0.getString("crm_mang_dept_nm"));
			rec.crm_cust_src_cd = Util.checkString(rset0.getString("crm_cust_src_cd"));
			rec.crm_cust_src_nm = Util.checkString(rset0.getString("crm_cust_src_nm"));
			rec.crm_publ_bo_cd = Util.checkString(rset0.getString("crm_publ_bo_cd"));
			rec.crm_publ_bo_nm = Util.checkString(rset0.getString("crm_publ_bo_nm"));
			rec.crm_job_clsf_cd = Util.checkString(rset0.getString("crm_job_clsf_cd"));
			rec.crm_job_clsf_nm = Util.checkString(rset0.getString("crm_job_clsf_nm"));
			rec.usb_key = Util.checkString(rset0.getString("usb_key"));
			rec.pre_dept_cd = Util.checkString(rset0.getString("pre_dept_cd"));
			rec.dept_chg_dt = Util.checkString(rset0.getString("dept_chg_dt"));
			rec.rep_posi_type_cd = Util.checkString(rset0.getString("rep_posi_type_cd"));
			rec.usb_key_reg_dt = Util.checkString(rset0.getString("usb_key_reg_dt"));
			rec.vpn_user_yn = Util.checkString(rset0.getString("vpn_user_yn"));
			rec.xcoop_use = Util.checkString(rset0.getString("xcoop_use"));
			rec.elec_tax_bill_use = Util.checkString(rset0.getString("elec_tax_bill_use"));
			rec.eis_user_level = Util.checkString(rset0.getString("eis_user_level"));
			rec.team_bb_use = Util.checkString(rset0.getString("team_bb_use"));
			rec.cust71 = Util.checkString(rset0.getString("cust71"));
			rec.cust76 = Util.checkString(rset0.getString("cust76"));
			rec.cust77 = Util.checkString(rset0.getString("cust77"));
			rec.cust78 = Util.checkString(rset0.getString("cust78"));
			rec.cust79 = Util.checkString(rset0.getString("cust79"));
			rec.cust80 = Util.checkString(rset0.getString("cust80"));
			rec.cust81 = Util.checkString(rset0.getString("cust81"));
			rec.cust82 = Util.checkString(rset0.getString("cust82"));
			rec.cust83 = Util.checkString(rset0.getString("cust83"));
			rec.cust84 = Util.checkString(rset0.getString("cust84"));
			rec.cust85 = Util.checkString(rset0.getString("cust85"));
			rec.olap_yn = Util.checkString(rset0.getString("olap_yn"));
			rec.pwd_chg_dt = Util.checkString(rset0.getString("pwd_chg_dt"));
			rec.chief_yn = Util.checkString(rset0.getString("chief_yn"));
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_MNG_1050_LDataSet ds = (CO_MNG_1050_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		CO_MNG_1050_LCURCOMMLISTRecord curcommlistRec = (CO_MNG_1050_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.acct_cd%>
<%= curcommlistRec.part_cd%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.empno%>
<%= curcommlistRec.nm%>
<%= curcommlistRec.acct_passwd%>
<%= curcommlistRec.emp_clsf_cd%>
<%= curcommlistRec.emp_clsf_nm%>
<%= curcommlistRec.inpre_no%>
<%= curcommlistRec.ptph%>
<%= curcommlistRec.email_id%>
<%= curcommlistRec.blng_cmpy_cd%>
<%= curcommlistRec.blng_cmpy_nm%>
<%= curcommlistRec.duty_cmpy_cd%>
<%= curcommlistRec.duty_cmpy_nm%>
<%= curcommlistRec.offi_real_hdqtboks_cd%>
<%= curcommlistRec.offi_real_hdqtboks_nm%>
<%= curcommlistRec.boks_team_cd%>
<%= curcommlistRec.boks_team_nm%>
<%= curcommlistRec.part_nm%>
<%= curcommlistRec.class_cd%>
<%= curcommlistRec.class_nm%>
<%= curcommlistRec.posi_cd%>
<%= curcommlistRec.posi_nm%>
<%= curcommlistRec.dty_cd%>
<%= curcommlistRec.dty_nm%>
<%= curcommlistRec.job_clsf_use_vdty_dd%>
<%= curcommlistRec.job_clsf_cd%>
<%= curcommlistRec.job_clsf_nm%>
<%= curcommlistRec.crm_usepers_type%>
<%= curcommlistRec.lvcmpy_dt%>
<%= curcommlistRec.crm_deal_bank_cd%>
<%= curcommlistRec.crm_deal_bank_nm%>
<%= curcommlistRec.crm_acct_no%>
<%= curcommlistRec.crm_mang_area_cd%>
<%= curcommlistRec.crm_mang_area_nm%>
<%= curcommlistRec.crm_sell_dept_cd%>
<%= curcommlistRec.crm_sell_dept_nm%>
<%= curcommlistRec.crm_bof_cd%>
<%= curcommlistRec.crm_sell_part_nm%>
<%= curcommlistRec.crm_bof_nm%>
<%= curcommlistRec.crm_area_cd%>
<%= curcommlistRec.crm_area_nm%>
<%= curcommlistRec.crm_hd_dept_cd%>
<%= curcommlistRec.crm_hd_dept_nm%>
<%= curcommlistRec.crm_bof_clsf%>
<%= curcommlistRec.crm_bof_clsf_nm%>
<%= curcommlistRec.crm_bill_grp_id%>
<%= curcommlistRec.crm_bill_grp_type%>
<%= curcommlistRec.crm_bill_blng_cd%>
<%= curcommlistRec.crm_sell_part_cd%>
<%= curcommlistRec.crm_mang_dept_cd%>
<%= curcommlistRec.crm_mang_dept_nm%>
<%= curcommlistRec.crm_cust_src_cd%>
<%= curcommlistRec.crm_cust_src_nm%>
<%= curcommlistRec.crm_publ_bo_cd%>
<%= curcommlistRec.crm_publ_bo_nm%>
<%= curcommlistRec.crm_job_clsf_cd%>
<%= curcommlistRec.crm_job_clsf_nm%>
<%= curcommlistRec.usb_key%>
<%= curcommlistRec.pre_dept_cd%>
<%= curcommlistRec.dept_chg_dt%>
<%= curcommlistRec.rep_posi_type_cd%>
<%= curcommlistRec.usb_key_reg_dt%>
<%= curcommlistRec.vpn_user_yn%>
<%= curcommlistRec.xcoop_use%>
<%= curcommlistRec.elec_tax_bill_use%>
<%= curcommlistRec.eis_user_level%>
<%= curcommlistRec.team_bb_use%>
<%= curcommlistRec.cust71%>
<%= curcommlistRec.cust76%>
<%= curcommlistRec.cust77%>
<%= curcommlistRec.cust78%>
<%= curcommlistRec.cust79%>
<%= curcommlistRec.cust80%>
<%= curcommlistRec.cust81%>
<%= curcommlistRec.cust82%>
<%= curcommlistRec.cust83%>
<%= curcommlistRec.cust84%>
<%= curcommlistRec.cust85%>
<%= curcommlistRec.olap_yn%>
<%= curcommlistRec.pwd_chg_dt%>
<%= curcommlistRec.chief_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 31 12:32:10 KST 2014 */