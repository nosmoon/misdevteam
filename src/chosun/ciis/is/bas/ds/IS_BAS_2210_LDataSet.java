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


public class IS_BAS_2210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BAS_2210_LDataSet(){}
	public IS_BAS_2210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			IS_BAS_2210_LCURLISTRecord rec = new IS_BAS_2210_LCURLISTRecord();
			rec.dlco_cd_seq = Util.checkString(rset0.getString("dlco_cd_seq"));
			rec.asnt_dstc_cd = Util.checkString(rset0.getString("asnt_dstc_cd"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.bo_head_nm = Util.checkString(rset0.getString("bo_head_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.leaf_now_chrg_pers = Util.checkString(rset0.getString("leaf_now_chrg_pers"));
			rec.leaf_now_chrg_pers_nm = Util.checkString(rset0.getString("leaf_now_chrg_pers_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.send_qty = Util.checkString(rset0.getString("send_qty"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BAS_2210_LDataSet ds = (IS_BAS_2210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BAS_2210_LCURLISTRecord curlistRec = (IS_BAS_2210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_cd_seq%>
<%= curlistRec.asnt_dstc_cd%>
<%= curlistRec.asnt_dstc_cd_nm%>
<%= curlistRec.bo_nm%>
<%= curlistRec.bo_head_nm%>
<%= curlistRec.ern%>
<%= curlistRec.leaf_now_chrg_pers%>
<%= curlistRec.leaf_now_chrg_pers_nm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.send_qty%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 27 16:23:10 KST 2012 */