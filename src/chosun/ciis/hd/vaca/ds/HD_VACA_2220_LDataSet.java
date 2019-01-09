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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_2220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_VACA_2220_LDataSet(){}
	public HD_VACA_2220_LDataSet(String errcode, String errmsg){
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
			HD_VACA_2220_LCURLISTRecord rec = new HD_VACA_2220_LCURLISTRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			//System.out.println("rec.dty_nm      : "+rec.dty_nm);
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.year_vaca_dds_sum = Util.checkString(rset0.getString("year_vaca_dds_sum"));
			rec.add_vaca_dds_sum = Util.checkString(rset0.getString("add_vaca_dds_sum"));
			rec.occr_vaca_dds_sum = Util.checkString(rset0.getString("occr_vaca_dds_sum"));
			rec.use_vaca_dds_sum = Util.checkString(rset0.getString("use_vaca_dds_sum"));
			rec.base_saly_sum = Util.checkString(rset0.getString("base_saly_sum"));
			rec.posk_saly_sum = Util.checkString(rset0.getString("posk_saly_sum"));
			rec.mm_ordy_wag_sum = Util.checkString(rset0.getString("mm_ordy_wag_sum"));
			rec.dd_basi_wag_sum = Util.checkString(rset0.getString("dd_basi_wag_sum"));
			rec.vaca_rmn_dds_sum = Util.checkString(rset0.getString("vaca_rmn_dds_sum"));
			rec.yymm_alon_sum = Util.checkString(rset0.getString("yymm_alon_sum"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_2220_LDataSet ds = (HD_VACA_2220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_VACA_2220_LCURLISTRecord curlistRec = (HD_VACA_2220_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cd_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.emp_no%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.year_vaca_dds_sum%>
<%= curlistRec.add_vaca_dds_sum%>
<%= curlistRec.occr_vaca_dds_sum%>
<%= curlistRec.use_vaca_dds_sum%>
<%= curlistRec.base_saly_sum%>
<%= curlistRec.posk_saly_sum%>
<%= curlistRec.mm_ordy_wag_sum%>
<%= curlistRec.dd_basi_wag_sum%>
<%= curlistRec.vaca_rmn_dds_sum%>
<%= curlistRec.yymm_alon_sum%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 21:38:04 KST 2009 */