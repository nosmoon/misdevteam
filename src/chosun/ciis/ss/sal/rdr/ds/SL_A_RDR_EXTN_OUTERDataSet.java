/***************************************************************************************************
* 파일명 : SL_A_RDR_EXTN_OUTERDataSet.java
* 기능 : 외부확장등록관리(등록,수정,삭제)
* 작성일자 : 2004-05-20
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
 * 외부확장등록관리(등록,수정,삭제)
 *
 */

public class SL_A_RDR_EXTN_OUTERDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long uncnfmcnt;
	public long cnfmcnt;
	public long errcnt;

	public SL_A_RDR_EXTN_OUTERDataSet(){}
	public SL_A_RDR_EXTN_OUTERDataSet(String errcode, String errmsg, long totalcnt, long uncnfmcnt, long cnfmcnt, long errcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.uncnfmcnt = uncnfmcnt;
		this.cnfmcnt = cnfmcnt;
		this.errcnt = errcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setUncnfmcnt(long uncnfmcnt){
		this.uncnfmcnt = uncnfmcnt;
	}

	public void setCnfmcnt(long cnfmcnt){
		this.cnfmcnt = cnfmcnt;
	}

	public void setErrcnt(long errcnt){
		this.errcnt = errcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getUncnfmcnt(){
		return this.uncnfmcnt;
	}

	public long getCnfmcnt(){
		return this.cnfmcnt;
	}

	public long getErrcnt(){
		return this.errcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(45);
		this.uncnfmcnt = cstmt.getLong(46);
		this.cnfmcnt = cstmt.getLong(47);
		this.errcnt = cstmt.getLong(48);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SL_A_RDR_EXTN_OUTERDataSet ds = (SL_A_RDR_EXTN_OUTERDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getUncnfmcnt()%>
<%= ds.getCnfmcnt()%>
<%= ds.getErrcnt()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 03 10:16:06 KST 2004 */