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


public class IS_SND_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_SND_1110_LDataSet(){}
	public IS_SND_1110_LDataSet(String errcode, String errmsg){
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
			IS_SND_1110_LCURLIST1Record rec = new IS_SND_1110_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.acwr_reg_dt = Util.checkString(rset0.getString("acwr_reg_dt"));
			rec.acwr_reg_seq = Util.checkString(rset0.getString("acwr_reg_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.wh_cd_nm = Util.checkString(rset0.getString("wh_cd_nm"));
			rec.fix_yn = Util.checkString(rset0.getString("fix_yn"));
			rec.self_yn = Util.checkString(rset0.getString("self_yn"));
			rec.wh_cd = Util.checkString(rset0.getString("wh_cd"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_SND_1110_LDataSet ds = (IS_SND_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_SND_1110_LCURLIST1Record curlist1Rec = (IS_SND_1110_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.acwr_reg_dt%>
<%= curlist1Rec.acwr_reg_seq%>
<%= curlist1Rec.dlco_nm%>
<%= curlist1Rec.advcs_cd_nm%>
<%= curlist1Rec.advt_nm%>
<%= curlist1Rec.std_cd_nm%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.chrg_pers%>
<%= curlist1Rec.wh_cd_nm%>
<%= curlist1Rec.fix_yn%>
<%= curlist1Rec.self_yn%>
<%= curlist1Rec.wh_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 24 14:50:06 KST 2012 */