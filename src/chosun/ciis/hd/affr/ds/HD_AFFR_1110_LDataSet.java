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


public class HD_AFFR_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1110_LDataSet(){}
	public HD_AFFR_1110_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_1110_LCURLISTRecord rec = new HD_AFFR_1110_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.cmpy_cnt = Util.checkString(rset0.getString("cmpy_cnt"));
			rec.cmpy_use_cnt = Util.checkString(rset0.getString("cmpy_use_cnt"));
			rec.cmpy_able_cnt = Util.checkString(rset0.getString("cmpy_able_cnt"));
			rec.not_use = Util.checkString(rset0.getString("not_use"));
			rec.cmpy_cnt_next = Util.checkString(rset0.getString("cmpy_cnt_next"));
			rec.cmpy_use_cnt_next = Util.checkString(rset0.getString("cmpy_use_cnt_next"));
			rec.cmpy_able_cnt_next = Util.checkString(rset0.getString("cmpy_able_cnt_next"));
			rec.not_use_next = Util.checkString(rset0.getString("not_use_next"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_1110_LDataSet ds = (HD_AFFR_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_1110_LCURLISTRecord curlistRec = (HD_AFFR_1110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.emp_no%>
<%= curlistRec.cmpy_cnt%>
<%= curlistRec.cmpy_use_cnt%>
<%= curlistRec.cmpy_able_cnt%>
<%= curlistRec.not_use%>
<%= curlistRec.cmpy_cnt_next%>
<%= curlistRec.cmpy_use_cnt_next%>
<%= curlistRec.cmpy_able_cnt_next%>
<%= curlistRec.not_use_next%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 23 14:47:14 KST 2009 */