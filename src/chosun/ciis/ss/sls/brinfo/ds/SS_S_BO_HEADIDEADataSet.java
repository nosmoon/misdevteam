/***************************************************************************************************
* 파일명 : SS_S_BO_HEADIDEADataSet.java
* 기능 : 지국Info-지국장-지국장소견 상세를 위한 DataSet
* 작성일자 : 2004-05-19
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-지국장-지국장소견 상세를 위한 DataSet
 */

public class SS_S_BO_HEADIDEADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String prn;
	public String seq;
	public String makedt;
	public String makepersnm;
	public String idea1;
	public String idea2;
	public String idea3;

	public SS_S_BO_HEADIDEADataSet(){}
	public SS_S_BO_HEADIDEADataSet(String errcode, String errmsg, String prn, String seq, String makedt, String makepersnm, String idea1, String idea2, String idea3){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.prn = prn;
		this.seq = seq;
		this.makedt = makedt;
		this.makepersnm = makepersnm;
		this.idea1 = idea1;
		this.idea2 = idea2;
		this.idea3 = idea3;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setIdea1(String idea1){
		this.idea1 = idea1;
	}

	public void setIdea2(String idea2){
		this.idea2 = idea2;
	}

	public void setIdea3(String idea3){
		this.idea3 = idea3;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getIdea1(){
		return this.idea1;
	}

	public String getIdea2(){
		return this.idea2;
	}

	public String getIdea3(){
		return this.idea3;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.prn = Util.checkString(cstmt.getString(5));
		this.seq = Util.checkString(cstmt.getString(6));
		this.makedt = Util.checkString(cstmt.getString(7));
		this.makepersnm = Util.checkString(cstmt.getString(8));
		this.idea1 = Util.checkString(cstmt.getString(9));
		this.idea2 = Util.checkString(cstmt.getString(10));
		this.idea3 = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_BO_HEADIDEADataSet ds = (SS_S_BO_HEADIDEADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPrn()%>
<%= ds.getSeq()%>
<%= ds.getMakedt()%>
<%= ds.getMakepersnm()%>
<%= ds.getIdea1()%>
<%= ds.getIdea2()%>
<%= ds.getIdea3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 20 20:53:51 KST 2004 */