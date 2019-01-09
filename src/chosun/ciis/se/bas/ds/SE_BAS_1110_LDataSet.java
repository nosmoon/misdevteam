/***************************************************************************************************
* 파일명 : SE_BAS_1110_LDataSet.java
* 기능 :  판매 - 기준정보 - 지역관리 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.rec.*;

/**
 * 
 */


public class SE_BAS_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist  = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BAS_1110_LDataSet(){}
	public SE_BAS_1110_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			SE_BAS_1110_LCURLISTRecord rec = new SE_BAS_1110_LCURLISTRecord();
			rec.cmpy_cd 		= Util.checkString(rset0.getString("cmpy_cd"		));
			rec.area_cd 		= Util.checkString(rset0.getString("area_cd"		));
			rec.area_nm 		= Util.checkString(rset0.getString("area_nm"		));
			rec.sido_cd 		= Util.checkString(rset0.getString("sido_cd"		));
			rec.sido_nm 		= Util.checkString(rset0.getString("sido_nm"		));
			rec.chrg_pers 		= Util.checkString(rset0.getString("chrg_pers"		));
			rec.flnm 			= Util.checkString(rset0.getString("flnm"			));
			rec.dept_nm 		= Util.checkString(rset0.getString("dept_nm"		));
			rec.dept_cd 		= Util.checkString(rset0.getString("dept_cd"		));
			rec.acct_sido_cd	= Util.checkString(rset0.getString("acct_sido_cd"	));
			rec.acct_sido_nm	= Util.checkString(rset0.getString("acct_sido_nm"	));
			rec.sell_sido_cd	= Util.checkString(rset0.getString("sell_sido_cd"	));
			rec.sell_sido_nm	= Util.checkString(rset0.getString("sell_sido_nm"	));
			rec.sell_srt_col	= Util.checkString(rset0.getString("sell_srt_col"	));
			rec.use_yn   		= Util.checkString(rset0.getString("use_yn"			));
			rec.area_cd_key 	= Util.checkString(rset0.getString("area_cd_key"	));
			
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BAS_1102DataSet ds = (SE_BAS_1102DataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BAS_1102CURLISTRecord curlistRec = (SE_BAS_1102CURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.area_cd%>
<%= curlistRec.area_nm%>
<%= curlistRec.sido_cd%>
<%= curlistRec.sido_nm%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 13 18:16:18 KST 2009 */