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


public class HD_LVCMPY_2500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_2500_LDataSet(){}
	public HD_LVCMPY_2500_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_2500_LCURLISTRecord rec = new HD_LVCMPY_2500_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.lon_clsf_cd = Util.checkString(rset0.getString("lon_clsf_cd"));
			rec.lon_clsf_nm = Util.checkString(rset0.getString("lon_clsf_nm"));
			rec.lon_dt = Util.checkString(rset0.getString("lon_dt"));
			rec.repay_months = Util.checkString(rset0.getString("repay_months"));
			rec.lon_prcp = Util.checkString(rset0.getString("lon_prcp"));
			rec.yy_int_rate = Util.checkString(rset0.getString("yy_int_rate"));
			rec.pymt_acml_tms = Util.checkString(rset0.getString("pymt_acml_tms"));
			rec.rmn_amt = Util.checkString(rset0.getString("rmn_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_LVCMPY_2500_LCURLIST1Record rec = new HD_LVCMPY_2500_LCURLIST1Record();
			rec.incmp_welf_livg_lon_bal = Util.checkString(rset1.getString("incmp_welf_livg_lon_bal"));
			rec.incmp_welf_livg_lon_int = Util.checkString(rset1.getString("incmp_welf_livg_lon_int"));
			rec.jrnst_safe_livg_patr_boks_bal = Util.checkString(rset1.getString("jrnst_safe_livg_patr_boks_bal"));
			rec.jrnst_safe_livg_patr_boks_int = Util.checkString(rset1.getString("jrnst_safe_livg_patr_boks_int"));
			rec.lvcmpy_amt_etc_dduc_nm = Util.checkString(rset1.getString("lvcmpy_amt_etc_dduc_nm"));
			rec.lvcmpy_amt_etc_dduc = Util.checkString(rset1.getString("lvcmpy_amt_etc_dduc"));
			rec.adv_bal = Util.checkString(rset1.getString("adv_bal"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_2500_LDataSet ds = (HD_LVCMPY_2500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_2500_LCURLISTRecord curlistRec = (HD_LVCMPY_2500_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_LVCMPY_2500_LCURLIST1Record curlist1Rec = (HD_LVCMPY_2500_LCURLIST1Record)ds.curlist1.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.lon_clsf_cd%>
<%= curlistRec.lon_clsf_nm%>
<%= curlistRec.lon_dt%>
<%= curlistRec.repay_months%>
<%= curlistRec.lon_prcp%>
<%= curlistRec.yy_int_rate%>
<%= curlistRec.pymt_acml_tms%>
<%= curlistRec.rmn_amt%>
<%= curlist1Rec.incmp_welf_livg_lon_bal%>
<%= curlist1Rec.incmp_welf_livg_lon_int%>
<%= curlist1Rec.jrnst_safe_livg_patr_boks_bal%>
<%= curlist1Rec.jrnst_safe_livg_patr_boks_int%>
<%= curlist1Rec.lvcmpy_amt_etc_dduc_nm%>
<%= curlist1Rec.lvcmpy_amt_etc_dduc%>
<%= curlist1Rec.adv_bal%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 08 15:45:40 KST 2009 */