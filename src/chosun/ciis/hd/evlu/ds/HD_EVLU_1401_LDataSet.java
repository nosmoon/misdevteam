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


public class HD_EVLU_1401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EVLU_1401_LDataSet(){}
	public HD_EVLU_1401_LDataSet(String errcode, String errmsg){
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
			HD_EVLU_1401_LCURLISTRecord rec = new HD_EVLU_1401_LCURLISTRecord();
			rec.evlu_grp_nm = Util.checkString(rset0.getString("evlu_grp_nm"));
			rec.ratio_10 = Util.checkString(rset0.getString("ratio_10"));
			rec.ratio_20 = Util.checkString(rset0.getString("ratio_20"));
			rec.ratio_30 = Util.checkString(rset0.getString("ratio_30"));
			rec.ratio_40 = Util.checkString(rset0.getString("ratio_40"));
			rec.ratio_50 = Util.checkString(rset0.getString("ratio_50"));
			rec.ratio_60 = Util.checkString(rset0.getString("ratio_60"));
			rec.ratio_tot = Util.checkString(rset0.getString("ratio_tot"));
			rec.asst_point = Util.checkString(rset0.getString("asst_point"));
			rec.asst_clsf = Util.checkString(rset0.getString("asst_clsf"));
			rec.spcl_plus_point = Util.checkString(rset0.getString("spcl_plus_point"));
			rec.spcl_minus_point = Util.checkString(rset0.getString("spcl_minus_point"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			rec.evlu_grp_cd = Util.checkString(rset0.getString("evlu_grp_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_1401_LDataSet ds = (HD_EVLU_1401_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_1401_LCURLISTRecord curlistRec = (HD_EVLU_1401_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evlu_grp_nm%>
<%= curlistRec.ratio_10%>
<%= curlistRec.ratio_20%>
<%= curlistRec.ratio_30%>
<%= curlistRec.ratio_40%>
<%= curlistRec.ratio_50%>
<%= curlistRec.ratio_60%>
<%= curlistRec.ratio_tot%>
<%= curlistRec.asst_point%>
<%= curlistRec.asst_clsf%>
<%= curlistRec.spcl_plus_point%>
<%= curlistRec.spcl_minus_point%>
<%= curlistRec.db_status%>
<%= curlistRec.evlu_grp_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 19 16:27:12 KST 2018 */