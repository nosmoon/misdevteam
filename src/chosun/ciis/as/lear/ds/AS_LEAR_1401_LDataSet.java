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


package chosun.ciis.as.lear.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.rec.*;

/**
 * 
 */


public class AS_LEAR_1401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAR_1401_LDataSet(){}
	public AS_LEAR_1401_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AS_LEAR_1401_LCURLISTRecord rec = new AS_LEAR_1401_LCURLISTRecord();
			rec.bldg_nm = Util.checkString(rset0.getString("bldg_nm"));
			rec.cntr_no = Util.checkString(rset0.getString("cntr_no"));
			rec.hire_dlco_nm = Util.checkString(rset0.getString("hire_dlco_nm"));
			rec.clam_amt = Util.checkString(rset0.getString("clam_amt"));
			rec.vat_clam_amt = Util.checkString(rset0.getString("vat_clam_amt"));
			rec.clam_tot_amt = Util.checkString(rset0.getString("clam_tot_amt"));
			rec.leas_fr_dt = Util.checkString(rset0.getString("leas_fr_dt"));
			rec.leas_to_dt = Util.checkString(rset0.getString("leas_to_dt"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.bldg_cd = Util.checkString(rset0.getString("bldg_cd"));
			rec.cntr_yy = Util.checkString(rset0.getString("cntr_yy"));
			rec.cntr_seq = Util.checkString(rset0.getString("cntr_seq"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.hire_dlco_ern = Util.checkString(rset0.getString("hire_dlco_ern"));
			rec.midw_expy_dt = Util.checkString(rset0.getString("midw_expy_dt"));
			rec.pymt_clsf = Util.checkString(rset0.getString("pymt_clsf"));
			rec.leas_clam_amt = Util.checkString(rset0.getString("leas_clam_amt"));
			rec.leas_clam_cycl = Util.checkString(rset0.getString("leas_clam_cycl"));
			rec.mang_clam_cycl = Util.checkString(rset0.getString("mang_clam_cycl"));
			rec.leas_cntr_dt = Util.checkString(rset0.getString("leas_cntr_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAR_1401_LDataSet ds = (AS_LEAR_1401_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_LEAR_1401_LCURLISTRecord curlistRec = (AS_LEAR_1401_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.bldg_nm%>
<%= curlistRec.cntr_no%>
<%= curlistRec.hire_dlco_nm%>
<%= curlistRec.clam_amt%>
<%= curlistRec.vat_clam_amt%>
<%= curlistRec.clam_tot_amt%>
<%= curlistRec.leas_fr_dt%>
<%= curlistRec.leas_to_dt%>
<%= curlistRec.cmpy_cd%>
<%= curlistRec.bldg_cd%>
<%= curlistRec.cntr_yy%>
<%= curlistRec.cntr_seq%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.hire_dlco_ern%>
<%= curlistRec.midw_expy_dt%>
<%= curlistRec.pymt_clsf%>
<%= curlistRec.leas_clam_amt%>
<%= curlistRec.leas_clam_cycl%>
<%= curlistRec.mang_clam_cycl%>
<%= curlistRec.leas_cntr_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 09:47:29 KST 2009 */