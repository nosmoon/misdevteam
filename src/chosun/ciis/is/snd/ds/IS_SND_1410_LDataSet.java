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


package chosun.ciis.is.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.rec.*;

/**
 * 
 */


public class IS_SND_1410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SND_1410_LDataSet(){}
	public IS_SND_1410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			IS_SND_1410_LCURLISTRecord rec = new IS_SND_1410_LCURLISTRecord();
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.purc_dlco_nm = Util.checkString(rset0.getString("purc_dlco_nm"));
			rec.scat_dt = Util.checkString(rset0.getString("scat_dt"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.bnch_qty = Util.checkString(rset0.getString("bnch_qty"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.purc_dlco_nm_sort = Util.checkString(rset0.getString("purc_dlco_nm_sort"));
			rec.dstc_seqo = Util.checkString(rset0.getString("dstc_seqo"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_SND_1410_LDataSet ds = (IS_SND_1410_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_SND_1410_LCURLISTRecord curlistRec = (IS_SND_1410_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.asnt_dstc_cd_nm%>
<%= curlistRec.purc_dlco_nm%>
<%= curlistRec.scat_dt%>
<%= curlistRec.advcs_cd_nm%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.qunt%>
<%= curlistRec.bnch_qty%>
<%= curlistRec.uprc%>
<%= curlistRec.purc_amt%>
<%= curlistRec.purc_dlco_nm_sort%>
<%= curlistRec.dstc_seqo%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 24 16:14:27 KST 2012 */