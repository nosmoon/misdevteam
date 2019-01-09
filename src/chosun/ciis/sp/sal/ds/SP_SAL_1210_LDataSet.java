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


package chosun.ciis.sp.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public SP_SAL_1210_LDataSet(){}
	public SP_SAL_1210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SP_SAL_1210_LCURLIST1Record rec = new SP_SAL_1210_LCURLIST1Record();
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.entr_fee = Util.checkString(rset0.getString("entr_fee"));
			rec.phon_hdqt_fee = Util.checkString(rset0.getString("phon_hdqt_fee"));
			rec.hzone_use_fee = Util.checkString(rset0.getString("hzone_use_fee"));
			rec.ictry_tel_fee = Util.checkString(rset0.getString("ictry_tel_fee"));
			rec.p00755tel_fee = Util.checkString(rset0.getString("p00755tel_fee"));
			rec.intl_tel_fee = Util.checkString(rset0.getString("intl_tel_fee"));
			rec.movm_tel_fee = Util.checkString(rset0.getString("movm_tel_fee"));
			rec.onnet_curc_fee = Util.checkString(rset0.getString("onnet_curc_fee"));
			rec.p070curc_fee = Util.checkString(rset0.getString("p070curc_fee"));
			rec.in_pre_curc_fee = Util.checkString(rset0.getString("in_pre_curc_fee"));
			rec.appm_curc_fee = Util.checkString(rset0.getString("appm_curc_fee"));
			rec.img_curc_fee = Util.checkString(rset0.getString("img_curc_fee"));
			rec.sms_use_fee = Util.checkString(rset0.getString("sms_use_fee"));
			rec.supl_use_fee = Util.checkString(rset0.getString("supl_use_fee"));
			rec.sound_src_make_fee = Util.checkString(rset0.getString("sound_src_make_fee"));
			rec.frft = Util.checkString(rset0.getString("frft"));
			rec.use_prd = Util.checkString(rset0.getString("use_prd"));
			rec.chg_matt = Util.checkString(rset0.getString("chg_matt"));
			rec.flag = Util.checkString(rset0.getString("flag"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SAL_1210_LDataSet ds = (SP_SAL_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SAL_1210_LCURLIST1Record curlist1Rec = (SP_SAL_1210_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.mang_no%>
<%= curlist1Rec.entr_fee%>
<%= curlist1Rec.phon_hdqt_fee%>
<%= curlist1Rec.hzone_use_fee%>
<%= curlist1Rec.ictry_tel_fee%>
<%= curlist1Rec.p00755tel_fee%>
<%= curlist1Rec.intl_tel_fee%>
<%= curlist1Rec.movm_tel_fee%>
<%= curlist1Rec.onnet_curc_fee%>
<%= curlist1Rec.p070curc_fee%>
<%= curlist1Rec.in_pre_curc_fee%>
<%= curlist1Rec.appm_curc_fee%>
<%= curlist1Rec.img_curc_fee%>
<%= curlist1Rec.sms_use_fee%>
<%= curlist1Rec.supl_use_fee%>
<%= curlist1Rec.sound_src_make_fee%>
<%= curlist1Rec.frft%>
<%= curlist1Rec.use_prd%>
<%= curlist1Rec.chg_matt%>
<%= curlist1Rec.flag%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 12 20:28:29 KST 2012 */