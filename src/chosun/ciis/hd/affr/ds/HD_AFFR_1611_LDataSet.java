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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1611_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1611_LDataSet(){}
	public HD_AFFR_1611_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_1611_LCURLISTRecord rec = new HD_AFFR_1611_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.scl_exps_pay_yy = Util.checkString(rset0.getString("scl_exps_pay_yy"));
			rec.scl_exps_pay_qq = Util.checkString(rset0.getString("scl_exps_pay_qq"));
			rec.scl_exps_clsf = Util.checkString(rset0.getString("scl_exps_clsf"));
			rec.scl_exps_pay_plac_clsf = Util.checkString(rset0.getString("scl_exps_pay_plac_clsf"));
			rec.obj_pers_flnm = Util.checkString(rset0.getString("obj_pers_flnm"));
			rec.obj_pers_prn = Util.checkString(rset0.getString("obj_pers_prn"));
			rec.scl_nm = Util.checkString(rset0.getString("scl_nm"));
			rec.grade = Util.checkString(rset0.getString("grade"));
			rec.scl_part = Util.checkString(rset0.getString("scl_part"));
			rec.aplc_amt = Util.checkString(rset0.getString("aplc_amt"));
			rec.vdty_amt = Util.checkString(rset0.getString("vdty_amt"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.slip_proc_mang_dt = Util.checkString(rset0.getString("slip_proc_mang_dt"));
			rec.slip_proc_mang_seq = Util.checkString(rset0.getString("slip_proc_mang_seq"));
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.aplc_seq = Util.checkString(rset0.getString("aplc_seq"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.rank = Util.checkString(rset0.getString("rank"));
			rec.scl_exps_clsf_nm = Util.checkString(rset0.getString("scl_exps_clsf_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_1611_LDataSet ds = (HD_AFFR_1611_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_1611_LCURLISTRecord curlistRec = (HD_AFFR_1611_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.scl_exps_pay_yy%>
<%= curlistRec.scl_exps_pay_qq%>
<%= curlistRec.scl_exps_clsf%>
<%= curlistRec.scl_exps_pay_plac_clsf%>
<%= curlistRec.obj_pers_flnm%>
<%= curlistRec.obj_pers_prn%>
<%= curlistRec.scl_nm%>
<%= curlistRec.grade%>
<%= curlistRec.scl_part%>
<%= curlistRec.aplc_amt%>
<%= curlistRec.vdty_amt%>
<%= curlistRec.pay_amt%>
<%= curlistRec.remk%>
<%= curlistRec.slip_proc_mang_dt%>
<%= curlistRec.slip_proc_mang_seq%>
<%= curlistRec.aplc_dt%>
<%= curlistRec.aplc_seq%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.rank%>
<%= curlistRec.scl_exps_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 10 11:55:38 KST 2012 */