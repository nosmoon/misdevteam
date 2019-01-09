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


public class HD_INFO_1052_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_1052_SDataSet(){}
	public HD_INFO_1052_SDataSet(String errcode, String errmsg){
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
			HD_INFO_1052_SCURLISTRecord rec = new HD_INFO_1052_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.addr_clsf = Util.checkString(rset0.getString("addr_clsf"));
			rec.zip_1 = Util.checkString(rset0.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset0.getString("zip_2"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.tel_no_1 = Util.checkString(rset0.getString("tel_no_1"));
			rec.tel_no_2 = Util.checkString(rset0.getString("tel_no_2"));
			rec.tel_no_3 = Util.checkString(rset0.getString("tel_no_3"));
			rec.fax_no = Util.checkString(rset0.getString("fax_no"));
			rec.ptph_no_1 = Util.checkString(rset0.getString("ptph_no_1"));
			rec.ptph_no_2 = Util.checkString(rset0.getString("ptph_no_2"));
			rec.ptph_no_3 = Util.checkString(rset0.getString("ptph_no_3"));
			rec.incmp_tel_no = Util.checkString(rset0.getString("incmp_tel_no"));
			rec.email_addr = Util.checkString(rset0.getString("email_addr"));
			rec.email_cd = Util.checkString(rset0.getString("email_cd"));
			rec.forn_addr = Util.checkString(rset0.getString("forn_addr"));
			rec.forn_tel_no = Util.checkString(rset0.getString("forn_tel_no"));
			rec.forn_ptph_no = Util.checkString(rset0.getString("forn_ptph_no"));
			rec.forn_fax_no = Util.checkString(rset0.getString("forn_fax_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_1052_SDataSet ds = (HD_INFO_1052_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_1052_SCURLISTRecord curlistRec = (HD_INFO_1052_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.addr_clsf%>
<%= curlistRec.zip_1%>
<%= curlistRec.zip_2%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.tel_no_1%>
<%= curlistRec.tel_no_2%>
<%= curlistRec.tel_no_3%>
<%= curlistRec.fax_no%>
<%= curlistRec.ptph_no_1%>
<%= curlistRec.ptph_no_2%>
<%= curlistRec.ptph_no_3%>
<%= curlistRec.incmp_tel_no%>
<%= curlistRec.email_addr%>
<%= curlistRec.forn_addr%>
<%= curlistRec.forn_tel_no%>
<%= curlistRec.forn_ptph_no%>
<%= curlistRec.forn_fax_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 05 15:32:14 KST 2009 */