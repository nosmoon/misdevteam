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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_3301_500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_3301_500_LDataSet(){}
	public HD_EVLU_3301_500_LDataSet(String errcode, String errmsg){
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

		ResultSet rset6 = (ResultSet) cstmt.getObject(7);
		while(rset6.next()){
			HD_EVLU_3301_500_LCURLISTRecord rec = new HD_EVLU_3301_500_LCURLISTRecord();
			rec.sel_chk = Util.checkString(rset6.getString("sel_chk"));
			rec.evlu_grp_nm = Util.checkString(rset6.getString("evlu_grp_nm"));
			rec.evlu_proc_stat_2tms = Util.checkString(rset6.getString("evlu_proc_stat_2tms"));
			rec.evlu_proc_stat_1tms = Util.checkString(rset6.getString("evlu_proc_stat_1tms"));
			rec.evlu_grp_cd = Util.checkString(rset6.getString("evlu_grp_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_3301_500_LDataSet ds = (HD_EVLU_3301_500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_3301_500_LCURLISTRecord curlistRec = (HD_EVLU_3301_500_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sel_chk%>
<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.evlu_proc_stat_2tms%>
<%= curlistRec.evlu_proc_stat_1tms%>
<%= curlistRec.evlu_grp_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 20 16:55:56 KST 2018 */