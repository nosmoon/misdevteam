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


package chosun.ciis.mt.submatrin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1305_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRIN_1305_LDataSet(){}
	public MT_SUBMATRIN_1305_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			MT_SUBMATRIN_1305_LCURLISTRecord rec = new MT_SUBMATRIN_1305_LCURLISTRecord();
			rec.gubun = Util.checkString(rset0.getString("gubun"));
			rec.biopsb = Util.checkString(rset0.getString("biopsb"));
			rec.bihannm = Util.checkString(rset0.getString("bihannm"));
			rec.sgjbyhcd10 = Util.checkString(rset0.getString("sgjbyhcd10"));
			rec.sgysjgbcd10 = Util.checkString(rset0.getString("sgysjgbcd10"));
			rec.biigamt10 = Util.checkString(rset0.getString("biigamt10"));
			rec.biigvat10 = Util.checkString(rset0.getString("biigvat10"));
			rec.sgjbyhcd20 = Util.checkString(rset0.getString("sgjbyhcd20"));
			rec.sgysjgbcd20 = Util.checkString(rset0.getString("sgysjgbcd20"));
			rec.biigamt20 = Util.checkString(rset0.getString("biigamt20"));
			rec.biigvat20 = Util.checkString(rset0.getString("biigvat20"));
			rec.sgjbyhcd22 = Util.checkString(rset0.getString("sgjbyhcd22"));
			rec.sgysjgbcd22 = Util.checkString(rset0.getString("sgysjgbcd22"));
			rec.biigamt22 = Util.checkString(rset0.getString("biigamt22"));
			rec.biigvat22 = Util.checkString(rset0.getString("biigvat22"));
			rec.sgjbyhcd25 = Util.checkString(rset0.getString("sgjbyhcd25"));
			rec.sgysjgbcd25 = Util.checkString(rset0.getString("sgysjgbcd25"));
			rec.biigamt25 = Util.checkString(rset0.getString("biigamt25"));
			rec.biigvat25 = Util.checkString(rset0.getString("biigvat25"));
			rec.sgjbyhcdall = Util.checkString(rset0.getString("sgjbyhcdall"));
			rec.sgysjgbcdall = Util.checkString(rset0.getString("sgysjgbcdall"));
			rec.biigamtall = Util.checkString(rset0.getString("biigamtall"));
			rec.biigvatall = Util.checkString(rset0.getString("biigvatall"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRIN_1305_LDataSet ds = (MT_SUBMATRIN_1305_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRIN_1305_LCURLISTRecord curlistRec = (MT_SUBMATRIN_1305_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.gubun%>
<%= curlistRec.biopsb%>
<%= curlistRec.bihannm%>
<%= curlistRec.sgjbyhcd10%>
<%= curlistRec.sgysjgbcd10%>
<%= curlistRec.biigamt10%>
<%= curlistRec.biigvat10%>
<%= curlistRec.sgjbyhcd20%>
<%= curlistRec.sgysjgbcd20%>
<%= curlistRec.biigamt20%>
<%= curlistRec.biigvat20%>
<%= curlistRec.sgjbyhcd22%>
<%= curlistRec.sgysjgbcd22%>
<%= curlistRec.biigamt22%>
<%= curlistRec.biigvat22%>
<%= curlistRec.sgjbyhcd25%>
<%= curlistRec.sgysjgbcd25%>
<%= curlistRec.biigamt25%>
<%= curlistRec.biigvat25%>
<%= curlistRec.sgjbyhcdall%>
<%= curlistRec.sgysjgbcdall%>
<%= curlistRec.biigamtall%>
<%= curlistRec.biigvatall%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 21:40:53 KST 2009 */