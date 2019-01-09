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


public class HD_INFO_5251_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_5251_LDataSet(){}
	public HD_INFO_5251_LDataSet(String errcode, String errmsg){
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
			HD_INFO_5251_LCURLISTRecord rec = new HD_INFO_5251_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.carr_seq = Util.checkString(rset0.getString("carr_seq"));
			rec.in_cmpy_dt = Util.checkString(rset0.getString("in_cmpy_dt"));
			rec.lvcmpy_dt = Util.checkString(rset0.getString("lvcmpy_dt"));
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.dty = Util.checkString(rset0.getString("dty"));
			rec.posk = Util.checkString(rset0.getString("posk"));
			rec.asaly = Util.checkString(rset0.getString("asaly"));
			rec.lvcmpy_resn = Util.checkString(rset0.getString("lvcmpy_resn"));
			rec.natn_cd = Util.checkString(rset0.getString("natn_cd"));
			rec.duty_yys = Util.checkString(rset0.getString("duty_yys"));
			rec.duty_dds = Util.checkString(rset0.getString("duty_dds"));
			rec.carr_aprv_yys = Util.checkString(rset0.getString("carr_aprv_yys"));
			rec.carr_aprv_dds = Util.checkString(rset0.getString("carr_aprv_dds"));
			rec.natn_nm = Util.checkString(rset0.getString("natn_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_5251_LDataSet ds = (HD_INFO_5251_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_5251_LCURLISTRecord curlistRec = (HD_INFO_5251_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.carr_seq%>
<%= curlistRec.in_cmpy_dt%>
<%= curlistRec.lvcmpy_dt%>
<%= curlistRec.offi_nm%>
<%= curlistRec.dty%>
<%= curlistRec.posk%>
<%= curlistRec.asaly%>
<%= curlistRec.lvcmpy_resn%>
<%= curlistRec.natn_cd%>
<%= curlistRec.duty_yys%>
<%= curlistRec.duty_dds%>
<%= curlistRec.carr_aprv_yys%>
<%= curlistRec.carr_aprv_dds%>
<%= curlistRec.natn_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 12:16:24 KST 2009 */