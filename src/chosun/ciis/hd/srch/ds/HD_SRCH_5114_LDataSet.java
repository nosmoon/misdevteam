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


package chosun.ciis.hd.srch.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_5114_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String text_tag;

	public HD_SRCH_5114_LDataSet(){}
	public HD_SRCH_5114_LDataSet(String errcode, String errmsg, String text_tag){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.text_tag = text_tag;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setText_tag(String text_tag){
		this.text_tag = text_tag;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getText_tag(){
		return this.text_tag;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_SRCH_5114_LCURLISTRecord rec = new HD_SRCH_5114_LCURLISTRecord();
			rec.clas_clsf = Util.checkString(rset0.getString("clas_clsf"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.prv_nops = Util.checkString(rset0.getString("prv_nops"));
			rec.this_nops = Util.checkString(rset0.getString("this_nops"));
			rec.cmpr_nops = Util.checkString(rset0.getString("cmpr_nops"));
			this.curlist.add(rec);
		}
		this.text_tag = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SRCH_5114_LDataSet ds = (HD_SRCH_5114_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SRCH_5114_LCURLISTRecord curlistRec = (HD_SRCH_5114_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getText_tag()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.clas_clsf%>
<%= curlistRec.emp_clsf%>
<%= curlistRec.prv_nops%>
<%= curlistRec.this_nops%>
<%= curlistRec.cmpr_nops%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 23 19:24:50 KST 2018 */