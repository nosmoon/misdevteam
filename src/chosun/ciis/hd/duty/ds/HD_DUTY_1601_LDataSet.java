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


package chosun.ciis.hd.duty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1601_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_DUTY_1601_LDataSet(){}
	public HD_DUTY_1601_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_DUTY_1601_LCURLISTRecord rec = new HD_DUTY_1601_LCURLISTRecord();
			rec.clndr_ma = Util.checkString(rset0.getString("clndr_ma"));
			rec.clndr_a = Util.checkString(rset0.getString("clndr_a"));
			rec.clndr_wkdy = Util.checkString(rset0.getString("clndr_wkdy"));
			rec.clndr_b = Util.checkString(rset0.getString("clndr_b"));
			rec.hody_clsf = Util.checkString(rset0.getString("hody_clsf"));
			rec.clndr_c = Util.checkString(rset0.getString("clndr_c"));
			rec.vaca_cd = Util.checkString(rset0.getString("vaca_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_DUTY_1601_LDataSet ds = (HD_DUTY_1601_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_DUTY_1601_LCURLISTRecord curlistRec = (HD_DUTY_1601_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.clndr_ma%>
<%= curlistRec.clndr_a%>
<%= curlistRec.clndr_wkdy%>
<%= curlistRec.clndr_b%>
<%= curlistRec.hody_clsf%>
<%= curlistRec.clndr_c%>
<%= curlistRec.vaca_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 21:03:07 KST 2009 */