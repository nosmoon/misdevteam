/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.hlywrk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1301_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_HLYWRK_1301_LDataSet(){}
	public HD_HLYWRK_1301_LDataSet(String errcode, String errmsg){
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
			HD_HLYWRK_1301_LCURLISTRecord rec = new HD_HLYWRK_1301_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.duty_dt = Util.checkString(rset0.getString("duty_dt"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.obj_clsf = Util.checkString(rset0.getString("obj_clsf"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.hody_clsf_nm = Util.checkString(rset0.getString("hody_clsf_nm"));
			rec.prsnt_tm = Util.checkString(rset0.getString("prsnt_tm"));
			rec.finish_dd_clsf = Util.checkString(rset0.getString("finish_dd_clsf"));
			rec.finish_dd_clsf_nm = Util.checkString(rset0.getString("finish_dd_clsf_nm"));
			rec.finish_tm = Util.checkString(rset0.getString("finish_tm"));
			rec.tot_duty_tm = Util.checkString(rset0.getString("tot_duty_tm"));
			rec.alvc_use_dt = Util.checkString(rset0.getString("alvc_use_dt"));
			rec.alvc_use_yn = Util.checkString(rset0.getString("alvc_use_yn"));
			rec.alvc_plan_dt = Util.checkString(rset0.getString("alvc_plan_dt"));
			rec.proc_stat = Util.checkString(rset0.getString("proc_stat"));
			rec.paidhody_ck = Util.checkString(rset0.getString("paidhody_ck"));
			rec.alvc_use_yn_nm = Util.checkString(rset0.getString("alvc_use_yn_nm"));
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.base_alon = Util.checkString(rset0.getString("base_alon"));
			rec.cmpn_alon = Util.checkString(rset0.getString("cmpn_alon"));
			rec.alon_pay_mm = Util.checkString(rset0.getString("alon_pay_mm"));
			rec.dspch_enpr_main_clsf = Util.checkString(rset0.getString("dspch_enpr_main_clsf"));
			rec.hody_duty_cnt = Util.checkString(rset0.getString("hody_duty_cnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_HLYWRK_1301_LDataSet ds = (HD_HLYWRK_1301_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_HLYWRK_1301_LCURLISTRecord curlistRec = (HD_HLYWRK_1301_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.duty_dt%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.obj_clsf%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.hody_clsf_nm%>
<%= curlistRec.prsnt_tm%>
<%= curlistRec.finish_dd_clsf%>
<%= curlistRec.finish_dd_clsf_nm%>
<%= curlistRec.finish_tm%>
<%= curlistRec.tot_duty_tm%>
<%= curlistRec.alvc_use_dt%>
<%= curlistRec.alvc_use_yn%>
<%= curlistRec.alvc_plan_dt%>
<%= curlistRec.proc_stat%>
<%= curlistRec.paidhody_ck%>
<%= curlistRec.alvc_use_yn_nm%>
<%= curlistRec.proc_stat_nm%>
<%= curlistRec.base_alon%>
<%= curlistRec.cmpn_alon%>
<%= curlistRec.alon_pay_mm%>
<%= curlistRec.dspch_enpr_main_clsf%>
<%= curlistRec.hody_duty_cnt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Nov 19 17:13:59 KST 2018 */