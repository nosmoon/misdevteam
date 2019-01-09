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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_1201_LDataSet(){}
	public FC_ACCT_1201_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			FC_ACCT_1201_LCURLISTRecord rec = new FC_ACCT_1201_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.abrv_nm = Util.checkString(rset0.getString("abrv_nm"));
			rec.slip_clsf01 = Util.checkString(rset0.getString("slip_clsf01"));
			rec.slip01 = Util.checkString(rset0.getString("slip01"));
			rec.slip_clsf02 = Util.checkString(rset0.getString("slip_clsf02"));
			rec.slip02 = Util.checkString(rset0.getString("slip02"));
			rec.slip_clsf03 = Util.checkString(rset0.getString("slip_clsf03"));
			rec.slip03 = Util.checkString(rset0.getString("slip03"));
			rec.slip_clsf10 = Util.checkString(rset0.getString("slip_clsf10"));
			rec.slip10 = Util.checkString(rset0.getString("slip10"));
			rec.slip_clsf11 = Util.checkString(rset0.getString("slip_clsf11"));
			rec.slip11 = Util.checkString(rset0.getString("slip11"));
			rec.slip_clsf12 = Util.checkString(rset0.getString("slip_clsf12"));
			rec.slip12 = Util.checkString(rset0.getString("slip12"));
			rec.slip_clsf13 = Util.checkString(rset0.getString("slip_clsf13"));
			rec.slip13 = Util.checkString(rset0.getString("slip13"));
			rec.slip_clsf16 = Util.checkString(rset0.getString("slip_clsf16"));
			rec.slip16 = Util.checkString(rset0.getString("slip16"));
			rec.slip_clsf17 = Util.checkString(rset0.getString("slip_clsf17"));
			rec.slip17 = Util.checkString(rset0.getString("slip17"));
			rec.slip_clsf20 = Util.checkString(rset0.getString("slip_clsf20"));
			rec.slip20 = Util.checkString(rset0.getString("slip20"));
			rec.slip_clsf21 = Util.checkString(rset0.getString("slip_clsf21"));
			rec.slip21 = Util.checkString(rset0.getString("slip21"));
			rec.slip_clsf22 = Util.checkString(rset0.getString("slip_clsf22"));
			rec.slip22 = Util.checkString(rset0.getString("slip22"));
			rec.slip_clsf26 = Util.checkString(rset0.getString("slip_clsf26"));
			rec.slip26 = Util.checkString(rset0.getString("slip26"));
			rec.slip_clsf27 = Util.checkString(rset0.getString("slip_clsf27"));
			rec.slip27 = Util.checkString(rset0.getString("slip27"));
			rec.slip_clsf30 = Util.checkString(rset0.getString("slip_clsf30"));
			rec.slip30 = Util.checkString(rset0.getString("slip30"));
			rec.slip_clsf32 = Util.checkString(rset0.getString("slip_clsf32"));
			rec.slip32 = Util.checkString(rset0.getString("slip32"));
			rec.slip_clsf33 = Util.checkString(rset0.getString("slip_clsf33"));
			rec.slip33 = Util.checkString(rset0.getString("slip33"));
			rec.slip_clsf34 = Util.checkString(rset0.getString("slip_clsf34"));
			rec.slip34 = Util.checkString(rset0.getString("slip34"));
			rec.slip_clsf35 = Util.checkString(rset0.getString("slip_clsf35"));
			rec.slip35 = Util.checkString(rset0.getString("slip35"));
			rec.slip_clsf36 = Util.checkString(rset0.getString("slip_clsf36"));
			rec.slip36 = Util.checkString(rset0.getString("slip36"));
			rec.slip_clsf40 = Util.checkString(rset0.getString("slip_clsf40"));
			rec.slip40 = Util.checkString(rset0.getString("slip40"));
			rec.slip_clsf41 = Util.checkString(rset0.getString("slip_clsf41"));
			rec.slip41 = Util.checkString(rset0.getString("slip41"));
			rec.slip_clsf42 = Util.checkString(rset0.getString("slip_clsf42"));
			rec.slip42 = Util.checkString(rset0.getString("slip42"));
			rec.slip_clsf50 = Util.checkString(rset0.getString("slip_clsf50"));
			rec.slip50 = Util.checkString(rset0.getString("slip50"));
			rec.slip_clsf51 = Util.checkString(rset0.getString("slip_clsf51"));
			rec.slip51 = Util.checkString(rset0.getString("slip51"));
			rec.slip_clsf52 = Util.checkString(rset0.getString("slip_clsf52"));
			rec.slip52 = Util.checkString(rset0.getString("slip52"));
			rec.slip_clsf53 = Util.checkString(rset0.getString("slip_clsf53"));
			rec.slip53 = Util.checkString(rset0.getString("slip53"));
			rec.slip_clsf54 = Util.checkString(rset0.getString("slip_clsf54"));
			rec.slip54 = Util.checkString(rset0.getString("slip54"));
			rec.slip_clsf55 = Util.checkString(rset0.getString("slip_clsf55"));
			rec.slip55 = Util.checkString(rset0.getString("slip55"));
			rec.slip_clsf60 = Util.checkString(rset0.getString("slip_clsf60"));
			rec.slip60 = Util.checkString(rset0.getString("slip60"));
			rec.slip_clsf61 = Util.checkString(rset0.getString("slip_clsf61"));
			rec.slip61 = Util.checkString(rset0.getString("slip61"));
			rec.slip_clsf62 = Util.checkString(rset0.getString("slip_clsf62"));
			rec.slip62 = Util.checkString(rset0.getString("slip62"));
			rec.slip_clsf63 = Util.checkString(rset0.getString("slip_clsf63"));
			rec.slip63 = Util.checkString(rset0.getString("slip63"));
			rec.slip_clsf64 = Util.checkString(rset0.getString("slip_clsf64"));
			rec.slip64 = Util.checkString(rset0.getString("slip64"));
			rec.slip_clsf90 = Util.checkString(rset0.getString("slip_clsf90"));
			rec.slip90 = Util.checkString(rset0.getString("slip90"));
			rec.slip_clsf91 = Util.checkString(rset0.getString("slip_clsf91"));
			rec.slip91 = Util.checkString(rset0.getString("slip91"));
			rec.slip_clsf92 = Util.checkString(rset0.getString("slip_clsf92"));
			rec.slip92 = Util.checkString(rset0.getString("slip92"));
			rec.slip_clsf93 = Util.checkString(rset0.getString("slip_clsf93"));
			rec.slip93 = Util.checkString(rset0.getString("slip93"));
			rec.slip_clsf94 = Util.checkString(rset0.getString("slip_clsf94"));
			rec.slip94 = Util.checkString(rset0.getString("slip94"));
			rec.slip_clsf95 = Util.checkString(rset0.getString("slip_clsf95"));
			rec.slip95 = Util.checkString(rset0.getString("slip95"));
			rec.slip_clsf96 = Util.checkString(rset0.getString("slip_clsf96"));
			rec.slip96 = Util.checkString(rset0.getString("slip96"));
			rec.slip_clsf97 = Util.checkString(rset0.getString("slip_clsf97"));
			rec.slip97 = Util.checkString(rset0.getString("slip97"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_1201_LDataSet ds = (FC_ACCT_1201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_1201_LCURLISTRecord curlistRec = (FC_ACCT_1201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.abrv_nm%>
<%= curlistRec.slip_clsf01%>
<%= curlistRec.slip01%>
<%= curlistRec.slip_clsf02%>
<%= curlistRec.slip02%>
<%= curlistRec.slip_clsf03%>
<%= curlistRec.slip03%>
<%= curlistRec.slip_clsf10%>
<%= curlistRec.slip10%>
<%= curlistRec.slip_clsf11%>
<%= curlistRec.slip11%>
<%= curlistRec.slip_clsf12%>
<%= curlistRec.slip12%>
<%= curlistRec.slip_clsf13%>
<%= curlistRec.slip13%>
<%= curlistRec.slip_clsf16%>
<%= curlistRec.slip16%>
<%= curlistRec.slip_clsf17%>
<%= curlistRec.slip17%>
<%= curlistRec.slip_clsf20%>
<%= curlistRec.slip20%>
<%= curlistRec.slip_clsf21%>
<%= curlistRec.slip21%>
<%= curlistRec.slip_clsf22%>
<%= curlistRec.slip22%>
<%= curlistRec.slip_clsf26%>
<%= curlistRec.slip26%>
<%= curlistRec.slip_clsf27%>
<%= curlistRec.slip27%>
<%= curlistRec.slip_clsf30%>
<%= curlistRec.slip30%>
<%= curlistRec.slip_clsf32%>
<%= curlistRec.slip32%>
<%= curlistRec.slip_clsf33%>
<%= curlistRec.slip33%>
<%= curlistRec.slip_clsf34%>
<%= curlistRec.slip34%>
<%= curlistRec.slip_clsf35%>
<%= curlistRec.slip35%>
<%= curlistRec.slip_clsf36%>
<%= curlistRec.slip36%>
<%= curlistRec.slip_clsf40%>
<%= curlistRec.slip40%>
<%= curlistRec.slip_clsf41%>
<%= curlistRec.slip41%>
<%= curlistRec.slip_clsf42%>
<%= curlistRec.slip42%>
<%= curlistRec.slip_clsf50%>
<%= curlistRec.slip50%>
<%= curlistRec.slip_clsf51%>
<%= curlistRec.slip51%>
<%= curlistRec.slip_clsf52%>
<%= curlistRec.slip52%>
<%= curlistRec.slip_clsf53%>
<%= curlistRec.slip53%>
<%= curlistRec.slip_clsf54%>
<%= curlistRec.slip54%>
<%= curlistRec.slip_clsf55%>
<%= curlistRec.slip55%>
<%= curlistRec.slip_clsf60%>
<%= curlistRec.slip60%>
<%= curlistRec.slip_clsf61%>
<%= curlistRec.slip61%>
<%= curlistRec.slip_clsf62%>
<%= curlistRec.slip62%>
<%= curlistRec.slip_clsf63%>
<%= curlistRec.slip63%>
<%= curlistRec.slip_clsf64%>
<%= curlistRec.slip64%>
<%= curlistRec.slip_clsf90%>
<%= curlistRec.slip90%>
<%= curlistRec.slip_clsf91%>
<%= curlistRec.slip91%>
<%= curlistRec.slip_clsf92%>
<%= curlistRec.slip92%>
<%= curlistRec.slip_clsf93%>
<%= curlistRec.slip93%>
<%= curlistRec.slip_clsf94%>
<%= curlistRec.slip94%>
<%= curlistRec.slip_clsf95%>
<%= curlistRec.slip95%>
<%= curlistRec.slip_clsf96%>
<%= curlistRec.slip96%>
<%= curlistRec.slip_clsf97%>
<%= curlistRec.slip97%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 18:11:10 KST 2009 */