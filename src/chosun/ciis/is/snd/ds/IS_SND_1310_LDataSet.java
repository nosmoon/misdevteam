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


public class IS_SND_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SND_1310_LDataSet(){}
	public IS_SND_1310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(18);
		while(rset0.next()){
			IS_SND_1310_LCURLISTRecord rec = new IS_SND_1310_LCURLISTRecord();
			rec.wh_cd_nm = Util.checkString(rset0.getString("wh_cd_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.purc_dlco_nm = Util.checkString(rset0.getString("purc_dlco_nm"));
			rec.purc_qunt = Util.checkString(rset0.getString("purc_qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.send_yn = Util.checkString(rset0.getString("send_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_SND_1310_LDataSet ds = (IS_SND_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_SND_1310_LCURLISTRecord curlistRec = (IS_SND_1310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.wh_cd_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.advcs_cd_nm%>
<%= curlistRec.advt_nm%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.asnt_dstc_cd_nm%>
<%= curlistRec.purc_dlco_nm%>
<%= curlistRec.purc_qunt%>
<%= curlistRec.uprc%>
<%= curlistRec.tot_amt%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.send_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 25 09:34:47 KST 2012 */