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


public class HD_AFFR_5020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_5020_LDataSet(){}
	public HD_AFFR_5020_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_AFFR_5020_LCURLISTRecord rec = new HD_AFFR_5020_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.certi_clsf_name = Util.checkString(rset0.getString("certi_clsf_name"));
			rec.issu_num_shet = Util.checkString(rset0.getString("issu_num_shet"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.issu_clsf = Util.checkString(rset0.getString("issu_clsf"));
			rec.issu_no = Util.checkString(rset0.getString("issu_no"));
			rec.certi_clsf = Util.checkString(rset0.getString("certi_clsf"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_5020_LDataSet ds = (HD_AFFR_5020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_5020_LCURLISTRecord curlistRec = (HD_AFFR_5020_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.aplc_dt%>
<%= curlistRec.certi_clsf_name%>
<%= curlistRec.issu_num_shet%>
<%= curlistRec.usag%>
<%= curlistRec.issu_dt%>
<%= curlistRec.issu_clsf%>
<%= curlistRec.issu_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jun 21 14:28:20 KST 2009 */