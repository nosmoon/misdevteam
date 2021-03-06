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


public class AS_ASET_1009_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1009_LDataSet(){}
	public AS_ASET_1009_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AS_ASET_1009_LCURLISTRecord rec = new AS_ASET_1009_LCURLISTRecord();
			rec.item_cd = Util.checkString(rset0.getString("item_cd"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.unit_cd = Util.checkString(rset0.getString("unit_cd"));
			rec.unit_nm = Util.checkString(rset0.getString("unit_nm"));
			rec.redm_clsf = Util.checkString(rset0.getString("redm_clsf"));
			rec.redm_nm = Util.checkString(rset0.getString("redm_nm"));
			rec.redm_mthd_cd = Util.checkString(rset0.getString("redm_mthd_cd"));
			rec.redm_mthd_nm = Util.checkString(rset0.getString("redm_mthd_nm"));
			rec.svc_yys_cnt = Util.checkString(rset0.getString("svc_yys_cnt"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1009_LDataSet ds = (AS_ASET_1009_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1009_LCURLISTRecord curlistRec = (AS_ASET_1009_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.item_cd%>
<%= curlistRec.item_nm%>
<%= curlistRec.unit_cd%>
<%= curlistRec.unit_nm%>
<%= curlistRec.redm_clsf%>
<%= curlistRec.redm_nm%>
<%= curlistRec.redm_mthd_cd%>
<%= curlistRec.redm_mthd_nm%>
<%= curlistRec.svc_yys_cnt%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 17:55:32 KST 2009 */