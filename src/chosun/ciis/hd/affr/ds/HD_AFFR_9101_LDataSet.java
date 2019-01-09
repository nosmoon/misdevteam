/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_9101_LDataSet(){}
	public HD_AFFR_9101_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_9101_LCURLISTRecord rec = new HD_AFFR_9101_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.otn_mgng_cd = Util.checkString(rset0.getString("otn_mgng_cd"));
			rec.outside_clsf_cd = Util.checkString(rset0.getString("outside_clsf_cd"));
			rec.outside_clsf_nm = Util.checkString(rset0.getString("outside_clsf_nm"));
			rec.outside_flnm = Util.checkString(rset0.getString("outside_flnm"));
			rec.outside_tel_no = Util.checkString(rset0.getString("outside_tel_no"));
			rec.zipcode = Util.checkString(rset0.getString("zipcode"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.use_yn_nm = Util.checkString(rset0.getString("use_yn_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_9101_LDataSet ds = (HD_AFFR_9101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_9101_LCURLISTRecord curlistRec = (HD_AFFR_9101_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.otn_mgng_cd%>
<%= curlistRec.outside_clsf_cd%>
<%= curlistRec.outside_clsf_nm%>
<%= curlistRec.outside_flnm%>
<%= curlistRec.outside_tel_no%>
<%= curlistRec.zipcode%>
<%= curlistRec.addr%>
<%= curlistRec.use_yn%>
<%= curlistRec.use_yn_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 11 19:29:45 KST 2016 */