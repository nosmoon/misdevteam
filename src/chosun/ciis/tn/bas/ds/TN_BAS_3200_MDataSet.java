/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_3200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_combo_020 = new ArrayList();
	public ArrayList xx_combo_010 = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_BAS_3200_MDataSet(){}
	public TN_BAS_3200_MDataSet(String errcode, String errmsg){
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
			TN_BAS_3200_MXX_COMBO_010Record rec = new TN_BAS_3200_MXX_COMBO_010Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			this.xx_combo_010.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			TN_BAS_3200_MXX_COMBO_020Record rec = new TN_BAS_3200_MXX_COMBO_020Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			this.xx_combo_020.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_BAS_3200_MDataSet ds = (TN_BAS_3200_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.xx_combo_010.size(); i++){
		TN_BAS_3200_MXX_COMBO_010Record xx_combo_010Rec = (TN_BAS_3200_MXX_COMBO_010Record)ds.xx_combo_010.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_combo_020.size(); i++){
		TN_BAS_3200_MXX_COMBO_020Record xx_combo_020Rec = (TN_BAS_3200_MXX_COMBO_020Record)ds.xx_combo_020.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_combo_010()%>
<%= ds.getXx_combo_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= xx_combo_010Rec.cd%>
<%= xx_combo_010Rec.cd_nm%>
<%= xx_combo_020Rec.cd%>
<%= xx_combo_020Rec.cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 05 14:47:23 KST 2016 */