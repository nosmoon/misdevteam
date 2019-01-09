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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BAS_1610_LDataSet(){}
	public IS_BAS_1610_LDataSet(String errcode, String errmsg){
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
			IS_BAS_1610_LCURLISTRecord rec = new IS_BAS_1610_LCURLISTRecord();
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.area_cd = Util.checkString(rset0.getString("area_cd"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.bo_addr = Util.checkString(rset0.getString("bo_addr"));
			rec.cntr_stat_clsf = Util.checkString(rset0.getString("cntr_stat_clsf"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.a_bo_seq = Util.checkString(rset0.getString("a_bo_seq"));
			rec.a_area_cd = Util.checkString(rset0.getString("a_area_cd"));
			rec.a_bo_nm = Util.checkString(rset0.getString("a_bo_nm"));
			rec.a_bo_head_nm = Util.checkString(rset0.getString("a_bo_head_nm"));
			rec.a_bo_addr = Util.checkString(rset0.getString("a_bo_addr"));
			rec.a_cntr_stat_clsf = Util.checkString(rset0.getString("a_cntr_stat_clsf"));
			rec.a_dlco_no = Util.checkString(rset0.getString("a_dlco_no"));
			rec.a_ern = Util.checkString(rset0.getString("a_ern"));
			rec.a_chg_dt_tm = Util.checkString(rset0.getString("a_chg_dt_tm"));
			rec.s_bo_seq = Util.checkString(rset0.getString("s_bo_seq"));
			rec.s_area_cd = Util.checkString(rset0.getString("s_area_cd"));
			rec.s_bo_nm = Util.checkString(rset0.getString("s_bo_nm"));
			rec.s_bo_head_nm = Util.checkString(rset0.getString("s_bo_head_nm"));
			rec.s_bo_addr = Util.checkString(rset0.getString("s_bo_addr"));
			rec.s_cntr_stat_clsf = Util.checkString(rset0.getString("s_cntr_stat_clsf"));
			rec.s_dlco_no = Util.checkString(rset0.getString("s_dlco_no"));
			rec.s_ern = Util.checkString(rset0.getString("s_ern"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BAS_1610_LDataSet ds = (IS_BAS_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BAS_1610_LCURLISTRecord curlistRec = (IS_BAS_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_seq%>
<%= curlistRec.area_cd%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.bo_addr%>
<%= curlistRec.cntr_stat_clsf%>
<%= curlistRec.dlco_no%>
<%= curlistRec.ern%>
<%= curlistRec.a_bo_seq%>
<%= curlistRec.a_area_cd%>
<%= curlistRec.a_bo_nm%>
<%= curlistRec.a_bo_head_nm%>
<%= curlistRec.a_bo_addr%>
<%= curlistRec.a_cntr_stat_clsf%>
<%= curlistRec.a_dlco_no%>
<%= curlistRec.a_ern%>
<%= curlistRec.a_chg_dt_tm%>
<%= curlistRec.s_bo_seq%>
<%= curlistRec.s_area_cd%>
<%= curlistRec.s_bo_nm%>
<%= curlistRec.s_bo_head_nm%>
<%= curlistRec.s_bo_addr%>
<%= curlistRec.s_cntr_stat_clsf%>
<%= curlistRec.s_dlco_no%>
<%= curlistRec.s_ern%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 26 18:10:46 KST 2012 */