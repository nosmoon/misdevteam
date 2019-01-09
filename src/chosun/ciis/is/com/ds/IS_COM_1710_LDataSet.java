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


package chosun.ciis.is.com.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.rec.*;

/**
 * 
 */


public class IS_COM_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_COM_1710_LDataSet(){}
	public IS_COM_1710_LDataSet(String errcode, String errmsg){
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
			IS_COM_1710_LCURLIST1Record rec = new IS_COM_1710_LCURLIST1Record();
			rec.send_atic_no = Util.checkString(rset0.getString("send_atic_no"));
			rec.send_atic_nm = Util.checkString(rset0.getString("send_atic_nm"));
			rec.reg_dd = Util.checkString(rset0.getString("reg_dd"));
			rec.car_kind = Util.checkString(rset0.getString("car_kind"));
			rec.yy_styl = Util.checkString(rset0.getString("yy_styl"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.tel = Util.checkString(rset0.getString("tel"));
			rec.ceph = Util.checkString(rset0.getString("ceph"));
			rec.zip_1 = Util.checkString(rset0.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset0.getString("zip_2"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.wh_cd = Util.checkString(rset0.getString("wh_cd"));
			rec.driv_yn = Util.checkString(rset0.getString("driv_yn"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_COM_1710_LDataSet ds = (IS_COM_1710_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_COM_1710_LCURLIST1Record curlist1Rec = (IS_COM_1710_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlist1Rec.send_atic_no%>
<%= curlist1Rec.send_atic_nm%>
<%= curlist1Rec.reg_dd%>
<%= curlist1Rec.car_kind%>
<%= curlist1Rec.yy_styl%>
<%= curlist1Rec.car_no%>
<%= curlist1Rec.prn%>
<%= curlist1Rec.tel%>
<%= curlist1Rec.ceph%>
<%= curlist1Rec.zip_1%>
<%= curlist1Rec.zip_2%>
<%= curlist1Rec.addr%>
<%= curlist1Rec.dtls_addr%>
<%= curlist1Rec.wh_cd%>
<%= curlist1Rec.driv_yn%>
<%= curlist1Rec.chg_dt_tm%>
<%= curlist1Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 29 18:48:39 KST 2012 */