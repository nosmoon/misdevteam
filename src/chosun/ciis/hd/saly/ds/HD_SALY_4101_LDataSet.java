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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_4101_LDataSet(){}
	public HD_SALY_4101_LDataSet(String errcode, String errmsg){
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
			HD_SALY_4101_LCURLISTRecord rec = new HD_SALY_4101_LCURLISTRecord();
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.emp_clsf = Util.checkString(rset0.getString("emp_clsf"));
			rec.last_midl_adjm_dt = Util.checkString(rset0.getString("last_midl_adjm_dt"));
			rec.gsycnt = Util.checkString(rset0.getString("gsycnt"));
			rec.sb = Util.checkString(rset0.getString("sb"));
			rec.eg = Util.checkString(rset0.getString("eg"));
			rec.gm = Util.checkString(rset0.getString("gm"));
			rec.rgla_saly = Util.checkString(rset0.getString("rgla_saly"));
			rec.base_saly = Util.checkString(rset0.getString("base_saly"));
			rec.supl_saly = Util.checkString(rset0.getString("supl_saly"));
			rec.gb = Util.checkString(rset0.getString("gb"));
			rec.tjamt = Util.checkString(rset0.getString("tjamt"));
			rec.tjg = Util.checkString(rset0.getString("tjg"));
			rec.jgcmjamt = Util.checkString(rset0.getString("jgcmjamt"));
			rec.sbjanamt = Util.checkString(rset0.getString("sbjanamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_4101_LDataSet ds = (HD_SALY_4101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_4101_LCURLISTRecord curlistRec = (HD_SALY_4101_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.emp_clsf%>
<%= curlistRec.last_midl_adjm_dt%>
<%= curlistRec.gsycnt%>
<%= curlistRec.sb%>
<%= curlistRec.eg%>
<%= curlistRec.gm%>
<%= curlistRec.rgla_saly%>
<%= curlistRec.base_saly%>
<%= curlistRec.supl_saly%>
<%= curlistRec.gb%>
<%= curlistRec.tjamt%>
<%= curlistRec.tjg%>
<%= curlistRec.jgcmjamt%>
<%= curlistRec.sbjanamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 19:29:43 KST 2009 */