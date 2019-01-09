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


public class HD_INFO_1081_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_1081_LDataSet(){}
	public HD_INFO_1081_LDataSet(String errcode, String errmsg){
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
			HD_INFO_1081_LCURLISTRecord rec = new HD_INFO_1081_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.frnc_word_seq = Util.checkString(rset0.getString("frnc_word_seq"));
			rec.frnc_word_cd = Util.checkString(rset0.getString("frnc_word_cd"));
			rec.frnc_word_flnm = Util.checkString(rset0.getString("frnc_word_flnm"));
			rec.frnc_word_nm = Util.checkString(rset0.getString("frnc_word_nm"));
			rec.test_cd = Util.checkString(rset0.getString("test_cd"));
			rec.test_flnm = Util.checkString(rset0.getString("test_flnm"));
			rec.test_nm = Util.checkString(rset0.getString("test_nm"));
			rec.test_grad = Util.checkString(rset0.getString("test_grad"));
			rec.test_scor = Util.checkString(rset0.getString("test_scor"));
			rec.test_dt = Util.checkString(rset0.getString("test_dt"));
			rec.test_enfc_instt = Util.checkString(rset0.getString("test_enfc_instt"));
			rec.spc_matt = Util.checkString(rset0.getString("spc_matt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_1081_LDataSet ds = (HD_INFO_1081_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_1081_LCURLISTRecord curlistRec = (HD_INFO_1081_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.frnc_word_seq%>
<%= curlistRec.frnc_word_cd%>
<%= curlistRec.frnc_word_flnm%>
<%= curlistRec.frnc_word_nm%>
<%= curlistRec.test_cd%>
<%= curlistRec.test_flnm%>
<%= curlistRec.test_nm%>
<%= curlistRec.test_grad%>
<%= curlistRec.test_scor%>
<%= curlistRec.test_dt%>
<%= curlistRec.test_enfc_instt%>
<%= curlistRec.spc_matt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 11:59:34 KST 2009 */