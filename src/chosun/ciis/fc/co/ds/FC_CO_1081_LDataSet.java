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


package chosun.ciis.fc.co.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.rec.*;

/**
 * 
 */


public class FC_CO_1081_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_CO_1081_LDataSet(){}
	public FC_CO_1081_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_CO_1081_LCURLISTRecord rec = new FC_CO_1081_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset2.getString("cmpy_cd"));
			rec.deps_isav_clsf_cd = Util.checkString(rset2.getString("deps_isav_clsf_cd"));
			rec.deps_isav_no = Util.checkString(rset2.getString("deps_isav_no"));
			rec.comp_dt = Util.checkString(rset2.getString("comp_dt"));
			rec.mtry_dt = Util.checkString(rset2.getString("mtry_dt"));
			rec.tot_pymt_amt = Util.checkString(rset2.getString("tot_pymt_amt"));
			rec.deps_isav_clsf_cd1 = Util.checkString(rset2.getString("deps_isav_clsf_cd1"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_CO_1081_LDataSet ds = (FC_CO_1081_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_CO_1081_LCURLISTRecord curlistRec = (FC_CO_1081_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.deps_isav_clsf_cd%>
<%= curlistRec.deps_isav_no%>
<%= curlistRec.comp_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.tot_pymt_amt%>
<%= curlistRec.deps_isav_clsf_cd1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 16:23:16 KST 2009 */