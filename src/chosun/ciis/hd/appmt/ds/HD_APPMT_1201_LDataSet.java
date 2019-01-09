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


package chosun.ciis.hd.appmt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_APPMT_1201_LDataSet(){}
	public HD_APPMT_1201_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			HD_APPMT_1201_LCURLISTRecord rec = new HD_APPMT_1201_LCURLISTRecord();
			rec.row_num = Util.checkString(rset0.getString("row_num"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.appmt_cd = Util.checkString(rset0.getString("appmt_cd"));
			rec.appmt_nm = Util.checkString(rset0.getString("appmt_nm"));
			rec.appmt_resn_cd = Util.checkString(rset0.getString("appmt_resn_cd"));
			rec.appmt_resn_nm = Util.checkString(rset0.getString("appmt_resn_nm"));
			rec.appmt_dt = Util.checkString(rset0.getString("appmt_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.emp_clsf_cd = Util.checkString(rset0.getString("emp_clsf_cd"));
			rec.emp_clsf_nm = Util.checkString(rset0.getString("emp_clsf_nm"));
			rec.appmt_sort = Util.checkString(rset0.getString("appmt_sort"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.posk_saly = Util.checkString(rset0.getString("posk_saly"));
			rec.saly_stot = Util.checkString(rset0.getString("saly_stot"));
			rec.lvcmpy_acml_amt = Util.checkString(rset0.getString("lvcmpy_acml_amt"));
			rec.bns_incd_servcost = Util.checkString(rset0.getString("bns_incd_servcost"));
			rec.appmt_cont = Util.checkString(rset0.getString("appmt_cont"));
			rec.clos_proc_yn = Util.checkString(rset0.getString("clos_proc_yn"));
			rec.clos_proc_yn_nm = Util.checkString(rset0.getString("clos_proc_yn_nm"));
			rec.dspch_enpr_main_clsf = Util.checkString(rset0.getString("dspch_enpr_main_clsf"));
			rec.dspch_enpr_main_nm = Util.checkString(rset0.getString("dspch_enpr_main_nm"));
			rec.posk_clas_cd = Util.checkString(rset0.getString("posk_clas_cd"));
			rec.posk_clas_nm = Util.checkString(rset0.getString("posk_clas_nm"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.appmt_indc_yn = Util.checkString(rset0.getString("appmt_indc_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_APPMT_1201_LDataSet ds = (HD_APPMT_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_APPMT_1201_LCURLISTRecord curlistRec = (HD_APPMT_1201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.row_num%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.appmt_cd%>
<%= curlistRec.appmt_nm%>
<%= curlistRec.appmt_resn_cd%>
<%= curlistRec.appmt_resn_nm%>
<%= curlistRec.appmt_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.emp_clsf_cd%>
<%= curlistRec.emp_clsf_nm%>
<%= curlistRec.appmt_sort%>
<%= curlistRec.base_saly%>
<%= curlistRec.posk_saly%>
<%= curlistRec.saly_stot%>
<%= curlistRec.lvcmpy_acml_amt%>
<%= curlistRec.bns_incd_servcost%>
<%= curlistRec.appmt_cont%>
<%= curlistRec.clos_proc_yn%>
<%= curlistRec.clos_proc_yn_nm%>
<%= curlistRec.dspch_enpr_main_clsf%>
<%= curlistRec.dspch_enpr_main_nm%>
<%= curlistRec.posk_clas_cd%>
<%= curlistRec.posk_clas_nm%>
<%= curlistRec.seq%>
<%= curlistRec.occr_dt%>
<%= curlistRec.appmt_indc_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 03 15:32:23 KST 2018 */