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


public class AS_ASET_1007_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1007_SDataSet(){}
	public AS_ASET_1007_SDataSet(String errcode, String errmsg){
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
			AS_ASET_1007_SCURLISTRecord rec = new AS_ASET_1007_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.make_natn = Util.checkString(rset0.getString("make_natn"));
			rec.make_cmpy = Util.checkString(rset0.getString("make_cmpy"));
			rec.make_yymm = Util.checkString(rset0.getString("make_yymm"));
			rec.make_no = Util.checkString(rset0.getString("make_no"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1007_SDataSet ds = (AS_ASET_1007_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1007_SCURLISTRecord curlistRec = (AS_ASET_1007_SCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.aset_no%>
<%= curlistRec.make_natn%>
<%= curlistRec.make_cmpy%>
<%= curlistRec.make_yymm%>
<%= curlistRec.make_no%>
<%= curlistRec.mang_no%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 17:11:41 KST 2009 */