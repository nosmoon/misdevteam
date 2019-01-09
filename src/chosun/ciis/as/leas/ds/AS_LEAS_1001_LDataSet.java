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


package chosun.ciis.as.leas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_LEAS_1001_LDataSet(){}
	public AS_LEAS_1001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			AS_LEAS_1001_LCURLISTRecord rec = new AS_LEAS_1001_LCURLISTRecord();
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.leas_obj_good_yn = Util.checkString(rset0.getString("leas_obj_good_yn"));
			rec.leas_bldg_cd = Util.checkString(rset0.getString("leas_bldg_cd"));
			rec.leas_ern_no = Util.checkString(rset0.getString("leas_ern_no"));
			rec.leas_dlco_ern_nm = Util.checkString(rset0.getString("leas_dlco_ern_nm"));
			rec.leas_ref_aset_no = Util.checkString(rset0.getString("leas_ref_aset_no"));
			rec.leas_ref_aset_nm = Util.checkString(rset0.getString("leas_ref_aset_nm"));
			rec.acqr_dt = Util.checkString(rset0.getString("acqr_dt"));
			rec.sale_dt = Util.checkString(rset0.getString("sale_dt"));
			rec.aset_qunt_cnt = Util.checkString(rset0.getString("aset_qunt_cnt"));
			rec.aset_usag = Util.checkString(rset0.getString("aset_usag"));
			rec.aset_loca = Util.checkString(rset0.getString("aset_loca"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.incmg_pers_nm = Util.checkString(rset0.getString("incmg_pers_nm"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_LEAS_1001_LDataSet ds = (AS_LEAS_1001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_LEAS_1001_LCURLISTRecord curlistRec = (AS_LEAS_1001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.leas_obj_good_yn%>
<%= curlistRec.leas_bldg_cd%>
<%= curlistRec.leas_ern_no%>
<%= curlistRec.leas_dlco_ern_nm%>
<%= curlistRec.leas_ref_aset_no%>
<%= curlistRec.leas_ref_aset_nm%>
<%= curlistRec.acqr_dt%>
<%= curlistRec.sale_dt%>
<%= curlistRec.aset_qunt_cnt%>
<%= curlistRec.aset_usag%>
<%= curlistRec.aset_loca%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.incmg_pers_nm%>
<%= curlistRec.cmpy_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 10:54:37 KST 2009 */