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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_6000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_6000_LDataSet(){}
	public MT_ETCCAR_6000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_ETCCAR_6000_LCURLISTRecord rec = new MT_ETCCAR_6000_LCURLISTRecord();
			rec.aply_dt = Util.checkString(rset0.getString("aply_dt"));
			rec.oil_clsf_1 = rset0.getDouble("oil_clsf_1");
			rec.oil_clsf_2 = rset0.getDouble("oil_clsf_2");
			rec.oil_clsf_3 = rset0.getDouble("oil_clsf_3");
			rec.oil_clsf_4 = rset0.getDouble("oil_clsf_4");
			rec.oil_clsf_5 = rset0.getDouble("oil_clsf_5");
			rec.oil_clsf_6 = rset0.getDouble("oil_clsf_6");
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_6000_LDataSet ds = (MT_ETCCAR_6000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_ETCCAR_6000_LCURLISTRecord curlistRec = (MT_ETCCAR_6000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aply_dt%>
<%= curlistRec.oil_clsf_1%>
<%= curlistRec.oil_clsf_2%>
<%= curlistRec.oil_clsf_3%>
<%= curlistRec.oil_clsf_4%>
<%= curlistRec.oil_clsf_5%>
<%= curlistRec.oil_clsf_6%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 14:44:34 KST 2009 */