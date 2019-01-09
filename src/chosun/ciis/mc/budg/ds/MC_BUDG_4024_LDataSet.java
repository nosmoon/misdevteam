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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4024_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4024_LDataSet(){}
	public MC_BUDG_4024_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MC_BUDG_4024_LCURLISTRecord rec = new MC_BUDG_4024_LCURLISTRecord();
			rec.sub_no = Util.checkString(rset0.getString("sub_no"));
			rec.work_no = Util.checkString(rset0.getString("work_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_cdnm = Util.checkString(rset0.getString("evnt_cdnm"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_cdnm = Util.checkString(rset0.getString("medi_cdnm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.yrsqty = Util.checkString(rset0.getString("yrsqty"));
			rec.yrdan = Util.checkString(rset0.getString("yrdan"));
			rec.yramt = Util.checkString(rset0.getString("yramt"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_4024_LDataSet ds = (MC_BUDG_4024_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4024_LCURLISTRecord curlistRec = (MC_BUDG_4024_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sub_no%>
<%= curlistRec.work_no%>
<%= curlistRec.seq%>
<%= curlistRec.sub_seq%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_cdnm%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_cdnm%>
<%= curlistRec.rmks%>
<%= curlistRec.yrsqty%>
<%= curlistRec.yrdan%>
<%= curlistRec.yramt%>
<%= curlistRec.qunt%>
<%= curlistRec.uprc%>
<%= curlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 16:31:31 KST 2009 */