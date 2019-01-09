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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_2200_LDataSet(){}
	public HD_LVCMPY_2200_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_LVCMPY_2200_LCURLISTRecord rec = new HD_LVCMPY_2200_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.cmpy_nm = Util.checkString(rset0.getString("cmpy_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.impt_saly = Util.checkString(rset0.getString("impt_saly"));
			rec.impt_bns = Util.checkString(rset0.getString("impt_bns"));
			rec.aprv_bns_tot_amt = Util.checkString(rset0.getString("aprv_bns_tot_amt"));
			rec.non_tax_work = Util.checkString(rset0.getString("non_tax_work"));
			rec.non_tax_prod = Util.checkString(rset0.getString("non_tax_prod"));
			rec.non_tax_frnc = Util.checkString(rset0.getString("non_tax_frnc"));
			rec.non_tax_etc = Util.checkString(rset0.getString("non_tax_etc"));
			rec.hosp_insr_fee = Util.checkString(rset0.getString("hosp_insr_fee"));
			rec.np_pymt_amt = Util.checkString(rset0.getString("np_pymt_amt"));
			rec.emp_insr_fee = Util.checkString(rset0.getString("emp_insr_fee"));
			rec.deci_incm_tax = Util.checkString(rset0.getString("deci_incm_tax"));
			rec.deci_res_tax = Util.checkString(rset0.getString("deci_res_tax"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_2200_LDataSet ds = (HD_LVCMPY_2200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_2200_LCURLISTRecord curlistRec = (HD_LVCMPY_2200_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.cmpy_nm%>
<%= curlistRec.ern%>
<%= curlistRec.impt_saly%>
<%= curlistRec.impt_bns%>
<%= curlistRec.aprv_bns_tot_amt%>
<%= curlistRec.non_tax_work%>
<%= curlistRec.non_tax_prod%>
<%= curlistRec.non_tax_frnc%>
<%= curlistRec.non_tax_etc%>
<%= curlistRec.hosp_insr_fee%>
<%= curlistRec.np_pymt_amt%>
<%= curlistRec.emp_insr_fee%>
<%= curlistRec.deci_incm_tax%>
<%= curlistRec.deci_res_tax%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 09:58:37 KST 2009 */