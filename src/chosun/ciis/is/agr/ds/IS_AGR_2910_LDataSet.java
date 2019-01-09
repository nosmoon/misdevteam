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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_2910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_2910_LDataSet(){}
	public IS_AGR_2910_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(19);
		while(rset0.next()){
			IS_AGR_2910_LCURLISTRecord rec = new IS_AGR_2910_LCURLISTRecord();
			rec.proc_stat_nm = Util.checkString(rset0.getString("proc_stat_nm"));
			rec.dlvs_dt = Util.checkString(rset0.getString("dlvs_dt"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.sub_dept_cd_nm = Util.checkString(rset0.getString("sub_dept_cd_nm"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.rcpm_clsf = Util.checkString(rset0.getString("rcpm_clsf"));
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.suply_amt = Util.checkString(rset0.getString("suply_amt"));
			rec.card_coms = Util.checkString(rset0.getString("card_coms"));
			rec.out_amt = Util.checkString(rset0.getString("out_amt"));
			rec.im_amt = Util.checkString(rset0.getString("im_amt"));
			rec.im_amt_rate = Util.checkString(rset0.getString("im_amt_rate"));
			rec.prz_rate_clsf_nm = Util.checkString(rset0.getString("prz_rate_clsf_nm"));
			rec.prz_amt = Util.checkString(rset0.getString("prz_amt"));
			rec.prz_phb_saly_boks = Util.checkString(rset0.getString("prz_phb_saly_boks"));
			rec.make_ask_reg_dt = Util.checkString(rset0.getString("make_ask_reg_dt"));
			rec.make_ask_reg_seq = Util.checkString(rset0.getString("make_ask_reg_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_2910_LDataSet ds = (IS_AGR_2910_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_2910_LCURLISTRecord curlistRec = (IS_AGR_2910_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.proc_stat_nm%>
<%= curlistRec.dlvs_dt%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.sub_dept_cd_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advcs_cd_nm%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.rcpm_clsf%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.suply_amt%>
<%= curlistRec.card_coms%>
<%= curlistRec.out_amt%>
<%= curlistRec.im_amt%>
<%= curlistRec.im_amt_rate%>
<%= curlistRec.prz_rate_clsf_nm%>
<%= curlistRec.prz_amt%>
<%= curlistRec.prz_phb_saly_boks%>
<%= curlistRec.make_ask_reg_dt%>
<%= curlistRec.make_ask_reg_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 07 10:25:53 KST 2012 */