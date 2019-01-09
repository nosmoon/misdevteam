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


public class AS_ASET_1108_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1108_LDataSet(){}
	public AS_ASET_1108_LDataSet(String errcode, String errmsg){
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
			AS_ASET_1108_LCURLISTRecord rec = new AS_ASET_1108_LCURLISTRecord();
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.acqr_dt = Util.checkString(rset0.getString("acqr_dt"));
			rec.orgin_acqr_amt = Util.checkString(rset0.getString("orgin_acqr_amt"));
			rec.buy_clsf_nm = Util.checkString(rset0.getString("buy_clsf_nm"));
			rec.aset_qunt_cnt = Util.checkString(rset0.getString("aset_qunt_cnt"));
			rec.aset_usag = Util.checkString(rset0.getString("aset_usag"));
			rec.aset_size = Util.checkString(rset0.getString("aset_size"));
			rec.aset_loca = Util.checkString(rset0.getString("aset_loca"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1108_LDataSet ds = (AS_ASET_1108_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1108_LCURLISTRecord curlistRec = (AS_ASET_1108_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.acqr_dt%>
<%= curlistRec.orgin_acqr_amt%>
<%= curlistRec.buy_clsf_nm%>
<%= curlistRec.aset_qunt_cnt%>
<%= curlistRec.aset_usag%>
<%= curlistRec.aset_size%>
<%= curlistRec.aset_loca%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 17:14:33 KST 2009 */