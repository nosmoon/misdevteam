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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1104_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1104_LDataSet(){}
	public AS_ASET_1104_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AS_ASET_1104_LCURLISTRecord rec = new AS_ASET_1104_LCURLISTRecord();
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.befo_dept_nm = Util.checkString(rset0.getString("befo_dept_nm"));
			rec.befo_loca = Util.checkString(rset0.getString("befo_loca"));
			rec.now_dept_nm = Util.checkString(rset0.getString("now_dept_nm"));
			rec.now_loca = Util.checkString(rset0.getString("now_loca"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.hsty_cnt = Util.checkString(rset0.getString("hsty_cnt"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.chg_clsf = Util.checkString(rset0.getString("chg_clsf"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset0.getString("occr_seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1104_LDataSet ds = (AS_ASET_1104_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1104_LCURLISTRecord curlistRec = (AS_ASET_1104_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.befo_dept_nm%>
<%= curlistRec.befo_loca%>
<%= curlistRec.now_dept_nm%>
<%= curlistRec.now_loca%>
<%= curlistRec.remk%>
<%= curlistRec.hsty_cnt%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.chg_clsf%>
<%= curlistRec.occr_dt%>
<%= curlistRec.occr_seq%>
<%= curlistRec.sub_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 14:55:52 KST 2009 */