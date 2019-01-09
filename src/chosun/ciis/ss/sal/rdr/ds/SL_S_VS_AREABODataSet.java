/***************************************************************************************************
* 파일명 : SL_S_VS_AREABODataSet.java
* 기능 : 독자-VacationStop관리-휴가지배달지역 상세
* 작성일자 : 2004-04-01
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자-VacationStop관리-휴가지배달지역 상세
 *
 */

public class SL_S_VS_AREABODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String vaca_areabocd;
	public String vaca_areabonm;
	public String vaca_areabotel;
	public String vaca_areazip;
	public String vaca_areaaddr;
	public String vaca_areadtlsaddr;

	public SL_S_VS_AREABODataSet(){}
	public SL_S_VS_AREABODataSet(String errcode, String errmsg, String vaca_areabocd, String vaca_areabonm, String vaca_areabotel, String vaca_areazip, String vaca_areaaddr, String vaca_areadtlsaddr){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.vaca_areabocd = vaca_areabocd;
		this.vaca_areabonm = vaca_areabonm;
		this.vaca_areabotel = vaca_areabotel;
		this.vaca_areazip = vaca_areazip;
		this.vaca_areaaddr = vaca_areaaddr;
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setVaca_areabocd(String vaca_areabocd){
		this.vaca_areabocd = vaca_areabocd;
	}

	public void setVaca_areabonm(String vaca_areabonm){
		this.vaca_areabonm = vaca_areabonm;
	}

	public void setVaca_areabotel(String vaca_areabotel){
		this.vaca_areabotel = vaca_areabotel;
	}

	public void setVaca_areazip(String vaca_areazip){
		this.vaca_areazip = vaca_areazip;
	}

	public void setVaca_areaaddr(String vaca_areaaddr){
		this.vaca_areaaddr = vaca_areaaddr;
	}

	public void setVaca_areadtlsaddr(String vaca_areadtlsaddr){
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getVaca_areabocd(){
		return this.vaca_areabocd;
	}

	public String getVaca_areabonm(){
		return this.vaca_areabonm;
	}

	public String getVaca_areabotel(){
		return this.vaca_areabotel;
	}

	public String getVaca_areazip(){
		return this.vaca_areazip;
	}

	public String getVaca_areaaddr(){
		return this.vaca_areaaddr;
	}

	public String getVaca_areadtlsaddr(){
		return this.vaca_areadtlsaddr;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.vaca_areabocd = Util.checkString(cstmt.getString(5));
		this.vaca_areabonm = Util.checkString(cstmt.getString(6));
		this.vaca_areabotel = Util.checkString(cstmt.getString(7));
		this.vaca_areazip = Util.checkString(cstmt.getString(8));
		this.vaca_areaaddr = Util.checkString(cstmt.getString(9));
		this.vaca_areadtlsaddr = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_S_VS_AREABODataSet ds = (SL_S_VS_AREABODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getVaca_areabocd()%>
<%= ds.getVaca_areabonm()%>
<%= ds.getVaca_areabotel()%>
<%= ds.getVaca_areazip()%>
<%= ds.getVaca_areaaddr()%>
<%= ds.getVaca_areadtlsaddr()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 01 11:19:44 KST 2004 */