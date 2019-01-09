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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_6510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_6510_LDataSet(){}
	public FC_FUNC_6510_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_6510_LCURLISTRecord rec = new FC_FUNC_6510_LCURLISTRecord();
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.deps_isav_clsf_cd_nm = Util.checkString(rset0.getString("deps_isav_clsf_cd_nm"));
			rec.deps_isav_no = Util.checkString(rset0.getString("deps_isav_no"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.tot_pymt_amt = Util.checkString(rset0.getString("tot_pymt_amt"));
			rec.int_rate = Util.checkString(rset0.getString("int_rate"));
			rec.ybjpno = Util.checkString(rset0.getString("ybjpno"));
			rec.deps_isav_clsf_cd = Util.checkString(rset0.getString("deps_isav_clsf_cd"));
			rec.deps_isav_nm = Util.checkString(rset0.getString("deps_isav_nm"));
			rec.dlco_clsf_cd = Util.checkString(rset0.getString("dlco_clsf_cd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.compnm = Util.checkString(rset0.getString("compnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_6010_LDataSet ds = (FC_FUNC_6010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_6010_LCURLISTRecord curlistRec = (FC_FUNC_6010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.banknm%>
<%= curlistRec.deps_isav_clsf_cd_nm%>
<%= curlistRec.deps_isav_no%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.tot_pymt_amt%>
<%= curlistRec.int_rate%>
<%= curlistRec.ybjpno%>
<%= curlistRec.deps_isav_clsf_cd%>
<%= curlistRec.deps_isav_nm%>
<%= curlistRec.dlco_clsf_cd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.compnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 17:48:40 KST 2009 */