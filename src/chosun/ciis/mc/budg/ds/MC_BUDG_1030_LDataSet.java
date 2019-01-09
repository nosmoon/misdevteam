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


public class MC_BUDG_1030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_1030_LDataSet(){}
	public MC_BUDG_1030_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_1030_LCURLISTRecord rec = new MC_BUDG_1030_LCURLISTRecord();
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.t1_hmcd = Util.checkString(rset0.getString("t1_hmcd"));
			rec.itm_15 = Util.checkString(rset0.getString("itm_15"));
			rec.itm_16 = Util.checkString(rset0.getString("itm_16"));
			rec.itm_17 = Util.checkString(rset0.getString("itm_17"));
			rec.itm_25 = Util.checkString(rset0.getString("itm_25"));
			rec.itm_35 = Util.checkString(rset0.getString("itm_35"));
			rec.itm_91 = Util.checkString(rset0.getString("itm_91"));
			rec.itm_92 = Util.checkString(rset0.getString("itm_92"));
			rec.itm_93 = Util.checkString(rset0.getString("itm_93"));
			rec.itm_94 = Util.checkString(rset0.getString("itm_94"));
			rec.itm_95 = Util.checkString(rset0.getString("itm_95"));
			rec.itm_96 = Util.checkString(rset0.getString("itm_96"));
			rec.flag = Util.checkString(rset0.getString("flag"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_1030_LDataSet ds = (MC_BUDG_1030_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_1030_LCURLISTRecord curlistRec = (MC_BUDG_1030_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.t1_hmcd%>
<%= curlistRec.itm_15%>
<%= curlistRec.itm_16%>
<%= curlistRec.itm_17%>
<%= curlistRec.itm_25%>
<%= curlistRec.itm_35%>
<%= curlistRec.itm_91%>
<%= curlistRec.itm_92%>
<%= curlistRec.itm_93%>
<%= curlistRec.itm_94%>
<%= curlistRec.itm_95%>
<%= curlistRec.itm_96%>
<%= curlistRec.flag%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 11 12:04:53 KST 2009 */