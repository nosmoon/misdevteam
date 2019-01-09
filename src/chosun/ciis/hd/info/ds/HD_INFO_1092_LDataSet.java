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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1092_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_1092_LDataSet(){}
	public HD_INFO_1092_LDataSet(String errcode, String errmsg){
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
			HD_INFO_1092_LCURLISTRecord rec = new HD_INFO_1092_LCURLISTRecord();
			rec.prtct_obj_clsf_cd = Util.checkString(rset0.getString("prtct_obj_clsf_cd"));
			rec.prtct_obj_clsf_nm = Util.checkString(rset0.getString("prtct_obj_clsf_nm"));
			rec.prtct_obj_pers_no = Util.checkString(rset0.getString("prtct_obj_pers_no"));
			rec.prtct_grad_cd = Util.checkString(rset0.getString("prtct_grad_cd"));
			rec.prtct_grad_nm = Util.checkString(rset0.getString("prtct_grad_nm"));
			rec.prtct_obj_relatn = Util.checkString(rset0.getString("prtct_obj_relatn"));
			rec.prtct_obj_relatn_rshp_cd = Util.checkString(rset0.getString("prtct_obj_relatn_rshp_cd"));
			rec.prtct_obj_relatn_rshp_nm = Util.checkString(rset0.getString("prtct_obj_relatn_rshp_nm"));
			rec.prtct_appmt_ofbld_cd = Util.checkString(rset0.getString("prtct_appmt_ofbld_cd"));
			rec.prtct_appmt_ofbld_nm = Util.checkString(rset0.getString("prtct_appmt_ofbld_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_INFO_1092_LCURLIST1Record rec = new HD_INFO_1092_LCURLIST1Record();
			rec.gurt_insr_entr_dt = Util.checkString(rset1.getString("gurt_insr_entr_dt"));
			rec.gurt_insr_mtry_dt = Util.checkString(rset1.getString("gurt_insr_mtry_dt"));
			rec.gurt_insr_amt = Util.checkString(rset1.getString("gurt_insr_amt"));
			rec.gurt_insr_no = Util.checkString(rset1.getString("gurt_insr_no"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_1092_LDataSet ds = (HD_INFO_1092_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_1092_LCURLISTRecord curlistRec = (HD_INFO_1092_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INFO_1092_LCURLIST1Record curlist1Rec = (HD_INFO_1092_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlistRec.prtct_obj_clsf_cd%>
<%= curlistRec.prtct_obj_clsf_nm%>
<%= curlistRec.prtct_obj_pers_no%>
<%= curlistRec.prtct_grad_cd%>
<%= curlistRec.prtct_grad_nm%>
<%= curlistRec.prtct_obj_relatn%>
<%= curlistRec.prtct_obj_relatn_rshp_cd%>
<%= curlistRec.prtct_obj_relatn_rshp_nm%>
<%= curlistRec.prtct_appmt_ofbld_cd%>
<%= curlistRec.prtct_appmt_ofbld_nm%>
<%= curlist1Rec.gurt_insr_entr_dt%>
<%= curlist1Rec.gurt_insr_mtry_dt%>
<%= curlist1Rec.gurt_insr_amt%>
<%= curlist1Rec.gurt_insr_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 15:35:18 KST 2009 */